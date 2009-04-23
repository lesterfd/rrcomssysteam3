using System;
using System.Collections.Generic;
using System.Text;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using RRComSSys.CVM.Transformers.SynthesisEngine;
using RRComSSys.CVM.ObjectModel;
using System.Linq;
using RRComSSys.CVM.Transformers.SynthesisEngine.SkypeAPI;
using RRComSSys.CVM.ObjectModel.XCMLWorkflowModel;


namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
    public class ExecutionSynthesizer
    {
        private AbstractApiFactory apiFactory;

        public ExecutionSynthesizer():this("Skype"){}

        public ExecutionSynthesizer(String platform)
        {
            apiFactory = AbstractApiFactory.GetFactory(platform);
        }

        public IExecutionContainer SynthesizeExecutionContainer(CMLDocument document)
        {
            try
            {
                if (document is XCMLWorkflowDocument)
                    return SynthesizeWorkFlow((XCMLWorkflowDocument)document);
                if (document is XCMLDocument)
                    return SynthesizeXCMLContainer((XCMLDocument)document);
                throw new Exception("CML Document not found/supported");
            }
            catch { throw; }
        }

        private XCMLContainer SynthesizeXCMLContainer(XCMLDocument doc)
        {
            XCMLContainer container = new XCMLContainer();

            foreach (Connection conn in doc.Connections)
            {
                foreach (CapabilityType cap in doc.LocalUser.Device.Capabilities)
                {
                    List<UserDefinition> remoteUsers = conn.FindItems<UserDefinition>(
                                         user => !  user.IsLocal 
                                                 && user.Device.Capabilities.Contains(cap));
                    if (remoteUsers.Count > 0)
                    {
                        List<Medium> media = conn.FindItems<Medium>(
                                             med => med.BuiltInType.Equals(cap));

                        List<IAPICommand> commands = new List<IAPICommand>();

                        switch (cap)
                        {
                            #region Text Chat
                            case CapabilityType.Text:
								IChatCommand txtCmd = apiFactory.API.TextChat;
								List<Medium> txtMedia = doc.FindItems<Medium>(m => m.BuiltInType == CapabilityType.Text);
								StringBuilder msg = new StringBuilder();
								foreach (Medium medium in txtMedia)
									msg.Append(medium.Name).Append("\n");
								txtCmd.TextMessage = msg.ToString();
								commands.Add(txtCmd);
                                break;
                            #endregion
                            #region File Transfer
                            case CapabilityType.TextFile:
                            case CapabilityType.BinaryFile:
                            case CapabilityType.StreamFile:
                            case CapabilityType.AudioFile:
                            case CapabilityType.VideoFile:
                            case CapabilityType.AudioVideoFile:
                            case CapabilityType.NonStreamFile:
                                foreach (Medium medium in media)
                                {
                                    ITransferFileCommand cmd = apiFactory.API.TransferFile;
                                    cmd.FileLocation = medium.Name;
                                    commands.Add(cmd);
                                }
                                break;
                            #endregion
                            #region AudioVideo
                            case CapabilityType.LiveAudio:
                                commands.Add(apiFactory.API.VoiceCall);
                                break;
                            case CapabilityType.LiveVideo:
                            case CapabilityType.LiveAudioVideo:
                                commands.Add(apiFactory.API.LiveVideo);
                                break;
                            #endregion
                            #region Other not supported
                            case CapabilityType.LiveStream:
                                break;
                            default:
                                break;
                            #endregion
                        }

                        var names =
                            from user in remoteUsers
                            select user.Person.Name;

                        foreach (IAPICommand cmd in commands)
                            cmd.Users = names.ToArray<String>();

                        container.Commands.AddRange(commands);
                    }
                }
            }
            return container;
        }

        private WorkFlow SynthesizeWorkFlow(XCMLWorkflowDocument doc)
        {
            return new WorkFlow(doc);
        }
    }
}
