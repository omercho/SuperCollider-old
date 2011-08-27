//-------KafGendy----------//

(
~ff = 404;

KafGendy.ar(0.01, 0.1, 2, 8,
	freq: [~ff/2, ~ff/2.5, ~ff*2], 
	freqrlp1: ~ff/2, 
	freqrlp2: ~ff*2).play;
)
*/


//--------KafPMO-------------//

KafPMO.ar(0.001, 0.02, 0.5, 2.5,
	
	cfreq: 1678,
	mfreq: 1130
		

).play
)


//--------KafSin-----------//

KafSin.ar(0.01, 0.1, 5.0, freq:44).play;



//-------KafSinVib--------//

KafSinVib.ar(1.1, 1.1, 5.0, freq: 144, vib: 4.1).play;