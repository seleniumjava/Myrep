$windowHandle = WinGetHandle("Open")
WinActivate($windowHandle)
sleep(2000)
ControlSetText ( "Open", "", "[Class:Edit;Instance:1]", "C:\atgpcdec.dll")
sleep(2000)
ControlClick ( "Open", "", "[Class:Button;Instance:1]")