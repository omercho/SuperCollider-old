
/*

~f=1; 		//Koma 
~e=3; 		//Koma3 
~b=4; 		//Bakiye 
~s=5; 		//KucukMucenneb 
~k=8; 		//BuyukMucenneb 
~t=9; 		//Tanini 
~a12=12; 		//ArtikIkili
~a13=13; 		//ArtikIkili




i = 2 ** ([~t, ~t, ~b, ~t, ~t, ~t, ~b] / 53); //Cmajor

~kabaCargah = 256;
~yegah = ~kabaCargah * i[0];
~huseyniAsiran = ~yegah * i[1];
~acemAsiran = ~huseyniAsiran * i[2];
~rast = ~acemAsiran * i[3];
~dugah = ~rast * i[4];
~buselik = ~dugah * i[5];
~cargah = ~buselik * i[6];
~neva = ~cargah * i[0];
~huseyni = ~neva *i[1];
~acem = ~huseyni * i[2];
~gerdaniye = ~acem * i[3];
~muhayyer = ~gerdaniye * i[4];
~tizBuselik = ~muhayyer * i[5];
~tizCargah = ~tizBuselik * i[6];
~huseyni;


Cargah.aralik;
Cargah.kademe;
Cargah.frekans;
Cargah.aralik[\t]


~rast
*/



Cargah {
	//classvar <aralik, <kademe, <frekans;
/*
	*initClass {
		StartUp add: {
			this.aralikYap;
			this.kademeYap;
			this.frekansYap;
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

		// Alternative: 
		/*		
		(
			f: 1,
			e: 3,
			b: 4,
			s: 5,
			k: 8
			// ... etc.
		
		)
		
		*/
		
	}

	*kademeYap {
		aralik use: {
			kademe = 2 ** ([~t, ~t, ~b, ~t, ~t, ~t, ~b] / 53); //Cmajor
		};
		
	}
	
	*frekansYap { | root = 256 |
		
		
		frekans = Event make: {		
			~kabaCargah = root;
			~yegah = ~kabaCargah * kademe[0];
			~huseyniAsiran = ~yegah * kademe[1];
			~acemAsiran = ~huseyniAsiran * kademe[2];
			~rast = ~acemAsiran * kademe[3];
			~dugah = ~rast * kademe[4];
			~buselik = ~dugah * kademe[5];
			~cargah = ~buselik * kademe[6];
			~neva = ~cargah * kademe[0];
			~huseyni = ~neva * kademe[1];
			~acem = ~huseyni * kademe[2];
			~gerdaniye = ~acem * kademe[3];
			~muhayyer = ~gerdaniye * kademe[4];
			~tizBuselik = ~muhayyer * kademe[5];
			~tizCargah = ~tizBuselik * kademe[6];
		}
	
	}*/

	*freqsControl {
		
		
		^Demand.kr(
			Impulse.kr(4), 
			0, 
			Dseq(
				[
					~cargah, 
					~neva, 
					~huseyni, 
					~acem, 
					~gerdaniye,
					~muhayyer, 
					~tizBuselik, 
					~tizCargah
				], 
				inf
			)
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
Perde.frekansYap(440)




a = Pseq(#[60, 61, 63, 65, 72], inf).asStream.next;
var trig, seq, freq;
	trig = Impulse.kr(24);
	seq = Drand([Dseq((1..5).mirror1, 1), Drand((4..10), 8)], 2000);
	freq = Demand.kr(trig, 0, seq * 100);

		Demand.kr(
			Impulse.kr(24), 
			0, 
			Dseq((300..500), inf) * 100
		);

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