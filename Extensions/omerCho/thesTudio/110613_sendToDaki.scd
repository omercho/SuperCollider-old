

~clock1 = TempoClock.new(1, 8, Main.elapsedTime.ceil); 

~clock1.tempo_(1.0);
~clock1.tempo_(0.1);
~clock1.tempo_(4.0);


(
Pdef(\dak01, Posc(
	[\msg, \dur ], 
	Prand([ 
		[\1, 1/4], [\2, 1/4], [\3, 1/4], [\4, 1/4], [\5, 1/4], [\6, 1/4], [\7, 1/4], [\8, 1/4]
	], inf),
	\dest, [NetAddr.localAddr, NetAddr("192.168.1.3", 57120)]
	)
);
)

(
Pdef(\dak01, Posc(
	[\msg, \dur ], 
	Pseq([ 
		[\1, 1/4], [\2, 1/4], [\3, 1/4], [\4, 1/4], [\5, 1/4], [\6, 1/4], [\7, 1/4], [\8, 1/4]
	], inf),
	\dest, [NetAddr.localAddr, NetAddr("192.168.1.3", 57120)]
	)
);
)


(
Pdef(\dak01, Posc(
	[\msg, \dur ], 
	Pshuf([ 
		[\1, 1/4], [\2, 1/4], [\3, 1/4], [\4, 1/4], [\5, 1/4], [\6, 1/4], [\7, 1/4], [\8, 1/4]
	], inf),
	\dest, [NetAddr.localAddr, NetAddr("192.168.1.3", 57120)]
	)
);
)


Pdef(\dak01).play(~clock1);

Pdef(\dak01).stop;


(
Pdef(\dop01, Posc(
	[\msg, \dur ], 
	Prand([ 
		[\a1, 1/4], [\a2, 1/4], [\a3, 1/4], [\a4, 1/4], [\a5, 1/4]
	], inf)
	)
);
)

Pdef(\dop01).play(~clock1);

Pdef(\dop01).stop;



Pdef(\doepfer).play(~clock1);


(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([1/4], inf), 
		\midinote, Pseq([36, 0, 38, 0, 38+12, 0, 36, 0,  38, 0, 38+7, 0, 36, 0, 38, 0], inf),
		\legato, Pseq([0, 0.5, 0, 0.2]+1.5, inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 1, 0], inf)
	)
); 
)

(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([ Pseq([1/4], 7), Pseq([1/8], 8) ], inf), 
		\midinote, Prand([36, 0, 38, 0, 40, 0, 46, 0,  48, 0, 48+7, 0, 36, 0, 38, 0]+12, inf),
		\legato, Pseq([0, 0.5, 0, 0.2]+0.5, inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 1, 0], inf)
	)
); 
)

(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Prand([ 
			Pseq([1] /4, 4) 
			], inf), 
		\midinote, Prand([36, 0, 38, 0, 38+12, 0, 36, 0,  38, 0, 38+7, 0, 36, 0, 38, 0]-1, inf),
		\legato, Pseq([0, 0.5, 0, 0.2]+5.5, inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 1, 0], inf)
	)
); 
)

(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Prand([ 
			Pseq([1] /4, 4) 
			], inf), 
		\midinote, Prand([36, 0, 38, 0, 38+12, 0, 36, 0,  38, 0, 38+7, 0, 36, 0, 38, 0]/1, inf),
		\legato, Pseq([0, 0.5, 0, 0.2]+5.5, inf),
		\amp,  Pseq([1, 0, 1, 0, 1, 0, 1, 0], inf)
	)
); 
)