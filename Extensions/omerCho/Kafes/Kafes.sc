
/*
Kafes.groups;

Kafes.buses;

Kafes.tempo;
*/



Kafes {
	
	*groups {


		
		~sources = Group.head(Server.default);
		~effects = Group.head(Server.default);
		
		


	}
	
	*buses {
		
		
		~ch1Bus = Bus.new(\audio, 22, 1);
		




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
