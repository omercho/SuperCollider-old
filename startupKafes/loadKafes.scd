{

	var g, a;
	
	g = SCMenuGroup(nil, "Kafes", 13);
	
	k = { 
		"loding Globals".postln;
		
		Kafes.groups;
		
		Kafes.tempo;
		
		Karcigar.load;
		Sipihr.load;
		1.0.wait;
		
		"loading Channels".postln;
		
		KafesChannels.ch1;
		1.0.wait;
		
		"loading Channels".postln;
		
		KafesChannels.ch2;
		1.0.wait;

		KafesChannels.ch3;
		1.0.wait;

		KafesChannels.ch4;

		2.5.wait;
		
		"K A F E S".postln;
		
	};	



	f = { | server, name, startcolor, donecolor |
		var w;
		w = Window(name ++ " server booting!", Rect(0, 990, 4400, 700));
		w.front.view.background = startcolor;
		a = SCStaticText(w, Rect(220,220,1180,200));
		a.string = "K A F E S";
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
			0.2.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.2.wait;
			w.refresh;
			0.2.wait;
			{ w.close }.defer(2.9);
			
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

/*

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