{

	var g, a;
	
	g = SCMenuGroup(nil, "Kafes", 13);
	
	k = {
		"loding Globals".postln;
		
		Kafes.groups;
		
		Kafes.tempo;
		
		1.0.wait;
		
		"loading Channels".postln;
		
		KafesChannels.ch1;
		1.0.wait;

		"3 of 3 loading".postln;

		0.5.wait;
		
		"K A F E S".postln;
		
	};	

	f = { | server, name, startcolor, donecolor |
		var w;
		w = Window(name ++ " server booting!", Rect(0, 990, 4400, 700));
		w.front.view.background = startcolor;
		server.doWhenBooted({
			w.name = name ++ " server booted";
			w.view.background = donecolor;
			{ w.close }.defer(2.5);
			k.fork;
		});
		if (server.serverRunning.not) { server.boot };
		s = Server.default;
	};

	a = SCMenuItem(g, "boot local server");
	a.action = { f.(Server.local, "Local", Color.white, Color.red) };
	a.setShortCut("¤", true, false); // Cmd-ctrl-alt-1



	a = SCMenuItem(g, "open startupKafes file");
	a.action = { (Platform.userAppSupportDir ++ "/startupKafes/loadKafes.scd").openTextFile; };
	a.setShortCut("9", true, false); // Cmd-ctrl-alt-0
	
	a = SCMenuItem(g, "open Kafes.sc file");
	a.action = { (Platform.userAppSupportDir ++ "/Extensions/omerCho/Kafes/Kafes.sc").openTextFile; };
	a.setShortCut("0", true, false); // Cmd-ctrl-alt-0

	

	
	

	a = SCMenuItem(g, "open");
	a.action = { k.fork; };
	a.setShortCut("1", true, false); // Cmd-ctrl-alt-1


}.value;