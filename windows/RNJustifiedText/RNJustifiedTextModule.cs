using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Com.Reactlibrary.RNJustifiedText
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNJustifiedTextModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNJustifiedTextModule"/>.
        /// </summary>
        internal RNJustifiedTextModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNJustifiedText";
            }
        }
    }
}
