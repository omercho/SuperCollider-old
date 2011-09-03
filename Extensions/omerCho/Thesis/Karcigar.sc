
/*

Makam : Karcigar 

Seyir : Inici-Cikici

Durak : Dugah = A

Guclu : Neva = D

Asma Karar : Neva perdesinde yarim karar Hicaz cesnisi

Yedeni : Rast = G

Perdeleri :
	~dugah = 431.94894227111
	~segah = 479.59086775338
	~cargah = 512
	~neva = 575.95461445806
	~hisar = 614.87568348396
	~evic = 719.35795928602
	~gerdaniye = 767.96974237599
	~muhayyer = 863.89788454222







Karcigar.aralik;
Karcigar.kademe;
Karcigar.frekans;
Karcigar.aralik[\t]

Karcigar.load
~rast
*/



Karcigar {
	classvar <aralik, <kademe, <frekans;

	*initClass {
		StartUp add: {
			this.aralikYap;
			this.kademeYap;
			this.frekansYap;
			this.load;
		}
	}

	*aralikYap {
		
		aralik = Event make: {
		
			~f=1; 		//Koma 
			~e=3; 		//Koma3 
			~b=4; 		//Bakiye 
			~s=5; 		//KucukMucenneb 
			~k=8; 		//BuyukMucenneb 
			~t=9; 		//Tanini 
			~a12=12; 		//ArtikIkili
			~a13=13; 		//ArtikIkili
		}

		
	}

	*kademeYap {
		aralik use: {
			kademe = 2 ** ([~k, ~s, ~t, ~s, ~a12, ~s, ~t] / 53); //Cmajor
		};
		
	}
	
	*frekansYap { | root = 431.94894227111 |
		
		
		frekans = Event make: {		

			~dugah = root;
			~segah = ~dugah * kademe[0];
			~cargah = ~segah * kademe[1];
			~neva = ~cargah * kademe[2];
			~hisar = ~neva * kademe[3];
			~evic = ~hisar * kademe[4];
			~gerdaniye = ~evic * kademe[5];
			~muhayyer = ~gerdaniye * kademe[6];
		}
	
	}

	*freqs {
		
		
		^Demand.kr(
			Impulse.kr(4), 
			0, 
			Dseq(
				[
					~dugah, 
					~segah, 
					~cargah, 
					~neva,
					~hisar, 
					~evic,
					~gerdaniye,
					~muhayyer 
				].miror2, 
				inf
			)
		);

	}
	
	*load {
		var i;
		
		~f=1; 		//Koma 
		~e=3; 		//Koma3 
		~b=4; 		//Bakiye 
		~s=5; 		//KucukMucenneb 
		~k=8; 		//BuyukMucenneb 
		~t=9; 		//Tanini 
		~a12=12; 		//ArtikIkili
		~a13=13; 		//ArtikIkili
		
		i = 2 ** ([~k, ~s, ~t, ~s, ~a12, ~s, ~t] / 53); //A karcigar
		
		
		//	karcigar Rate
		
		~kRA1 = 1/4;
		
		~kRA2 = ~kRA1 * i[0];
		~kRA3 = ~kRA2 * i[1];
		~kRA4 = ~kRA3 * i[2];
		~kRA5 = ~kRA4 * i[3];
		~kRA6 = ~kRA5 *i[4];
		~kRA7 = ~kRA6 * i[5];
		
		~kRB1 = ~kRA7 * i[6];
		
		~kRB2 = ~kRB1 * i[0];
		~kRB3 = ~kRB2 * i[1];
		~kRB4 = ~kRB3 * i[2];
		~kRB5 = ~kRB4 * i[3];
		~kRB6 = ~kRB5 *i[4];
		~kRB7 = ~kRB6 * i[5];
		
		~kRC1 = ~kRB7 * i[6];
		
		~kRC2 = ~kRC1 * i[0];
		~kRC3 = ~kRC2 * i[1];
		~kRC4 = ~kRC3 * i[2];
		~kRC5 = ~kRC4 * i[3];
		~kRC6 = ~kRC5 *i[4];
		~kRC7 = ~kRC6 * i[5];
		
		~kRD1 = ~kRC7 * i[6];
		
		~kRD2 = ~kRD1 * i[0];
		~kRD3 = ~kRD2 * i[1];
		~kRD4 = ~kRD3 * i[2];
		~kRD5 = ~kRD4 * i[3];
		~kRD6 = ~kRD5 *i[4];
		~kRD7 = ~kRD6 * i[5];
		
		~kRE1 = ~kRD7 * i[6];

		~kRE2 = ~kRE1 * i[0];
		~kRE3 = ~kRE2 * i[1];
		~kRE4 = ~kRE3 * i[2];
		~kRE5 = ~kRE4 * i[3];
		~kRE6 = ~kRE5 *i[4];
		~kRE7 = ~kRE6 * i[5];

		~kRF1 = ~kRE7 * i[6];

		~kRF2 = ~kRF1 * i[0];
		~kRF3 = ~kRF2 * i[1];
		~kRF4 = ~kRF3 * i[2];
		~kRF5 = ~kRF4 * i[3];
		~kRF6 = ~kRF5 *i[4];
		~kRF7 = ~kRF6 * i[5];

		~kRG1 = ~kRF7 * i[6];

		~kRG2 = ~kRG1 * i[0];
		~kRG3 = ~kRG2 * i[1];
		~kRG4 = ~kRG3 * i[2];
		~kRG5 = ~kRG4 * i[3];
		~kRG6 = ~kRG5 *i[4];
		~kRG7 = ~kRG6 * i[5];
		
		//	karcigar Freq
		
		~kA1 = 431.94894227111 / 8;
		
		~kA2 = ~kA1 * i[0];
		~kA3 = ~kA2 * i[1];
		~kA4 = ~kA3 * i[2];
		~kA5 = ~kA4 * i[3];
		~kA6 = ~kA5 *i[4];
		~kA7 = ~kA6 * i[5];
		
		~kB1 = ~kA7 * i[6];
		
		~kB2 = ~kB1 * i[0];
		~kB3 = ~kB2 * i[1];
		~kB4 = ~kB3 * i[2];
		~kB5 = ~kB4 * i[3];
		~kB6 = ~kB5 *i[4];
		~kB7 = ~kB6 * i[5];
		
		~kC1 = ~kB7 * i[6];
		
		~kC2 = ~kC1 * i[0];
		~kC3 = ~kC2 * i[1];
		~kC4 = ~kC3 * i[2];
		~kC5 = ~kC4 * i[3];
		~kC6 = ~kC5 *i[4];
		~kC7 = ~kC6 * i[5];
		
		~kD1 = ~kC7 * i[6];
		
		~kD2 = ~kD1 * i[0];
		~kD3 = ~kD2 * i[1];
		~kD4 = ~kD3 * i[2];
		~kD5 = ~kD4 * i[3];
		~kD6 = ~kD5 *i[4];
		~kD7 = ~kD6 * i[5];
		
		~kE1 = ~kD7 * i[6];
		
		~kE2 = ~kE1 * i[0];
		~kE3 = ~kE2 * i[1];
		~kE4 = ~kE3 * i[2];
		~kE5 = ~kE4 * i[3];
		~kE6 = ~kE5 *i[4];
		~kE7 = ~kE6 * i[5];

		~kF1 = ~kE7 * i[6];
		
		~kF2 = ~kF1 * i[0];
		~kF3 = ~kF2 * i[1];
		~kF4 = ~kF3 * i[2];
		~kF5 = ~kF4 * i[3];
		~kF6 = ~kF5 *i[4];
		~kF7 = ~kF6 * i[5];
		
		~kG1 = ~kF7 * i[6];
		
		~kG2 = ~kG1 * i[0];
		~kG3 = ~kG2 * i[1];
		~kG4 = ~kG3 * i[2];
		~kG5 = ~kG4 * i[3];
		~kG6 = ~kG5 *i[4];
		~kG7 = ~kG6 * i[5];
		
	}


}

/*
gucluA4 = 71.994326807257
gucluD4 = 575.95461445806

Yed7 = 47.9981088985
YedD7 = 767.96974237599

A1 = 53.993617783889
B1 = 107.98723556778
C1 = 215.97447113555
D1 = 431.94894227111
E1 = 863.89788454222

*/


