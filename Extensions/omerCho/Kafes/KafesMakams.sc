/*

KarcigarMakam.load;

*/

Karcigar { 

	
	*load {
//////////////////////	
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



////////////////////////////	
	}
}


/*

SipihrMakam.load;

*/

Sipihr { 

	
	*load {
//////////////////////	
var i;

~f=1; 		//Koma 
~e=3; 		//Koma3 
~b=4; 		//Bakiye 
~s=5; 		//KucukMucenneb 
~k=8; 		//BuyukMucenneb 
~t=9; 		//Tanini 
~a12=12; 		//ArtikIkili
~a13=13; 		//ArtikIkili

i = 2 ** ([~t, ~s, ~k, ~t, ~t, ~s, ~k] / 53); //G sipihr

//	sipihr Rate

~sipihrRateA1 = 1/4;

~sipihrRateA2 = ~sipihrRateA1 * i[0];
~sipihrRateA3 = ~sipihrRateA2 * i[1];
~sipihrRateA4 = ~sipihrRateA3 * i[2];
~sipihrRateA5 = ~sipihrRateA4 * i[3];
~sipihrRateA6 = ~sipihrRateA5 *i[4];
~sipihrRateA7 = ~sipihrRateA6 * i[5];

~sipihrRateB1 = ~sipihrRateA7 * i[6];

~sipihrRateB2 = ~sipihrRateB1 * i[0];
~sipihrRateB3 = ~sipihrRateB2 * i[1];
~sipihrRateB4 = ~sipihrRateB3 * i[2];
~sipihrRateB5 = ~sipihrRateB4 * i[3];
~sipihrRateB6 = ~sipihrRateB5 *i[4];
~sipihrRateB7 = ~sipihrRateB6 * i[5];

~sipihrRateC1 = ~sipihrRateB7 * i[6];

~sipihrRateC2 = ~sipihrRateC1 * i[0];
~sipihrRateC3 = ~sipihrRateC2 * i[1];
~sipihrRateC4 = ~sipihrRateC3 * i[2];
~sipihrRateC5 = ~sipihrRateC4 * i[3];
~sipihrRateC6 = ~sipihrRateC5 *i[4];
~sipihrRateC7 = ~sipihrRateC6 * i[5];

~sipihrRateD1 = ~sipihrRateC7 * i[6];

~sipihrRateD2 = ~sipihrRateD1 * i[0];
~sipihrRateD3 = ~sipihrRateD2 * i[1];
~sipihrRateD4 = ~sipihrRateD3 * i[2];
~sipihrRateD5 = ~sipihrRateD4 * i[3];
~sipihrRateD6 = ~sipihrRateD5 *i[4];
~sipihrRateD7 = ~sipihrRateD6 * i[5];

~sipihrRateE1 = ~sipihrRateD7 * i[6];

//	sipihr Freq

~sipihrA1 = 392.98 / 8;

~sipihrA2 = ~sipihrA1 * i[0];
~sipihrA3 = ~sipihrA2 * i[1];
~sipihrA4 = ~sipihrA3 * i[2];
~sipihrA5 = ~sipihrA4 * i[3];
~sipihrA6 = ~sipihrA5 *i[4];
~sipihrA7 = ~sipihrA6 * i[5];

~sipihrB1 = ~sipihrA7 * i[6];

~sipihrB2 = ~sipihrB1 * i[0];
~sipihrB3 = ~sipihrB2 * i[1];
~sipihrB4 = ~sipihrB3 * i[2];
~sipihrB5 = ~sipihrB4 * i[3];
~sipihrB6 = ~sipihrB5 *i[4];
~sipihrB7 = ~sipihrB6 * i[5];

~sipihrC1 = ~sipihrB7 * i[6];

~sipihrC2 = ~sipihrC1 * i[0];
~sipihrC3 = ~sipihrC2 * i[1];
~sipihrC4 = ~sipihrC3 * i[2];
~sipihrC5 = ~sipihrC4 * i[3];
~sipihrC6 = ~sipihrC5 *i[4];
~sipihrC7 = ~sipihrC6 * i[5];

~sipihrD1 = ~sipihrC7 * i[6];

~sipihrD2 = ~sipihrD1 * i[0];
~sipihrD3 = ~sipihrD2 * i[1];
~sipihrD4 = ~sipihrD3 * i[2];
~sipihrD5 = ~sipihrD4 * i[3];
~sipihrD6 = ~sipihrD5 *i[4];
~sipihrD7 = ~sipihrD6 * i[5];

~sipihrE1 = ~sipihrD7 * i[6];



////////////////////////////	
	}
}

