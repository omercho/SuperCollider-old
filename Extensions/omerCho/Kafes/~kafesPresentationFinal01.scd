

// Some Sounds Samples Created with GENESIS


(
//:- Loading buffers..
~zil01 = Buffer.read(s, "sounds/zil_01_01.aif");
~zil02 = Buffer.read(s, "sounds/zil_01_02.aiff");
~zil03 = Buffer.read(s, "sounds/zil_01_03.aiff");
~zil04 = Buffer.read(s, "sounds/zil_01_04.aiff");
~zil05 = Buffer.read(s, "sounds/zil_01_05.aiff");
~zil07 = Buffer.read(s, "sounds/zil_01_07.aiff");
~zil09 = Buffer.read(s, "sounds/zil_01_09.aiff");
~zil10 = Buffer.read(s, "sounds/zil_01_10.aiff");
~zil11 = Buffer.read(s, "sounds/zil_01_11.aiff");
)

//:- playing them

~zil01.play;
~zil02.play;
~zil03.play;
~zil04.play;
~zil05.play;
~zil07.play;
~zil09.play;
~zil10.play;
~zil11.play;


// putting them in tags with the Preceive by IZ

(
Preceive(
	'tag1' -> {
		~zil01.play;
		},
	'tag2' -> {
		~zil02.play;
	
		},
	'3' -> {
		~zil03.play;
		},
	'chord' -> {
		~zil04.play;
		~zil05.play;
		~zil07.play;
		~zil11.play;
		},
	'chord1' -> {
		~zil03.play;
		~zil09.play;
		~zil10.play;
		},
	'b' -> {
		~zil03.play;

		},
	'7' -> {
		~zil03.play;

		},
	'chord2' -> {
		~zil03.play;
		~zil01.play;
		~zil11.play;

		},
	'9' -> {
		~zil09.play;
		},
	'10' -> {
		~zil10.play;
		}
).play;
)

Posc.play(
	[\tag1, \tag2, \3, \nil, \b, \chord1, \7, \chord2],
	\dur, 1
	
);


Posc.play(
	[\1, \b, \nil, \chord1, \b, \7, \chord2],
	\dur, 0.5
	
);

Posc.play(
	[\10, \b, \2, \chord1, \nil, \7, \chord2],
	\dur, 0.25
	
);

Posc.play(
	[\11, \b, \2, \chord1, \nil, \7, \chord2, \b],
	\dur, 0.25
	
);






(
SynthDef(\buf, { | out=0, bufnum = 0, rate = 0.1, startPos = 5, amp = 1.0, sustain = 1, pan = 0, wid = 2, loop = 1|
	var audio;
	rate = rate * BufRateScale.kr(bufnum);
	startPos = startPos * BufFrames.kr(bufnum);
	
	audio = BufRd.ar(1, bufnum, Phasor.ar(0, rate, startPos, BufFrames.ir(bufnum)), 2, 4);
	audio = EnvGen.ar(Env.sine, 1, timeScale: sustain, doneAction: 2) * audio;
	audio = Pan2.ar(audio, pan, amp*4);
	//audio = PanAz.ar( 8, audio, pan, amp*4, width: wid);
	OffsetOut.ar(out, audio);
}).add;
)


(	
	~ea = Pbind(*[
		\instrument,	\buf,
		\dur,		Pseq([0.5], inf),
		\legato,		Pseq([ (1..8) ], inf),
		\startPos,	0,
		\rate,		1,
		\sustain,		Pseq([ (1..1.5), 0.5 ], inf),
		\pan,  		Prand([ (-4..4),2, -1 ], inf),
		\bufnum,		Pseq([~zil01, ~zil03, ~zil05, ~zil07], inf)
	
	]);

	~ea1 = Pbind(*[
		\instrument,	\buf,
		\dur,		Pseq([0.5,0.1,0.001,2, 0.002, 1, 0.008, 0.4], inf),
		\legato,		Pseq([ (1..8) ], inf),
		\startPos,	0,
		\rate,		1,
		\sustain,		Pseq([ (6..1.5), 5 ], inf),
		\pan,  		Prand([ (-4..4),2, -1 ], inf),
		\bufnum,		Pseq([~zil01, ~zil03, ~zil05, ~zil07], inf)
	
	]);


	~ea2 = Pbind(*[
		\instrument,	\buf,
		\dur,		Pseq([1,0.1,0.001,2, 0.002, 3, 0.008, 0.4], inf),
		\legato,		Pseq([ (18..8),2 ], inf),
		\startPos,	Pseq([ (0..8)], inf),
		\rate,		Pwhite(0.1, 4).abs*2,
		\sustain,		Pseq([ (6..0.5),2 ], inf).linrand.cos*4,
		\pan,  		Pseq([ (-4..4),2, -1 ], inf),
		\bufnum,		Pseq([~zil01, ~zil02, ~zil03, ~zil04], inf)
	
	]);


	~ea3 = Pbind(*[
		\instrument,	\buf,
		\dur,		Pseq([1,0.1,0.001,2, 0.002, 3, 0.008, 0.4], inf),
		\legato,		Pseq([ (18..8),2 ], inf),
		\startPos,	Pseq([ (0..8)], inf),
		\rate,		Pwhite(0.1, 4).abs*2,
		\sustain,		Pseq([ (6..0.5),2 ], inf).linrand.cos*4,
		\pan,  		Pseq([ (-4..4),2, -1 ], inf),
		\bufnum,		Pseq([~zil01,~zil09, ~zil02, ~zil03, ~zil04], inf)
	
	]);

	~ea4 = Pbind(*[
		\instrument,	\buf,
		\dur,		Pseq([1,0.1,0.001,2, 0.002, 3, 0.008, 0.4], inf)/2,
		\legato,		Pseq([ (18..8),2 ], inf),
		\startPos,	Pseq([ (0..8)], inf),
		\rate,		Pwhite(0.1, 4).abs*2,
		\sustain,		Pseq([ (6..2.5),2 ], inf).linrand.cos*4,
		\pan,  		Pseq([ (-4..4),2, -1 ], inf),
		\bufnum,		Pseq([~zil01,~zil07, ~zil02, ~zil03, ~zil04, ~zil10, ~zil03], inf)
	
	]);

)




Pdef(\bufRand).play;
Pdef(\bufRand, ~ea);
Pdef(\bufRand, ~ea1);
Pdef(\bufRand, ~ea2);
Pdef(\bufRand, ~ea3);
Pdef(\bufRand, ~ea4);


Pdef(\bufRand).stop;



//--------------------Kaffer--------------//


		~gou01 = Kaffer.read(Server.default, "sounds/_kafes/goun/01.aif");
		~gou02 = Kaffer.read(Server.default, "sounds/_kafes/goun/02.aif");
		~gou03 = Kaffer.read(Server.default, "sounds/_kafes/goun/03.aif");
		~gou04 = Kaffer.read(Server.default, "sounds/_kafes/goun/04.aif");
		~gou05 = Kaffer.read(Server.default, "sounds/_kafes/goun/05.aif");




~gou01.play;
~gou01.playBuf(0.1, 2, 2, 0.9);
~gou01.playBufR(0.1, 5, 6, 0.9);

~int1.play0(0.001, 0.5, 2.1, 0.7, loop: 0);

~dlyStr1.brate_(1).play0(0.1, 0.5, 0.1);


(
Preceive(
	'1' -> {
		~zil01.play;
		},
	'2' -> {
		~zil02.play;
	
		},
	'3' -> {
		~zil03.play;
		},
	'chord' -> {
		~zil04.play;
		~zil05.play;
		~zil07.play;
		~zil11.play;
		},
	'chord1' -> {
		~zil03.play;
		~zil09.play;
		~zil10.play;
		},
	'b' -> {
		~zil03.play;

		},
	'7' -> {
		~zil03.play;

		},
	'chord2' -> {
		~zil03.play;
		~zil01.play;
		~zil11.play;

		},
	'9' -> {
		~zil09.play;
		},
	'10' -> {
		~zil10.play;
		}
).play;
)




//--------------------SCALES--------------//


"Pure intervals" (not tempered)

Examples: 
Octave
400 * 2
Fifth
400 * 3 / 2
Whole tone: 
400 * 9 / 8
Semitone 
400 * 16 / 15


"Subdivisions of the octave"

Examples: 

Octave / 2:  2 ** (1/2) 
Octave / 3:  2 ** (1/3) 
...
Octave / 12: 2 ** (1/12)
Octave / 53: 2 ** (1/53) 


3 semitones in 12 equal tempered system: 

400 * (2 ** (3/12))
general reference: frequency * (subdivided interval ** (number of steps / number of subdivisions))

Which means that interval is: 
(subdivided interval ** (number of steps / number of subdivisions))
Subdivided interval: octave => 2
Number of steps: The number of semitones or commas or ...
number of subdivisions: 12 semitones, 53 commas ...



i = 2 ** ([2, 1, 2, 2, 2, 1, 2 ] / 12);

 
~la = 440;
~si = ~la * i[0];
~do = ~si * i[2];
~do = ~si * i[2];

//MAKAM

Do Ê Ê ÊKaba Cargah Ê Ê Ê Ê Ê = Ê Ê Ê256
ÊÊ Ê Ê Ê ÊKaba Nim Hicaz Ê Ê Ê= Ê Ê Ê269,695
ÊÊ Ê Ê Ê ÊKaba Hicaz Ê Ê Ê Ê Ê= Ê Ê Ê273,375
ÊÊ Ê Ê Ê ÊKaba Dik Hicaz Ê Ê Ê= Ê Ê Ê284,123
Re Ê Ê ÊYegah Ê Ê Ê Ê Ê Ê ÊÊ Ê= Ê Ê Ê288
ÊÊ Ê Ê Ê ÊKaba Nim Hisar Ê ÊÊ = Ê Ê Ê303,157
ÊÊ Ê Ê Ê ÊKaba Hisar Ê Ê Ê Ê Ê= Ê Ê Ê307,546
ÊÊ Ê Ê Ê ÊKaba Dik Hisar Ê Ê Ê= Ê Ê Ê319,639
Mi Ê Ê ÊHuseyni Asiran Ê Ê Ê Ê= Ê Ê Ê324
Fa Ê Ê ÊAcem Asiran Ê Ê Ê Ê Ê = Ê Ê Ê341,333
ÊÊ Ê Ê Ê ÊDik Acem Asiran Ê Ê = Ê Ê Ê345,5
ÊÊ Ê Ê Ê ÊIrak Ê Ê Ê Ê Ê Ê Ê Ê= Ê Ê Ê359,593
ÊÊ Ê Ê Ê ÊGevest Ê Ê Ê ÊÊ Ê Ê = Ê Ê Ê364,5
ÊÊ Ê Ê Ê ÊDik Gevest Ê Ê  Ê Ê = Ê Ê Ê378,831
Sol Ê Ê Rast Ê Ê Ê Ê ÊÊ Ê Ê Ê = Ê Ê Ê384
ÊÊ Ê Ê Ê ÊNim Zirgule Ê Ê Ê Ê = Ê Ê Ê404,548
ÊÊ Ê Ê Ê ÊZirgule Ê Ê Ê ÊÊ Ê Ê= Ê Ê Ê410,062
ÊÊ Ê Ê Ê ÊDik Zirgule Ê Ê  Ê Ê= Ê Ê Ê426,185
La Ê Ê ÊDugah Ê Ê Ê Ê Ê Ê Ê Ê = Ê Ê Ê440 
ÊÊ Ê Ê Ê ÊKurdi Ê Ê ÊÊ Ê Ê Ê Ê= Ê Ê Ê455,111
ÊÊ Ê Ê Ê ÊDik KurdiÊ Ê Ê Ê Ê Ê= Ê Ê Ê461,320
ÊÊ Ê Ê Ê ÊSegah Ê Ê Ê Ê Ê  Ê Ê= Ê Ê Ê479,478
Si Ê Ê Ê Buselik Ê Ê Ê ÊÊ Ê Ê = Ê Ê Ê486
ÊÊ Ê Ê Ê ÊDik Buselik Ê Ê Ê Ê = Ê Ê Ê505,108
Do Ê Ê ÊCargah Ê Ê Ê Ê Ê Ê Ê Ê= Ê Ê Ê512
 
 


Cargah Makami
a- Duragi:	Cargah veya kabaCargah perdesidir.
b- Seyri:		Cikici veya cikici-inici.
c- Dizisi:	Cargah veya kabaCargah perdesi uzerindeki bir Cargah beslisine 5. derece uzerinden bir Cargah dortlusunun eklenmesinden meydana gelmistir.
d- Guclusu:	Rast veya Gerdaniye prdesidir.


~f=1; 		//Koma 
~e=3; 		//Koma3 
~b=4; 		//Bakiye 
~s=5; 		//KucukMucenneb 
~k=8; 		//BuyukMucenneb 
~t=9; 		//Tanini 
~a12=12; 	//ArtikIkili
~a13=13; 	//ArtikIkili

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


Pbind(
	\freq, Pseq([~cargah, ~neva, ~huseyni, ~acem, ~gerdaniye, ~muhayyer, ~tizBuselik, ~tizCargah], inf),
	\dur, Pseq([1] / 2, 8),
	\amp, 0.08,
	\octave, 2,
	\stepsPerOctave, 53
).play;


Pbind(
	\freq, Pseq([~cargah, ~neva, ~huseyni, ~acem, ~gerdaniye, ~muhayyer, ~tizBuselik, ~tizCargah].mirror, inf),
	\dur, Pseq([1] / 2, inf),
	\amp, 0.08,
	\octave, 2,
	\stepsPerOctave, 53
).play;


i = 2 ** ([~t, ~t, ~b, ~t, ~t, ~t, ~b] / 53); //Cmajor

~kabaCargah = 1;
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



(
SynthDef(\buf, { | out=0, bufnum = 0, 
				rate = 0.1, startPos = 0, amp = 1.0, 
				gate = 1, att = 0.1, dec = 1.1, sus = 1, rls = 0.2, 
				pan = 0, wid = 2, loop = 0|
	var env, audio;
	//rate = rate * BufRateScale.kr(bufnum);
	startPos = startPos * BufFrames.kr(bufnum);
	
	env = EnvGen.ar(Env.adsr(att, dec, sus, rls, 1, -1), gate, doneAction: 2);
	
	audio = PlayBuf.ar(1, bufnum, BufRateScale.kr(bufnum)*rate, startPos: startPos, loop:1);
	
	audio = Pan2.ar(audio, pan, amp*6);
	//audio = PanAz.ar( 8, audio, pan, amp*6, width: wid);
	Out.ar(out, audio* env);
}).add;
)

(
Pdef(\bufRand, Pbind(*[
		\instrument,	\buf,
		\dur,		Pseq([0.5], inf),
		\startPos,	0,
		\rate,		Pseq([~cargah, ~neva, ~huseyni, ~acem, ~gerdaniye, ~muhayyer, ~tizBuselik, ~tizCargah], inf),
		\sus,		Pseq([1], inf),
		\pan,  		Pwhite(-0.5, 0.5, inf),
		\bufnum,		Pseq([~gir01], inf)
])).play;
)

(
Pdef(\bufRand, Pbind(*[
		\instrument,	\buf,
		\dur,		Pseq([0.1], inf),
		\startPos,	0.0,
		\rate,		Pseq([~cargah, ~neva, ~huseyni, ~acem, ~gerdaniye, ~muhayyer, ~tizBuselik, ~tizCargah].mirror2, inf),
		\sus,		Pseq([1], inf),
		\pan,  		Pwhite(-0.5, 0.5, inf),
		\bufnum,		Pseq([~gir01], inf)
])).play;
)








//---------------------------------FFT--------------------------------------------//

~gnB01 = Buffer.read(s, "sounds/~zkm1/simek2_Rev.aif");

~gnB01.play

(
SynthDef(\fftgrain, { |out, bufnum, sustain = 1, rate = 0.2, rate2 = 0.2|
	var in, chain;
	in = PlayBuf.ar(1, bufnum, BufRateScale.kr(bufnum)*rate, loop: 1);
	chain = FFT({LocalBuf(2048, 2)}.dup(8), in);
	chain = PV_BrickWall(
		chain, 
		SinOsc.kr(
			rate2 * 
			XLine.kr(
				1, 
				15 * [1, 1.6], 
				sustain
			), 
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
	\bufnum, Pseq([~gnB01], inf), 
	\rate, Pseq([1], inf), 
	\rate2, Pseq([4, 5, 3, 6, 2, 1], inf), 
	\legato, Pseq([3.5], inf),
	\dur, Pseries(0.1, 1, inf)*Pseq([1, 0.9, 0.8, 0.7, 0.6, 0.5, 0.4, 0.3, 0.2].mirror2, 1)
));
)


//
(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([~gnB01], inf), 
	\rate, Pseq([0.5], inf), 
	\rate2, Pseq([4, 5, 3, 6, 2, 1], inf), 
	\legato, Pseq([3.5], inf),
	\dur, Pseries(0.1, 1, inf)*Pseq([1, 0.9, 0.8, 0.7, 0.6, 0.5, 0.4, 0.3, 0.2].mirror2, 1)
));
)


(
Pdef(\fft01, Pbind(
	\instrument, \fftgrain,
	\bufnum, Pseq([~agc01], inf), 
	\rate, Pseq([1], inf), 
	\rate2, Pseq([4, 5, 3, 6, 2, 1], inf), 
	\legato, Pseq([3.5], inf),
	\dur, Pseq([1, 0.9, 0.8, 0.7, 0.6, 0.5, 0.4, 0.3, 0.2, 3]*0.2, 1)
));
)




//------------------------DigitalDrum----------------------------//

//SoundIn Trigger


( // trigger a synth 
SynthDef("help-EnvGen",{ arg out=0;
	Out.ar(out,
		EnvGen.kr(Env.perc,1.0,doneAction: 2) 
			* SinOsc.ar(440,0,0.1)
	)
}).send(s);

// This synth has no output. It only checks amplitude of input and looks for a transition from > 0.2
// to < 0.2

SynthDef("help-<= trig", {
	SendTrig.kr(Amplitude.kr(SoundIn.ar(0)) <= 0.01);
}).play(s);

// responder to trigger synth
OSCresponderNode(s.addr,'/tr',{ "triggered".postln; Synth.new("help-EnvGen") }).add;
)






(
SynthDef('digDrum', {
	var in, sinyal;

	p= Trig.ar(Saw.ar(18), LFNoise2.ar(4, 0.5, 5));
	y= SinOsc.ar(p*SoundIn.ar(0, 1.2));
	z= SinOsc.ar(p* LFNoise2.ar(4, 0.5, 5));
	in = GrainIn.ar(
			2, 	//channelNum
			y, 	//trigger
			y,	//duration-the size of the grain
			z,	//input to granulate
			p*z,	//pan
			-1	//buf num containing a singal to use for the grain envelope. -1 uses a built-in Hanning envelope.
		);
	in = in * Amplitude.kr(SoundIn.ar(0, 0.2));
	sinyal = GVerb.ar(
		in, 
		20.2, //room
		4,
		0.4
	)*8;
	Out.ar(0, sinyal*2);
}).send(Server.default);

~drum = Synth(\digDrum);
)



//----------------------ZIRKONIUM--------------------------//

//--messages

[ "/pan/xy", channel=int, x=float, y=float, xspan=float, xspan=float, gain=float ]



network address

z = NetAddr("localhost", 2001);

//ch1
z.sendMsg("/pan/xy", 0, 0.0, 0.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 0.1, 0.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 0.2, 0.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 0.3, 0.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 0.4, 0.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 0.5, 0.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 0.6, 0.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 0.7, 0.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 0.8, 0.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 0.9, 0.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 0.0, 0.0, 0.0, 1.0);

z.sendMsg("/pan/xy", 0, 1.0, 0.1, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 0.2, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 0.3, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 4.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 7.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 8.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 9.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 10.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 11.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 12.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 13.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 14.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 15.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 16.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 17.0, 0.0, 0.0, 1.0);
z.sendMsg("/pan/xy", 0, 1.0, 18.0, 0.0, 0.0, 1.0);




z.sendMsg("/pan/xy", 1, 0.5, 0.0, 0.0, 0.0, 1.0);






//:examp01

~zrk = {
	~delayTime = 0.1;
	~panx = 0.0;
	~pany = 0.0;
	~xspan = 0.0;
	~yspan = 0.0; 
	z = NetAddr("localhost", 2001);
	inf.do{ |i|
		~panx = sin(i*0.01);
		~pany = cos(i*0.01);
		i.postln;		
		z.sendMsg("/pan/xy", 0, ~panx, ~pany, ~xspan, ~yspan, 1.0);
		//z.sendMsg("/pan/xy", 1, 1-~panx, 1-~pany, 0.3, 0.3, 1.0);
		~delayTime.wait;
	}
}.fork 


~pany3 = -1.0;
~pany2 = -1.0;

//:examp02 y=x
z = NetAddr("localhost", 2001);
	~delayTime2 = 0.05;
	~panx2 = -1.0;
	~pany2 = -1.0;
	~xspan = 0.0;
	~yspan = 0.0; 
	~step = 0.1;
(
	
~zrk2 = {
	inf.do{ |i|	
		~pany2 = ~pany2 + ~step;
		~panx2 = ~pany2;
		~pany2.postln;		
		z.sendMsg("/pan/xy", 1, ~panx2, ~pany2, ~xspan, ~yspan, 1.0);
		~delayTime2.wait;
		
		if (~pany2 > 1, {~step = -1*~step});
		if (~pany2 < -1, {~step = -1*~step});
	}
}.fork 
)

//:examp02 y=x
z = NetAddr("localhost", 2001);
	~delayTime3 = 0.05;
	~panx3 = 1.0;
	~pany3 = -1.0;
	~xspan = 0.0;
	~yspan = 0.0; 
	~step3 = 0.1;
(	
~zrk3 = {
	inf.do{ |i|	
		~pany3 = ~pany3+~step3;
		~panx3 = -1*~pany3;
		~pany3.postln;		
		z.sendMsg("/pan/xy", 0, ~panx3, ~pany3, ~xspan, ~yspan, 1.0);
		~delayTime2.wait;
		
		if (~pany3 > 1, {~step3 = -1*~step3});
		if (~pany3 < -1, {~step3 = -1*~step3});
	}
}.fork 
)














//:POsc dont work
Pdef(\zirkDef01, Posc(
	\msg, Pseq([
		["/pan/xy", 0, 0.4 rrand: 0.5, 0.8, 0.3, 0.3, 1.0],
		["/pan/xy", 1, 0.0 rrand: 1.0, 0.8, 0.3, 0.3, 1.0],
		["/pan/xy", 0, 0.0 rrand: 1.0, 0.8, 0.3, 0.3, 1.0],
		["/pan/xy", 1, 0.0 rrand: 1.0, 0.8, 0.3, 0.3, 1.0]
		], inf),
	\dur, 0.1,
	\dest, NetAddr("localhost", 2001)
));
Pdef(\zirkDef01).play;



//--------------------------VISUALS---------------------------//


OF.img(0,0,0,1280,720);
OF.bg(0,0,0)
OF.img(0,0,0,200,200);

OF.int("mirrorMode",0);
OF.int("mirrorMode",1);
OF.int("mirrorMode",4);
OF.int("mirrorMode",5);

//:Small fill the screen by grid
k = {
	~delayTime = 0.1;
	~countX = 0; 
	~countY = 0;
	~screenWidth = 1280;
	~screenHeight = 720;
	~fotoWidth = ~fotoHeight = ~screenWidth/20;
	~fotoHeight = ~fotoWidth;
	inf.do{
	7.do{ |i|
		i.postln;		
		OF.img(i, ~countX, ~countY, ~fotoWidth, ~fotoHeight);
		
		~countX = ~countX + ~fotoWidth;
		if (~countX>~screenWidth, {~countX = 0;~countY = ~countY + ~fotoHeight});
		if (~countY>~screenHeight, {~countY = 0;});
		~delayTime.wait;
	}
	}
	
}.fork 
//:Small random position
k = {
	OF.img(0,0,0,1280,720);
	~delayTime = 0.02;
	~countX = 0; 
	~countY = 0;
	~screenWidth = 1280;
	~screenHeight = 720;
	~fotoWidth = ~fotoHeight = ~screenWidth/20;
	~fotoHeight = ~fotoWidth;
	inf.do{
	186.do{ |i|
		i.postln;		
		OF.img(185.rand.asInteger, ~screenWidth.rand,  ~screenHeight.rand, 100, 100*720/1280);
		~delayTime.wait;
	}
	}
	
}.fork 


//:Small random position  random size
k = {
	OF.img(0,0,0,1280,720);
	~delayTime = 0.05;
	~countX = 0; 
	~countY = 0;
	~screenWidth = 1280;
	~screenHeight = 720;
	~fotoWidth = ~fotoHeight = ~screenWidth/20;
	~fotoHeight = ~fotoWidth;
	inf.do{
	18.do{ |i|
		i.postln;		
		OF.img(185.rand.asInteger, ~screenWidth.rand,  ~screenHeight.rand, 1000.rand, 600.rand);
		~delayTime.wait;
	}
	}
	
}.fork 

//:Center Slide show
~delayTime = 0.01;
k = {
	~delayTime = 0.05;
	~countX = 0; 
	~countY = 0;
	~screenWidth = 1280;
	~screenHeight = 780;
	~fotoWidth = ~fotoHeight = ~screenWidth/20;
	~fotoHeight = ~fotoWidth;
	inf.do{
		8.do{ |i|
			186.postln;		
			OF.img(i, 0,0, ~screenWidth, ~screenHeight);
			~delayTime.wait;
		}
	}
	
}.fork 
//:Random Slide show
~delayTime = 0.01;
k = {
	~delayTime = 0.1;
	~countX = 0; 
	~countY = 0;
	~screenWidth = 1280;
	~screenHeight = 780;
	~fotoWidth = ~fotoHeight = ~screenWidth/20;
	~fotoHeight = ~fotoWidth;
	inf.do{
		186.do{ |i|
			186.postln;		
			OF.img(186.rand.asInteger, 0,0, ~screenWidth, ~screenHeight);
			~delayTime.wait;
		}
	}
	
}.fork 

//:Many images
k = {
	~delayTime = 0.01;
	~countX = 0; 
	~countY = 0;
	~screenWidth = 1280;
	~screenHeight = 780;
	~fotoWidth = ~fotoHeight = ~screenWidth/20;
	~fotoHeight = ~fotoWidth;
	
	inf.do{ |i|
				
		OF.img((0..200).choose.round, ~countX, ~countY, ~fotoWidth, ~fotoHeight);
		~countX = ~countX + ~fotoWidth;
		if (~countX>~screenWidth, {~countX = 0;~countY = ~countY + ~fotoHeight});
		if (~countY>~screenHeight, {~countY = 0;});
		~delayTime.wait;
	}
	
}.fork 
//:--

OF.int("yPosImage", 100)
OF.int("xPosImage", 100)
OF.int("wImg", 100 rrand: 500)
OF.int("mirrorMode",0);
//:Create Synth from function
a = SynthDef(\synthFunc, { |delayTime = 0.01, countX = 0, countY = 0, screenWidth = 1280, screenHeight = 1024, fotoWidth, fotoHeight|
	
	fotoWidth = screenWidth/20;
	fotoHeight = screenWidth/20;
	10.do{ |i|
				
//		OF.img((0..60).choose.round, countX, countY, fotoWidth, fotoHeight);
//		countX = countX + fotoWidth;
//		if (countX>screenWidth, {countX = 0;countY = countY + fotoHeight});
//		if (countY>screenHeight, {countY = 0;});
		//delayTime.wait;
	}

	
	
	}).send(s);

//:Play with width and height
k = {
	inf.do	{
	OF.int("wImg", 100 rrand: 1500);
	OF.int("hImg", 100 rrand: 1500);			
	0.3.wait
	}
	
}.fork;
//:Play with width and height
k = {
	inf.do	{ |i|
	OF.int("wImg", i);
	OF.int("hImg", i);			
	0.3.wait
	}
	
}.fork;

//:Precieve
Preceive(
	'af1' -> {
		
		OF.img(0,0,0,200,200);
		
		},
	'af2' -> {
		OF.img(0,0,0,200,200);
		},
	'af3' -> {
		OF.img("af3");
		},
	'af4' -> {
		OF.img("af4");
		},
	'af5' -> {
		OF.img("af5");
		},
	'af6' -> {
		OF.img("af6");
		},
	'af7' -> {
		OF.img("af7");
		},
	'2' -> {
		~klk = Synth("over", [
			\atk, 0.5,
			\sus, 1,
			\rel, 4,
			\pan, 1.0.rand2,
			\freqs,  {6000.0.linrand+80}.dup(12),
			\rings, {0.1.rrand(3)}.dup(12)
		]);
		}
).play;


//:Play Pdef
Pdef(\fullScreen).play;	
//:Fill the screen with a foto
Pdef(\fullScreen, Posc(
		\msg, Pseq([['img', 0, 0, 0, 600,600]], inf),
		\dur, Pseq([~duyekDur], inf),
		\dest,  [NetAddr.localAddr, NetAddr("localhost", 12345)]
		)
	);
	
//:Duyek
a = Pdef(\klank, Posc(
		\msg, Pseq([\af1, \af2, \af3, \af4, \af5, \af6, \af7], inf),
		\dur, Pseq([~duyekDur]*0.1, inf),
		\dest,  [NetAddr.localAddr, NetAddr("localhost", 12345)]
		)
	);
//:duyekKudDur
Pdef(\klank, Posc(
		\msg, Pseq([\af1, \af2], inf),
		\dur, Pseq([~duyekKudDur]*0.5, inf),
		\dest,  [NetAddr.localAddr, NetAddr("localhost", 12345)]
		)
	);

//:Posc with predefine TempoClock
Pdef(\klank, Posc(
		\msg, Pseq([\1, \2, \3, \4], inf),
		\dur, Pseq([~duyekDur]*4, inf),
		\dest,  [NetAddr.localAddr, NetAddr("localhost", 12345)]
		)
	).play(~clock1);
//:Other

Posc.play(
	[0,1,2,3,4],
	\dur, 2
	
);
//:--




//:-----
















