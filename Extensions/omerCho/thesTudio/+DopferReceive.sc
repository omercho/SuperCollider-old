
/*
Dopfer01Receive.load;
*/


Dopfer01Receive {
	*load {
///////////////////////////////////////

var d;

MIDIClient.init;
MIDIIn.connect;
//v = MIDIOut(0);
d = MIDIOut.newByName("USB Uno MIDI Interface", "USB Uno MIDI Interface");

//	Tags
~dopf01 = Preceive(
	
	\a1 -> {
		d.bend(0, 1);
		
		},
	\a2 -> {
		d.bend(0, 12);
		},
	\a3 -> {
		d.bend(0, 8);
		},
	\a4 -> {
		d.bend(0, 4);
		},
	\a5 -> {
		d.bend(0, 5);
		}
).play;

//////////////////////////////////////
	}
	*unLoad { 
	}
}

/*

Dopfer01Receive.load;

(
Pdef(\dop01, Posc(
	[\msg, \dur ], 
	Prand([ 
		[\a1, 1/4], [\a2, 1/4], [\a3, 1/4], [\a4, 1/4], [\a5, 1/4]
	], inf)
	)
);
)

Pdef(\dop01).play;

Pdef(\dop01).stop;






ERGASTIRIO




Pdef(\doepfer).stop;


(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([1]/8, inf), 
		\midinote, Pseq([36, 0, 38, 0, 38+12, 0, 36, 0,  38, 0, 38+7, 0, 36, 0, 38, 0]+8, inf),
		\legato, Pseq([0, 0.5, 0, 0.2]+1.5, inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 1, 0], inf)
	)
); 
)

(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([ Pseq([1/8], 8*7), Pseq([1], 2) ], inf), 
		\midinote, Pseq([36, 0, 38, 0, 38+12, 0, 36, 0,  38, 0, 38+7, 0, 36, 0, 38, 0]+8, inf),
		\legato, Pseq([0, 0.5, 0, 0.2]+0.5, inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 1, 0], inf)
	)
); 
)

(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([ Pseq([1/8], 16), Pseq([1]/16, 12) ], inf), 
		\midinote, Pseq([36, 0, 38, 0, 38+12, 0, 36, 0,  38, 0, 38+7, 0, 36, 0, 38, 0]+8, inf),
		\legato, Pseq([2, 0, 0.5, 0]+0.5, inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 1, 0], inf)
	)
); 
)


(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([1]/8, inf), 
		\midinote, Pseq([36, 0, 38, 0, 38+12, 0, 36, 0,  38, 0, 38+7, 0, 36, 0, 38, 0], inf),
		\legato, Pseq([0, 0, 0, 0]+0.5, inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 1, 0], inf)
	)
); 
)

(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([1]/8, inf), 
		\midinote, Pseq([36, 0, 38, 0, 38+12, 0, 36, 0,  38, 0, 38+7, 0, 36, 0, 38, 0], inf),
		\legato, Pseq([0, 0, 0, 0]+1.5, inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 1, 0], inf)
	)
); 
)

(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([1]/8, inf), 
		\midinote, Pseq([36, 0, 38, 0, 38+12, 0, 36, 0,  38, 0, 38+7, 0, 36, 0, 38, 0]-1, inf),
		\legato, Pseq([0, 0.5, 0, 0.2]+1.5, inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 1, 0], inf)
	)
); 
)

(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([1]/8, inf), 
		\midinote, Pseq([36, 0, 38, 0, 38+12, 0, 36, 0,  38, 0, 38+7, 0, 36, 0, 38, 0]+8, inf),
		\legato, Pseq([0, 0, 0, 0]+1.5, inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 1, 0], inf)
	)
); 
)




*/