{

	var g, a;
	
	g = SCMenuGroup(nil, "Kafes", 13);
	
	k = { 
		"loding Globals".postln;
		
		KafesGlobals.groups;
		
		KafesGlobals.tempo;
		
		Karcigar.load;
		1.0.wait;
		
		"loading Channels".postln;
		
		KafesChannels.ch1;
		1.0.wait;
		
		
		KafesChannels.ch2;
		1.0.wait;

		KafesChannels.ch3;
		1.0.wait;

		KafesChannels.ch4;

		2.5.wait;
		
		"K A F E S".postln;
		 //Document.open("/Users/omerchatziserif/Dropbox/SC/-Projects/9_Kafes@ZKM/\~Play/Play.scd").load;
		 //(Platform.pathSeparator ++ "/Users/omerchatziserif/Dropbox/SC/-Projects/9_Kafes@ZKM/\~Play/Play.scd").openTextFile;
		 //(Platform.userAppSupportDir ++ "/startupLilt.scd").load; 
	};	



	f = { | server, name, startcolor, donecolor |
		var w;
		w = Window(name ++ " server booting!", Rect(0, 990, 4400, 700));
		w.front.view.background = startcolor;
		
		a = Array.fill(1, {StaticText(w, Rect(w.bounds.extent.x.rand, w.bounds.extent.y.rand, 160, 16))
			.string_("K A F E S")
			.align_(\center)
			.stringColor_(Color.gray(0.5, 1.0))
			.font_(Font([
				"Helvetica-Bold",
				"Helvetica"
			].choose, 11))
		});

		r = {inf.do{|i|
			thisThread.randSeed_(1284);
			a.do{|item|
				// setting GUI values is asynchronous, so you must use .defer
				{item.bounds = Rect(5+w.bounds.extent.x.rand * (cos(i*0.01)).abs,
							w.bounds.extent.y.rand * sin(i*0.01),
							160, 20)}.defer;
			};
			0.15.wait;
		}}.fork;
		
		w.drawHook = {
			Pen.translate(100, 100);
			1000.do{
				// set the Color
				Pen.color = Color.green(rrand(0.0, 1), rrand(0.0, 0.5));
				Pen.addAnnularWedge(
					(100.rand)@(100.rand),Ê
					rrand(10, 50),Ê
					rrand(51, 100),Ê	
					2pi.rand,Ê
					2pi.rand
				);
				Pen.perform([\stroke, \fill].choose);
			}
		};		
		

		
		server.doWhenBooted({
			
			w.refresh;
			w.name = name ++ " server booted";
			k.fork;
			0.2.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.6.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.6.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.4.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.4.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.4.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.4.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.2.wait;
			{ w.close }.defer(0.4);
			w.onClose_({r.stop});
			(Platform.userAppSupportDir ++ "/Extensions/omerCho/Kafes/~Play/Play.scd").openTextFile;
		});
		if (server.serverRunning.not) { server.boot };
		s = Server.default;
	};

	a = SCMenuItem(g, "boot local server + load Kafes");
	a.action = { f.(Server.local, "Local", Color.white, Color.red) };
	a.setShortCut("¤", true, false); // Cmd-ctrl-alt-1
	
	a = SCMenuItem(g, "~PlayFile");
	a.action = { (Platform.userAppSupportDir ++ "/Extensions/omerCho/Kafes/~Play/Play.scd").openTextFile; };
	a.setShortCut("1", true, false); // Cmd-ctrl-alt-1


	a = SCMenuItem(g, "open startupKafes file");
	a.action = { (Platform.userAppSupportDir ++ "/startupKafes/KafesLoad.scd").openTextFile; };
	a.setShortCut("8", true, false); // Cmd-ctrl-alt-8

	a = SCMenuItem(g, "open startupKafes file");
	a.action = { (Platform.userAppSupportDir ++ "/Extensions/omerCho/Kafes/Kaffer.sc").openTextFile; };
	a.setShortCut("9", true, false); // Cmd-ctrl-alt-9
	
	a = SCMenuItem(g, "open Play file");
	a.action = { (Platform.userAppSupportDir ++ "/Extensions/omerCho/Kafes/~Play/Play.scd").openTextFile; };
	a.setShortCut("0", true, false); // Cmd-ctrl-alt-0

	

	
	

	a = SCMenuItem(g, "loadKafs");
	a.action = { Kaffer.loadKafs; };
	a.setShortCut("5", true, false); // Cmd-ctrl-alt-1


}.value;

/*




	w = Window.new.front;
	w.view.background=Color.white;
	
	a = Array.fill(1, {StaticText(w, Rect(w.bounds.extent.x.rand, w.bounds.extent.y.rand, 160, 16))
		.string_("K A F E S")
		.align_(\center)
		.stringColor_(Color.gray(0.5, 1.0))
		.font_(Font([
			"Helvetica-Bold",
			"Helvetica"
		].choose, 11))
	});
	
	r = {15.do{|i|
		thisThread.randSeed_(1284);
		a.do{|item|
			// setting GUI values is asynchronous, so you must use .defer
			{item.bounds = Rect(5+w.bounds.extent.x.rand * (cos(i*0.01)).abs,
						w.bounds.extent.y.rand * sin(i*0.01),
						160, 20)}.defer;
		};
		0.15.wait;
	}}.fork;
	CmdPeriod.doOnce({w.close});
	w.onClose_({r.stop});




	*addAnnularWedge (center, innerRadius, outerRadius, startAngle, arcAngle)
		Draw an annular wedge around the [Point] center, from innerRadius to outerRadius in pixels. startAngle and arcAngle refer to the starting angle and the extent of the arc, and are in radians [0..2pi].
		
		(
		w = Window.new.front;
		w.view.background_(Color.white);
		w.drawHook = {
			Pen.translate(100, 100);
			1000.do{
				// set the Color
				Pen.color = Color.green(rrand(0.0, 1), rrand(0.0, 0.5));
				Pen.addAnnularWedge(
					(100.rand)@(100.rand),Ê
					rrand(10, 50),Ê
					rrand(51, 100),Ê	
					2pi.rand,Ê
					2pi.rand
				);
				Pen.perform([\stroke, \fill].choose);
			}
		};
		w.refresh;
		)
*/