

KafesSpat {
	
	*ch2{
	
		~strCok = [ [0,1] ];
		~strHep = ~strCok;
		~strTek = [ 0,1 ];

		
	}


	*ch24{

				
		
		~strTek = (0..23);
		~strCok = [[(0..23).choose, (0..23).choose],  [ (0..23).choose, (0..23).choose, (0..23).choose], [ (0..23).choose, (0..23).choose, (0..23).choose, (0..23).choose]];
		~strHep = [(0..23)];
		
		
	}

}