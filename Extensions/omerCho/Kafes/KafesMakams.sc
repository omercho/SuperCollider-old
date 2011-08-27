


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

