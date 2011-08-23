
/*
Kafes.groups;

Kafes.buses;

Kafes.tempo;
*/



KafesGlobals {
	
	*groups {

		
		~sources = Group.head(Server.default);
		~effects = Group.tail(Server.default);

		//~sources2 = Group.head(Server.default);
		//~effects2 = Group.tail(Server.default);
		

	}
	
	*buses {
		

		
	}
	

	
	
	*tempo{
		
		~clock1 = TempoClock.new(1, 8, Main.elapsedTime.ceil); 
		
	}
	*scales{
		
		~scl1 = Scale.siphr;
	
	}
	
	*lines {
		
		~line1 = PatternProxy( Pn(1, inf) );
		
	}
		
}
