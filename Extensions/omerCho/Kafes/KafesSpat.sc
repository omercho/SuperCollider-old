

KafesSpat {
	
	*ch2{
	
		~strCok = [ [0,1] ];
		~strHep = ~strCok;
		~strTek = [ 0,1 ];

		
	}

	*ch4{

				
		
		~strTek = (0..3);
		~strCok = [[0,1], [0,2], [0,3], [1,2], [1,3], [2,3], [0,1,2], [0,2,3], [1,2,3], [0,1,2,3] ];
		~strHep = [(0..3)];
		
		
	}

	*ch24{

				
		
		~strTek = (0..23);
		~strCok = [[(0..23).choose, (0..23).choose],  [ (0..23).choose, (0..23).choose, (0..23).choose], [ (0..23).choose, (0..23).choose, (0..23).choose, (0..23).choose]];
		~strHep = [(0..23)];
		
		
	}

}