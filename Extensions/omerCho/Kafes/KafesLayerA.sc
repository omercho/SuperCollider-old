


KafesLayerA {
	
	
	*load {
		
		~zencirLayerA = Preceive(


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////-------------------------------------- CiFTE DUYEK --------2 Levels-- 8 parts -- 1.6s -------------------------------------------------/////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//-------------------------------------------lev1-8/4--48s-----------------------------------------------KafesChannels
			\layer_A_1 -> {//	|dum2 ---------------- 12
"LayerA CIFTE DUYEK".postln;				
				
fork{
	~tol08.brt_(~kRC1 *1.07500).playBuf(0.001, 0.3, 0.1, mul:1.9, out: ~strHep);
	
	0.265.wait;
	
	KafSinVib.ar(0.1, 0.1, 18.0, mul:0.3, freq1: ~kA1, freq2: ~kA1+3, vib1: 2.1, vib2: 4, out: ~strCok.choose).play;
	
	~tol06.brt_(~kRB1 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.5, room:165, rev:23.5, damp:0.71, out: ~strHep);
	
	//~tol06.brt_(~kRC1 *1.23700).playBuf(0.001, 1.1, 16.1, mul:0.4, out: ~strHep);
	
	5.6.wait;
	
	~tol06.brt_(~kRB1 *1.23700).playGverbR(0.001, 1.1, 10.1, mul:0.5, room:55, rev:13.5, damp:0.71, out: ~strTek.choose);
	
	2.9.wait;
	
	~tol06.brt_(~kRB4 *1.23700).playBufR(0.01, 3.5, 0.1, mul:0.5, out: ~strTek.choose);
	
	0.01.wait;
	
	~tol06.brt_(~kRB1 *1.23700).playBufR(0.01, 4.5, 0.1, mul:0.5, out: ~strTek.choose);
	
	2.5.wait;
	
	fork{
		
		~botbs.brt_(~kRC1 *1.36619).playBuf(0.001, 1.1, 3, mul:0.7, out: ~strTek.choose);
		0.5.wait;
		~botbs.brt_(~kRC4 *1.36619).playBuf(0.001, 1.1, 3, mul:0.5, out: ~strTek.choose);
		
	};
	
	0.25.wait;
	
	~tol03.brt_(~kRD1 *1.07600).playBufR(0.001, 0.8, 1,4, mul:0.5, out: ~strTek.choose);
	
	1.5.wait;
	
	~gir01.brt_(2.8).playGverbR(0.001, 1.1, 10.1, mul:0.5, room:55, rev:13.5, damp:0.71, out: ~strTek.choose);

};
				
			
				
				}, 
			\layer_A_2 -> {//	+tek2-3-4------------- 24
fork{

	~gou02.brt_(~kRC7 *0.89000).playGverbR(0.001, 1.1, 10.1, mul:0.2, room:55, rev:13.5, damp:0.71, out: ~strCok.choose);
	~gou02.brt_(~kRC1 *0.89000).playGverb(0.001, 1.1, 10.1, mul:0.2, room:55, rev:13.5, damp:0.71, out: ~strHep.choose);

	0.31.wait;
	~gou02.brt_(~kRB4 *0.89000).playGverb(0.001, 1.1, 10.1, mul:0.25, room:55, rev:13.5, damp:0.71, out: ~strCok.choose);
	~bth02.brt_(~kRC1 *1.00011).playPV2(0.001, 10.3, 0.3, mul:0.5, out: ~strTek.choose);
	0.25.wait;
	fork{
		~kPseq01 = Pseq([~kRC1, ~kRC3, ~kRC5, ~kRD1, ~kRC4, ~kRD1, ~kRC1, ~kRD1]/2, inf).asStream;
		~spira = Pseq((0..23).reverse, inf).asStream;
		23.do {|i|
		~tht02.brt_(~kPseq01.next *1.47500).playPV2(0.001, 10.3, 0.3, mul:0.09+(0.04*(i%9)), out: ~spira);
		0.1- (0.04*(i%15)).wait;	
			
		};
		
		
	};
	
	
	0.8.wait;
	fork{
		15.do {
			~bth02.brt_(~kRA1 *1.00011).playPV2(0.001, 10.3, 0.3, mul:0.2, out: ~strTek.choose);
			0.4.wait	
			
		};
	};
	8.0.wait;
	fork{
		15.do {
			~bth02.brt_(~kRA4 *1.00011).playPV2(0.001, 10.3, 0.3, mul:0.09, out: ~strTek.choose);
			0.4.wait	
			
		};
	};
	0.001.wait;
	~ff = ~kC1;
	KafGendy.ar(0.001, 0.01, 0.03, 29.8,
		freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
		freqrlp1: ~kA1/2, 
		freqrlp2: ~ff*2,
		mul: 0.4,
		out: ~strTek.choose
	).play;	
	0.5.wait;
	fork{
		15.do {
			~bth02.brt_(~kRB1 *1.00011).playPV2(0.001, 10.3, 0.3, mul:0.09, out: ~strTek.choose);
			0.4.wait	
			
		};
	};
	10.24.wait;
	~tol01.brt_(~kRC4 *1.07600).playBufR(0.001, 1.1, 4, mul:0.9, out: ~strTek.choose);
	2.5.wait;
	~tol03.brt_(~kRC1 *1.07600).playBufR(0.001, 1.1, 1.9, mul:0.8, out: ~strTek.choose);
};


/*
~tol03.brt_(~kRD1 *1.07600).playPV1(0.001, 1.1, 4, mul:0.5, out: ~strTek.choose);
*/				

				}, 
			\layer_A_3 -> {//	|tek2 ---------------- 12
fork {
	
	~gir01.brt_(1).playBuf(2.1, 0.1, 3, loop:0, out: ~strTek.choose);
	
	0.25.wait;
	
	~gou02.brt_(~kRB4 *0.89000).playGverb(0.001, 1.1, 10.1, mul:0.3, room:55, rev:13.5, damp:0.71, out: ~strTek.choose);				
	fork{
		~spirOut = Pseq((23..00), inf).asStream;
		~kPseq01 = Pseq([~kRC1, ~kRC3, ~kRC5, ~kRD1, ~kRC4, ~kRD1, ~kRC1, ~kRD1]/2, inf).asStream;
		23.do {|i|
		~bth02.brt_(~kPseq01.next *1.00011).playPV2(0.001, 10.3, 0.3, mul:0.09+(0.04*(i%9)), out: ~spirOut);
		0.1- (0.04*(i%15)).wait;	
			
		};
		
		
	};

};
				},
		
		//-------------------------------------------lev2-8/4--48s-----------------------------------------------
			\layer_A_4 -> {//	+dum2

fork{

	~ff = ~kA1;
	KafGendy.ar(1.1, 0.1, 4.3, 26.8,
		freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
		freqrlp1: ~kA1/2, 
		freqrlp2: ~ff,
		mul: 0.4,
		out: 0
	).play;	
	
	~ats01.brt_(~kRD1 *1.00000).playGverbR(0.01, 0.2, 6.0, mul:0.5, out: ~strTek.choose);


	2.5.wait;
	fork{
		3.do{
		var dur = Pseq([0.25, 0.36, 2.47, 0.58, 0.69, 0.80, 0.91, 0.94], inf).asStream;
		var amp = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/2, inf).asStream;
		~gou02.brt_(~kRD3 *0.89000).playPV2(0.001, 1.1, 10.1, mul:amp, out: ~strTek.choose);
		dur.next.wait;
	
		};

	};


};
				
				}, 
			\layer_A_5 -> {//	|dum2
~ff = ~kA4;
KafGendy.ar(1.1, 0.1, 4.3, 26.8,
	freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
	freqrlp1: ~kA1/2, 
	freqrlp2: ~ff*2,
	mul: 0.4,
	out: ~strTek.choose
).play;				

~bth05.brt_(~kRD1 *1.00011).playPV1(0.001, 12.3, 0.3, mul:0.1, out: ~strTek.choose);			
				}, 
			\layer_A_6 -> {//	|tek2
~ff = ~kA5;
KafGendy.ar(3.2, 0.2, 4.3, 16.8,
	freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
	freqrlp1: ~kA1/2, 
	freqrlp2: ~ff*2,
	mul: 0.5,
	out: ~strTek.choose
).play;					

fork{
	~bth05.brt_(~kRD1 *1.00011).playPV1R(0.001, 2.3, 0.3, mul:0.4, out: ~strTek.choose);
	2.8.wait;
	~tht02.brt_(1).playPV1R(0.01, 5, 1, loop:0, out: ~strTek.choose);
	0.5.wait;
	~bth05.brt_(~kRD1 *1.00011).playPV1(0.001, 2.3, 0.3, mul:0.4, out: ~strTek.choose);
	3.0.wait;
	~tht02.brt_(1).playPV1(0.01, 5, 4, mul:0.9, loop:0, out: ~strTek.choose);

};
	
				}, 
			\layer_A_7 -> {//	|te

~ff = ~kA4;
KafGendy.ar(1.1, 0.1, 4.3, 26.8,
	freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
	freqrlp1: ~kA1/2, 
	freqrlp2: ~ff*2,
	mul: 0.4,
	out: ~strTek.choose
).play;	

~gou02.brt_(~kRB4 *0.89000).playPV2(0.1, 3.1, 5.1, mul:0.1, out: ~strCok.choose);
			
				}, 
			\layer_A_8 -> {//	ke

~tht02.brt_(~kRA1 *1.05000).playBufR(0.01, 15, 1.1, mul:0.4, out: ~strTek.choose);

fork { |i, dur = 0.1|



	~bth05.brt_(~kRB7 *1.00011).playBufR(0.001, 2.3, 1.3, mul:0.1,  out: ~strTek.choose);
	0.5.wait;
	~bth05.brt_(~kRD1 *1.00011).playPV1(0.001, 12.3, 0.3, mul:0.1, out: ~strTek.choose);
	dur.wait;
	~bth01.brt_(~kRD1 *1.00011).playPV2(0.001, 12.3, 0.3, mul:0.1, out: ~strTek.choose);
	dur+0.2.wait;				
	~bth03.brt_(~kRB7 *1.00011).playGverb(0.001, 0.3, 0.3, mul:0.2, out: ~strTek.choose);
	dur+0.4.wait;
	~bth02.brt_(~kRA1 *1.00011).playPV2(0.001, 10.3, 0.3, mul:0.8, out: ~strTek.choose);
	dur.wait;
	~bth01.brt_(~kRC7 *1.00011).playPV2(0.001, 10.3, 0.3, mul:0.9,  out: ~strTek.choose);
	1.2.wait;				
	
	~tht02.brt_(1).playPV1R(0.01, 5, 1, loop:0, out: ~strTek.choose);
	
	0.5.wait;
	~tht02.brt_(~kRA1 *1.05000).playBufR(0.01, 15, 1.1, mul:0.4, out: ~strTek.choose);	~tol04.brt_(~kRD1 *1.23700).playGverbR(0.001, 1.1, 9.1, mul:0.5, room:55, rev:13.5, damp:0.71, out: ~strTek.choose);	
				
};
				
				}, 			
			
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////------------------------------------------- FAHTE --------4 Levels-- 13 parts -- 2.0s -------------------------------------------------/////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//-------------------------------------------lev1-4/4--24s-----------------------------------------------
			\layer_A_9 -> {//	+dum2
"LayerA FAHTE".postln;

~fot01.stop;

fork{
	fork{
		~tol08.brt_(~kRC1 *1.07500).playBuf(0.001, 0.3, 0.1, mul:1.9, out: ~strTek.choose);
		0.265.wait;
		~tol06.brt_(~kRB2 *1.23700).playGverb(0.001, 2.1, 16.1, mul:0.5, room:55, rev:13.5, damp:0.71, out: ~strTek.choose);
		0.1.wait;
	
	};
	0.5.wait;
	
	~tol06.brt_(~kRC1 *1.07500).playBuf(0.001, 0.9, 0.01, mul:0.3, out: ~strTek.choose);
	0.265.wait;
	~sis03.brt_(~kRC1 *1.38000).playBuf(0.001, 1.1, 4, mul:0.5, out: ~strTek.choose);
	~tol06.brt_(~kRD1 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.5, room:55, rev:23.5, damp:0.71, out: ~strTek.choose);
	2.6.wait;
	~tol04.brt_(~kRB7 *1.23700).playGverbR(0.001, 1.1, 10.1, mul:0.5, room:55, rev:13.5, damp:0.71, out: ~strTek.choose);
	
	2.9.wait;
	~tol06.brt_(~kRB2 *1.23700).playBufR(0.01, 2.5, 1.1, mul:0.5, out: ~strTek.choose);
	0.01.wait;
	~tol06.brt_(~kRA1 *1.23700).playBufR(0.01, 4.5, 4.1, mul:0.5, out: ~strTek.choose);
	2.5.wait;
	fork{
		
		~tol03.brt_(~kRB3 *1.07600).playBufR(0.001, 1.1, 4,8, mul:0.5, out: ~strTek.choose);
		0.03.wait;
		~tol03.brt_(~kRA3 *1.07600).playBufR(0.001, 1.1, 2,8, mul:0.5, out: ~strTek.choose);
	};	
	1.5.wait;
	~gir01.brt_(10.5).playBufR(0.01, 1, 1, loop:0, out: ~strTek.choose);

	~tol04.brt_(~kRC4 *1.07500).playBuf(0.001, 0.9, 2.01, mul:0.3, out: ~strTek.choose);
	0.265.wait;
	fork{
		~sis03.brt_(~kRC7 *1.38000).playBuf(0.001, 1.1, 4, mul:0.5, out: ~strTek.choose);
		~tol06.brt_(~kRD7 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.5, room:45, rev:3.5, damp:0.71, out: ~strTek.choose);
		0.4.wait;
		~sis03.brt_(~kRC7 *1.38000).playBuf(0.001, 1.1, 4, mul:0.5, out: ~strTek.choose);
		~tol06.brt_(~kRD7 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.5, room:15, rev:23.5, damp:0.71, out: ~strTek.choose);
		0.3.wait;
		~sis03.brt_(~kRC7 *1.38000).playBuf(0.001, 1.1, 4, mul:0.5, out: ~strTek.choose);
		~tol06.brt_(~kRD7 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.5, room:9, rev:20.5, damp:0.81, out: ~strTek.choose);
		0.2.wait;
		~sis03.brt_(~kRC7 *1.38000).playBuf(0.001, 1.1, 4, mul:0.5, out: ~strTek.choose);
		~tol06.brt_(~kRD7 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.5, room:15, rev:2.5, damp:0.71, out: ~strTek.choose);
		0.1.wait;
		~sis03.brt_(~kRC7 *1.38000).playBuf(0.001, 1.1, 4, mul:0.5, out: ~strTek.choose);
		~tol06.brt_(~kRD4 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.5, room:55, rev:13.5, damp:0.71, out: ~strTek.choose);

	};
	0.5.wait;
	
};
	
				
				
				}, 
			\layer_A_10 -> {//	|dum
fork{
	fork{
		~kPseq01 = Pseq([~kRC1, ~kRC3, ~kRC5, ~kRD1, ~kRC4, ~kRD1, ~kRC1, ~kRD1].rotate(0), inf).asStream;
		~amp = Pseq([0.15, 0.25, 0.35].rotate/1.9, inf).asStream;
		20.do{|i, frq = 2240, dur = 0.25|
			var freqs = frq + (12 *( i % 20)); 
			
			~tol06.brt_(~kPseq01 *1.07500).playPV2(0.001, 0.9, 0.4, mul:~amp, out: ~strTek.choose);
			( dur - (0.01*(i%20)) ).yield;
		};
	};
	0.5.wait;
	
	~tol06.brt_(~kRD1 *1.23700).playPV5(0.001, 1.1, 16.1, mul:0.5, out: ~strTek.choose);
	0.8.wait;
	
	~tol06.brt_(~kRD4 *1.23700).playPV5(0.001, 1.1, 16.1, mul:0.5,  out: ~strTek.choose);
	1.0.wait;
	
	~tol06.brt_(~kRD7 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.5, room:55, rev:23.5, damp:0.71, out: ~strTek.choose);
	0.25.wait;
	
	~tol06.brt_(~kRD4 *1.23700).playBuf(0.001, 1.1, 16.1, mul:0.5,  out: ~strTek.choose);
	
	~tol04.brt_(~kRB7 *1.23700).playGverbR(0.001, 1.1, 15.1, mul:0.5, room:55, rev:13.5, damp:0.71, out: ~strTek.choose);
	0.25.wait;
	
	~tol06.brt_(~kRC7 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.5, room:55, rev:23.5, damp:0.71, out: ~strTek.choose);
	0.35.wait;
	
	~tol06.brt_(~kRD1 *1.23700).playPV5(0.001, 1.1, 16.1, mul:0.5, out: ~strTek.choose);
	1.5.wait;
	fork{
		~kPseq01 = Pseq([~kRB2, ~kRD6, ~kRB2, ~kRC4, ~kRD4, ~kRC1, ~kRB6, ~kRB1], inf).asStream;
		~amp = Pseq((0.02..1.0), 19).asStream;
		19.do{|i, frq = 2240, dur = 0.35|
			var freqs = frq + (12 *( i % 20)); 
			
			~tol06.brt_(~kPseq01 *1.07500).playPV1R(0.001, 0.9, 2.01, mul:~amp, out: ~strTek.choose);
			( dur - (0.01*(i%20)) ).yield;
		};
	};			
};				
				}, 
			\layer_A_11 -> {//	dum
/*fork{
	fork{//OK
		~kPseq01 = Pseq([~kRC4, ~kRC6, ~kRC5, ~kRD1, ~kRC4, ~kRD2, ~kRC7, ~kRD1].rotate(1), inf).asStream;
		~amp = Pseq([0.15, 0.25, 0.35, 0.45, 0.49].rotate/1.5, inf).asStream;
		24.do{|i, frq = 2240, dur = 0.29|
			var freqs = frq + (12 *( i % 20)); 
			
			~tol06.brt_(~kPseq01 *1.07500).playPV2(0.001, 0.9, 0.01, mul:~amp, out: ~strTek.choose);
			( dur - (0.011*(i%24)) ).yield;
		};
		0.2.wait;
		~tol06.brt_(~kRC4 *1.07500).playGverb(0.001, 1.9, 1.01, mul:~amp, out: ~strCok.choose);
	};
	
	3.4.wait;	
	~tol06.brt_(~kRE1 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.4, room:55, rev:13.5, damp:0.71, out: ~strHep);
	0.001.wait;


	0.5.wait;
	~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // tek

};*/				

fork{
	
	fork{//OK
		~kPseq01 = Pseq([~kRC4, ~kRC6, ~kRC5, ~kRD1, ~kRC4, ~kRD2, ~kRC7, ~kRD1].rotate(1), inf).asStream;
		~amp = Pseq([0.15, 0.25, 0.35, 0.45, 0.49].rotate/1.5, inf).asStream;
		~out = Pseq((0..1), inf).asStream;
		24.do{|i, frq = 2240, dur = 0.3|
			var freqs = frq + (12 *( i % 20)); 
			
			~tol06.brt_(~kPseq01 *1.07500).playPV2(0.001, 0.9, 0.01, mul:~amp, out: ~strTek.choose);
			( dur - (0.011*(i%24)) ).yield;
		};
		0.02.wait;
		~tol06.brt_(~kRB4 *1.07500).playPV5(0.001, 1.9, 3.01, mul:~amp, pv5a: 0.1, out: ~strCok.choose);
	};
	
	4.5.wait;	
	~tol06.brt_(~kRE1 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.4, room:55, rev:13.5, damp:0.71, out: ~strHep);


	0.02.wait;
	
	KafSinVib.ar(0.1, 0.1, 8.0, mul:0.3, freq1: ~kA1, freq2: ~kA1, vib1: 2.1, vib2: 4, out: ~strCok.choose).play;
};
				
				}, 
			
		//-------------------------------------------lev2-6/4--36s-----------------------------------------------
			\layer_A_12 -> {//	+tek2
fork{
	~kPseq01 = Pseq([~kRC4, ~kRE4, ~kRD1, ~kRC1, ~kRC4, ~kRC7, ~kRB7, ~kRC1], inf).asStream;
	~dur = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/3, inf).asStream;
	3.do{
		
		//var dur = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/5, inf).asStream;
		//var frqqq = Pseq([~kRC1, ~kRC3, ~kRC5, ~kRD1, ~kRC4, ~kRD1, ~kRC1, ~kRD1].rotate(0), inf).asStream;
		
		~gou02.brt_(~kPseq01 *0.89000).playPV5(0.001, 1.1, 10.1, mul:0.09, out: ~strTek.choose);
		~dur.next.wait;
		
		~tol06.brt_(~kPseq01 *1.23700).playPV2(0.001, 1.1, 16.1, mul:0.1, out: ~strHep);
		
		~dur.next.wait;

	};
	
	0.001.wait;
	
	~tol06.brt_(~kRE4 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.3, room:55, rev:13.5, damp:0.71, out: ~strHep);

	
};

~kik01.brt_(2.5).playPV4(0.001, 1.1, 1, mul:0.9, out: ~strCok.choose); // tek

fork{

	
	~met03.brt_(~kRA1 *0.99900).playGverb(1, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.5.wait;
	//~met03.brt_(~kRC3 *1.01000).playGverb(0.1, 5.1, 16.1, mul:0.3, room:55, rev:23.5, damp:0.71, out:~strTek.choose);
	0.25.wait;
	~met02.brt_(~kRB1 *1.01000).playGverbR(1, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.5.wait;
	~met02.brt_(~kRA5 *1.01000).playGverb(1, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.25.wait;
	~met02.brt_(~kRB5 *1.01000).playGverbR(0.001, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	1.25.wait;

};	
				
				}, 
			\layer_A_13 -> {//	|tek2

~kik01.brt_(1.5).playPV1(0.001, 1.1, 1, mul:0.8, out: ~strTek.choose); // tek
fork{

	
	~met03.brt_(~kRA2 *0.99900).playGverb(2.1, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.5.wait;
	fork {
	
		~met03.brt_(~kRC5 *1.01000).playGverb(0.1, 5.1, 16.1, mul:0.3, room:55, rev:23.5, damp:0.71, out:~strTek.choose);
		2.9.wait;
		~met03.brt_(~kRC4 *1.01000).playGverb(0.1, 5.1, 16.1, mul:0.3, room:55, rev:23.5, damp:0.71, out:~strTek.choose);
	
	};
	0.25.wait;
	~met02.brt_(~kRB2 *1.01000).playGverbR(0.001, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.5.wait;
	~met02.brt_(~kRA7 *1.01000).playGverb(1, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.25.wait;


};
				
				}, 
			\layer_A_14 -> {//	_tek2
~kik01.brt_(1.5).playPV1(0.001, 1.1, 1, mul:0.5, out: ~strTek.choose); // tek				
fork{

	
	~met03.brt_(~kRA1 *0.99900).playGverb(2.1, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.5.wait;
	~met03.brt_(~kRB4 *1.01000).playGverb(3.1, 5.1, 16.1, mul:0.3, room:55, rev:23.5, damp:0.71, out:~strTek.choose);
	0.25.wait;
	~met02.brt_(~kRB2 *1.01000).playGverbR(1, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.5.wait;
	~met02.brt_(~kRA7 *1.01000).playGverb(2.001, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.5.wait;


};
				}, 
			
		//-------------------------------------------lev3-6/4--36s-----------------------------------------------
			\layer_A_15 -> {//	+dum2
~kik01.brt_(1.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // tek
fork{

	
	~met03.brt_(~kRA4 *0.99900).playGverb(2.1, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	1.5.wait;
	~met03.brt_(~kRB4 *1.01000).playGverb(3.1, 5.1, 16.1, mul:0.3, room:55, rev:23.5, damp:0.81, out:~strTek.choose);
	0.45.wait;
	~met02.brt_(~kRB2 *1.01000).playGverbR(1.4, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.5.wait;
	~met02.brt_(~kRA7 *1.01000).playGverb(2.001, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	1.5.wait;


};

				
				}, 
			\layer_A_16 -> {//	|ta2

~kik01.brt_(1.5).playPV1(0.001, 1.1, 1, mul:0.4, out: ~strTek.choose); // tek

fork{

	
	~met03.brt_(~kRA7 *0.99900).playGverb(2.1, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	2.5.wait;
	~met03.brt_(~kRB4 *1.01000).playGverb(3.1, 5.1, 16.1, mul:0.3, room:55, rev:23.5, damp:0.81, out:~strTek.choose);
	0.45.wait;
	~met02.brt_(~kRB3 *1.01000).playGverbR(1, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	2.5.wait;
	~met02.brt_(~kRB1 *1.01000).playGverb(2.001, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	1.5.wait;


};

				
				}, 
			\layer_A_17 -> {//	hek2
~kik01.brt_(1.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // tek

fork{

	
	~met03.brt_(~kRA1 *0.99900).playGverb(2, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.5.wait;
	~met03.brt_(~kRC3 *1.01000).playGverb(5.1, 5.1, 16.1, mul:0.3, room:55, rev:23.5, damp:0.71, out:~strTek.choose);
	0.25.wait;
	~met02.brt_(~kRB1 *1.01000).playGverbR(0.001, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.5.wait;
	~met02.brt_(~kRA5 *1.01000).playGverb(0.001, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.25.wait;
	~met02.brt_(~kRB5 *1.01000).playGverbR(0.001, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	1.25.wait;

};				
				
				}, 
			
		//-------------------------------------------lev4-4/4--24s-----------------------------------------------
			\layer_A_18 -> {//	|te
	~kik01.brt_(2.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // tek
fork{
	~ats01.brt_(~kRA1 *1.00000).playPV1(0.01, 6.0, 4.0, mul:0.3, out: ~strCok.choose);
	8.5.wait;
	~ats01.brt_(~kRB1 *1.00000).playPV1(0.01, 6.0, 4.0, mul:0.3, out: ~strCok.choose);
	5.0.wait;
	~ats02.brt_(1.5).playPV1(0.01, 0.4, 0.9, mul:0.4, start:[0.73, 0.2, 0.28, 0.37].choose, out: ~strTek.choose); // dum
	
};				
				}, 
			\layer_A_19 -> {//	ke

~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // tek	
~ats02.brt_(1.5).playPV1(0.01, 0.4, 0.9, mul:0.4, start:[0.59].choose, out:  ~strCok.choose); // dum			
				}, 
			\layer_A_20 -> {//	|te

~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strCok.choose); // tek	
~ats02.brt_(1.5).playPV3(0.01, 0.4, 0.9, mul:0.4, start:[0.27].choose, out:  ~strCok.choose); // dum			
				}, 
			\layer_A_21 -> {//	ke
~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // tek	
~ats02.brt_(1.5).playPV1(0.01, 0.4, 0.9, mul:0.4, start:[0.73].choose, out:  ~strCok.choose); 
		
				}, 
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////------------------------------------------- Cember --------4 Levels-- 13 parts -- 2.4s -------------------------------------------------////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//-------------------------------------------lev1-4/4--24s-----------------------------------------------
			\layer_A_22 -> {//	+dum2
"LayerA CEMBER".postln;				


fork{

	~kik01.brt_(0.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // tek
	2.5.wait;
	~kik01.brt_(0.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strCok.choose); // tek
	
	~ats03.brt_(~kRB1 *1.02006).playBuf(0.001, 0.9, 0.01, mul:0.3, start: 0.3, out: [0,1]);
	

};

				}, 
			\layer_A_23 -> {//	|te
			
~kik01.brt_(0.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strHep); // tek
~ats02.brt_(1.0).playPV1(0.01, 1.4, 0.9, mul:0.4, start:0.33, out: ~strHep); // dum

				}, 
			\layer_A_24 -> {//	ke

~kik01.brt_(0.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strHep); // tek
~ats02.brt_(4.0).playPV1(0.01, 1.4, 0.9, mul:0.4, start:0.33, out: ~strHep); // dum
				
				},
			
		//-------------------------------------------lev2-4/4--24s-----------------------------------------------	
			\layer_A_25 -> {//	+dum2
				
~kik01.brt_(0.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strHep); // tek
~ats02.brt_(2.0).playPV1(0.01, 1.4, 2.9, mul:0.4, start:0.13, out: ~strHep); // dum
				
				}, 
			\layer_A_26 -> {//	|dum

~kik01.brt_(0.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strHep); // tek
~ats02.brt_(0.4).playPV1(0.01, 1.4, 0.9, mul:0.4, start:0.33, out: ~strHep); // dum
	
				}, //0.73, 0.2, 0.28, 0.57
			\layer_A_27 -> {//	_dum
~kik02.brt_(0.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strHep); // tek
~ats02.brt_(1.5).playPV1(0.01, 1.4, 0.9, mul:0.4, start:0.73, out: ~strHep); // dum

				
				},
			
		//-------------------------------------------lev3-6/4--36s-----------------------------------------------
			\layer_A_28 -> {//	+tek2

fork{
	1.5.wait;
	
	~kik01.brt_(1.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strCok.choose); // dum
	KafSinVib.ar(0.1, 0.1, 18.0, mul:0.3, freq1: ~kA1, freq2: ~kA1+3, vib1: 2.1, vib2: 4, out: ~strCok.choose).play;
	
	fork{
		18.do {
			
			~kik01.brt_(71.5).playPV4(0.001, 1.1, 1, mul:0.1, out: ~strCok.choose); // dum
			2.0.wait;
		};
	};
	


}
				
				}, 
			\layer_A_29 -> {//	|tek2

fork{

	~kik01.brt_(1.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum
	0.005.wait;
	KafSinVib.ar(0.1, 0.1, 14.0, mul:0.3, freq1: ~kA3, freq2: ~kA3+2, vib1: 2.1, vib2: 4).play;
	fork{
		
		~ats03.brt_(~kRC1 *1.82101).playGverb(0.01, 0.3, 0.1, mul:0.5, out: ~strCok);
		0.2.wait;
		
		~tol01.brt_(~kRB2 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.3, room:55, rev:23.5, damp:0.71, out: ~strHep);
	
	};
	fork{
		9.do {
			
			~kik01.brt_(71.5).playPV3(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum
			0.8.wait;
			~kik01.brt_(61.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strCok); // dum
			1.8.wait;
		};
	};

};				
				}, 
			\layer_A_30 -> {//	tek2

~kik01.brt_(1.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum
KafSinVib.ar(0.1, 0.1, 8.0, mul:0.3, freq1: ~kA1, freq2: ~kA1+1.2, vib1: 2.1, vib2: 4, out: ~strCok).play;

fork{
	9.do {
		
		~kik01.brt_(11.5).playPV4(0.001, 1.1, 1, mul:0.2, out: ~strTek.choose); // dum
		0.8.wait;
		~kik01.brt_(21.5).playPV1(0.001, 0.1, 1, mul:0.6, start: 0.4, out: ~strHep); // dum
		0.6.wait;
	};
	2.3.wait;
		~tol01.brt_(~kRD7 *1.23700).playGverbR(0.001, 1.1, 16.1, mul:0.4, room:55, rev:23.5, damp:0.71, out: ~strCok);
};
				
				}, 


			
		//-------------------------------------------lev4-6/4--36s-----------------------------------------------
			\layer_A_31 -> {//	+dum2
fork{

	~ats03.brt_(~kRD1 *1.82101).playPV3(0.01, 6.0, 4.1, mul:0.5, pv3a:6.0,  out:[0,1]);
	
	fork{	
		
		~rit02
			.brt1_(~kRB4 *1.02006).brt1Dur_(0.01)
			.btrDur_(0.5)
			.brt2_(~kRC7 *1.02006).brt2Dur_(3)
		.transBuf(0.02, 2.78, 8.0, mul:0.1, loop:1, out: ~strTek.choose);
		10.0.wait;
		
		~ats03.brt_(~kRA1 *1.82101).playPV3(0.01, 6.0, 1.0, mul:0.5, pv3a:6.0,  out:[0,1]);
		
		4.5.wait;
		
		~rit03
			.brt1_(~kRB4 *1.02006).brt1Dur_(0.01)
			.btrDur_(0.5)
			.brt2_(~kRC7 *1.02006).brt2Dur_(3)
		.transBuf(0.02, 0.78, 5.0, mul:0.1, loop:1, out: ~strCok.choose);
		
		~rit02
			.brt1_(~kRB4 *1.02006).brt1Dur_(0.01)
			.btrDur_(0.5)
			.brt2_(~kRC7 *1.02006).brt2Dur_(3)
		.transBuf(0.02, 0.78, 8.0, mul:0.1, loop:1, out: ~strHep);
		
	};
	

	2.5.wait;

	fork{
	
		~ats03.brt_(~kRD1 *1.82101).playPV3(0.01, 0.5, 0.1, mul:0.5, pv3a:6.0, start:0.2, out: ~strCok.choose);
		0.5.wait;
		~ats03.brt_(~kRD1 *1.82101).playPV3(0.01, 0.6, 1.1, mul:0.5, pv3a:8.0, start:0.4, out: ~strCok.choose);
		0.8.wait;
		~ats03.brt_(~kRB1 *1.82101).playPV3(0.01, 2.5, 0.1, mul:0.5, pv3a:8.0, start:0.1, out: ~strCok.choose);
		0.8.wait;
		~ats03.brt_(~kRB1 *1.82101).playPV3(0.01, 2.5, 0.1, mul:0.5, pv3a:2.0, start:0.1, out: ~strCok.choose);
	
	};

};



				
				}, 
			\layer_A_32 -> {//	|ta2
fork{

	~kik02.brt_(1.5).playPV2(0.001, 1.1, 1, mul:0.5, out: ~strTek.choose); // dum
	
	0.005.wait;
	~tol01.brt_(~kRD7 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.4, room:55, rev:23.5, damp:0.71, out: ~strCok);
	
	0.005.wait;
	//KafSinVib.ar(0.1, 0.1, 8.0, mul:0.3, freq1: ~kA4, freq2: ~kA4+1.1, vib1: 2.1, vib2: 4).play;
	
	0.005.wait;
	fork{
		~volUp = Pseq([0.9, 0.65, 0.4, 0.3, 0.2, 0.1, 0.07, 0.04].reverse*0.9, inf).asStream;
		6.do{
			~ats03.brt_(~kRC1 *1.82101).playPV3(0.01, 2.0, 0.1, mul:~volUp.next, pv3a:6.0, start:[0.73, 0.1, 0.28, 0.57, 0.9].choose, out: ~strCok.choose);
			1.0.wait;
		};
		0.5.wait;
		~ats06.brt_(~kRC1 *1.82101).playGverb(0.01, 2.0, 4.1, mul:0.7, start:[0.73, 0.1, 0.28, 0.57, 0.9].choose, out: ~strCok.choose);
		2.5.wait;
		~ats01.brt_(~kRA1/2 *1.82101).playPV3(0.01, 2.5, 5.1, mul:0.5, pv3a:8.0, start:0.5, out: ~strCok.choose);
	};


	2.5.wait;

	fork{
	
		~ats03.brt_(~kRD1 *1.82101).playPV3(1.01, 0.5, 0.1, mul:0.5, pv3a:9.0, start:0.2, out: ~strCok.choose);
		0.5.wait;
		~ats03.brt_(~kRD1 *1.82101).playPV3(0.01, 0.6, 1.1, mul:0.5, pv3a:8.0, start:0.4, out: ~strCok.choose);
		0.8.wait;
		~ats03.brt_(~kRB1 *1.82101).playPV3(0.01, 2.5, 0.1, mul:0.5, pv3a:7.0, start:0.1, out: ~strCok.choose);
		0.8.wait;
		~ats04.brt_(~kRB1 *1.82101).playPV3(0.01, 2.5, 5.1, mul:0.5, pv3a:4.0, start:0.1, out: ~strCok.choose);
	
	};


};

		
				}, 
			\layer_A_33 -> {//	hek2
				
fork{

	~kik02.brt_(1.0).playBuf(0.001, 2.1, 1, mul:0.8, out: ~strTek.choose); // dum
	KafSinVib.ar(0.1, 0.1, 8.0, mul:0.3, freq1: ~kB3, freq2: ~kC1+3, vib1: 20.1, vib2: 40 ).play;
	~ats01.brt_(~kRA1 *1.82101).playPV3(0.01, 2.5, 5.1, mul:0.8, pv3a:10.0, start:0.4, out: ~strCok.choose);
	
	3.5.wait;	
	fork{
		~volUp = Pseq([0.9, 0.65, 0.4, 0.3, 0.2, 0.1, 0.07, 0.04].reverse*0.9, inf).asStream;
		6.do{
			~ats03.brt_(~kRC1 *1.82101).playPV3(0.01, 2.0, 0.1, mul:~volUp.next, pv3a:6.0, start:[0.73, 0.1, 0.28, 0.57, 0.9].choose, out: ~strCok.choose);
			1.0.wait;
		};
		0.5.wait;
		~ats06.brt_(~kRA1 *1.82101).playGverb(0.01, 2.0, 4.1, mul:0.7, start:[0.73, 0.1, 0.28, 0.57, 0.9].choose, out: ~strCok.choose);
	};


};		
		
		

				}, 
			
		//-------------------------------------------lev5-4/4--24s-----------------------------------------------
			\layer_A_34 -> {//	|te
~ats06.brt_(~kRA1 *1.82101).playGverb(0.01, 2.0, 4.1, mul:0.7, start:[0.73, 0.1, 0.28, 0.57, 0.9].choose, out: ~strCok.choose);

fork{
	~kPseq01 = Pseq([~kRC2, ~kRE2, ~kRD1, ~kRC1, ~kRC2, ~kRC4, ~kRB3, ~kRC1], inf).asStream;
	~dur = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/3, inf).asStream;
	3.do{
		
		//var dur = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/5, inf).asStream;
		//var frqqq = Pseq([~kRC1, ~kRC3, ~kRC5, ~kRD1, ~kRC4, ~kRD1, ~kRC1, ~kRD1].rotate(0), inf).asStream;
		
		~gou02.brt_(~kPseq01 *0.89000).playPV5(0.001, 1.1, 10.1, mul:0.09, out: ~strTek.choose);
		~dur.next.wait;
		
		~tol06.brt_(~kPseq01 *1.23700).playPV2(0.001, 1.1, 16.1, mul:0.1, out: ~strHep);
		~ats03.brt_(~kPseq01 *1.82101).playPV1(0.01, 1.0, 1.1, mul:0.9, start:0.5, out: ~strCok.choose);
		~dur.next.wait;

	};
	
	0.001.wait;
	
	~met02.brt_(~kRD4 *1.01000).playGverb(0.001, 3.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strCok.choose);
	~ats02.brt_(~kRB4 *1.82101).playPV1(0.01, 1.0, 1.1, mul:0.9, start:0.5, out: ~strCok.choose);
	
};

~kik02.brt_(2.5).playPV4(0.001, 1.1, 1, mul:0.9, out: ~strCok.choose); // tek	



				
				}, 
			\layer_A_35 -> {//	ke
~ats06.brt_(~kRA1 *1.82101).playGverbR(0.01, 4.0, 9.1, mul:0.7, start:[0.0].choose, out: ~strCok.choose);

~gou05
	.brt1_(~kRA1 *1.02006).brt1Dur_(15)
	.btrDur_(0.25)
	.brt2_(~kRA2 *1.02006).brt2Dur_(16)
.transGverb(4.0, 5.9, 28.0, mul:0.01, start:0.0, out:~strCok.choose);


			
				}, 
			\layer_A_36 -> {//	|te

~ats06.brt_(~kRA2 *1.82101).playGverbR(0.01, 4.0, 9.1, mul:1.7, start:[0.0].choose, out: ~strCok.choose);

~gou05
	.brt1_(~kRA2 *1.02006).brt1Dur_(15)
	.btrDur_(0.25)
	.brt2_(~kRA4 *1.02006).brt2Dur_(16)
.transGverb(4.0, 5.9, 28.0, mul:0.02, start:0.0, out:~strCok.choose);	

				}, 
			\layer_A_37 -> {//	ke

~ats06.brt_(~kRA1 *1.82101).playGverbR(0.01, 4.0, 9.1, mul:1.7, start:[0.0].choose, out: ~strCok.choose);
				

				},

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////-------------------------------------------DEVR-i KEBIR --------5 Levels--19 parts--2.8s-----------------------------------------------/////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//-------------------------------------------lev1-6/4--36s-----------------------------------------------
			\layer_A_38 -> {//	+dum2
"LayerA DEVR-i KEBIR level 1  6/4".postln;

~ats06.brt_(~kRA1 *1.82101).playGverbR(0.01, 4.0, 9.1, mul:1.7, start:[0.0].choose, out: ~strCok.choose);

~gou05
	.brt1_(~kRA3 *1.02006).brt1Dur_(15)
	.btrDur_(0.25)
	.brt2_(~kRA4 *1.02006).brt2Dur_(16)
.transGverb(4.0, 5.9, 28.0, mul:0.05, start:0.0, out:~strCok.choose);

		
				
				}, 
			\layer_A_39 -> {//	|dum2
				
~ats06.brt_(~kRA1 *1.82101).playGverbR(0.01, 4.0, 9.1, mul:1.7, start:[0.0].choose, out: ~strCok.choose);


				
				}, 
			\layer_A_40 -> {//	|tek2

~ats06.brt_(~kRA1 *1.82101).playGverbR(0.01, 4.0, 9.1, mul:1.7, start:[0.0].choose, out: ~strCok.choose);
			
~gou05
	.brt1_(~kRA4 *1.02006).brt1Dur_(15)
	.btrDur_(0.25)
	.brt2_(~kRA1 *1.02006).brt2Dur_(16)
.transGverb(4.0, 5.9, 28.0, mul:0.09, start:0.0, out:~strCok.choose);



				},
			
		//-------------------------------------------lev2-4/4--24s-----------------------------------------------
			\layer_A_41 -> {//	+dum
"LayerA DEVR-i KEBIR level 2  4/4".postln;


~ats06.brt_(~kRA1 *1.82101).playGverbR(0.01, 4.0, 9.1, mul:1.7, start:[0.0].choose, out: ~strCok.choose);
		
~gou05
	.brt1_(~kRA1 *1.02006).brt1Dur_(15)
	.btrDur_(0.25)
	.brt2_(~kRA2 *1.02006).brt2Dur_(16)
.transGverb(4.0, 5.9, 28.0, mul:0.8, start:0.0, out:~strCok.choose);


				}, 
			\layer_A_42 -> {//	|tek


~ats06.brt_(~kRA1 *1.82101).playGverbR(0.01, 4.0, 9.1, mul:0.7, start:[0.0].choose, out: ~strCok.choose);
~gou05
	.brt1_(~kRA4 *1.02006).brt1Dur_(10)
	.btrDur_(0.25)
	.brt2_(~kRA1 *1.02006).brt2Dur_(16)
.transGverb(1.0, 1.9, 28.0, mul:0.8, start:0.0, out:~strCok.choose);

~gouA1 = {
	 ~kP01 = Pxrand([
				~kRA1, ~kRA2, ~kRA3, ~kRA4, ~kRA5, ~kRA6, ~kRA7, 
				~kRB1, ~kRB2, ~kRB3, ~kRB4, ~kRB5, ~kRB6, ~kRB7,
				~kRC1, ~kRC2, ~kRC3, ~kRC4, ~kRC5, ~kRC6, ~kRC7,
				~kRD1, ~kRD2, ~kRD3, ~kRD4, ~kRD5, ~kRD6, ~kRD7,
				~kRE1, ~kRE2, ~kRE3, ~kRE4, ~kRE5, ~kRE6, ~kRE7,
				~kRF1, ~kRF2, ~kRF3, ~kRF4, ~kRF5, ~kRF6, ~kRF7
	], inf).asStream;
	~amp = Pseq((0.1..0.05), 128).asStream;
	inf.do{
		var dur = Pwhite(0.2, 0.5, inf).asStream;

		~gou02.brt_(~kP01.next *0.89000).playBuf(0.001, 1.1, 5.1, mul:~amp.next, out: ~strTek.choose);
		dur.next.wait;
		
		
	};
	
}.fork;


				
				}, 
			\layer_A_43 -> {//	te'


~ats06.brt_(~kRA1 *1.82101).playGverbR(0.01, 4.0, 9.1, mul:3.7, start:[0.0].choose, out: ~strCok.choose);
~gou05
	.brt1_(~kRA5 *1.02006).brt1Dur_(10)
	.btrDur_(0.25)
	.brt2_(~kRA4 *1.02006).brt2Dur_(16)
.transGverb(1.0, 6.9, 28.0, mul:0.4, start:0.0, out:~strCok.choose);

				
				}, 
			\layer_A_44 -> {//	ke'

~ats06.brt_(~kRA4/2 *1.82101).playGverbR(0.01, 4.0, 9.1, mul:3.7, start:[0.0].choose, out: ~strCok.choose);
				
				},
			\layer_A_45 -> {//	|dum



				}, 
			
		//-------------------------------------------lev3-4/4--24s-----------------------------------------------
			\layer_A_46 -> {//	+tek2
"LayerA DEVR-i KEBIR level 3  4/4".postln;

~gouA2 = {
	 ~kP01 = Pxrand([
				~kRA1, ~kRA2, ~kRA3, ~kRA4, ~kRA5, ~kRA6, ~kRA7, 
				~kRB1, ~kRB2, ~kRB3, ~kRB4, ~kRB5, ~kRB6, ~kRB7,
				~kRC1, ~kRC2, ~kRC3, ~kRC4, ~kRC5, ~kRC6, ~kRC7,
				~kRD1, ~kRD2, ~kRD3, ~kRD4, ~kRD5, ~kRD6, ~kRD7,
				~kRE1, ~kRE2, ~kRE3, ~kRE4, ~kRE5, ~kRE6, ~kRE7,
				~kRF1, ~kRF2, ~kRF3, ~kRF4, ~kRF5, ~kRF6, ~kRF7
	], inf).asStream;
	~amp = Pseq((0.1..0.05), 128).asStream;
	inf.do{
		var dur = Pwhite(0.2, 0.5, inf).asStream;

		~gou02.brt_(~kP01.next *0.89000).playPV2(0.001, 1.1, 5.1, mul:~amp.next, out: ~strTek.choose);
		dur.next.wait;
		
		
	};
	
}.fork;


				
				}, 
			\layer_A_47 -> {//	|tek2
			
	
			
				
				
				
				},
			
			
		//-------------------------------------------lev4-6/4--36s-----------------------------------------------
			\layer_A_48 -> {//	+tek2
"LayerA DEVR-i KEBIR level 4  6/4".postln;

		


				}, 
			\layer_A_49 -> {//	+dum2
				
				}, 
			\layer_A_50 -> {//	|dum
				
				}, 
			
			\layer_A_51 -> {//	+ta2

				}, 
			\layer_A_52 -> {//	|hek

~gouA1.stop;
~gouA2.stop;

fork{
	~kPseq01 = Pseq([~kRC2, ~kRE2, ~kRD1, ~kRC1, ~kRC2, ~kRC4, ~kRB3, ~kRC1], inf).asStream;
	~dur = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/3, inf).asStream;
	8.do{
		
		//var dur = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/5, inf).asStream;
		//var frqqq = Pseq([~kRC1, ~kRC3, ~kRC5, ~kRD1, ~kRC4, ~kRD1, ~kRC1, ~kRD1].rotate(0), inf).asStream;
		
		~gou02.brt_(~kPseq01 *0.89000).playPV5(0.001, 1.1, 10.1, mul:0.09, out: ~strTek.choose);
		~dur.next.wait;
		
		~tol06.brt_(~kPseq01 *1.23700).playPV5(0.001, 1.1, 16.1, mul:0.1, out: ~strHep);
		~ats06.brt_(~kPseq01 *1.82101).playPV1(0.01, 1.0, 1.1, mul:0.9, start:0.5, out: ~strCok.choose);
		~dur.next.wait;

	};
	
	0.001.wait;
	
	~met02.brt_(~kRD4 *1.01000).playGverb(0.001, 3.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strCok.choose);
	~ats02.brt_(~kRB4 *1.82101).playPV1(0.01, 1.0, 1.1, mul:0.9, start:0.5, out: ~strCok.choose);
	
};

~kik02.brt_(2.5).playPV4(0.001, 1.1, 1, mul:0.9, out: ~strCok.choose); // tek	
			
				}, 
			
		//-------------------------------------------lev5-4/4--24s-----------------------------------------------
			\layer_A_53 -> {//	|te
"LayerA DEVR-i KEBIR level 5  4/4".postln;

~tol01.brt_(~kRD4 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.4, room:55, rev:23.5, damp:0.71, out: ~strCok.choose);


fork{		
	
	~kik01.brt_(1.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum				
	KafSinVib.ar(0.1, 0.1, 8.0, mul:0.3, freq1: ~kA1, freq2: ~kA1+3, vib1: 2.1, vib2: 4, out: ~strCok.choose).play;
	0.8.wait;
	fork{
		~mul01 = Pseq([0.5, 0.4, 0.3, 0.2, 0.1, 0.09, 0.07, 0.04]*0.9, inf).asStream;
		~dur01 = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/2, inf).asStream;
		8.do {|i|
			
			~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul: ~mul01.next, room:8.4, rev:1, damp:0.91, out: ~strCok.choose);
			~dur01.next.wait;
		
		};
	};
	2.5.wait;
	~kik01.brt_(5.5).playGverb(0.001, 1.1, 1, mul: ~mul01.next, room:8.4, rev:1, damp:0.91, out: ~strTek.choose);

	~gir04.brt_(2.8).playGverbR(0.001, 1.1, 10.1, mul:0.9, room:55, rev:13.5, damp:0.71, out: ~strTek.choose);

};


				
				}, 
			\layer_A_54 -> {//	ke
				
				}, 
			\layer_A_55 -> {//	|te
				
				}, 
			\layer_A_56 -> {//	ke
				



				
				
				},
			
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////-------------------------------------- BEREFSAN --------7 Levels-- 15 parts -- 3.2s -------------------------------------------------/////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//-------------------------------------------lev1-6/4--36s-----------------------------------------------
			\layer_A_57 -> {//	+dum2-3-4
"LayerA BEREFSAN".postln;				
~gir02.brt_(~kRD4 *1.07500).playGverb(1.1, 2.1, 16.1, mul:0.2, room:55, rev:13.5, damp:0.71, out: ~strCok.choose);

~kik01.brt_(1.5).playPV5(0.1, 1.1, 1, mul:0.9, out: ~strTek.choose); // dum

~ks38 = KafSinVib.ar(0.1, 0.1, 8.0, mul:0.3, freq1: ~kA4, freq2: ~kA4+3, vib1: 2.1, vib2: 4).play;
		
				
				}, 
			\layer_A_58 -> {//	|tek2

~met02.brt_(~kRA5 *1.01000).playGverb(0.001, 1.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);

~kik01.brt_(1.3).playPV2(0.001, 1.1, 1, mul:0.5, out: ~strTek.choose); // dum

~ks39 = KafSinVib.ar(0.1, 0.1, 8.0, mul:0.4, freq1: ~kA3, freq2: ~kA3+3, vib1: 2.1, vib2: 4).play;

				
				}, 
			
		//-------------------------------------------lev2-6/4--36s-----------------------------------------------
			\layer_A_59 -> {//	+dum2-3-4
				
~met02.brt_(~kRA6 *1.01000).playGverb(0.001, 0.1, 8.1, mul:0.6, room:55, rev:3.5, damp:0.71, out:~strTek.choose);

~kik01.brt_(1.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum

~ks40 = KafSinVib.ar(0.1, 0.1, 8.0, mul:0.3, freq1: ~kA2, freq2: ~kA2+3, vib1: 2.1, vib2: 4, out: ~strCok.choose).play;

~ats01.brt_(~kRA1/2 *1.82101).playPV3(0.01, 2.5, 5.1, mul:0.5, pv3a:8.0, start:0.5, out: ~strCok.choose);			
				}, 
			\layer_A_60 -> {//	|tek2

fork{
	~kik01.brt_(1.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum
	~met02.brt_(~kRA7 *1.01000).playGverb(0.001, 0.1, 8.1, mul:0.6, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.4.wait;
	~met02.brt_(~kRA5 *1.01000).playGverb(0.001, 0.1, 8.1, mul:0.6, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	~kik01.brt_(8.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum

};

~kik01.brt_(1.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum

~ks41 = KafSinVib.ar(0.1, 0.1, 8.0, mul:0.8, freq1: ~kA6, freq2: ~kA5+3, vib1: 2.1, vib2: 4).play;

~ats01.brt_(~kRA1/2 *1.82101).playPV3(0.01, 2.5, 5.1, mul:0.5, pv3a:9.0, start:0.5, out: ~strCok.choose);
				
				}, 
			
		//-------------------------------------------lev3-4/4--24s-----------------------------------------------
			\layer_A_61 -> {//	+dum2-3-4

~ks42 = KafSinVib.ar(0.1, 0.1, 8.0, mul:0.8, freq1: ~kA1, freq2: ~kA4+3, vib1: 2.1, vib2: 4).play;

~ats01.brt_(~kRA1/2 *1.82101).playPV3(0.01, 2.5, 5.1, mul:0.5, pv3a:4.0, start:0.2, out: ~strCok.choose);
				
				}, 
			
		//-------------------------------------------lev4-4/4--24s-----------------------------------------------
			\layer_A_62 -> {//	|dum2

~met02.brt_(~kRA6 *1.01000).playGverb(0.001, 0.1, 8.1, mul:0.6, room:55, rev:3.5, damp:0.71, out:~strTek.choose);

~kik01.brt_(1.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum

~ks43 = KafSinVib.ar(0.1, 0.1, 8.0, mul:0.3, freq1: ~kA2, freq2: ~kA2+3, vib1: 2.1, vib2: 4).play;

~ats01.brt_(~kRA1/2 *1.82101).playPV3(0.01, 2.5, 5.1, mul:0.5, pv3a:8.0, start:0.5, out: ~strCok.choose);

				
				}, 
			\layer_A_63 -> {//	tek2

~met02.brt_(~kRA3 *1.01000).playGverb(0.001, 0.1, 8.1, mul:0.6, room:55, rev:3.5, damp:0.71, out:~strTek.choose);

~kik01.brt_(1.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum

~ks44 = KafSinVib.ar(0.1, 0.1, 8.0, mul:0.3, freq1: ~kA2, freq2: ~kA2+3, vib1: 2.1, vib2: 4).play;

~ats01.brt_(~kRA1/2 *1.82101).playPV3(0.01, 2.5, 5.1, mul:0.5, pv3a:8.0, start:0.5, out: ~strCok.choose);
				
				}, 
		//-------------------------------------------lev5-4/4--24s-----------------------------------------------
			\layer_A_64 -> {//	+dum2

~met02.brt_(~kRA4 *1.01000).playGverb(0.001, 0.1, 8.1, mul:0.6, room:55, rev:3.5, damp:0.71, out:~strTek.choose);

~kik01.brt_(1.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum

~ks45 = KafSinVib.ar(0.1, 0.1, 8.0, mul:0.3, freq1: ~kA4, freq2: ~kA4+3, vib1: 2.1, vib2: 4).play;

~ats01.brt_(~kRA1/2 *1.82101).playPV3(0.01, 2.5, 5.1, mul:0.9, pv3a:8.0, start:0.5, out: ~strCok.choose);
				
				}, 
			\layer_A_65 -> {//	|dum2

fork{
	
	0.5.wait;
	
	~gir04
		.brt1_(~kRA1 *1.02006).brt1Dur_(0.1)
		.btrDur_(180.5)
		.brt2_(~kRC3 *1.02006).brt2Dur_(80)
	.transGverb(0.001, 1.09, 4.0, mul:0.3, start:0.0, out: ~strCok.choose);

	fork{
		3.do{
			var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
			var amp = Pseq((0.4..0.75), 8).asStream;
			~kik03.brt_(7.5).playPV5(0.001, 1.1, 1, mul:amp, out: ~strCok.choose); // tek	
			dur.next.wait;
			
			
		};
		~kik03.brt_(2.5).playPV5(0.001, 1.1, 1, mul:0.9, out: ~strCok.choose); // tek
		~met02.brt_(~kRA1 *1.01000).playGverb(0.001, 0.1, 8.1, mul:0.6, room:55, rev:3.5, damp:0.71, out:~strTek.choose);	
	};

};
				
				}, 
		//-------------------------------------------lev6-4/4--24s-----------------------------------------------
			\layer_A_66 -> {//	+ta2

fork{
	

	~kik03.brt_(1.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum
	~met02.brt_(~kRA6 *1.01000).playGverb(0.001, 0.1, 8.1, mul:0.6, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	0.2.wait;
	~met03.brt_(~kRA4 *1.01000).playGverb(0.001, 0.1, 8.1, mul:0.6, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
	~kik03.brt_(8.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum

};

				}, 
			\layer_A_67 -> {//	|hek
				
				}, 
			
		//-------------------------------------------lev7-4/4--24s-----------------------------------------------
			\layer_A_68 -> {//	|te

fork {
	~ff = ~kA1;
	KafGendy.ar(1.1, 0.1, 4.3, 16.8,
		freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
		freqrlp1: ~kA1/2, 
		freqrlp2: ~ff*2,
		mul: 0.4,
		out: ~strTek.choose
	).play;
	
	9.5.wait;
	
	~ff = ~kA4;
	KafGendy.ar(1.1, 0.1, 4.3, 4.8,
		freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
		freqrlp1: ~kA1/2, 
		freqrlp2: ~ff*2,
		mul: 0.4,
		out: ~strTek.choose
	).play;
	~tht08.brt_(~kRB4 *1.10000).playPV4(1, 4.1, 5.1, pv4a:1.2, loop:0, out: ~strTek.choose); //ok

	5.5.wait;
	
	~ff = ~kA3;
	KafGendy.ar(1.1, 0.1, 4.3, 4.8,
		freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
		freqrlp1: ~kA1/2, 
		freqrlp2: ~ff*2,
		mul: 0.4,
		out: ~strTek.choose
	).play;

	
};				
	
				
				}, 
			\layer_A_69 -> {//	ke
				
				}, 
			\layer_A_70 -> {//	|te
				
				}, 
			\layer_A_71 -> {//	ke
				
				}
		).play;
		
//------Zencir-------//
Pdef(\zencirLayerA, Posc(
	\msg, Pseq(
		[
		//cifteDuyek
		\layer_A_1, \layer_A_2, \layer_A_3, 
		\layer_A_4, \layer_A_5, \layer_A_6, \layer_A_7, \layer_A_8,
		//fahte
		\layer_A_9, \layer_A_10,\layer_A_11, 
		\layer_A_12, \layer_A_13, \layer_A_14, 
		\layer_A_15, \layer_A_16, \layer_A_17, 
		\layer_A_18, \layer_A_19, \layer_A_20, \layer_A_21, 
		//cember
		\layer_A_22, \layer_A_23, \layer_A_24, 
		\layer_A_25, \layer_A_26, \layer_A_27, 
		\layer_A_28, \layer_A_29, \layer_A_30,
		\layer_A_31, \layer_A_32, \layer_A_33, 
		\layer_A_34, \layer_A_35, \layer_A_36, \layer_A_37, 
		//devriKebir
		\layer_A_38, \layer_A_39, \layer_A_40, 
		\layer_A_41, \layer_A_42, \layer_A_43, \layer_A_44, \layer_A_45, 
		\layer_A_46, \layer_A_47, 
		\layer_A_48, \layer_A_49, \layer_A_50, \layer_A_51, \layer_A_52, 
		\layer_A_53, \layer_A_54, \layer_A_55, \layer_A_56, 
		//berefsan
		\layer_A_57, \layer_A_58, 
		\layer_A_59, \layer_A_60, 
		\layer_A_61, 
		\layer_A_62, \layer_A_63, \layer_A_64, \layer_A_65, \layer_A_66, \layer_A_67, 
		\layer_A_68, \layer_A_69, \layer_A_70, \layer_A_71
		
		], inf
	),
	\dur, Pseq(
		[
		//cifteDuyek
		Pseq([2, 4, 2], 1),
		Pseq([2, 2, 2, 1, 1], 1),
		//fahte
		Pseq([2, 1, 1], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1,1], 1),
		//cember
		Pseq([2, 1, 1], 1),
		Pseq([2, 1, 1], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1, 1], 1),
		//devriKebir
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1/2, 1/2, 1], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1, 1], 1),
		//berefsan
		Pseq([4, 2], 1),
		Pseq([4, 2], 1),
		Pseq([4], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1,1], 1)
		
		]*6, 1
	)
	)
);






//------CifteDuyek-------//
Pdef(\cifteDuyekLayerA, Posc(
	\msg, Pseq(
		[
		//cifteDuyek
		\layer_A_1, \layer_A_2, \layer_A_3, 
		\layer_A_4, \layer_A_5, \layer_A_6, \layer_A_7, \layer_A_8		
		], inf
	),
	\dur, Pseq(
		[
		//cifteDuyek
		Pseq([2, 4, 2], 1),
		Pseq([2, 2, 2, 1, 1], 1)
		
		]*6, 1
	)
	)
);

//------toFahte-------//
Pdef(\toFahteLayerA, Posc(
	\msg, Pseq(
		[
		\layer_A_7, \layer_A_8,
		//fahte
		\layer_A_9, \layer_A_10,\layer_A_11, 
		\layer_A_12, \layer_A_13, \layer_A_14, 
		\layer_A_15, \layer_A_16, \layer_A_17, 
		\layer_A_18, \layer_A_19, \layer_A_20, \layer_A_21, 
		//cember
		\layer_A_22, \layer_A_23, \layer_A_24, 
		\layer_A_25, \layer_A_26, \layer_A_27, 
		\layer_A_28, \layer_A_29, \layer_A_30,
		\layer_A_31, \layer_A_32, \layer_A_33, 
		\layer_A_34, \layer_A_35, \layer_A_36, \layer_A_37, 
		//devriKebir
		\layer_A_38, \layer_A_39, \layer_A_40, 
		\layer_A_41, \layer_A_42, \layer_A_43, \layer_A_44, \layer_A_45, 
		\layer_A_46, \layer_A_47, 
		\layer_A_48, \layer_A_49, \layer_A_50, \layer_A_51, \layer_A_52, 
		\layer_A_53, \layer_A_54, \layer_A_55, \layer_A_56, 
		//berefsan
		\layer_A_57, \layer_A_58, 
		\layer_A_59, \layer_A_60, 
		\layer_A_61, 
		\layer_A_62, \layer_A_63, \layer_A_64, \layer_A_65, \layer_A_66, \layer_A_67, 
		\layer_A_68, \layer_A_69, \layer_A_70, \layer_A_71
		], inf
	),
	\dur, Pseq(
		[
		Pseq([ 1, 1], 1),
		//fahte
		Pseq([2, 1, 1], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1,1], 1),
		//cember
		Pseq([2, 1, 1], 1),
		Pseq([2, 1, 1], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1, 1], 1),
		//devriKebir
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1/2, 1/2, 1], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1, 1], 1),
		//berefsan
		Pseq([4, 2], 1),
		Pseq([4, 2], 1),
		Pseq([4], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1,1], 1)
		]*6, 1
	)
	)
);


//---------Fahte-------//
Pdef(\fahteLayerA, Posc(
	\msg, Pseq(
		[

		//fahte
		\layer_A_9, \layer_A_10,\layer_A_11, 
		\layer_A_12, \layer_A_13, \layer_A_14, 
		\layer_A_15, \layer_A_16, \layer_A_17, 
		\layer_A_18, \layer_A_19, \layer_A_20, \layer_A_21, 
		//cember
		\layer_A_22, \layer_A_23, \layer_A_24, 
		\layer_A_25, \layer_A_26, \layer_A_27, 
		\layer_A_28, \layer_A_29, \layer_A_30,
		\layer_A_31, \layer_A_32, \layer_A_33, 
		\layer_A_34, \layer_A_35, \layer_A_36, \layer_A_37, 
		//devriKebir
		\layer_A_38, \layer_A_39, \layer_A_40, 
		\layer_A_41, \layer_A_42, \layer_A_43, \layer_A_44, \layer_A_45, 
		\layer_A_46, \layer_A_47, 
		\layer_A_48, \layer_A_49, \layer_A_50, \layer_A_51, \layer_A_52, 
		\layer_A_53, \layer_A_54, \layer_A_55, \layer_A_56, 
		//berefsan
		\layer_A_57, \layer_A_58, 
		\layer_A_59, \layer_A_60, 
		\layer_A_61, 
		\layer_A_62, \layer_A_63, \layer_A_64, \layer_A_65, \layer_A_66, \layer_A_67, 
		\layer_A_68, \layer_A_69, \layer_A_70, \layer_A_71
		
		
		], inf
	),
	\dur, Pseq(
		[

		//fahte
		Pseq([2, 1, 1], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1,1], 1),
		//cember
		Pseq([2, 1, 1], 1),
		Pseq([2, 1, 1], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1, 1], 1),
		//devriKebir
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1/2, 1/2, 1], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1, 1], 1),
		//berefsan
		Pseq([4, 2], 1),
		Pseq([4, 2], 1),
		Pseq([4], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1,1], 1)
		
		]*6, 1
	)
	)
);


//------toCember-------//
Pdef(\toCemberLayerA, Posc(
	\msg, Pseq(
		[
		\layer_A_20, \layer_A_21,
		//cember
		\layer_A_22, \layer_A_23, \layer_A_24, 
		\layer_A_25, \layer_A_26, \layer_A_27, 
		\layer_A_28, \layer_A_29, \layer_A_30,
		\layer_A_31, \layer_A_32, \layer_A_33, 
		\layer_A_34, \layer_A_35, \layer_A_36, \layer_A_37, 
		//devriKebir
		\layer_A_38, \layer_A_39, \layer_A_40, 
		\layer_A_41, \layer_A_42, \layer_A_43, \layer_A_44, \layer_A_45, 
		\layer_A_46, \layer_A_47, 
		\layer_A_48, \layer_A_49, \layer_A_50, \layer_A_51, \layer_A_52, 
		\layer_A_53, \layer_A_54, \layer_A_55, \layer_A_56, 
		//berefsan
		\layer_A_57, \layer_A_58, 
		\layer_A_59, \layer_A_60, 
		\layer_A_61, 
		\layer_A_62, \layer_A_63, \layer_A_64, \layer_A_65, \layer_A_66, \layer_A_67, 
		\layer_A_68, \layer_A_69, \layer_A_70, \layer_A_71
		], inf
	),
	\dur, Pseq(
		[
		Pseq([ 1, 1], 1),
		//cember
		Pseq([2, 1, 1], 1),
		Pseq([2, 1, 1], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1, 1], 1),
		//devriKebir
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1/2, 1/2, 1], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1, 1], 1),
		//berefsan
		Pseq([4, 2], 1),
		Pseq([4, 2], 1),
		Pseq([4], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1,1], 1)
		]*6, 1
	)
	)
);


//------Cember-------//
Pdef(\cemberLayerA, Posc(
	\msg, Pseq(
		[

		//cember
		\layer_A_22, \layer_A_23, \layer_A_24, 
		\layer_A_25, \layer_A_26, \layer_A_27, 
		\layer_A_28, \layer_A_29, \layer_A_30,
		\layer_A_31, \layer_A_32, \layer_A_33, 
		\layer_A_34, \layer_A_35, \layer_A_36, \layer_A_37, 
		//devriKebir
		\layer_A_38, \layer_A_39, \layer_A_40, 
		\layer_A_41, \layer_A_42, \layer_A_43, \layer_A_44, \layer_A_45, 
		\layer_A_46, \layer_A_47, 
		\layer_A_48, \layer_A_49, \layer_A_50, \layer_A_51, \layer_A_52, 
		\layer_A_53, \layer_A_54, \layer_A_55, \layer_A_56, 
		//berefsan
		\layer_A_57, \layer_A_58, 
		\layer_A_59, \layer_A_60, 
		\layer_A_61, 
		\layer_A_62, \layer_A_63, \layer_A_64, \layer_A_65, \layer_A_66, \layer_A_67, 
		\layer_A_68, \layer_A_69, \layer_A_70, \layer_A_71
		
		], inf
	),
	\dur, Pseq(
		[

		//cember
		\layer_A_22, \layer_A_23, \layer_A_24, 
		\layer_A_25, \layer_A_26, \layer_A_27, 
		\layer_A_28, \layer_A_29, \layer_A_30,
		\layer_A_31, \layer_A_32, \layer_A_33, 
		\layer_A_34, \layer_A_35, \layer_A_36, \layer_A_37, 
		//devriKebir
		\layer_A_38, \layer_A_39, \layer_A_40, 
		\layer_A_41, \layer_A_42, \layer_A_43, \layer_A_44, \layer_A_45, 
		\layer_A_46, \layer_A_47, 
		\layer_A_48, \layer_A_49, \layer_A_50, \layer_A_51, \layer_A_52, 
		\layer_A_53, \layer_A_54, \layer_A_55, \layer_A_56, 
		//berefsan
		\layer_A_57, \layer_A_58, 
		\layer_A_59, \layer_A_60, 
		\layer_A_61, 
		\layer_A_62, \layer_A_63, \layer_A_64, \layer_A_65, \layer_A_66, \layer_A_67, 
		\layer_A_68, \layer_A_69, \layer_A_70, \layer_A_71
		
		]*6, 1
	)
	)
);

//------toDKebir-------//
Pdef(\toDevriKebirLayerA, Posc(
	\msg, Pseq(
		[
		\layer_A_31, \layer_A_32, \layer_A_33,
		\layer_A_34, \layer_A_35, \layer_A_36, \layer_A_37,
		//devriKebir
		\layer_A_38, \layer_A_39, \layer_A_40, 
		\layer_A_41, \layer_A_42, \layer_A_43, \layer_A_44, \layer_A_45, 
		\layer_A_46, \layer_A_47, 
		\layer_A_48, \layer_A_49, \layer_A_50, \layer_A_51, \layer_A_52, 
		\layer_A_53, \layer_A_54, \layer_A_55, \layer_A_56, 
		//berefsan
		\layer_A_57, \layer_A_58, 
		\layer_A_59, \layer_A_60, 
		\layer_A_61, 
		\layer_A_62, \layer_A_63, \layer_A_64, \layer_A_65, \layer_A_66, \layer_A_67, 
		\layer_A_68, \layer_A_69, \layer_A_70, \layer_A_71
		], inf
	),
	\dur, Pseq(
		[
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1, 1], 1),
		//devriKebir
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1/2, 1/2, 1], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1, 1], 1),
		//berefsan
		Pseq([4, 2], 1),
		Pseq([4, 2], 1),
		Pseq([4], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1,1], 1)
		]*6, 1
	)
	)
);

//------devriKebirLayerA-------//
Pdef(\devriKebirLayerA, Posc(
	\msg, Pseq(
		[

		//devriKebir
		\layer_A_38, \layer_A_39, \layer_A_40, 
		\layer_A_41, \layer_A_42, \layer_A_43, \layer_A_44, \layer_A_45, 
		\layer_A_46, \layer_A_47, 
		\layer_A_48, \layer_A_49, \layer_A_50, \layer_A_51, \layer_A_52, 
		\layer_A_53, \layer_A_54, \layer_A_55, \layer_A_56, 
		//berefsan
		\layer_A_57, \layer_A_58, 
		\layer_A_59, \layer_A_60, 
		\layer_A_61, 
		\layer_A_62, \layer_A_63, \layer_A_64, \layer_A_65, \layer_A_66, \layer_A_67, 
		\layer_A_68, \layer_A_69, \layer_A_70, \layer_A_71
		
		], inf
	),
	\dur, Pseq(
		[

		//devriKebir
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1/2, 1/2, 1], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1, 1], 1),
		//berefsan
		Pseq([4, 2], 1),
		Pseq([4, 2], 1),
		Pseq([4], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1,1], 1)
		
		]*6, 1
	)
	)
);

//------toBerefsan-------//
Pdef(\toBerefsanLayerA, Posc(
	\msg, Pseq(
		[
		\layer_A_55, \layer_A_56, 
		//berefsan
		\layer_A_57, \layer_A_58, 
		\layer_A_59, \layer_A_60, 
		\layer_A_61, 
		\layer_A_62, \layer_A_63, \layer_A_64, \layer_A_65, \layer_A_66, \layer_A_67, 
		\layer_A_68, \layer_A_69, \layer_A_70, \layer_A_71
		], inf
	),
	\dur, Pseq(
		[
		Pseq([ 1, 1], 1),
		//berefsan
		Pseq([4, 2], 1),
		Pseq([4, 2], 1),
		Pseq([4], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1,1], 1)
		]*6, 1
	)
	)
);

//------Berefsan-------//
Pdef(\berefsanLayerA, Posc(
	\msg, Pseq(
		[

		//berefsan
		\layer_A_57, \layer_A_58, 
		\layer_A_59, \layer_A_60, 
		\layer_A_61, 
		\layer_A_62, \layer_A_63, \layer_A_64, \layer_A_65, \layer_A_66, \layer_A_67, 
		\layer_A_68, \layer_A_69, \layer_A_70, \layer_A_71
		
		], inf
	),
	\dur, Pseq(
		[

		//berefsan
		Pseq([4, 2], 1),
		Pseq([4, 2], 1),
		Pseq([4], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([2, 2], 1),
		Pseq([1, 1, 1,1], 1)
		
		]*6, 1
	)
	)
);




	
	
		
	
	}	
	


}