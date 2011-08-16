//////////// initialize the midi ////////////

(
MIDIClient.init;
MIDIIn.connect;
v = MIDIOut(0);
d = MIDIOut.newByName("UM-2G", "Port 1");
)

d.noteOn(0, 41, 60);  	/// for doepfer
d.noteOff(0, 41, 60);
d.bend(0, 12);
d.control(0, 1, 10);
v.noteOn(1, 30, 60); // for vermona

///////////set up and start midiclock///////////

p = MIDIClockOut.new("UM-2G", "Port 1");

p.play;
//////////////tempo/////////////////

Tempo.bpm = 100;

///////////////patterns//////////////

(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		\midiout, d,
		\dur, Pseq([1]/8, inf), 
		\chan, 0,
		\midinote, Pseq([36, 0, 38, 0, 38+12, 0, 36, 0,  38, 0, 38+7, 0, 36, 0, 38, 0], inf),
		\legato, Pseq([0, 0, 0, 0]+0.5, inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 1, 0], inf)
	)
).play; 
)

(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		\midiout, d,
		\dur, Pseq([1]/8, inf), 
		\chan, 0,
		\midinote, Pseq([36, 0, 36+4, 0, 36+12, 0, 36, 0, 36+4, 0, 36+12, 0, 36, 0, 36+12, 0], inf),
		\legato, Pseq([0, 0, 0, 0]+0.5, inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 1, 0], inf)
	)
); 
)
(
Pdef(\doepfer2,	
	Pbind(\type, \midi,
		\midiout, d,
		\ctlNum, 1,
		\dur, Pseq([1]/8, inf), 
		\chan, 0,
		\bend, Pseq([0, 0, 0, 0]+70, inf),
		\control, Pseq([0, 0, 40, 40], inf)
	)
); 
)


Pdef(\vermona7,	
	Pbind(\type, \midi,
		\midiout, v,
		\dur, Pseq([1]/8, inf), 
		\chan, 1,
		\midinote, Pseq([~kick], inf),
		\amp,  Pseq([1, 0, 0.5, 0, 0.5, 0, 0.25, 0.25], inf)
	)
); 


Pdef(\vermona7,	
	Pbind(\type, \midi,
		[\midiout, \chan],  [v, 1],
		\dur, Pseq([1]/8, inf), 
		\midinote, Pseq([~kick], inf),
		\amp,  Pseq([1, 0, 0, 0, 1, 0, 0, 0], inf)
	)
).play; 

(
Pdef(\vermona7,	
	Pbind(\type, \midi,
		[\midiout, \chan],  [v, 1],
		\dur, Pseq([1]/8, inf), 
		\midinote, Pseq([~kick], inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 0.5, 0], 1)
	)
).play; 
)
Pdef(\vermona17,	
	Pbind(\type, \midi,
		\midiout, v,
		\dur, Pseq([1]/8, inf), 
		\chan, 1,
		\midinote, Pseq([~drum1], inf),
		\amp,  Pseq([0, 0, 1, 0, 0, 1, 0, 1], inf)
	)
).play; 

Pdef(\vermona8,	
	Pbind(\type, \midi,
		\midiout, v,
		\dur, Pseq([1]/8, inf), 
		\chan, 1,
		\midinote, Pseq([~kick], inf),
		\amp,  Pseq([1, 0, 0, 0, 0, 0, 0, 0], inf)
	)
).play; 

Pdef(\vermona1,	
	Pbind(\type, \midi,
		\midiout, v,
		\dur, Pseq([1]/8, inf), 
		\chan, 1,
		\midinote, Pseq([~drum2], inf),
		\amp,  Pseq([0, 0, 0, 0, 1, 0, 0, 0], inf)
	)
).play; 


Pdef(\vermona1,	
	Pbind(\type, \midi,
		\midiout, v,
		\dur, Pseq([1]/8, inf), 
		\chan, 2,
		\midinote, Pseq([~snare], inf),
		\amp,  Pseq([0, 0, 0, 0, 1, 0, 0, 0], inf)
	)
).play; 

Pdef(\vermona11,	
	Pbind(\type, \midi,
		\midiout, v,
		\dur, Pseq([1]/8, inf), 
		\chan, 1,
		\midinote, Pseq([~hihat1c], inf),
		\amp,  Pseq([0, 0, 0, 0, 0, 0, 0, 0], inf)
	)
); 


Pdef(\vermona211,	
	Pbind(\type, \midi,
		\midiout, v,
		\dur, Pseq([1]/8, inf), 
		\chan, 1,
		\midinote, Pseq([~hihat2c], inf),
		\amp,  Pseq([0, 0, 1, 0, 0, 0, 1, 0], inf)
	)
).play; 

Pdef(\vermona111,	
	Pbind(\type, \midi,
		\midiout, v,
		\dur, Pseq([1]/8, inf), 
		\chan, 1,
		\midinote, Pseq([~hihat1o], inf),
		\amp,  Pseq([1, 0, 0, 0, 1, 0, 0, 0], inf)
	)
); 


MIDIOut
//////////////grains/////////////
~section1 = Event make: {
		~melody = PatternProxy(Pwhite(36, 70));
		~dur = PatternProxy(Pseq([1]/180, inf));
		~pattern = Pbind(
						\type, \midi,
						\midiout, d,
						\dur, ~dur,
						\chan, 0,
						\midinote, ~melody,
						\amp, Pseq([1, 0,0,0, 1, 0,0,0], inf)
						);
		~player = ~pattern.play;
}

~section1.melody.source = Pseq([36], inf);
~section1.melody.source = Pwhite(36, 70);
~section1.melody.source = Pseq([38], inf);
~section1.melody.source = Pseq([38+48], inf);
~section1.melody.source = Pseq([36, 38], inf);
~section1.melody.source = Pseq([36, 38, 36+14], inf);
~section1.dur.source = Pseq([1]/100, inf);
~section1.dur.source = Pseq([1]/8, inf);

////////////////////Tasksss/////////////////
(
~tpat1 =
	Task({
		loop({
				~section1.melody.source = Pseq([38], inf);
				3.wait;
				~section1.melody.source = Pseq([36], inf);
				1.5.wait;
				~section1.melody.source = Pseq([36+24], inf);
				0.5.wait;
		});
	})
)
~tpat1.start;
~tpat1.stop;

(
~tpat2 =
	Task({
		loop({
				~section1.dur.source = Pseq([1]/20, inf);
				1.wait;
				~section1.dur.source = Pseq([1]/100, inf);
				1.wait;
				
		});
	})
)
~tpat2.start;
~tpat2.stop;

////////////////////////////////////////

Pdef(\doepfer,	
	Pbind(\type, \midi,
		\midiout, d,
		\dur, Pseq([1]/180, inf), 
		\chan, 0,
		\midinote, Pwhite(36, 36+60, inf),
		\amp,  Pseq([1, 0, 0, 0, 1, 0, 0, 0], inf)
	)
); 

/////////////////////////////////////

(
~rec = Buffer.alloc(s, s.sampleRate * 2, 1); // a 5 second 1 channel Buffer
~b1 = Buffer.alloc(s, s.sampleRate*8, 1);
~b2 = Buffer.alloc(s, s.sampleRate*2, 1);
)

(
	// record for four seconds
SynthDef("recBuffer1",{ arg out=0,bufnum=0;
	var noise;
	noise = SoundIn.ar(1, 2);		// record sound input
	RecordBuf.ar(noise, bufnum); 	// by default this loops
}).add;

//Phasor.ar(0.01, rate, startPos, BufFrames.ir(bufnum))
//SinOsc.ar(0.1) * BufFrames.ir(0)
SynthDef(\buf, { | out=0, bufnum = 0, rate = 1, startPos = 0, amp = 1.0, sustain = 1, pan = 0, loop = 1|
	var audio;
	rate = rate * BufRateScale.kr(bufnum);
	startPos = startPos * BufFrames.kr(bufnum);
	audio = BufRd.ar(1, bufnum, Phasor.ar(0.01, rate, startPos, BufFrames.ir(bufnum)), 1, 4);
	audio = EnvGen.ar(Env.perc, 1.5, timeScale: sustain, doneAction: 2) * audio;
	audio = Pan2.ar(audio, pan, amp*4);
	OffsetOut.ar(out, audio);
}).add;

SynthDef(\tap1, {|bufnum, delay1, delay2, rate = 2.9|
	var source, capture, tap, env; 
	source= SoundIn.ar(0, 2); //use headphones to avoid feedback
	capture= BufWr.ar(source, bufnum, Phasor.ar(0,1, 0 , BufFrames.ir(bufnum) * rate,1));
	tap = Tap.ar(bufnum, 1, [delay1, delay2]);
	//env = EnvGen.ar(Env.sine, 1.5, timeScale:5, doneAction: 2);
	//tap = CombN.ar(tap, 0.2, 0.2, 3, mul:1.1);
	Out.ar(0, tap); //multichannel expansion, so one tap each ear  
}).send(s);



// trig with MouseY
SynthDef("scramble", { arg out=0, bufnum=0, trig = 0, wipe = 0, width = 0;
	var in, chain;
	in = SoundIn.ar(1, 2);
	chain = FFT(LocalBuf(2048), in);
	chain = PV_BinScramble(chain, wipe, width, Impulse.kr(trig)); 
	Out.ar(out, 0.5 * IFFT(chain).dup);
}).send(s);
/*

(
// trig with MouseY
SynthDef("help-binScramble", { arg out=0, bufnum=0;
	var in, chain;
	in = SoundIn.ar(1, 2);
	chain = FFT(LocalBuf(2048), in);
	chain = PV_BinScramble(chain, MouseX.kr , 0.1, MouseY.kr > 0.5 ); 
	Out.ar(out, 0.5 * IFFT(chain).dup);
}).play(s,[\out, 0, \bufnum, b]);
)
*/

)	


Pdef(
	\scr,
	Pmono(
		\scramble,
		\dur, 4,
		\wipe, Pseq([1], inf),
		\width, Pseq([1], inf), 
		\trig, Pseq([4], inf),
		\out, 0
		)
).play;
		
~scramble.free;	
~scramble = Synth.new(\scramble, [\out, 0, \bufnum, 0]);

~scramble.set(\trig, 16, \width, 0.2, \wipe, 0.2);

~recBuf = Synth(\recBuffer1, [\out, 0, \bufnum, ~rec]);

Pdef(\buf2, Pbind(
	\instrument,	\buf,
	\amp,		Pseq([0, 0.5, 0, 0.5], inf),
	\dur,		Pseq([1]/4, inf),
	\startPos,	0,
	\rate,		Pseq([1, 1, 1, -2, 1, 1, 1, 2]*2, inf),
	\sustain,		Pseq([ 1.0, 0.5, 1 ], inf),
	\pan,  		Pseq([ 0], inf),
	\bufnum,		 Pseq([~rec], inf)
)).play;

