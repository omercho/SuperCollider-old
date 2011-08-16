
/*
Kafes.groups;
Kafes.tempo;
Kafes.buses;
*/



Kafes {
	
	*groups {
		var s;


		s = Server.default;
		
		~sources = Group.head(s);
		~effects = Group.head(s);
		
		


	}
	
	*buses {
		
		
		~mainBus = Bus.new(\audio, 22, 2);
		
		~limBus = Bus.new(\audio, 24, 2);
		~revBus = Bus.new(\audio, 26, 2);
		~dlyBus = Bus.new(\audio, 28, 2);
		~rlpBus = Bus.new(\audio, 30, 2);
		~wahBus = Bus.new(\audio, 32, 2);
		
 		~flowBus = Bus.new(\audio, 34, 2);



	}

	*tempo{
		
		~clock1 = TempoClock.new(1, 8, Main.elapsedTime.ceil); 
		
	}
	*scales{
		
		~scl1 = Scale.rast;
		
	}
	
	*lines {
		~line1 = PatternProxy( Pn(1, inf) );
		
	}
		
}
