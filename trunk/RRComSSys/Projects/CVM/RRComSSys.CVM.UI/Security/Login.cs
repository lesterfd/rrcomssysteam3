using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.UI.Security
{
    class SecurityManager
    {
        private Dictionary<String, String> credentials;

		public SecurityManager()
        {
            credentials = new Dictionary<string, string>();
            credentials.Add("guest", "guest");
            credentials.Add("maung", "maung");
            credentials.Add("amanda", "amanda");
            credentials.Add("danny", "danny");
            credentials.Add("lester", "lester");
        }

        public bool CheckCredentials(String user, String password)
        {
            return credentials.Contains(new KeyValuePair<string,string>(user,password));
        }
    }
}
