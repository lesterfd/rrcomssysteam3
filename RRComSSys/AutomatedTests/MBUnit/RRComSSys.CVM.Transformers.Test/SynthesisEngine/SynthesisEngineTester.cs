using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;
using RRComSSys.CVM.Transformers.SynthesisEngine;
using RRComSSys.CVM.Transformers.ModelTransformer;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using System.Threading;
using RRComSSys.CVM.ObjectModel.XCMLWorkflowModel;

namespace RRComSSys.CVM.Transformers.Test.SynthesisEngine
{
    [TestFixture]
    class SynthesisEngineTester
    {
        [Test]
        public void Test_ExecutionSynthesizer()
        {
            String fileName = @".\TestFiles\sample_xcml_02.xcml";
            XCMLDocument doc = (XCMLDocument)ModelTransformationEngine.LoadCMLDocument(fileName);
            ExecutionSynthesizer xs = new ExecutionSynthesizer();
            XCMLContainer container = (XCMLContainer)xs.SynthesizeExecutionContainer(doc);
            container.Execute();
            Thread.Sleep(20000);
        }

        [Test]
        public void Test_SynthesisEngineController()
        {
            String fileName = @".\TestFiles\sample_xcml_02.xcml";
            XCMLDocument doc = (XCMLDocument)ModelTransformationEngine.LoadCMLDocument(fileName);
            SynthesisEngineController SE = SynthesisEngineController.Instance;
            SE.GenerateCommands(doc);
            SE.ExecuteCommands();
        }

        [Test]
        public void Test_SynthesisEngineController_Workflow()
        {
            String fileName1 = @".\TestFiles\sample_xcml_01.xcml";
            XCMLDocument xcml1 = (XCMLDocument)ModelTransformationEngine.LoadCMLDocument(fileName1);

            String fileName2 = @".\TestFiles\sample_xcml_02.xcml";
            XCMLDocument xcml2 = (XCMLDocument)ModelTransformationEngine.LoadCMLDocument(fileName2);


            String fileName = @".\TestFiles\2WayVoice_complete.wfgcml";
            XCMLWorkflowDocument doc = (XCMLWorkflowDocument)ModelTransformationEngine.LoadCMLDocument(fileName);
            SynthesisEngineController SE = SynthesisEngineController.Instance;

            ((WorkflowGCMLItem)doc.Start.First).XCMLDocument = xcml1;
            ((WorkflowGCMLItem)(((WorkflowCondition)doc.Start.First.Next).AltNext)).XCMLDocument = xcml2;

            SE.GenerateCommands(doc);
            SE.ExecuteCommands();
        }
    }
}
