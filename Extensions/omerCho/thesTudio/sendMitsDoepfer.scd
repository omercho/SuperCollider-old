(
MIDIClient.init;
MIDIIn.connect;
//v = MIDIOut(0);
d = MIDIOut.newByName("UM-2G", "Port 1");
)


~clock1 = TempoClock.new(1, 16, Main.elapsedTime.ceil); 

~clock1.tempo_(1.0);
~clock1.tempo_(0.1);
~clock1.tempo_(4.0);





Pdef(\mits01).play(~clock1);

Pdef(\doepfer).play(~clock1);


(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([1/4], inf), 
		\midinote, Pseq([
			36, 0, 0, 0, 0, 0, 0, 0,  0, 36, 0, 0, 0, 0, 0, 0
			], inf),
		\amp,  Pseq([
			1, 1, 1, 1, 1, 1, 1, 1, 1, 0.4, 1, 1, 1, 1, 1, 1
			], inf),
		\legato, Pseq([
			0, 0, 0, 0, 0, 0, 0, 0, 0, 1.5, 0, 0, 0, 0, 0, 0
			], inf)
	)
); 
)

(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([1/4], inf), 
		\midinote, Pseq([
			36, 0, 0, 0, 0, 0, 0, 0,  0, 36, 0, 0, 0, 0, 36*4, 0
			], inf),
		\amp,  Pseq([
			1, 1, 1, 1, 1, 1, 1, 1, 1, 0.4, 1, 1, 1, 1, 1, 1
			], inf),
		\legato, Pseq([
			0, 0, 0, 0, 0, 0, 0, 0, 0, 1.5, 0, 0, 0, 0, 0, 0
			], inf)
	)
); 
)


(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([1/4], inf), 
		\midinote, Pseq([
			36, 0, 0, 0, 0, 0, 0, 0,  0, 36, 0, 0, 0, 0, 36*4, 0
			], inf),
		\amp,  Pseq([
			1, 1, 1, 1, 1, 1, 1, 1, 1, 0.4, 1, 1, 1, 1, 1, 1
			], inf),
		\legato, Pseq([
			0, 0, 0, 0, 0, 0, 0, 0, 0, 1.5, 0, 0, 0, 0, 0, 0
			], inf)
	)
); 
)

(
Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([1/4], inf), 
		\midinote, Pseq([
			36, 0, 0, 0, 0, 0, 0, 0,  0, 36, 0, 0, 0, 0, 36*4, 0
			]+12, inf),
		\amp,  Pseq([
			1, 1, 1, 1, 1, 1, 1, 1, 1, 0.4, 1, 1, 1, 1, 1, 1
			], inf),
		\legato, Pseq([
			0, 0, 0, 0, 0, 0, 0, 0, 0, 1.5, 0, 0, 0, 0, 0, 0
			], inf)
	)
); 
)




////-------1------/////
(
Pdef(\mits01, Posc(
	\msg, Pseq(
		[
		\1, \2, \3, \4, \5, \6, \7, \8, 
		\9, \10, \11, \12, \13, \14, \15, \16
		], inf
	),
	\dur, Pseq([
			1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4,
			1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4
			], inf),
	\dest, [NetAddr.localAddr, NetAddr("192.168.1.7", 57122)]
));


Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([1/4], inf), 
		\midinote, Pseq([
			36, 0, 0, 0, 0, 0, 0, 0,  0, 36, 0, 0, 0, 0, 0, 0
			], inf),
		\amp,  Pseq([
			1, 1, 1, 1, 1, 1, 1, 1, 1, 0.4, 1, 1, 1, 1, 1, 1
			], inf),
		\legato, Pseq([
			0, 0, 0, 0, 0, 0, 0, 0, 0, 1.5, 0, 0, 0, 0, 0, 0
			], inf)
	)
);
)

//////////-----------shuf---------///////
(
Pdef(\mits01, Posc(
	\msg, Pshuf(
		[
		\1, \2, \3, \4, \5, \6, \7, \8, 
		\9, \10, \11, \12, \13, \14, \15, \16
		], inf
	),
	\dur, Pseq([
			1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4,
			1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4
			], inf),
	\dest, [NetAddr.localAddr, NetAddr("192.168.1.7", 57122)]
));


Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([1/4], inf), 
		\midinote, Pshuf([
			36, 0, 0, 0, 0, 0, 0, 0,  0, 36, 0, 0, 0, 0, 0, 0
			], inf),
		\amp,  Pseq([
			1, 1, 1, 1, 1, 1, 1, 1, 1, 0.4, 1, 1, 1, 1, 1, 1
			], inf),
		\legato, Pseq([
			0.1, 0, 0, 0, 0, 0, 0, 0, 0, 1.5, 0, 0, 0, 0, 0, 0
			], inf)
	)
);
)

//////////-----------rand---------///////
(
Pdef(\mits01, Posc(
	\msg, Prand(
		[
		\1, \2, \3, \4, \5, \6, \7, \8, 
		\9, \10, \11, \12, \13, \14, \15, \16
		], inf
	),
	\dur, Pseq([
			1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4,
			1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4
			], inf),
	\dest, [NetAddr.localAddr, NetAddr("192.168.1.7", 57122)]
));


Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([1/4], inf), 
		\midinote, Prand([
			36, 0, 0, 0, 0, 0, 0, 0,  0, 36, 0, 0, 0, 0, 0, 0
			], inf),
		\amp,  Pseq([
			1, 1, 1, 1, 1, 1, 1, 1, 1, 0.4, 1, 1, 1, 1, 1, 1
			], inf),
		\legato, Pseq([
			0.1, 0, 0, 0, 0, 0, 0, 0, 0, 1.5, 0, 0, 0, 0, 0, 0
			], inf)
	)
);
)



////-------2------/////
(
Pdef(\mits01, Posc(
	\msg, Pseq(
		[
		\1, \2, \3, \4, \5, \6, \7, \8, 
		\9, \10, \11, \12, \13, \14, \15, \16
		], inf
	),
	\dur, Pseq([
			1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4,
			1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4
			], inf),
	\dest, [NetAddr.localAddr, NetAddr("192.168.1.7", 57122)]
));


Pdef(\doepfer,	
	Pbind(\type, \midi,
		[\midiout, \chan], [d, 0],
		\dur, Pseq([
			1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4,
			1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4, 1/4
			], inf), 
		\midinote, Pseq([
			36, 0, 0, 0, 0, 0, 0, 0,  
			0, 37, 0, 0, 0, 0, 0, 0
			], inf),
		\amp,  Pseq([
			1, 1, 1, 1, 1, 1, 1, 
			1, 1, 0.4, 1, 1, 1, 1, 1, 1
			], inf),
		\legato, Pseq([
			0, 0, 0, 0, 0, 0, 0, 0, 
			0, 1.5, 0, 0, 0, 0, 0, 0
			], inf)
	)
);
)

