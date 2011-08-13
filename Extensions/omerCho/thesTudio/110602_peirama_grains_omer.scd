{\rtf1\ansi\ansicpg1252\cocoartf1038
{\fonttbl\f0\fnil\fcharset0 Monaco;\f1\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;\red255\green0\blue0;\red255\green255\blue255;\red0\green128\blue255;
\red250\green248\blue227;\red167\green167\blue167;\red51\green153\blue26;\red0\green128\blue255;\red51\green153\blue26;
}
\deftab560
\pard\pardeftab560\ql\qnatural

\f0\fs24 \cf2 //////////// initialize the midi ////////////\cf3 \
\
(\
\cf4 MIDIClient\cf3 .init;\
\cf4 MIDIIn\cf3 .connect;\
v = \cf4 MIDIOut\cf3 (\cf5 0\cf3 );\
\cf2 //d = MIDIOut.newByName("UM-2G", "Port 1");\cf3 \
)\
\
d.noteOn(\cf5 0\cf3 , \cf5 41\cf3 , \cf5 60\cf3 );  	\cf2 /// for doepfer\cf3 \
d.noteOff(\cf5 0\cf3 , \cf5 41\cf3 , \cf5 60\cf3 );\
d.bend(\cf5 0\cf3 , \cf5 12\cf3 );\
d.control(\cf5 0\cf3 , \cf5 1\cf3 , \cf5 10\cf3 );\
v.noteOn(\cf5 1\cf3 , \cf5 30\cf3 , \cf5 60\cf3 ); \cf2 // for vermona\cf3 \
\
\cf2 ///////////set up and start midiclock///////////\cf3 \
\
p = \cf4 MIDIClockOut\cf3 .new(\cf6 "UM-2G"\cf3 , \cf6 "Port 1"\cf3 );\
\
p.play;\
\cf2 //////////////tempo/////////////////\cf3 \
\
\cf4 Tempo\cf3 .bpm = \cf5 100\cf3 ;\
\
\cf2 ///////////////patterns//////////////\cf3 \
\
(\
\cf4 Pdef\cf3 (\cf7 \\doepfer\cf3 ,	\
	\cf4 Pbind\cf3 (\cf7 \\type\cf3 , \cf7 \\midi\cf3 ,\
		\cf7 \\midiout\cf3 , d,\
		\cf7 \\dur\cf3 , \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 8\cf3 , \cf4 inf\cf3 ), \
		\cf7 \\chan\cf3 , \cf5 0\cf3 ,\
		\cf7 \\midinote\cf3 , \cf4 Pseq\cf3 ([\cf5 36\cf3 , \cf5 0\cf3 , \cf5 38\cf3 , \cf5 0\cf3 , \cf5 38\cf3 +\cf5 12\cf3 , \cf5 0\cf3 , \cf5 36\cf3 , \cf5 0\cf3 ,  \cf5 38\cf3 , \cf5 0\cf3 , \cf5 38\cf3 +\cf5 7\cf3 , \cf5 0\cf3 , \cf5 36\cf3 , \cf5 0\cf3 , \cf5 38\cf3 , \cf5 0\cf3 ], \cf4 inf\cf3 ),\
		\cf7 \\legato\cf3 , \cf4 Pseq\cf3 ([\cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 ]+\cf5 0.5\cf3 , \cf4 inf\cf3 ),\
		\cf7 \\amp\cf3 ,  \cf4 Pseq\cf3 ([\cf5 1\cf3 , \cf5 0\cf3 , \cf5 1\cf3 , \cf5 0\cf3 , \cf5 1\cf3 , \cf5 0\cf3 , \cf5 1\cf3 , \cf5 0\cf3 ], \cf4 inf\cf3 )\
	)\
).play; \
)\
\
(\
\cf4 Pdef\cf3 (\cf7 \\doepfer\cf3 ,	\
	\cf4 Pbind\cf3 (\cf7 \\type\cf3 , \cf7 \\midi\cf3 ,\
		\cf7 \\midiout\cf3 , d,\
		\cf7 \\dur\cf3 , \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 8\cf3 , \cf4 inf\cf3 ), \
		\cf7 \\chan\cf3 , \cf5 0\cf3 ,\
		\cf7 \\midinote\cf3 , \cf4 Pseq\cf3 ([\cf5 36\cf3 , \cf5 0\cf3 , \cf5 36\cf3 +\cf5 4\cf3 , \cf5 0\cf3 , \cf5 36\cf3 +\cf5 12\cf3 , \cf5 0\cf3 , \cf5 36\cf3 , \cf5 0\cf3 , \cf5 36\cf3 +\cf5 4\cf3 , \cf5 0\cf3 , \cf5 36\cf3 +\cf5 12\cf3 , \cf5 0\cf3 , \cf5 36\cf3 , \cf5 0\cf3 , \cf5 36\cf3 +\cf5 12\cf3 , \cf5 0\cf3 ], \cf4 inf\cf3 ),\
		\cf7 \\legato\cf3 , \cf4 Pseq\cf3 ([\cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 ]+\cf5 0.5\cf3 , \cf4 inf\cf3 ),\
		\cf7 \\amp\cf3 ,  \cf4 Pseq\cf3 ([\cf5 1\cf3 , \cf5 0\cf3 , \cf5 1\cf3 , \cf5 0\cf3 , \cf5 1\cf3 , \cf5 0\cf3 , \cf5 1\cf3 , \cf5 0\cf3 ], \cf4 inf\cf3 )\
	)\
); \
)\
(\
\cf4 Pdef\cf3 (\cf7 \\doepfer2\cf3 ,	\
	\cf4 Pbind\cf3 (\cf7 \\type\cf3 , \cf7 \\midi\cf3 ,\
		\cf7 \\midiout\cf3 , d,\
		\cf7 \\ctlNum\cf3 , \cf5 1\cf3 ,\
		\cf7 \\dur\cf3 , \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 8\cf3 , \cf4 inf\cf3 ), \
		\cf7 \\chan\cf3 , \cf5 0\cf3 ,\
		\cf7 \\bend\cf3 , \cf4 Pseq\cf3 ([\cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 ]+\cf5 70\cf3 , \cf4 inf\cf3 ),\
		\cf7 \\control\cf3 , \cf4 Pseq\cf3 ([\cf5 0\cf3 , \cf5 0\cf3 , \cf5 40\cf3 , \cf5 40\cf3 ], \cf4 inf\cf3 )\
	)\
); \
)\
\
\
\cf4 Pdef\cf3 (\cf7 \\vermona7\cf3 ,	\
	\cf4 Pbind\cf3 (\cf7 \\type\cf3 , \cf7 \\midi\cf3 ,\
		\cf7 \\midiout\cf3 , v,\
		\cf7 \\dur\cf3 , \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 8\cf3 , \cf4 inf\cf3 ), \
		\cf7 \\chan\cf3 , \cf5 1\cf3 ,\
		\cf7 \\midinote\cf3 , \cf4 Pseq\cf3 ([~kick], \cf4 inf\cf3 ),\
		\cf7 \\amp\cf3 ,  \cf4 Pseq\cf3 ([\cf5 1\cf3 , \cf5 0\cf3 , \cf5 0.5\cf3 , \cf5 0\cf3 , \cf5 0.5\cf3 , \cf5 0\cf3 , \cf5 0.25\cf3 , \cf5 0.25\cf3 ], \cf4 inf\cf3 )\
	)\
); \
\
\
\cf8 Pdef\cf1 (\cf9 \\vermona7\cf1 ,	\
	\cf8 Pbind\cf1 (\cf9 \\type\cf1 , \cf9 \\midi\cf1 ,\
		[\cf9 \\midiout\cf1 , \cf9 \\chan], \cf1  [v, \cf5 1],\cf1 \
		\cf9 \\dur\cf1 , \cf8 Pseq\cf1 ([\cf5 1\cf1 ]/\cf5 8\cf1 , \cf8 inf\cf1 ), \
		\cf9 \\midinote\cf1 , \cf8 Pseq\cf1 ([~kick], \cf8 inf\cf1 ),\
		\cf9 \\amp\cf1 ,  \cf8 Pseq\cf1 ([\cf5 1\cf1 , \cf5 0\cf1 , \cf5 0\cf1 , \cf5 0\cf1 , \cf5 1\cf1 , \cf5 0\cf1 , \cf5 0\cf1 , \cf5 0\cf1 ], \cf8 inf\cf1 )\
	)\
).play; \cf3 \
\
(\
\cf8 Pdef\cf1 (\cf9 \\vermona7\cf1 ,	\
	\cf8 Pbind\cf1 (\cf9 \\type\cf1 , \cf9 \\midi\cf1 ,\
		[\cf9 \\midiout\cf1 , \cf9 \\chan], \cf1  [v, \cf5 1],\cf1 \
		\cf9 \\dur\cf1 , \cf8 Pseq\cf1 ([\cf5 1\cf1 ]/\cf5 8\cf1 , \cf8 inf\cf1 ), \
		\cf9 \\midinote\cf1 , \cf8 Pseq\cf1 ([~kick], \cf8 inf\cf1 ),\
		\cf9 \\amp\cf1 ,  \cf8 Pseq\cf1 ([\cf5 1\cf1 , \cf5 0\cf1 , \cf5 1\cf1 , \cf5 0\cf1 , \cf5 1\cf1 , \cf5 0\cf1 , \cf5 0.5\cf1 , \cf5 0\cf1 ], \cf8 1\cf1 )\
	)\
).play; \cf3 \
)\
\cf4 Pdef\cf3 (\cf7 \\vermona17\cf3 ,	\
	\cf4 Pbind\cf3 (\cf7 \\type\cf3 , \cf7 \\midi\cf3 ,\
		\cf7 \\midiout\cf3 , v,\
		\cf7 \\dur\cf3 , \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 8\cf3 , \cf4 inf\cf3 ), \
		\cf7 \\chan\cf3 , \cf5 1\cf3 ,\
		\cf7 \\midinote\cf3 , \cf4 Pseq\cf3 ([~drum1], \cf4 inf\cf3 ),\
		\cf7 \\amp\cf3 ,  \cf4 Pseq\cf3 ([\cf5 0\cf3 , \cf5 0\cf3 , \cf5 1\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 1\cf3 , \cf5 0\cf3 , \cf5 1\cf3 ], \cf4 inf\cf3 )\
	)\
).play; \
\
\cf4 Pdef\cf3 (\cf7 \\vermona8\cf3 ,	\
	\cf4 Pbind\cf3 (\cf7 \\type\cf3 , \cf7 \\midi\cf3 ,\
		\cf7 \\midiout\cf3 , v,\
		\cf7 \\dur\cf3 , \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 8\cf3 , \cf4 inf\cf3 ), \
		\cf7 \\chan\cf3 , \cf5 1\cf3 ,\
		\cf7 \\midinote\cf3 , \cf4 Pseq\cf3 ([~kick], \cf4 inf\cf3 ),\
		\cf7 \\amp\cf3 ,  \cf4 Pseq\cf3 ([\cf5 1\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 ], \cf4 inf\cf3 )\
	)\
).play; \
\
\cf4 Pdef\cf3 (\cf7 \\vermona1\cf3 ,	\
	\cf4 Pbind\cf3 (\cf7 \\type\cf3 , \cf7 \\midi\cf3 ,\
		\cf7 \\midiout\cf3 , v,\
		\cf7 \\dur\cf3 , \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 8\cf3 , \cf4 inf\cf3 ), \
		\cf7 \\chan\cf3 , \cf5 1\cf3 ,\
		\cf7 \\midinote\cf3 , \cf4 Pseq\cf3 ([~drum2], \cf4 inf\cf3 ),\
		\cf7 \\amp\cf3 ,  \cf4 Pseq\cf3 ([\cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 1\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 ], \cf4 inf\cf3 )\
	)\
).play; \
\
\
\cf8 Pdef\cf1 (\cf9 \\vermona1\cf1 ,	\
	\cf8 Pbind\cf1 (\cf9 \\type\cf1 , \cf9 \\midi\cf1 ,\
		\cf9 \\midiout\cf1 , v,\
		\cf9 \\dur\cf1 , \cf8 Pseq\cf1 ([\cf5 1\cf1 ]/\cf5 8\cf1 , \cf8 inf\cf1 ), \
		\cf9 \\chan\cf1 , \cf5 2\cf1 ,\
		\cf9 \\midinote\cf1 , \cf8 Pseq\cf1 ([~snare], \cf8 inf\cf1 ),\
		\cf9 \\amp\cf1 ,  \cf8 Pseq\cf1 ([\cf5 0\cf1 , \cf5 0\cf1 , \cf5 0\cf1 , \cf5 0\cf1 , \cf5 1\cf1 , \cf5 0\cf1 , \cf5 0, 0\cf1 ], \cf8 inf\cf1 )\
	)\
).play; \
\cf3 \
\cf4 Pdef\cf3 (\cf7 \\vermona11\cf3 ,	\
	\cf4 Pbind\cf3 (\cf7 \\type\cf3 , \cf7 \\midi\cf3 ,\
		\cf7 \\midiout\cf3 , v,\
		\cf7 \\dur\cf3 , \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 8\cf3 , \cf4 inf\cf3 ), \
		\cf7 \\chan\cf3 , \cf5 1\cf3 ,\
		\cf7 \\midinote\cf3 , \cf4 Pseq\cf3 ([~hihat1c], \cf4 inf\cf3 ),\
		\cf7 \\amp\cf3 ,  \cf4 Pseq\cf3 ([\cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , 0, \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 ], \cf4 inf\cf3 )\
	)\
); \
\
\cf1 \
\cf8 Pdef\cf1 (\cf9 \\vermona211\cf1 ,	\
	\cf8 Pbind\cf1 (\cf9 \\type\cf1 , \cf9 \\midi\cf1 ,\
		\cf9 \\midiout\cf1 , v,\
		\cf9 \\dur\cf1 , \cf8 Pseq\cf1 ([\cf5 1\cf1 ]/\cf5 8\cf1 , \cf8 inf\cf1 ), \
		\cf9 \\chan\cf1 , \cf5 1\cf1 ,\
		\cf9 \\midinote\cf1 , \cf8 Pseq\cf1 ([~hihat2c], \cf8 inf\cf1 ),\
		\cf9 \\amp\cf1 ,  \cf8 Pseq\cf1 ([\cf5 0\cf1 , \cf5 0\cf1 , \cf5 1\cf1 , \cf5 0\cf1 , \cf5 0\cf1 , \cf5 0\cf1 , \cf5 1\cf1 , \cf5 0\cf1 ], \cf8 inf\cf1 )\
	)\
).play; \cf3 \
\
\cf4 Pdef\cf3 (\cf7 \\vermona111\cf3 ,	\
	\cf4 Pbind\cf3 (\cf7 \\type\cf3 , \cf7 \\midi\cf3 ,\
		\cf7 \\midiout\cf3 , v,\
		\cf7 \\dur\cf3 , \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 8\cf3 , \cf4 inf\cf3 ), \
		\cf7 \\chan\cf3 , \cf5 1\cf3 ,\
		\cf7 \\midinote\cf3 , \cf4 Pseq\cf3 ([~hihat1o], \cf4 inf\cf3 ),\
		\cf7 \\amp\cf3 ,  \cf4 Pseq\cf3 ([\cf5 1\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 1\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 ], \cf4 inf\cf3 )\
	)\
); \
\
\
\cf4 MIDIOut\cf3 \
\cf2 //////////////grains/////////////\cf3 \
~section1 = \cf4 Event\cf3  make: \{\
		~melody = \cf4 PatternProxy\cf3 (\cf4 Pwhite\cf3 (\cf5 36\cf3 , \cf5 70\cf3 ));\
		~dur = \cf4 PatternProxy\cf3 (\cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 180\cf3 , \cf4 inf\cf3 ));\
		~pattern = \cf4 Pbind\cf3 (\
						\cf7 \\type\cf3 , \cf7 \\midi\cf3 ,\
						\cf7 \\midiout\cf3 , d,\
						\cf7 \\dur\cf3 , ~dur,\
						\cf7 \\chan\cf3 , \cf5 0\cf3 ,\
						\cf7 \\midinote\cf3 , ~melody,\
						\cf7 \\amp\cf3 , \cf4 Pseq\cf3 ([\cf5 1\cf3 , \cf5 0\cf3 ,\cf5 0\cf3 ,\cf5 0\cf3 , \cf5 1\cf3 , \cf5 0\cf3 ,\cf5 0\cf3 ,\cf5 0\cf3 ], \cf4 inf\cf3 )\
						);\
		~player = ~pattern.play;\
\}\
\
~section1.melody.source = \cf4 Pseq\cf3 ([\cf5 36\cf3 ], \cf4 inf\cf3 );\
~section1.melody.source = \cf4 Pwhite\cf3 (\cf5 36\cf3 , \cf5 70\cf3 );\
~section1.melody.source = \cf4 Pseq\cf3 ([\cf5 38\cf3 ], \cf4 inf\cf3 );\
~section1.melody.source = \cf4 Pseq\cf3 ([\cf5 38\cf3 +\cf5 48\cf3 ], \cf4 inf\cf3 );\
~section1.melody.source = \cf4 Pseq\cf3 ([\cf5 36\cf3 , \cf5 38\cf3 ], \cf4 inf\cf3 );\
~section1.melody.source = \cf4 Pseq\cf3 ([\cf5 36\cf3 , \cf5 38\cf3 , \cf5 36\cf3 +\cf5 14\cf3 ], \cf4 inf\cf3 );\
~section1.dur.source = \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 100\cf3 , \cf4 inf\cf3 );\
~section1.dur.source = \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 8\cf3 , \cf4 inf\cf3 );\
\
\cf2 ////////////////////Tasksss/////////////////\cf3 \
(\
~tpat1 =\
	\cf4 Task\cf3 (\{\
		loop(\{\
				~section1.melody.source = \cf4 Pseq\cf3 ([\cf5 38\cf3 ], \cf4 inf\cf3 );\
				\cf5 3\cf3 .wait;\
				~section1.melody.source = \cf4 Pseq\cf3 ([\cf5 36\cf3 ], \cf4 inf\cf3 );\
				\cf5 1.5\cf3 .wait;\
				~section1.melody.source = \cf4 Pseq\cf3 ([\cf5 36\cf3 +\cf5 24\cf3 ], \cf4 inf\cf3 );\
				\cf5 0.5\cf3 .wait;\
		\});\
	\})\
)\
~tpat1.start;\
~tpat1.stop;\
\
(\
~tpat2 =\
	\cf4 Task\cf3 (\{\
		loop(\{\
				~section1.dur.source = \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 20\cf3 , \cf4 inf\cf3 );\
				\cf5 1\cf3 .wait;\
				~section1.dur.source = \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 100\cf3 , \cf4 inf\cf3 );\
				\cf5 1\cf3 .wait;\
				\
		\});\
	\})\
)\
~tpat2.start;\
~tpat2.stop;\
\
\cf2 ////////////////////////////////////////\cf3 \
\
\cf4 Pdef\cf3 (\cf7 \\doepfer\cf3 ,	\
	\cf4 Pbind\cf3 (\cf7 \\type\cf3 , \cf7 \\midi\cf3 ,\
		\cf7 \\midiout\cf3 , d,\
		\cf7 \\dur\cf3 , \cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 180\cf3 , \cf4 inf\cf3 ), \
		\cf7 \\chan\cf3 , \cf5 0\cf3 ,\
		\cf7 \\midinote\cf3 , \cf4 Pwhite\cf3 (\cf5 36\cf3 , \cf5 36\cf3 +\cf5 60\cf3 , \cf4 inf\cf3 ),\
		\cf7 \\amp\cf3 ,  \cf4 Pseq\cf3 ([\cf5 1\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 1\cf3 , \cf5 0\cf3 , \cf5 0\cf3 , \cf5 0\cf3 ], \cf4 inf\cf3 )\
	)\
); \
\
\cf2 /////////////////////////////////////\cf3 \
\
(\
~rec = \cf4 Buffer\cf3 .alloc(s, s.sampleRate * \cf5 2\cf3 , \cf5 1\cf3 ); \cf2 // a 5 second 1 channel Buffer\cf3 \
~b1 = \cf4 Buffer\cf3 .alloc(s, s.sampleRate*\cf5 8\cf3 , \cf5 1\cf3 );\
~b2 = \cf4 Buffer\cf3 .alloc(s, s.sampleRate*\cf5 2\cf3 , \cf5 1\cf3 );\
)\
\
(\
	\cf2 // record for four seconds\cf3 \
\cf4 SynthDef\cf3 (\cf6 "recBuffer1"\cf3 ,\{ \cf4 arg\cf3  out=\cf5 0\cf3 ,bufnum=\cf5 0\cf3 ;\
	\cf4 var\cf3  noise;\
	noise = \cf4 SoundIn\cf3 .ar(\cf5 1\cf3 , \cf5 2\cf3 );		\cf2 // record sound input\cf3 \
	\cf4 RecordBuf\cf3 .ar(noise, bufnum); 	\cf2 // by default this loops\cf3 \
\}).add;\
\
\cf2 //Phasor.ar(0.01, rate, startPos, BufFrames.ir(bufnum))\cf3 \
\cf2 //SinOsc.ar(0.1) * BufFrames.ir(0)\cf3 \
\cf4 SynthDef\cf3 (\cf7 \\buf\cf3 , \{ \cf4 | out=0, bufnum = 0, rate = 1, startPos = 0, amp = 1.0, sustain = 1, pan = 0, loop = 1|\cf3 \
	\cf4 var\cf3  audio;\
	rate = rate * \cf4 BufRateScale\cf3 .kr(bufnum);\
	startPos = startPos * \cf4 BufFrames\cf3 .kr(bufnum);\
	audio = \cf4 BufRd\cf3 .ar(\cf5 1\cf3 , bufnum, \cf4 Phasor\cf3 .ar(\cf5 0.01\cf3 , rate, startPos, \cf4 BufFrames\cf3 .ir(bufnum)), \cf5 1\cf3 , \cf5 4\cf3 );\
	audio = \cf4 EnvGen\cf3 .ar(\cf4 Env\cf3 .perc, \cf5 1.5\cf3 , timeScale: sustain, doneAction: \cf5 2\cf3 ) * audio;\
	audio = \cf4 Pan2\cf3 .ar(audio, pan, amp*\cf5 4\cf3 );\
	\cf4 OffsetOut\cf3 .ar(out, audio);\
\}).add;\
\
\cf4 SynthDef\cf3 (\cf7 \\tap1\cf3 , \{\cf4 |bufnum, delay1, delay2, rate = 2.9|\cf3 \
	\cf4 var\cf3  source, capture, tap, env; \
	source= \cf4 SoundIn\cf3 .ar(\cf5 0\cf3 , \cf5 2\cf3 ); \cf2 //use headphones to avoid feedback\cf3 \
	capture= \cf4 BufWr\cf3 .ar(source, bufnum, \cf4 Phasor\cf3 .ar(\cf5 0\cf3 ,\cf5 1\cf3 , \cf5 0 \cf3 , \cf4 BufFrames\cf3 .ir(bufnum) * rate,\cf5 1\cf3 ));\
	tap = \cf4 Tap\cf3 .ar(bufnum, \cf5 1\cf3 , [delay1, delay2]);\
	\cf2 //env = EnvGen.ar(Env.sine, 1.5, timeScale:5, doneAction: 2);\cf3 \
	\cf2 //tap = CombN.ar(tap, 0.2, 0.2, 3, mul:1.1);\cf3 \
	\cf4 Out\cf3 .ar(\cf5 0\cf3 , tap); \cf2 //multichannel expansion, so one tap each ear  \cf3 \
\}).send(s);\
\
\
\
\cf2 // trig with MouseY\cf3 \
\cf4 SynthDef\cf3 (\cf6 "scramble"\cf3 , \{ \cf4 arg\cf3  out=\cf5 0\cf3 , bufnum=\cf5 0\cf3 , trig = \cf5 0\cf3 , wipe = \cf5 0\cf3 , width = \cf5 0\cf3 ;\
	\cf4 var\cf3  in, chain;\
	in = \cf4 SoundIn\cf3 .ar(\cf5 1\cf3 , \cf5 2\cf3 );\
	chain = \cf4 FFT\cf3 (\cf4 LocalBuf\cf3 (\cf5 2048\cf3 ), in);\
	chain = \cf4 PV_BinScramble\cf3 (chain, wipe, width, \cf4 Impulse\cf3 .kr(trig)); \
	\cf4 Out\cf3 .ar(out, \cf5 0.5 \cf3 * \cf4 IFFT\cf3 (chain).dup);\
\}).send(s);\
\cf2 /*\
\pard\pardeftab560\ql\qnatural

\f1 \cf2 \

\f0\fs18 (\
// trig with MouseY\
SynthDef("help-binScramble", \{ arg out=0, bufnum=0;\
	var in, chain;\
	in = SoundIn.ar(1, 2);\
	chain = FFT(LocalBuf(2048), in);\
	chain = PV_BinScramble(chain, MouseX.kr , 0.1, MouseY.kr > 0.5 ); \
	Out.ar(out, 0.5 * IFFT(chain).dup);\
\}).play(s,[\\out, 0, \\bufnum, b]);\
)\
\pard\pardeftab560\ql\qnatural

\fs24 \cf2 */\cf3 \
\
)	\
\
\
\cf4 Pdef\cf3 (\
	\cf7 \\scr\cf3 ,\
	\cf4 Pmono\cf3 (\
		\cf7 \\scramble\cf3 ,\
		\cf7 \\dur\cf3 , \cf5 4\cf3 ,\
		\cf7 \\wipe\cf3 , \cf4 Pseq\cf3 ([\cf5 1\cf3 ], \cf4 inf\cf3 ),\
		\cf7 \\width\cf3 , \cf4 Pseq\cf3 ([\cf5 1\cf3 ], \cf4 inf\cf3 ), \
		\cf7 \\trig\cf3 , \cf4 Pseq\cf3 ([\cf5 4\cf3 ], \cf4 inf\cf3 ),\
		\cf7 \\out\cf3 , \cf5 0\cf3 \
		)\
).play;\
		\
~scramble.free;	\
~scramble = \cf4 Synth\cf3 .new(\cf7 \\scramble\cf3 , [\cf7 \\out\cf3 , \cf5 0\cf3 , \cf7 \\bufnum\cf3 , \cf5 0\cf3 ]);\
\
~scramble.set(\cf7 \\trig\cf3 , \cf5 16\cf3 , \cf7 \\width\cf3 , \cf5 0.2\cf3 , \cf7 \\wipe\cf3 , \cf5 0.2\cf3 );\
\
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardeftab560\ql\qnatural\pardirnatural
\cf3 ~recBuf = \cf4 Synth\cf3 (\cf7 \\recBuffer1\cf3 , [\cf7 \\out\cf3 , \cf5 0\cf3 , \cf7 \\bufnum\cf3 , ~rec]);\
\pard\pardeftab560\ql\qnatural
\cf3 \
\pard\pardeftab720\ql\qnatural
\cf4 Pdef\cf3 (\cf7 \\buf2\cf3 , \cf4 Pbind\cf3 (\
\pard\pardeftab560\ql\qnatural
\cf3 	\cf7 \\instrument\cf3 ,	\cf7 \\buf\cf3 ,\
	\cf7 \\amp\cf3 ,		\cf4 Pseq\cf3 ([\cf5 0\cf3 , \cf5 0.5\cf3 , \cf5 0\cf3 , \cf5 0.5\cf3 ], \cf4 inf\cf3 ),\
	\cf7 \\dur\cf3 ,		\cf4 Pseq\cf3 ([\cf5 1\cf3 ]/\cf5 4\cf3 , \cf4 inf\cf3 ),\
	\cf7 \\startPos\cf3 ,	\cf5 0\cf3 ,\
	\cf7 \\rate\cf3 ,		\cf4 Pseq\cf3 ([\cf5 1\cf3 , \cf5 1\cf3 , \cf5 1\cf3 , \cf5 -2\cf3 , \cf5 1\cf3 , \cf5 1\cf3 , \cf5 1\cf3 , \cf5 2\cf3 ]*\cf5 2\cf3 , \cf4 inf\cf3 ),\
	\cf7 \\sustain\cf3 ,		\cf4 Pseq\cf3 ([ \cf5 1.0\cf3 , \cf5 0.5\cf3 , \cf5 1 \cf3 ], \cf4 inf\cf3 ),\
	\cf7 \\pan\cf3 ,  		\cf4 Pseq\cf3 ([ \cf5 0\cf3 ], \cf4 inf\cf3 ),\
	\cf7 \\bufnum\cf3 ,		 \cf4 Pseq\cf3 ([~rec], \cf4 inf\cf3 )\
)).play;\
\
}