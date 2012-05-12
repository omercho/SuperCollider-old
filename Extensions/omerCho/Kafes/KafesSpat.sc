

KafesSpat {
	
	*ch1{
	
		~strCok = [ [0] ];
		~strHep = ~strCok;
		~strTek = [ 0 ];
		~spira = Pseq((0..1).reverse, inf).asStream;
		~spirOut = Pseq((1..0), inf).asStream;
		~circ = Pseq((0..1), inf).asStream;

		
	}

	*ch2{
	
		~strCok = [ [0,1] ];
		~strHep = ~strCok;
		~strTek = [ 0,1 ];
		~spira = Pseq((0..1).reverse, inf).asStream;
		~spirOut = Pseq((1..0), inf).asStream;
		~circ = Pseq((0..1), inf).asStream;

		
	}

	*ch4{

				
		
		~strTek = (0..3);
		~strCok = [[0,1], [0,2], [0,3], [1,2], [1,3], [2,3], [0,1,2], [0,2,3], [1,2,3], [0,1,2,3] ];
		~strHep = [(0..3)];
		~spira = Pseq((0..3).reverse, inf).asStream;
		~spirOut = Pseq((3..0), inf).asStream;
		~circ = Pseq((0..3), inf).asStream;
		
		
	}

	*ch6{

				
		
		~strTek = (0..5);
		~strCok = [ [0,1], [0,2], [0,3], [0,4], [0,5], [1,2], [1,3], [1,4], [1,5], [2,3], [2,4], [2,5], [0,1,2], [0,2,3], [1,2,3], [0,1,2,3], [0,1,2,3,4], [1,2,3,4, 5], [2,3,4], [2,3,4,5], [1,2,3,4], [1,2,4,5], [0,3,5], [0,1,3,4], [0,1,2,5], [1,2,4,5] ];
		~strHep = [(0..5)];
		
		~spira = Pseq((0..5).reverse, inf).asStream;
		~spirOut = Pseq((5..0), inf).asStream;
		~circ = Pseq((0..5), inf).asStream;
		
		
	}

	*ch24{

				
		
		~strTek = (0..23);
		~strCok = [[(0..23).choose, (0..23).choose],  [ (0..23).choose, (0..23).choose, (0..23).choose], [ (0..23).choose, (0..23).choose, (0..23).choose, (0..23).choose]];
		~strHep = [(0..23)];
		~spira = Pseq((0..23).reverse, inf).asStream;
		~spirOut = Pseq((23..0), inf).asStream;
		~circ = Pseq((0..23), inf).asStream;
		
		
	}

}