
/*

~f=1; 		//Koma 
~e=3; 		//Koma3 
~b=4; 		//Bakiye 
~s=5; 		//KucukMucenneb 
~k=8; 		//BuyukMucenneb 
~t=9; 		//Tanini 
~a12=12; 		//ArtikIkili
~a13=13; 		//ArtikIkili

i = 2 ** ([~t, ~k, ~s, ~t, ~t, ~k, ~s] / 53); //G


~rast = 3.6
~dugah = ~rast * i[0];
~segah = ~dugah * i[1];
~cargah = ~segah * i[2];
~neva = ~cargah * i[3];
~huseyni = ~neva *i[4];
~acem = ~huseyni * i[5];
~rast2 = ~acem * i[6];


Rast.aralik;
Rast.kademe;
Cargah.frekans;
Rast.aralik[\t]



*/



Rast {
	classvar <aralik, <kademe, <frekans;

	*initClass {
		StartUp add: {
			this.aralikYap;
			this.kademeYap;
			this.frekansYap;
		}
	}

	*aralikYap {
		
		aralik = Event make: {
		
			~s=5; 		//KucukMucenneb 
			~k=8; 		//BuyukMucenneb 
			~t=9; 		//Tanini 
		}

	}

	*kademeYap {
		aralik use: {
			kademe = 2 ** ([~t, ~k, ~s, ~t, ~t, ~k, ~s] / 53); //Cmajor
		};
		
	}
	
	*frekansYap { | root = 383.98 |
		
		
		frekans = Event make: {		
			~rast = root;
			~dugah = ~rast * kademe[0];
			~segah = ~dugah * kademe[1];
			~cargah = ~segah * kademe[2];
			~neva = ~cargah * kademe[3];
			~huseyni = ~neva * kademe[4];
			~acem = ~huseyni * kademe[5];
			~rast2 = ~acem * kademe[6];
		}
	
	}

	*freqsControl {
		
		
		^Demand.kr(
			Impulse.kr(4), 
			0, 
			Dseq([~rast, ~segah ,~neva, ~acem], inf)
		);
		
		/*
		^SinOsc.kr(1).range(400, 440);
		^Demand.kr(
			Impulse.kr(8), 
			0, 
			Drand([Dseq((1..5).mirror1, 1), Drand((4..10), 8)], 2000) * 100
		);
		*/

	}
	
	*postFreqs { | root = 256 |
		
	

	}

	*postRates { | root = 1 |
		
	

	}

}



/*

{ SinOsc.ar(Cargah.freqsControl, 0, 0.5 ) }.play;


{ SinOsc.ar(
		Demand.kr(
			Impulse.kr(4), 
			0, 
			Dseq([~rast, ~segah , ~neva, ~acem], inf)
		), 
		0, 
		0.5
	) 
}.play;

*/



















/*
*ena set apo diastimata 
*mia sira apo diast poy ekfrazei tis sxeseis
*i freq tis themeli..



mia klimaka se sxeseis freq vathmidwn

i = to kathe stixio tis stixias einai enas arithmos pou antiprosopevei to diastima anamesa se mia vathmida tis klimakas k tin amesos epomeni bathm tis klimakas se aniusa seira sixnotiton


tha xrisimop to i gis na paroume tis freq olon ton vathmi

i = 2 ** ([~t, ~t, ~b, ~t, ~t, ~t, ~b] / 53); //Cmajor
*/