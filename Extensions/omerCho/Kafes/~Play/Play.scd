~forGal1 = Kaffer.read(Server.default, "sounds/agacMono01.aif");
~th1A = Kaffer.read(Server.default, "sounds/~kafes/~thol/thol1A.aif");
~forGal1.play;
~forGal1.bout_(~ch3).playBuf(0.01, 5, 5, rate: 4.rand);
~th1A.bout_(~ch4).playBuf(0.01, 5, 5, rate: 10.0);


(

fork {
	var cha = ~ch1;
	var chb = ~ch2;
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
};
)



(

fork {|i|
	var cha = ~ch2;
	var chb = ~ch4;
	var chc = ~ch3;
	var chd = ~ch3;
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
	var ch = ~ch2;
	
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

	
(
{ var inA, chainA, inB, chainB, chain;
	inA = LFSaw.ar([100, 150], 0, 0.2);
	inB = PlayBuf.ar(1, ~agN01, BufRateScale.kr(d), loop: 1);
	chainA = FFT(LocalBuf(2048), inA);
	chainB = FFT(LocalBuf(2048), inB);
	chain = PV_MagMul(chainA, chainB); // writes into bufferA
	0.1 * IFFT(chain);
}.play(s);
)

d.free;


// spawn some FFT based synths:
(
SynthDef(\fftgrain, { |out, bufnum, sustain = 1, rate = 0.2, rate2 = 0.2|
	var in, chain;
	in = PlayBuf.ar(1, bufnum, BufRateScale.kr(bufnum)*rate/1.2, loop: 1);
	chain = FFT({LocalBuf(2048, 2)}.dup(8), in);
	chain = PV_BrickWall(chain, 
		SinOsc.kr(
			rate2 * XLine.kr(1, 15 * [1, 1.6], sustain), 
			Rand(0, pi)
		);
	); 
	Out.ar(out, IFFT(chain) * XLine.kr(2, 0.001, sustain, doneAction: 2)*3) // inverse FFT
}).add;
)

(
SynthDef(\fftgrain, { |out, sustain = 1, rate = 0.2, rate2 = 0.2|
	var in, chain;
	in = PlayBuf.ar(1, bufnum, BufRateScale.kr(bufnum)*rate/1.2, loop: 1);
	chain = FFT({LocalBuf(2048, 2)}.dup(8), in);
	chain = PV_BrickWall(chain, 
		SinOsc.kr(
			rate2 * XLine.kr(1, 15 * [1, 1.6], sustain), 
			Rand(0, pi)
		);
	); 
	Out.ar(out, IFFT(chain) * XLine.kr(2, 0.001, sustain, doneAction: 2)) // inverse FFT
}).add;
)

(
Pbind(
	\instrument, \fftgrain, 
	\bufnum, Pseq([~zil01], inf),
	\rate, Pwhite(-12, 14, inf), 
	\rate2, Pwhite(1, 12, inf).linexp(0, 1, 0.01, 300), 
	\legato, Pwhite(1, 3.0, inf),
	\dur, Prand([0.2, 1, 1.2], inf)
).play
)
	

Pdef(\fft01).play;
Pdef(\fft01).stop;

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
	\bufnum, Pshuf([~zil03, ~zil02, ~zil01, ~zil04, ~gnB01], inf), 
	\rate, Pseq([~karcigarRC1, ~karcigarRC3, ~karcigarRC5, ~karcigarRD1, ~karcigarRC1, ~karcigarRC3, ~karcigarRC5, ~karcigarRD1], inf), 
	\rate2, Pseq([2.1], inf), 
	\legato, Pseq([4.5], inf),
	\dur, Pseq([0.1, 0.2, 0.1], inf),
	\out, Pseq([~ch1, ~ch2, ~ch3, ~ch4], inf)
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
	
	
	
	
