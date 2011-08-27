////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////


(
		~main1 = Preceive(
			\1 -> {},
			\2 -> {},
			\3 -> {},
			\4 -> {},
			\5 -> {},
			\6 -> {},
			\7 -> {},
			\8 -> {},
			\9 -> {},
			\10 -> {},
			
			\11 -> {},
			\12 -> {},
			\13 -> {},
			\14 -> {},
			\15 -> {},
			\16 -> {},
			\17 -> {},
			\18 -> {},
			\19 -> {},
			\20 -> {},
			
			\21 -> {},
			\22 -> {},
			\23 -> {},
			\24 -> {},
			\25 -> {},
			\26 -> {},
			\27 -> {},
			\28 -> {},
			\29 -> {},
			\30 -> {},
			
			\31 -> {},
			\32 -> {},
			\33 -> {},
			\34 -> {},
			\35 -> {},
			\36 -> {},
			\37 -> {},
			\38 -> {},
			\39 -> {},
			\40 -> {},
			
			\41 -> {},
			\42 -> {},
			\43 -> {},
			\44 -> {},
			\45 -> {},
			\46 -> {},
			\47 -> {},
			\48 -> {},
			\49 -> {},
			\50 -> {},
			
			\61 -> {},
			\62 -> {},
			\63 -> {},
			\64 -> {},
			\65 -> {},
			\66 -> {},
			\67 -> {},
			\68 -> {},
			\69 -> {},
			\70 -> {},
			
			\71 -> {},
			\72 -> {},
			\73 -> {},
			\74 -> {},
			\75 -> {},
			\76 -> {},
			\77 -> {},
			\78 -> {},
			\79 -> {},
			\80 -> {},
			
			\81 -> {},
			\82 -> {},
			\83 -> {},
			\84 -> {},
			\85 -> {},
			\86 -> {},
			\87 -> {},
			\88 -> {},
			\89 -> {},
			\90 -> {},
			
			\91 -> {},
			\92 -> {},
			\93 -> {},
			\94 -> {},
			\95 -> {},
			\96 -> {},
			\97 -> {},
			\98 -> {},
			\99 -> {},
			\100 -> {},
			
			\101 -> {},
			\102 -> {},
			\103 -> {},
			\104 -> {},
			\105 -> {},
			\106 -> {},
			\107 -> {},
			\108 -> {},
			\109 -> {},
			\110 -> {},
			
			\111 -> {},
			\112 -> {},
			\113 -> {},
			\114 -> {},
			\115 -> {},
			\116 -> {},
			\117 -> {},
			\118 -> {},
			\119 -> {},
			\120 -> {},
			
			\121 -> {},
			\122 -> {},
			\123 -> {},
			\124 -> {},
			\125 -> {},
			\126 -> {},
			\127 -> {},
			\128 -> {},
			\129 -> {},
			\130 -> {},
			
			\131 -> {},
			\132 -> {},
			\133 -> {},
			\134 -> {},
			\135 -> {},
			\136 -> {},
			\137 -> {},
			\138 -> {},
			\139 -> {},
			\140 -> {},
			
			\141 -> {},
			\142 -> {},
			\143 -> {},
			\144 -> {},
			\145 -> {},
			\146 -> {},
			\147 -> {},
			\148 -> {},
			\149 -> {},
			\150 -> {},
			
			\161 -> {},
			\162 -> {},
			\163 -> {},
			\164 -> {},
			\165 -> {},
			\166 -> {},
			\167 -> {},
			\168 -> {},
			\169 -> {},
			\170 -> {},
			
			\171 -> {},
			\172 -> {},
			\173 -> {},
			\174 -> {},
			\175 -> {},
			\176 -> {},
			\177 -> {},
			\178 -> {},
			\179 -> {},
			\180 -> {},
			
			\181 -> {},
			\182 -> {},
			\183 -> {},
			\184 -> {},
			\185 -> {},
			\186 -> {},
			\187 -> {},
			\188 -> {},
			\189 -> {},
			\190 -> {},
			
			\191 -> {},
			\192 -> {},
			\193 -> {},
			\194 -> {},
			\195 -> {},
			\196 -> {},
			\197 -> {},
			\198 -> {},
			\199 -> {},
			\200 -> {}		
		);
		
		~main1.play;
)



Pdef(\kafes01).play;

(
Pdef(\kafes01, Posc(
	\dest, [NetAddr.localAddr, NetAddr("192.168.1.12", 57120)],
	
	\msg, Pseq([\1, \2,  \3, \4, \5, \6, \7], inf),
	\dur, Pseq([~duyekDur]*2, inf)
	)
);
)

Pdef(\kafes01).stop;





Pdef(\Ncircle, Posc(
	\msg, Prand(
		[
		\1, \2, \3, \4, \5, \6, \7, \8, \9, \10,
		\11, \12, \13, \14, \15, \16, \17, \18, \19, \20,
		\21, \22, \23, \24, \25, \26, \27, \28, \29, \30,
		\31, \32, \33, \34, \35, \36, \37, \38, \39, \40,
		\41, \42, \43, \44, \45, \46, \47, \48, \49, \50,
		\51, \52, \53, \54, \55, \56, \57, \58, \59, \60,
		\61, \62, \63, \64, \65, \66, \67, \68, \69, \70,
		\71, \72, \73, \74, \75, \76, \77, \78, \79, \80,
		\81, \82, \83, \84, \85, \86, \87, \88, \89, \90,
		\91, \92, \93, \94, \95, \96, \97, \98, \99, \100,
		
		\101, \102, \103, \104, \105, \106, \107, \108, \109, \110,
		\111, \112, \113, \114, \115, \116, \117, \118, \119, \120,
		\121, \122, \123, \124, \125, \126, \127, \128, \129, \130,
		\131, \132, \133, \134, \135, \136, \137, \138, \139, \140,
		\141, \142, \143, \144, \145, \146, \147, \148, \149, \150,
		\151, \152, \153, \154, \155, \156, \157, \158, \159, \160,
		\161, \162, \163, \164, \165, \166, \167, \168, \169, \170,
		\171, \172, \173, \174, \175, \176, \177, \178, \179, \180,
		\181, \182, \183, \184, \185, \186, \187, \188, \189, \190,
		\191, \192, \193, \194, \195, \196, \197, \198, \199, \200
		], inf
	),
	\dur, Pseq([~duyekKudDur], inf)
	)
);






//////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



~forGal1 = Kaffer.read(Server.default, "sounds/agacMono01.aif");
~th1A = Kaffer.read(Server.default, "sounds/~kafes/~thol/thol1A.aif");
~forGal1.play;
~forGal1.bout_(~ch3).playBuf(0.01, 5, 5, rate: 4.rand);
~th1A.bout_(~ch4).playBuf(0.01, 5, 5, rate: 10.0);


(

fork {
	var cha = ~ch1;
	var chb = ~ch2;
	var chc = ~ch3;
	var chd = ~ch4;
	~th1A.bout_(cha).bufRd(0.001, 0.1, 2, rate: ~karcigarRA6, mul:2);
	0.01.wait;
	~th1A.bout_(chb).bufRd(0.001, 0.1, 3, rate:~karcigarRB1);
	0.1.wait;
	~forGal1.bout_(chc).bufRd(1, 0.5, 1.5, rate:~karcigarRB5);
	2.1.wait;
	~forGal1.bout_(chd).bufRd(0.01, 4, 7.5, rate: ~karcigarRC1);
	~forGal1.bout_(chb).bufRd(0.002, 5, 4.5, rate:~karcigarRC7);
	
	4.1.wait;
	~forGal1.bout_(cha).bufRd(0.0011, 0.5, 0.5, rate:~karcigarRC4);
	0.1.wait;
	~th1A.bout_(chd).bufRd(0.1, 0.5, 3, rate:~karcigarRE3);
	0.1.wait;
	~forGal1.bout_(chb).bufRd(0.11, 0.5, 1, rate: ~karcigarRC4);
	0.1.wait;
	~forGal1.bout_(cha).bufRd(0.005, 0.5, 1.9, rate:~karcigarRD5);

	0.1.wait;
	~th1A.bout_(chd).bufRd(1, 0.5, 3, rate:~karcigarRE4);
	0.1.wait;
	~forGal1.bout_(chc).bufRd(0.11, 0.5, 6, rate:~karcigarRC3);
	0.1.wait;
	~th1A.bout_(cha).bufRd(0.005, 1.5, 2, rate:~karcigarRC1);
	
	3.1.wait;
	~forGal1.bout_(chb).bufRd(0.001, 0.5, 5, rate:~karcigarRD6);
};
)



(

fork {|i|
	inf.do{
	var cha = ~ch1;
	var chb = ~ch1;
	var chc = ~ch1;
	var chd = ~ch1;
	~th1A.bout_(cha).bufRd(0.001, 0.1, 2, rate: ~karcigarRA6, mul:2);
	0.01.wait;
	~th1A.bout_(chb).bufRd(0.001, 0.1, 3, rate:~karcigarRB1);
	0.1.wait;
	~forGal1.bout_(chc).bufRd(1, 0.5, 1.5, rate:~karcigarRB5);
	2.1.wait;
	~forGal1.bout_(chd).bufRd(0.01, 4, 7.5, rate: ~karcigarRC1);
	~forGal1.bout_(chb).bufRd(0.002, 5, 4.5, rate:~karcigarRC7);
	
	4.1.wait;
	~forGal1.bout_(cha).bufRd(0.0011, 0.5, 0.5, rate:~karcigarRC4);
	0.1.wait;
	~th1A.bout_(chd).bufRd(0.1, 0.5, 3, rate:~karcigarRE3);
	0.1.wait;
	~forGal1.bout_(chb).bufRd(0.11, 0.5, 1, rate: ~karcigarRC4);
	0.1.wait;
	~forGal1.bout_(cha).bufRd(0.005, 0.5, 1.9, rate:~karcigarRD5);

	0.1.wait;
	~th1A.bout_(chd).bufRd(1, 0.5, 3, rate:~karcigarRE4);
	0.1.wait;
	~forGal1.bout_(chc).bufRd(0.11, 0.5, 6, rate:~karcigarRC3);
	0.1.wait;
	~th1A.bout_(cha).bufRd(0.005, 1.5, 2, rate:~karcigarRC1);
	
	3.1.wait;
	~forGal1.bout_(chb).bufRd(0.001, 0.5, 5, rate:~karcigarRD6);
}};
)

(

fork {|i|
	inf.do{
	var cha = ~ch2;
	var chb = ~ch2;
	var chc = ~ch2;
	var chd = ~ch2;
	~th1A.bout_(cha).bufRd(0.001, 0.1, 2, rate: ~karcigarRA6, mul:2);
	0.01.wait;
	~th1A.bout_(chb).bufRd(0.001, 0.1, 3, rate:~karcigarRB1);
	0.1.wait;
	~forGal1.bout_(chc).bufRd(1, 0.5, 1.5, rate:~karcigarRB5);
	2.1.wait;
	~forGal1.bout_(chd).bufRd(0.01, 4, 7.5, rate: ~karcigarRC1);
	~forGal1.bout_(chb).bufRd(0.002, 5, 4.5, rate:~karcigarRC7);
	
	4.1.wait;
	~forGal1.bout_(cha).bufRd(0.0011, 0.5, 0.5, rate:~karcigarRC4);
	0.1.wait;
	~th1A.bout_(chd).bufRd(0.1, 0.5, 3, rate:~karcigarRE3);
	0.1.wait;
	~forGal1.bout_(chb).bufRd(0.11, 0.5, 1, rate: ~karcigarRC4);
	0.1.wait;
	~forGal1.bout_(cha).bufRd(0.005, 0.5, 1.9, rate:~karcigarRD5);

	0.1.wait;
	~th1A.bout_(chd).bufRd(1, 0.5, 3, rate:~karcigarRE4);
	0.1.wait;
	~forGal1.bout_(chc).bufRd(0.11, 0.5, 6, rate:~karcigarRC3);
	0.1.wait;
	~th1A.bout_(cha).bufRd(0.005, 1.5, 2, rate:~karcigarRC1);
	
	3.1.wait;
	~forGal1.bout_(chb).bufRd(0.001, 0.5, 5, rate:~karcigarRD6);
}};
)

(

fork {
	inf.do{
	var cha = ~ch4;
	var chb = ~ch3;
	var chc = ~ch4;
	var chd = ~ch3;
	
	~th1A.bout_(cha).bufRd(0.001, 0.1, 1, rate: ~karcigarRD7, mul:0.2);
	0.1.wait;
	~th1A.bout_(chb).bufRd(0.001, 0.1, 1.3, rate:~karcigarRD6, mul:0.2);
	0.08.wait;
	~th1A.bout_(chc).bufRd(0.011, 0.5, 1.5, rate:~karcigarRC7, mul:0.3);
	0.05.wait;
	~th1A.bout_(chd).bufRd(0.01, 4, 1.5, rate: ~karcigarRD2, mul:0.4);
	0.2.wait;
	~th1A.bout_(chb).bufRd(0.002, 5, 2.5, rate:~karcigarRB7, mul:0.5);
	
	0.17.wait;
	~th1A.bout_(cha).bufRd(0.0011, 0.5, 0.5, rate:~karcigarRD1, mul:0.6);
	0.3.wait;
	~th1A.bout_(chc).bufRd(0.1, 1.5, 0.3, rate:~karcigarRE1, mul:0.7);
	0.05.wait;
	~th1A.bout_(chd).bufRd(0.11, 0.5, 1.2, rate: ~karcigarRC4, mul:0.8);
	0.1.wait;
	~th1A.bout_(chb).bufRd(0.005, 0.5, 0.7, rate:~karcigarRD5, mul:0.9);

	0.15.wait;
	~th1A.bout_(chc).bufRd(0.01, 0.05, 1.3, rate:~karcigarRD7, mul:0.6);
	0.8.wait;
	~th1A.bout_(chd).bufRd(0.11, 0.5, 0.6, rate:~karcigarRE1, mul:0.3);
	0.19.wait;
	~th1A.bout_(cha).bufRd(0.005, 1.5, 2.1, rate:~karcigarRD5, mul:0.2);
	
	0.30.wait;
	~th1A.bout_(chb).bufRd(0.001, 0.5, 3.5, rate:~karcigarRE1, mul:0.8);
}
};
)


(

fork {
	var ch = ~ch3;
	
	~th1A.bout_(ch).bufRd(0.001, 0.1, 1, rate: ~karcigarRD7, mul:0.2);
	0.1.wait;
	~th1A.bout_(ch).bufRd(0.001, 0.1, 1.3, rate:~karcigarRD6, mul:0.2);
	0.08.wait;
	~th1A.bout_(ch).bufRd(0.011, 0.5, 1.5, rate:~karcigarRC7, mul:0.3);
	0.05.wait;
	~th1A.bout_(ch).bufRd(0.01, 4, 1.5, rate: ~karcigarRD2, mul:0.4);
	0.2.wait;
	~th1A.bout_(ch).bufRd(0.002, 5, 2.5, rate:~karcigarRB7, mul:0.5);
	
	0.17.wait;
	~th1A.bout_(ch).bufRd(0.0011, 0.5, 0.5, rate:~karcigarRD1, mul:0.6);
	0.3.wait;
	~th1A.bout_(ch).bufRd(0.1, 1.5, 0.3, rate:~karcigarRE1, mul:0.7);
	0.05.wait;
	~th1A.bout_(ch).bufRd(0.11, 0.5, 1.2, rate: ~karcigarRC4, mul:0.8);
	0.1.wait;
	~th1A.bout_(ch).bufRd(0.005, 0.5, 0.7, rate:~karcigarRD5, mul:0.9);

	0.15.wait;
	~th1A.bout_(ch).bufRd(0.01, 0.05, 1.3, rate:~karcigarRD7, mul:0.6);
	0.8.wait;
	~th1A.bout_(ch).bufRd(0.11, 0.5, 0.6, rate:~karcigarRE1, mul:0.3);
	0.19.wait;
	~th1A.bout_(ch).bufRd(0.005, 1.5, 2.1, rate:~karcigarRD5, mul:0.2);
	
	0.30.wait;
	~th1A.bout_(ch).bufRd(0.001, 0.5, 3.5, rate:~karcigarRE1, mul:0.8);
};
)


(

fork {
	var ch = ~ch1;
	
	~th1A.bout_(ch).bufRd(0.001, 0.1, 2, rate: ~karcigarRA6, mul:2);
	0.1.wait;
	~th1A.bout_(ch).bufRd(0.001, 0.1, 3, rate:~karcigarRB2);
	0.1.wait;
	~forGal1.bout_(ch).bufRd(1, 0.5, 1.5, rate:~karcigarRA7);
	1.03.wait;
	~forGal1.bout_(ch).bufRd(0.01, 4, 7.5, rate: ~karcigarRC3);
	~forGal1.bout_(ch).bufRd(0.002, 5, 4.5, rate:~karcigarRC8);
	
	3.1.wait;
	~forGal1.bout_(ch).bufRd(0.0011, 0.5, 3.5, rate:~karcigarRC4);
	0.1.wait;
	~th1A.bout_(ch).bufRd(0.1, 0.5, 3, rate:~karcigarRB3);
	1.1.wait;
	~forGal1.bout_(ch).bufRd(0.11, 1.5, 1, rate: ~karcigarRC1);
	0.1.wait;
	~forGal1.bout_(ch).bufRd(0.005, 2.5, 1, rate:~karcigarRD5);

	0.2.wait;
	~th1A.bout_(ch).bufRd(1, 0.5, 3, rate:~karcigarRE1);
	0.1.wait;
	~forGal1.bout_(ch).bufRd(0.11, 0.5, 6, rate:~karcigarRC3);
	0.3.wait;
	~th1A.bout_(ch).bufRd(0.005, 1.5, 2, rate:~karcigarRC1);
	
	2.1.wait;
	~forGal1.bout_(ch).bufRd(0.001, 0.5, 5, rate:~karcigarRD1);
};
)




//////////////////////-------FFTry----//////////////////////

~agN01 = Buffer.read(s, "sounds/~zkm1/agacNor.aif");

~zil01 = Buffer.read(s, "sounds/~zkm1/zilA01.aif");
~zil02 = Buffer.read(s, "sounds/~zkm1/zilA02.aif");
~zil03 = Buffer.read(s, "sounds/~zkm1/zilA03.aif");
~zil04 = Buffer.read(s, "sounds/~zkm1/zilA04.aif");
~gnB01 = Buffer.read(s, "sounds/~zkm1/simek2_Rev.aif");
~dun01 = Buffer.read(s, "sounds/~zkm1/dunA01.aif");
~bas01 = Buffer.read(s, "sounds/~zkm1/agacBass01.aif");
~agc01 = Buffer.read(s, "sounds/~zkm1/dran01.aif");
	

~zil01.play;




// spawn some FFT based synths:
(
SynthDef(\fftgrain, { |out, bufnum, sustain = 1, rate = 0.2, rate2 = 0.2, amp = 3.5|
	var in, chain;
	in = PlayBuf.ar(1, bufnum, BufRateScale.kr(bufnum)*rate/1.2, loop: 1);
	chain = FFT({LocalBuf(2048, 1)}.dup(2), in);
	chain = PV_BrickWall(chain, 
		SinOsc.kr(
			rate2 * XLine.kr(1, 15 * [1, 1.6], sustain), 
			Rand(0, pi)
		);
	); 
	Out.ar(out, IFFT(chain) * XLine.kr(2, 0.001, sustain, doneAction: 2)*amp) // inverse FFT
}).add;
)

(
SynthDef(\fftgrain, { |out, sustain = 1, rate = 0.2, rate2 = 0.2|
	var in, chain;
	in = PlayBuf.ar(1, bufnum, BufRateScale.kr(bufnum)*rate/1.2, loop: 1);
	chain = FFT({LocalBuf(2048, 1)}.dup(8), in);
	chain = PV_BrickWall(chain, 
		SinOsc.kr(
			rate2 * XLine.kr(1, 15 * [1, 1.6], sustain), 
			Rand(0, pi)
		);
	); 
	Out.ar(out, IFFT(chain) * XLine.kr(2, 0.001, sustain, doneAction: 2)) // inverse FFT
}).add;
)
	

Pdef(\fft01).play;
Pdef(\fft01).stop;


(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([[~zil01, ~zil02]], inf), 
	\rate, Pseq([~karcigarRA1], 1), 
	\rate2, Pseq([2.1], inf), 
	\legato, Pseq([4.5], inf),
	\dur, Pseq([2, 0.2, 0.1], inf),
	\out, Pseq([~ch1], inf),
	\amp, Pseq([0.2], inf)
));
)

(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([~zil01], inf), 
	\rate, Pseq([~karcigarRB1], 1), 
	\rate2, Pseq([2.1], inf), 
	\legato, Pseq([4.5], inf),
	\dur, Pseq([2, 0.2, 0.1], inf),
	\out, Pseq([~ch1], inf),
	\amp, Pseq([0.2], inf)
));
)


(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([~zil01], inf), 
	\rate, Pseq([~karcigarRC1], 1), 
	\rate2, Pseq([2.1], inf), 
	\legato, Pseq([4.5], inf),
	\dur, Pseq([2, 0.2, 0.1], inf),
	\out, Pseq([~ch1], inf),
	\amp, Pseq([0.2], inf)
));
)

(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([~zil01], inf), 
	\rate, Pseq([~karcigarRD1], 1), 
	\rate2, Pseq([2.1], inf), 
	\legato, Pseq([4.5], inf),
	\dur, Pseq([2, 0.2, 0.1], inf),
	\out, Pseq([~ch1], inf),
	\amp, Pseq([0.2], inf)
));
)

(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([~zil01], inf), 
	\rate, Pseq([~karcigarRE1], 1), 
	\rate2, Pseq([2.1], inf), 
	\legato, Pseq([4.5], inf),
	\dur, Pseq([2, 0.2, 0.1], inf),
	\out, Pseq([~ch1], inf),
	\amp, Pseq([0.2], inf)
));
)


(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([~zil01], inf), 
	\rate, Pseq([1], inf), 
	\rate2, Pseq([4], inf), 
	\legato, Pseq([2], inf),
	\dur, Pseq([0.1], inf),
	\out, Pseq([~ch1, ~ch2, ~ch3, ~ch4], inf)
));
)

(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([~zil02], inf), 
	\rate, Pseq([1], inf), 
	\rate2, Pseq([4], inf), 
	\legato, Pseq([3], inf),
	\dur, Pseq([0.1], inf),
	\out, Pseq([~ch1, ~ch2], inf)
));
)

(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([~zil03], inf), 
	\rate, Pseq([1], inf), 
	\rate2, Pseq([4], inf), 
	\legato, Pseq([2], inf),
	\dur, Pseq([0.1], inf),
	\out, Pseq([~ch1, ~ch2, ~ch3, ~ch4], inf)
));
)

(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([~zil03, ~zil02], inf), 
	\rate, Pseq([1], inf), 
	\rate2, Pseq([4], inf), 
	\legato, Pseq([2.5], inf),
	\dur, Pseq([0.1], inf),
	\out, Pseq([~ch1, ~ch2, ~ch3, ~ch4], inf)
));
)

(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([~zil03, ~zil02, ~zil01, ~zil04, ~gnB01], inf), 
	\rate, Pseq([~karcigarRC1, ~karcigarRC3, ~karcigarRC5, ~karcigarRD1, ~karcigarRC1, ~karcigarRC3, ~karcigarRC5, ~karcigarRD1], 1), 
	\rate2, Pseq([2.1], inf), 
	\legato, Pseq([4.5], inf),
	\dur, Pseq([0.1, 0.2, 0.1], inf),
	\out, Pseq([~ch1, ~ch2, ~ch3, ~ch4], inf)
));
)

(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([~zil01], inf), 
	\rate, Pseq([~karcigarRC1, ~karcigarRC3, ~karcigarRC5, ~karcigarRD1, ~karcigarRC1, ~karcigarRC3, ~karcigarRC5, ~karcigarRD1], inf), 
	\rate2, Pseq([1.1], inf), 
	\legato, Pseq([2.5], inf),
	\dur, Pseq([0.1, 0.2, 0.1]/2, inf),
	\out, Pseq([~ch3,~ch2], inf)
));
)

(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([~zil01, ~zil02, ~zil03, ~gnB01], inf), 
	\rate, Pseq([~karcigarRC1, ~karcigarRC3, ~karcigarRC5, ~karcigarRD1, ~karcigarRC1, ~karcigarRC3, ~karcigarRC5, ~karcigarRD1], inf), 
	\rate2, Pseq([2.1], inf), 
	\legato, Pseq([2.8], inf),
	\dur, Pseq([0.1, 0.2, 0.1]/2, inf),
	\out, Pseq([~ch1, ~ch4, ~ch3,~ch2], inf)
));
)

(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain, 
	\rate, Pwhite(-2, 4, inf), 
	\rate2, Pwhite(1, 12, inf).linexp(0, 1, 0.01, 300), 
	\legato, Pwhite(1, 3.0, inf),
	\dur, Prand([0.2, 1, 0.2], inf),
	\out, Pseq([~ch1, ~ch2, ~ch3, ~ch4], inf)
));
)	


///////////////////////////-------thol----------//////////////////////////////

~thol01 = {
	10.do{|i, frq = 1.8, dur = 0.05|
		var rates = frq + (0.1 *( i % 50)); 
		
		~th1A.bout_([~ch1, ~ch2, ~ch3, ~ch4].choose).playPV1(0.01, 0.5, 3, rate: rates);
		( dur + (0.05*(i%6)) ).yield;
	}
};

~thol02 = {
	8.do{|i, frq = 18.8, dur = 0.05|
		var rates = frq + (0.9 *( i % 50)); 
		
		~th1A.bout_([~ch1, ~ch2, ~ch3, ~ch4].choose).playPV1(0.01, 0.5, 3, rate: rates);
		( dur + (0.04*(i%9)) ).yield;
	}
};


~thol03 = {
	6.do{|i, frq = 18.8, dur = 0.05|
		var rates = frq + (1.9 *( i % 50)); 
		
		~th1A.bout_([~ch1, ~ch2, ~ch3, ~ch4].choose).playPV1(0.01, 0.5, 3, rate: rates);
		( dur + (0.4*(i%9)) ).yield;
	}
};

~thol04 = {
	10.do{|i, frq = 0.8, dur = 0.05|
		var rates = frq + (1.1 *( i % 50)); 
		
		~th1A.bout_([~ch1, ~ch2, ~ch3, ~ch4].choose).playPV1(0.01, 0.5, 3, rate: rates);
		( dur + (0.05*(i%6)) ).yield;
	}
};


~thol = {
	inf.do{
		~thol01.fork;
		2.9.yield;
		~thol02.fork;
		0.9.yield;
		~thol03.fork;
		1.9.yield;
		~thol04.fork;
		3.4.yield;
	}
}.fork;

~thol01Routine.stop;


///----------------------------------BELL--------------------------//////


fork{
	20.do{|i, frq = 2240, dur = 0.1|
		var freqs = frq + (12 *( i % 20)); 
		
		KafBell.ar(freq: freqs, out: [~ch1, ~ch2, ~ch3, ~ch4].choose).play;
		( dur + (0.1*(i%10)) ).yield;
	}
}


	
	
	
