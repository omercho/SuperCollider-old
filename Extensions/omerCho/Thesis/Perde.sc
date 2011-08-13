
/*

Perde.aralikYap;
Perde.aralik[\e]

Perde.kademeYap;
Perde.kademe;

Perde.frekansYap;
Perde.frekans;

Perde.frekansYap(256);
Perde.frekans;



~dugah
*/



Perde {
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
			kademe = 2 ** ([~f, ~e, ~b, ~s, ~k, ~t] / 53);
		};
		
	}
	
	*frekansYap { | root = 256 |
		
		
		frekans = currentEnvironment use: {		
			~kabaCargah = root;
			~kabaNimHicaz = ~kabaCargah * kademe[2];
			~kabaHicaz = ~kabaCargah * kademe[3];
			~kabaDikHicaz = ~kabaCargah * kademe[4];
			~yegah = ~kabaCargah * kademe[5];
			~kabaNimHisar = ~yegah * kademe[2];
			~kabaHisar = ~yegah * kademe[3];
			~kabaDikHisar = ~yegah * kademe[4];
			~huseyniAsiran = ~yegah * kademe[5];
			~acemAsiran = ~huseyniAsiran * kademe[2];
			~dikAcemAsiran = ~acemAsiran * kademe[0];
			~irak = ~acemAsiran * kademe[2];
			~gevest = ~acemAsiran * kademe[3];
			~dikGevest = ~acemAsiran * kademe[4];
			~rast = ~acemAsiran * kademe[5];
			~nimZirgule = ~rast * kademe[2];
			~zirgule = ~rast * kademe[3];
			~dikZirgule = ~rast * kademe[4];
			~dugah = ~rast * kademe[5];
			~kurdi = ~dugah * kademe[2];
			~dikKurdi = ~dugah * kademe[3];
			~segah = ~dugah * kademe[4];
			~buselik = ~dugah * kademe[5];
			~dikBuselik = ~buselik * kademe[1];
			~cargah = ~buselik * kademe[2];
			~nimHicaz = ~cargah * kademe[2];
			~hicaz = ~cargah * kademe[3];
			~dikHicaz = ~cargah * kademe[4];
			~neva = ~cargah * kademe[5];
			~nimHisar = ~neva * kademe[2];
			~hisar = ~neva * kademe[3];
			~dikHisar = ~neva * kademe[4];
			~huseyni = ~neva *kademe[5];
			~acem = ~huseyni * kademe[2];
			~dikAcem = ~acem * kademe[0];
			~evic = ~acem * kademe[2];
			~mahur = ~acem * kademe[3];
			~dikMahur = ~acem * kademe[4];
			~gerdaniye = ~acem * kademe[5];
			~nimSehnaz = ~gerdaniye * kademe[2];
			~sehnaz = ~gerdaniye * kademe[3];
			~dikSehnaz = ~gerdaniye * kademe[4];
			~muhayyer = ~gerdaniye * kademe[5];
			~sunbule = ~muhayyer * kademe[2];
			~dikSunbule = ~muhayyer * kademe[3];
			~tizSegah = ~muhayyer * kademe[4];
			~tizBuselik = ~muhayyer * kademe[5];
			~tizDikBuselik = ~tizBuselik * kademe[1];
			~tizCargah = ~tizBuselik * kademe[2];

		}
	
	}

}
















/*
*ena set apo diastimata 
*mia sira apo diast poy ekfrazei tis sxeseis
*i freq tis themeli..



mia klimaka se sxeseis freq vathmidwn

i = to kathe stixio tis stixias einai enas arithmos pou antiprosopevei to diastima anamesa se mia vathmida tis klimakas k tin amesos epomeni bathm tis klimakas se aniusa seira sixnotiton


tha xrisimop to i gis na paroume tis freq olon ton vathmi

i = 2 ** ([~t, ~t, ~b, ~t, ~t, ~t, ~b] / 53); //Cmajor
*/