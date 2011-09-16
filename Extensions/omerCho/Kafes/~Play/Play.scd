~zencirPlay.fork;
~cifteDuyekPlay.fork;
~toFahtePlay.fork;
~fahtePlay.fork;
~toCemberPlay.fork;
~cemberPlay.fork;
~toDevriKebirPlay.fork;
~devriKebirPlay.fork;
~toBerefsanPlay.fork;
~berefsanPlay.fork;

KafesLayerA.load;
KafesLayerB.load;
KafesLayerC.load;
KafesPLayers.load;
KafesSpat.ch2;





(
fork{
	18.do{|i|
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
		~gou02.brt_([~kRD3, ~kRC1].choose *0.89000).playBuf(0.001, 1.1, 5.1, mul:0.0001+0.01*(i%19), out: ~strTek.choose);
		dur.next.wait;
		
		
	};
	~gou02.brt_(~kRD6 *0.89000).playPV2(0.001, 1.1, 5.1, mul: 0.9, out: ~strTek.choose);
};
)

(
fork{
	144.do{|i|
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
		~gou02.brt_([~kRE2, ~kRC6].choose *0.89000).playBuf(0.001, 1.1, 5.1, mul:0.0001+0.001*(i%70), out: ~strTek.choose);
		dur.next.wait;
		
		
	};
};
)


(
fork{
	44.do{|i|
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
		~gou02.brt_([~kRD1, ~kRC1].choose *0.89000).playBuf(0.001, 1.1, 5.1, mul:0.0001+0.01*(i%22), out: ~strTek.choose);
		dur.next.wait;
		
		
	};
};
)


(
fork{
	144.do{|i|
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
		~gou02.brt_([~kRE3, ~kRC1].choose *0.89000).playBuf(0.001, 1.1, 5.1, mul:0.0001+0.001*(i%70), out: ~strTek.choose);
		dur.next.wait;
		
		
	};
};
)


(
fork{
	~circ = Pseq((0..2), inf).asStream;
	144.do{|i|
		var dur = Pseq([0.25]/4, inf).asStream;
		~gou02.brt_([~kRE1, ~kRC1].choose *0.89000).playBuf(0.001, 1.1, 5.1, mul:0.0001+0.001*(i%70), out: ~circ);
		dur.next.wait;
		
		
	};
};
)


(

~layC34.stop;
~layC34 = Posc(
	\msg, Pshuf([ Pseq([\lC31_1d2], 1),	Pseq([\lC4_2, \lC31_3, \bitA1], 7), Pseq([\lC4_2], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 1)
).play;

~cemb01.stop;
~cemb01 = Posc(
	\msg, Pshuf(
		[
		//cember
		\kk1, \bt23, \kk24, 
		\kk4, \kP26, \aP27, 
		\bt18, \kP29, \kP30,
		\kP31, \kP32, \aP33, 
		\kk22, \kP35, \kk46, \kk2
		], inf
	),
	\dur, Pseq(
		[
		//cember
		Pseq([2, 1, 1], 1),
		Pseq([2, 1, 1], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1, 1], 1)
		]/4, 2
	)
).play;

)