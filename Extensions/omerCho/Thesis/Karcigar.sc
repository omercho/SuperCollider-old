
/*

Makam : Karcigar 

Durak : Dugah = A

Seyir : Inici-Cikici

Guclu : Neva = D

Asma Karar : Neva perdesinde yarim karar Hicaz cesnisi

Perdeleri :
	~dugah = 431.94894227111
	~segah = 479.59086775338
	~cargah = 512
	~neva = 575.95461445806
	~hisar = 614.87568348396
	~evic = 719.35795928602
	~gerdaniye = 767.96974237599
	~muhayyer = 863.89788454222


Yedeni :
	Rast = G

Karcigar.aralik;
Karcigar.kademe;
Karcigar.frekans;
Karcigar.aralik[\t]


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

	*freqsControl {
		
		
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
				], 
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
		
		~karcigarRA1 = 1/4;
		
		~karcigarRA2 = ~karcigarRA1 * i[0];
		~karcigarRA3 = ~karcigarRA2 * i[1];
		~karcigarRA4 = ~karcigarRA3 * i[2];
		~karcigarRA5 = ~karcigarRA4 * i[3];
		~karcigarRA6 = ~karcigarRA5 *i[4];
		~karcigarRA7 = ~karcigarRA6 * i[5];
		
		~karcigarRB1 = ~karcigarRA7 * i[6];
		
		~karcigarRB2 = ~karcigarRB1 * i[0];
		~karcigarRB3 = ~karcigarRB2 * i[1];
		~karcigarRB4 = ~karcigarRB3 * i[2];
		~karcigarRB5 = ~karcigarRB4 * i[3];
		~karcigarRB6 = ~karcigarRB5 *i[4];
		~karcigarRB7 = ~karcigarRB6 * i[5];
		
		~karcigarRC1 = ~karcigarRB7 * i[6];
		
		~karcigarRC2 = ~karcigarRC1 * i[0];
		~karcigarRC3 = ~karcigarRC2 * i[1];
		~karcigarRC4 = ~karcigarRC3 * i[2];
		~karcigarRC5 = ~karcigarRC4 * i[3];
		~karcigarRC6 = ~karcigarRC5 *i[4];
		~karcigarRC7 = ~karcigarRC6 * i[5];
		
		~karcigarRD1 = ~karcigarRC7 * i[6];
		
		~karcigarRD2 = ~karcigarRD1 * i[0];
		~karcigarRD3 = ~karcigarRD2 * i[1];
		~karcigarRD4 = ~karcigarRD3 * i[2];
		~karcigarRD5 = ~karcigarRD4 * i[3];
		~karcigarRD6 = ~karcigarRD5 *i[4];
		~karcigarRD7 = ~karcigarRD6 * i[5];
		
		~karcigarRE1 = ~karcigarRD7 * i[6];
		
		//	karcigar Freq
		
		~karcigarA1 = 431.94894227111 / 8;
		
		~karcigarA2 = ~karcigarA1 * i[0];
		~karcigarA3 = ~karcigarA2 * i[1];
		~karcigarA4 = ~karcigarA3 * i[2];
		~karcigarA5 = ~karcigarA4 * i[3];
		~karcigarA6 = ~karcigarA5 *i[4];
		~karcigarA7 = ~karcigarA6 * i[5];
		
		~karcigarB1 = ~karcigarA7 * i[6];
		
		~karcigarB2 = ~karcigarB1 * i[0];
		~karcigarB3 = ~karcigarB2 * i[1];
		~karcigarB4 = ~karcigarB3 * i[2];
		~karcigarB5 = ~karcigarB4 * i[3];
		~karcigarB6 = ~karcigarB5 *i[4];
		~karcigarB7 = ~karcigarB6 * i[5];
		
		~karcigarC1 = ~karcigarB7 * i[6];
		
		~karcigarC2 = ~karcigarC1 * i[0];
		~karcigarC3 = ~karcigarC2 * i[1];
		~karcigarC4 = ~karcigarC3 * i[2];
		~karcigarC5 = ~karcigarC4 * i[3];
		~karcigarC6 = ~karcigarC5 *i[4];
		~karcigarC7 = ~karcigarC6 * i[5];
		
		~karcigarD1 = ~karcigarC7 * i[6];
		
		~karcigarD2 = ~karcigarD1 * i[0];
		~karcigarD3 = ~karcigarD2 * i[1];
		~karcigarD4 = ~karcigarD3 * i[2];
		~karcigarD5 = ~karcigarD4 * i[3];
		~karcigarD6 = ~karcigarD5 *i[4];
		~karcigarD7 = ~karcigarD6 * i[5];
		
		~karcigarE1 = ~karcigarD7 * i[6];
		
	}


}

