


KafesLayerB {
	
	
	*load {
		
	

		~zencirLayerB = Preceive(


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////-------------------------------------- CiFTE DUYEK --------2 Levels-- 8 parts -- 1.6s -------------------------------------------------/////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//-------------------------------------------lev1-8/4--48s-----------------------------------------------KafesGlobals
			\layer_B_1 -> {//	|dum2 ---------------- 12

OF.rect(0,0,1280, 1024);
OF.int("mirrorMode", 0);
			
				}, 
			\layer_B_2 -> {//	+tek2-3-4------------- 24

				}, 
			\layer_B_3 -> {//	|tek2 ---------------- 12


fork {
	
	~gir01.brt_(~kRC1 *1.19000).playBuf(2.1, 0.1, 4, loop:0, out: ~strCok.choose);
	~kik01.brt_(3.5).playPV2(0.001, 1.1, 1, mul:0.4, out: ~strTek.choose); // tek
	
	fork{
		4.do{
		var dur = Pseq([0.25]/5, inf).asStream;
		~gou02.brt_(~kRD3 *0.89000).playPV2(0.001, 1.1, 10.1, mul:0.2, out: ~strTek.choose);
		OF.img(~imageLib.at('deli', rrand(0,5)), [255, 155, 100, 55], 255, 180, 0);
		dur.next.wait;
	
		};
		0.09.wait;
		~gou02.brt_(~kRD4 *0.89000).playGverb(0.001, 1.1, 10.1, mul:0.5, room:55, rev:3.5, damp:0.91, out: ~strTek.choose);
		OF.img(~imageLib.at('deli', rrand(0,5)), [255, 155, 100, 55], 255, 180, 0);
		
	};
	
	
	0.25.wait;
	fork {
		
		~gou02.brt_(~kRD5 *0.89000).playGverb(0.001, 1.1, 10.1, mul:0.2, room:55, rev:3.5, damp:0.91, out: ~strTek.choose);
		OF.img(~imageLib.at('deli', rrand(0,5)), [255, 155, 100, 55], 255, 180, 0);
		
		
		0.5.wait;
		~kik01.brt_(9.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // tek
		OF.img(~imageLib.at('deli', rrand(0,5)), [255, 155, 100, 55], 255, 180, 0);
		0.5.wait;
	};
	1.5.wait;			
	fork{
		~kPseq01 = Pseq([~kRC1, ~kRC3, ~kRC5, ~kRD1, ~kRC4, ~kRD1, ~kRC1, ~kRD1], inf).asStream;
		11.do {|i, fr|
			var  ja;
			~bth02.brt_(~kPseq01.next *1.00011).playPV2(0.001, 10.3, 0.3, mul:0.03+(0.04*(i%9)), out: ~strTek.choose);
			OF.img(~imageLib.at('deli', rrand(0,5)), [255, 155, 100, 55], 255, 180, 0);
			(0.4 - (0.04*(i%15))).wait;	
			
		};
		
		
	};

	2.5.wait;
	fork{
		~kPseq01 = Pseq([~kRC1, ~kRC3, ~kRC5, ~kRD1, ~kRC4, ~kRD1, ~kRC1, ~kRD1], inf).asStream;
		12.do {|i, fr|
			var  ja;
			~gou02.brt_(~kRD5 *0.89000).playPV2(0.001, 10.3, 0.3, mul:0.01+(0.04*(i%9)), out: ~strTek.choose);
			OF.img(~imageLib.at('deli', rrand(0,5)), [255, 155, 100, 55], 255, 180, 0);
			(0.1 + (0.04*(i%15))).wait;	
			~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.05+(0.04*(i%9)), out: ~strTek.choose); // tek
			(0.1 + (0.04*(i%15))).wait;
		};
		
		
	};


};


				},
		
		//-------------------------------------------lev2-8/4--48s-----------------------------------------------
			\layer_B_4 -> {//	+dum2

~gou02.brt_(~kRC3 *0.89000).playPV2(0.001, 1.1, 10.1, mul:0.6, out: ~strTek.choose);
OF.img(~imageLib.at('kostum', rrand(0,3)), 100, 205, 0, 0);

fork{
	0.5.wait;
	~sis08.brt_(~kRA1 *1.20900).playBufR(0.01, 8.1, 1.1, mul:0.5, out: ~strTek.choose);
	0.4.wait;
	
	fork{
		~volUp = Pseq([0.9, 0.65, 0.4, 0.3, 0.2, 0.1, 0.07, 0.04].reverse*0.5, inf).asStream;
		5.do{
			~ats03.brt_(~kRA1 *1.82101).playPV2(0.01, 2.0, 0.1, mul:~volUp.next, pv2a:6.0, start:[0.3, 0.1, 0.18, 0.17, 0.19].choose, out: ~strTek.choose);
			1.0.wait;
		};
	};
	2.2.wait;
	
	fork{
		~dur = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/5, inf).asStream;
		3.do{
		//var dur = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/5, inf).asStream;
		~gou02.brt_(~kRC5 *0.89000).playPV2(0.001, 1.1, 10.1, mul:0.2, out: ~strTek.choose);
		OF.img(~imageLib.at('el1', rrand(0,8)), [55, 155, 100, 55].choose, 255, 0, 0);
		~dur.next.wait;
	
		};
		0.09.wait;
		~gou02.brt_(~kRD5 *0.89000).playGverb(0.001, 1.1, 10.1, mul:0.5, room:55, rev:3.5, damp:0.91, out: ~strTek.choose);
		OF.img(~imageLib.at('el1', rrand(0,8)), [68, 155, 100, 55].choose, 255, 0, 0);
		
	};
	
	
	

};
				
				}, 
			\layer_B_5 -> {//	|dum2


fork{

	~gou02.brt_(~kRD4 *0.89000).playPV1R(0.1, 3.1, 5.1, mul:0.6, out: ~strTek.choose);
	~gou02.brt_(~kRD4 *0.89000).playGverb(0.001, 1.1, 10.1, mul:0.5, room:55, rev:3.5, damp:0.91, out: ~strTek.choose);
	//vis
	~blackFade={
		~fade = Pseq((0..255), 124).asStream;
		124.do{
			OF.img(~imageLib.at('box', 2), ~fade.next, 200, 0, 0);
			OF.int("mirrorMode", 0);
			0.04.wait;
		};
	}.fork;
	0.05.wait;			
	~gou03
		.brt1_(~kRA1 *1.02006).brt1Dur_(3.7)
		.btrDur_(1.9)
		.brt2_(~kRB4 *1.02006).brt2Dur_(7)
	.transGverb(10.0, 1.9, 8.0, mul:0.02, start:0.0, out: ~strTek.choose);
	0.05.wait;
	
	~gou02.brt_(~kRD1 *0.89000).playPV1R(0.1, 3.1, 5.1, mul:0.6, out: ~strTek.choose);
	
	~gou03
		.brt1_(~kRA3 *1.02006).brt1Dur_(3.4)
		.btrDur_(2.3)
		.brt2_(~kRA4 *1.02006).brt2Dur_(7)
	.transGverb(10.0, 1.9, 8.0, mul:0.02, start:0.0, out: ~strTek.choose);
	2.8.wait;
	~gou02.brt_(~kRB1 *0.89000).playPV2(0.1, 3.1, 5.1, mul:0.1, out: ~strCok.choose);
	0.2.wait;
	~gou02.brt_(~kRC1 *0.89000).playPV1(0.1, 3.1, 5.1, mul:0.2, out: ~strCok.choose);
	0.4.wait;
	~gou02.brt_(~kRB4 *0.89000).playPV2(0.1, 3.1, 5.1, mul:0.1, out: ~strCok.choose);

};			
			
				}, 
			\layer_B_6 -> {//	|tek2
	
				}, 
			\layer_B_7 -> {//	|te

				
				}, 
			\layer_B_8 -> {//	ke

				
				}, 			
			
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////------------------------------------------- FAHTE --------4 Levels-- 13 parts -- 2.0s -------------------------------------------------/////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//-------------------------------------------lev1-4/4--24s-----------------------------------------------
			\layer_B_9 -> {//	+dum2
"LayerB FAHTE".postln;
	
~tol06.brt_(~kRB4 *1.23700).playGverbR(0.001, 3.1, 5.1, mul:0.5, room:55, rev:13.5, damp:0.71, out: ~strCok.choose);

	
				}, 
			\layer_B_10 -> {//	|dum
/*fork{
	fork{
		~kPseq01 = Pseq([~kRA1, ~kRC2, ~kRC1, ~kRC4, ~kRC2, ~kRC3, ~kRC1, ~kRA1].rotate(0)/4, inf).asStream;
		~amp = Pseq([0.15, 0.25, 0.35].rotate/1.9, inf).asStream;
		21.do{|i, frq = 2240, dur = 0.35|
			var freqs = frq + (12 *( i % 20)); 
			
			~tol06.brt_(~kPseq01 *1.07500).playPV2(0.001, 0.9, 2.01, mul:~amp, out: ~strTek.choose);
			( dur - (0.01*(i%24)) ).yield;
		};
	};
	0.5.wait;
	
	~tol06.brt_(~kRD1 *1.23700).playPV1R(0.001, 1.1, 16.1, mul:0.5, out: ~strTek.choose);
	0.8.wait;
	
	~tol06.brt_(~kRD4 *1.23700).playPV1R(0.001, 1.1, 16.1, mul:0.3, out: ~strTek.choose);
	1.0.wait;

	1.5.wait;
	
	~tol06.brt_(~kRD1 *1.23700).playPV1R(0.001, 1.1, 16.1, mul:0.5, out: ~strTek.choose);
	0.9.wait;
	
	~tol06.brt_(~kRA3 *1.23700).playPV1R(0.001, 1.4, 0.1, mul:0.2, out: ~strTek.choose);
	1.0.wait;
	~tol06.brt_(~kRA4 *1.23700).playPV2(0.001, 1.4, 5.1, mul:0.2, out: ~strTek.choose);
		
};*/				
				}, 
			\layer_B_11 -> {//	dum

//~met03.brt_(~kRB4 *0.99900).playGverb(2, 4.1, 16.1, mul:0.2, start: 0.4, room:55, rev:3.5, damp:0.81, out: ~strTek.choose);				
fork {
	0.5.wait;
	~ats02.brt_(~kRA1 *1.82101).playBufR(0.01, 1, 4, mul: 0.7, out: ~strTek.choose);
};	
				}, 
			
		//-------------------------------------------lev2-6/4--36s-----------------------------------------------
			\layer_B_12 -> {//	+tek2
	
~tol06.brt_(~kRB1 *1.23700).playGverbR(0.001, 1.1, 8.3, mul:0.8, room:55, rev:23.5, damp:0.61, out: ~strTek.choose);
~gou02.brt_(~kRB4 *0.89000).playPV2(0.1, 3.1, 5.1, mul:0.1, out: ~strCok.choose);
				
				}, 
			\layer_B_13 -> {//	|tek2

//~ats02.brt_(17.5).playPV1(0.01, 0.2, 2.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				
				}, 
			\layer_B_14 -> {//	_tek2

//~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.23, 0.1, 0.68, 0.57].choose, out:  ~strTek.choose); // tek
				
				}, 
			
		//-------------------------------------------lev3-6/4--36s-----------------------------------------------
			\layer_B_15 -> {//	+dum2
	
//~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.13, 0.18, 0.70, 0.47].choose, out:  ~strTek.choose); // tek
				
				}, 
			\layer_B_16 -> {//	|ta2


//~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				
				}, 
			\layer_B_17 -> {//	hek2
			
//~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek				
				}, 
			
		//-------------------------------------------lev4-4/4--24s-----------------------------------------------
			\layer_B_18 -> {//	|te

~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				
				}, 
			\layer_B_19 -> {//	ke

~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				
				}, 
			\layer_B_20 -> {//	|te

~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				
				}, 
			\layer_B_21 -> {//	ke
				
				}, 
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////------------------------------------------- Cember --------4 Levels-- 13 parts -- 2.4s -------------------------------------------------/////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//-------------------------------------------lev1-4/4--24s-----------------------------------------------
			\layer_B_22 -> {//	+dum2
"LayerB CEMBER".postln;				

fork{

//:-gonca1
~visRout.stop;
~visRout = {
	~seq = Pslide((0..7),inf, 3, 1, 0).asStream;
	18.do{
		
		OF.img(~imageLib.at('gonca', ~seq.next), 255, 255, 0, 0);
		0.02.wait;
		
	}
}.fork;

	fork{
		~kPseq01 = Pseq([~kRC4, ~kRC4, ~kRD1, ~kRC1, ~kRC4, ~kRC7, ~kRB7, ~kRC1].rotate(1)/1.5, inf).asStream;
		~seq0 = Pslide((0..7),inf, 3, 1, 0).asStream;
		18.do{|i, strt = 0.001, dur = 0.25|
			var starts = strt + (0.02 *( i % 24)); 
			
			~ats03.brt_(~kRA6 *1.02006).playBuf(0.001, 0.9, 0.01, mul:0.3, start: 0.0 + (0.01 *( i % 30)), out: ~strCok.choose);
			//OF.img(~imageLib.at('gonca', ~seq0.next), 255, 255, 0, 0);
			( dur - (0.0025*(i%40)) ).yield;
	
		};
		~ats03.brt_(~kRB1 *1.82101).playPV3(0.01, 2.5, 3.1, mul:0.5, pv3a:2.0, start:0.1, out: ~strCok.choose);

		
	};
	2.5.wait;
	~ats02.brt_(~kRB1 *1.82101).playBuf(0.01, 1.0, 1.1, mul:0.9, start:0.5, out: ~strCok.choose);
	
//:-elGecis
~visRout.stop;
~visRout = {
	~group = Pseq([
		Pseq(['el1'],7),
		Pseq(['el2'],4)
	], inf).asStream;
	~seq = Pseq([
		Pseq((0..8).mirror,9),
		Pseq((0..4).mirror,5)
	], inf).asStream;
	~op = Pseq((0..255), inf).asStream;
	inf.do{
		
		OF.img(~imageLib.at(~group.next, ~seq.next), 250, ~op.next, 0, 0);
		0.08.wait;
		
		
	}
}.fork;
	
	fork{
		~kPseq01 = Pseq([~kRC4, ~kRC4, ~kRD1, ~kRC1, ~kRC4, ~kRC7, ~kRB7, ~kRC1].rotate(1)/1.5, inf).asStream;
		15.do{|i, strt = 0.001, dur = 0.25|
			var starts = strt + (0.02 *( i % 24)); 
			
			~ats03.brt_(~kRA7 *1.02006).playBuf(0.001, 0.9, 0.01, mul:0.3, start: 0.0 + (0.01 *( i % 30)), out: ~strHep);
			( dur - (0.0025*(i%40)) ).yield;
			
	
		};
		0.5.wait;
		~ats02.brt_(~kRA4 *1.82101).playBuf(0.01, 1.0, 1.1, mul:0.9, start:0.5, out: ~strCok.choose);
		fork{
			~visRout.stop;
			0.2.wait;
			OF.img(~imageLib.at('sleepSag', 1), 255, 255, 0, 0);
			
			};
		
	};

};

~ats02.brt_(3.5).playPV1(0.01, 0.4, 4.1, mul:0.2, start:[0.28].choose, out: ~strTek.choose); // dum
				}, 
			\layer_B_23 -> {//	|te
~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out: ~strTek.choose); // dum			

				}, 
			\layer_B_24 -> {//	ke
	~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
	~ats03.brt_(3.5).playPV1(0.01, 4.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
			
				},
			
		//-------------------------------------------lev2-4/4--24s-----------------------------------------------	
			\layer_B_25 -> {//	+dum2
	~ats02.brt_(3.5).playPV1(0.01, 0.4, 1.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum			
				
				}, 
			\layer_B_26 -> {//	|dum
	
	~ats02.brt_(3.5).playPV1(0.01, 2.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
	

	
				}, 
			\layer_B_27 -> {//	_dum
	
	~ats02.brt_(3.5).playPV1(0.01, 2.4, 0.1, mul:0.2, start: 0.21, out:  ~strTek.choose); // dum

				
				},
			
		//-------------------------------------------lev3-6/4--36s-----------------------------------------------
			\layer_B_28 -> {//	+tek2
				
fork{

	~ats03.brt_(0.5).playPV1(0.01, 2.4, 4.1, mul:0.2, start: 0.39, out:  ~strTek.choose); // dum

};

				}, 
			\layer_B_29 -> {//	|tek2
				
fork{
	~ats04.brt_(3.5).playPV1(0.01, 0.4, 4.1, mul:0.2, start: 0.21, out:  ~strTek.choose); // dum
	1.5.wait;
	~ats03.brt_(0.5).playPV2(0.01, 0.4, 4.1, mul:0.2, start: 0.21, out:  ~strTek.choose); // dum
};

				}, 
			\layer_B_30 -> {//	tek2

	~ats04.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start: 0.11, out:  ~strTek.choose); // dum
				
				}, 
			
		//-------------------------------------------lev4-6/4--36s-----------------------------------------------
			\layer_B_31 -> {//	+dum2

	~ats04.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start: 0.51, out:  ~strTek.choose); // dum
	
	~rit01
		.brt1_(~kRA7/2 *1.02006).brt1Dur_(8.2)
		.btrDur_(1.5)
		.brt2_(~kRA1 *1.02006).brt2Dur_(3)
	.transBuf(2, 3.7, 28.0, mul:0.2, loop:1, out: ~strCok.choose);

fork{
	~volUp = Pseq([0.9, 0.65, 0.4, 0.3, 0.2, 0.1, 0.07, 0.04].reverse*0.9, inf).asStream;
	6.do{
		~ats03.brt_(~kRA1 *1.82101).playPV3(0.01, 2.0, 0.1, mul:~volUp.next, pv3a:6.0, start:[0.73, 0.1, 0.28, 0.57, 0.9].choose, out: ~strCok.choose);
		1.0.wait;
	};
};
				
				}, 
			\layer_B_32 -> {//	|ta2
fork{
	
	fork{
	
		~kik02.brt_(2.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
		1.5.wait;
		~kik02.brt_(5.5).playBuf(0.001, 1.1, 2, mul:0.6,  out: ~strTek.choose);
		0.5.wait;
		~kik02.brt_(2.5).playBuf(0.001, 1.1, 2, mul:0.4, out: ~strTek.choose);
		0.5.wait;
		~kik02.brt_(9.5).playBuf(0.001, 1.1, 2, mul:0.6,  out: ~strTek.choose);
	
	};
	
	0.001.wait;
	fork{
	
		~ats03.brt_(~kRB1 *1.82101).playPV3(0.01, 0.5, 0.1, mul:0.5, pv3a:6.0, start:0.2, out: ~strCok.choose);
		0.5.wait;
		~ats03.brt_(~kRB4 *1.82101).playPV3(0.01, 0.6, 1.1, mul:0.5, pv3a:2.0, start:0.4, out: ~strCok.choose);
		0.8.wait;
		~ats03.brt_(~kRB1 *1.82101).playPV3(0.01, 2.5, 0.1, mul:0.5, pv3a:8.0, start:0.1, out: ~strCok.choose);
		0.8.wait;
		~ats03.brt_(~kRB1 *1.82101).playPV3(0.01, 2.5, 0.1, mul:0.5, pv3a:2.0, start:0.1, out: ~strCok.choose);
	
	};
	4.0.wait;

	~ats03.brt_(0.9).playPV1(0.01, 5.4, 3.1, mul:0.8, start: 0.51, out:  ~strTek.choose); // dum

	fork{
		~mul01 = Pseq([0.5, 0.4, 0.3, 0.2, 0.1, 0.09, 0.07, 0.04]*0.9, inf).asStream;
		~dur01 = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94].reverse/2, inf).asStream;
		8.do {|i|
			
			~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul: ~mul01.next, room:8.4, rev:1, damp:0.91, out: ~str);
			~dur01.next.wait;
		
		};
	};

};
				
				}, 
			\layer_B_33 -> {//	hek2

~kik02.brt_(2.5).playPV4(0.001, 1.1, 1, mul:0.9, out: ~strCok.choose);
fork{

		~ff = ~kB3;
		KafGendy.ar(1.1, 0.1, 4.3, 0.8,
			freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
			freqrlp1: ~kA1/2, 
			freqrlp2: ~ff*2,
			mul: 0.4,
			out: ~strTek.choose
		).play;

	~ats03.brt_(~kRB1 *1.82101).playPV3(0.01, 0.5, 3.1, mul:0.9, pv3a:5.3, start:0.2, out: ~strCok.choose);	
	0.3.wait;
	~ats03.brt_(0.5).playPV4(0.01, 0.4, 4.1, mul:0.2, start: 0.17, out:  ~strTek.choose); // dum	0.5.wait;		
	~ats02.brt_(~kRB4 *1.82101).playBuf(0.01, 1.0, 1.1, mul:0.9, start:0.5, out: ~strCok.choose);
	0.5.wait;

	fork{
		~amp = Pseq((0.2..0.75), inf).asStream;
		3.do{
			
			var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
			//var amp = Pseq((0.4..0.75), 8).asStream;
			~kik01.brt_([9.5, 1.5, 3.5, 5.6 ].choose).playPV5(0.001, 1.1, 1, mul:~amp, out: ~strCok.choose); // tek	
			dur.next.wait;
			
			
		};
		~kik01.brt_(1.3).playPV5(0.001, 1.1, 1, mul:0.9, out: ~strCok.choose); // tek	
	};

	2.5.wait;
	~ats03.brt_(~kRB1 *1.82101).playPV3(0.01, 2.5, 0.1, mul:0.5, pv3a:2.0, start:0.1, out: ~strCok.choose);
	2.3.wait;
	
	fork{
		2.do{
			var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
			var amp = Pseq((0.4..0.75), 8).asStream;
			~kik01.brt_(0.5).playPV5(0.001, 1.1, 1, mul:amp, out: ~strCok.choose); // tek	
			dur.next.wait;
			
			
		};
		~kik01.brt_(1.5).playPV5(0.001, 1.1, 1, mul:0.9, out: ~strCok.choose); // tek	
	};
	
	fork{
		~bth02.brt_(~kRC1 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: [0, 1, [0,1]].choose);
		0.005.wait;
		~kik01.brt_(1.0).playPV2(0.001, 1.1, 2, mul:0.5, out: ~strTek.choose);
		~ats03.brt_(~kRB1 *1.82101).playPV3(0.01, 0.5, 2.1, mul:0.9, pv3a:5.0, start:0.18, out: ~strCok.choose);	
		
		0.005.wait;
		~ff = ~kA1;
		KafGendy.ar(1.1, 0.1, 6.3, 0.8,
			freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
			freqrlp1: ~kA1/2, 
			freqrlp2: ~ff*2,
			mul: 0.4,
			out: 0
		).play;
		0.005.wait;
		~tht08.brt_(~kRB1 *1.10000).playPV4(1, 0.1, 1.1, pv4a:0.02, loop:0, out: ~strTek.choose); //ok
		0.5.wait;
		~ff = ~kB1;
		KafGendy.ar(1.1, 0.1, 4.3, 0.8,
			freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
			freqrlp1: ~kA1/2, 
			freqrlp2: ~ff*2,
			mul: 0.4,
			out: 0
		).play;
	1.5.wait;
	~ats02.brt_(~kRB4 *1.82101).playPV1(0.01, 1.0, 1.1, mul:0.9, start:0.5, out: ~strCok.choose);	
	};

};
				
				}, 
			
		//-------------------------------------------lev5-4/4--24s-----------------------------------------------

			\layer_B_34 -> {//	|te
"--------------------KOUNATA----------------------".postln;

fork{
	1.2.wait;
	fork{
		~kPseq01 = Pseq([~kRD7, ~kRD6, ~kRD7, ~kRD4, ~kRD6, ~kRD5, ~kRD4, ~kRD3].rotate(6)/2, inf).asStream;
		~dur = Pseq([0.25, 0.25*1.1, 0.25*1.2, 0.25*1.3, 0.25*1.4, 0.25*1.5, 0.25*1.6, 0.25*1.7]/2, inf).asStream;
		12.do{
			
			//var dur = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/5, inf).asStream;
			//var frqqq = Pseq([~kRC1, ~kRC3, ~kRC5, ~kRD1, ~kRC4, ~kRD1, ~kRC1, ~kRD1].rotate(0), inf).asStream;
			
			~ats01.brt_(~kPseq01 *1.82101).playPV2(0.01, 1.0, 1.1, mul:0.6, start:0.5, out: ~strCok.choose);
			
			~tol06.brt_(~kPseq01*2 *1.23700).playPV3(0.001, 1.1, 16.1, mul:0.9, out: ~strHep);
			~dur.next.wait;
			
			~gou02.brt_(~kPseq01 *0.89000).playPV5(0.001, 1.1, 10.1, mul:0.09, out: ~strTek.choose);
			~ats02.brt_(~kPseq01 *1.82101).playPV1(0.01, 1.0, 1.1, mul:0.6, start:0.5, out: ~strCok.choose);
			~dur.next.wait;
	
		};
		
		0.01.wait;
		
		~met02.brt_(~kPseq01 *1.01000).playGverb(0.001, 3.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strCok.choose);
		~ats03.brt_(~kRB5 *1.82101).playPV1(0.01, 1.0, 1.1, mul:0.9, start:0.5, out: ~strCok.choose);
		~kik01.brt_(5.5).playPV5(0.001, 1.1, 1, mul:0.5, out: ~strCok.choose);
		0.5.wait;
		~tol01.brt_(~kPseq01 *1.07600).playPV5(0.001, 1.1, 4, mul:0.9, out: ~strCok.choose);
		0.5.wait;
		~met02.brt_(~kPseq01 *1.01000).playGverb(0.001, 3.1, 16.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strCok.choose);
	
	};
	
	~kik02.brt_(2.5).playPV4(0.001, 1.1, 1, mul:0.9, out: ~strCok.choose);
	
	//~gir04.brt_(~kRA7).playBuf(2.1, 0.1, 4, mul: 0.9, out: ~strTek.choose);



};
			
			
				}, 
			\layer_B_35 -> {//	ke
				
//~ats06.brt_(~kRA3 *1.82101).playGverbR(0.01, 4.0, 9.1, mul:0.7, start:[0.0].choose, out: ~strCok.choose);	
			




				}, 
			\layer_B_36 -> {//	|te

//~ats06.brt_(~kRA4 *1.82101).playGverbR(0.01, 4.0, 9.1, mul:1.7, start:[0.0].choose, out: ~strCok.choose);
	
				
				}, 
			\layer_B_37 -> {//	ke

//~ats06.brt_(~kRA5/2 *1.82101).playGverbR(0.01, 4.0, 9.1, mul:2.7, start:[0.0].choose, out: ~strCok.choose);

				
				},

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////-------------------------------------------DEVR-i KEBIR --------5 Levels--19 parts--2.8s-----------------------------------------------/////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//-------------------------------------------lev1-6/4--36s-----------------------------------------------
			\layer_B_38 -> {//	+dum2
"LayerB DEVR-i KEBIR".postln;


~gou02.brt_(~kRC1 *0.89000).playBufR(0.001, 2.1, 2.1, mul:0.9, out: ~strTek.choose);				


				
				}, 
			\layer_B_39 -> {//	|dum2
				
~gou02.brt_(~kRC1 *0.89000).playBufR(0.001, 3.1, 3.1, mul:0.9, out: ~strTek.choose);				
				
				}, 
			\layer_B_40 -> {//	|tek2
				
~gou02.brt_(~kRC1 *0.89000).playBuf(0.001, 1.1, 10.1, mul:0.09, out: ~strTek.choose);	

				},
			
		//-------------------------------------------lev2-4/4--24s-----------------------------------------------
			\layer_B_41 -> {//	+dum
~gou02.brt_(~kRC1 *0.89000).playBuf(0.001, 1.1, 10.1, mul:0.09, out: ~strTek.choose);	
~gou02.brt_(~kRC3 *0.89000).playBufR(0.001, 1.1, 2.1, mul:0.9, out: ~strTek.choose);				

				}, 
			\layer_B_42 -> {//	|tek

~gou02.brt_(~kRB7 *0.89000).playBufR(0.001, 4.1, 2.1, mul:1.9, out: ~strTek.choose);								
~gou02.brt_(~kRB7 *0.89000).playBuf(0.001, 1.1, 10.1, mul:0.09, out: ~strTek.choose);	

				}, 
			\layer_B_43 -> {//	te'
				
~gou02.brt_(~kRC1 *0.89000).playBufR(0.001, 6.1, 2.1, mul:0.9, out: ~strTek.choose);
				}, 
			\layer_B_44 -> {//	ke'

~gou02.brt_(~kRB5 *0.89000).playBufR(0.001, 8.1, 2.1, mul:0.9, out: ~strTek.choose);				
				},
			\layer_B_45 -> {//	|dum
~gou02.brt_(~kRC1 *0.89000).playBufR(0.001, 5.1, 2.1, mul:0.9, out: ~strTek.choose);

				}, 
			
		//-------------------------------------------lev3-4/4--24s-----------------------------------------------
			\layer_B_46 -> {//	+tek2

~gou02.brt_(~kRC4 *0.89000).playBufR(0.001, 3.1, 2.1, mul:0.9, out: ~strTek.choose);

				
				}, 
			\layer_B_47 -> {//	|tek2

~gou02.brt_(~kRC2 *0.89000).playBufR(0.001, 1.1, 4.1, mul:0.9, out: ~strTek.choose);

				
				},
			
			
		//-------------------------------------------lev4-6/4--36s-----------------------------------------------
			\layer_B_48 -> {//	+tek2

fork{
	~amp = Pseq((0.05..0.55), 28).asStream;
	28.do{
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]*4, inf).asStream;
		~gou02.brt_(~kRC1 *0.89000).playPV2(0.001, 1.1, 5.1, mul:~amp.next, out: ~strTek.choose);
		dur.next.wait;
		
		
	};

	
};

				}, 
			\layer_B_49 -> {//	+dum2

fork{
	~amp = Pseq((0.05..0.55), 28).asStream;
	28.do{
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25], inf).asStream;
		~gou02.brt_(~kRC1 *0.89000).playPV2(0.001, 1.1, 5.1, mul:~amp.next, out: ~strTek.choose);
		dur.next.wait;
		
		
	};

	
};
fork{
	~amp = Pseq((0.05..0.55), 28).asStream;
	28.do{
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]*1.1, inf).asStream;
		~gou02.brt_(~kRC4 *0.89000).playPV2(0.001, 1.1, 5.1, mul:~amp.next, out: ~strTek.choose);
		dur.next.wait;
		
		
	};

	
};


				
				}, 
			\layer_B_50 -> {//	|dum

fork{
	~amp = Pseq((0.1..0.55), 28).asStream;
	~kP = Pseq([~kRC4, ~kRC4, ~kRD1, ~kRC1, ~kRC4, ~kRC7, ~kRB7, ~kRC1].rotate(1), inf).asStream;
	12.do{
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]*3, inf).asStream;
		
		~gou02.brt_(~kP.next *0.89000).playPV2(0.001, 1.1, 5.1, mul:~amp.next, out: ~strTek.choose);
		dur.next.wait;
		
		
	};

	
};

fork{
	~amp = Pseq((0.05..0.55), 28).asStream;
	28.do{
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]*1.1, inf).asStream;
		~gou02.brt_(~kRC4 *0.89000).playPV2(0.001, 1.1, 5.1, mul:~amp.next, out: ~strTek.choose);
		dur.next.wait;
		
		
	};

	
};
				
				}, 
			
			\layer_B_51 -> {//	+ta2
fork{
	~amp = Pseq((0.05..0.55), 28).asStream;
	~dur = Pseq([0.25, 0.5, 0.25, 0.25, 0.25, 0.5, 0.25, 0.25]/2, inf).asStream;
	28.do{
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]*4, inf).asStream;
		~gou02.brt_(~kRC1 *[0.89000, 0.9000, 0.8000, 0.79000].choose).playPV2(0.001, 1.1, 5.1, mul:~amp.next, out: ~strTek.choose);
		~dur.next.wait;
		
		
	};

	
};


				}, 
			\layer_B_52 -> {//	|hek

/*	fork{
		
		~mul01 = Pseq([0.5, 0.4, 0.3, 0.2, 0.1, 0.09, 0.07, 0.04]*0.9, inf).asStream;
		~dur01 = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/2, inf).asStream;
		
		1.do {|i|
			
			
			~dur01.next.wait;
			fork{
				~kP01 = Pseq([~kRC4, ~kRC4, ~kRD1, ~kRC1, ~kRC4, ~kRC7, ~kRB7, ~kRC1].rotate(1)/1.5, inf).asStream;
				3.do{
				var dur = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/5, inf).asStream;
				~gou02.brt_(~kP01 *0.89000).playPV2(0.001, 1.1, 10.1, mul:0.2, out: ~strTek.choose);
				dur.next.wait;
			
				};
				0.09.wait;
				~gou02.brt_(~kP01 *0.89000).playGverb(0.001, 1.1, 10.1, mul:0.5, room:55, rev:3.5, damp:0.91, out: ~strTek.choose);
				
			};
			~dur01.next.wait;
		
		};
	};*/

~gouA1.stop;
~gouA2.stop;

	fork{
		~kik03.brt_(0.5).playGverb(0.001, 1.1, 1, mul: ~mul01.next, room:8.4, rev:1, damp:0.91, out: ~strCok.choose);
		~seq1 = Pseq([Pseq((1..4),1), Pseq((4..6),inf)],inf).asStream;
		~seq2 = Pseq([Pseq((6..8),1), Pseq((8..9),inf)],inf).asStream;
		~seq3 = Pseq([Pseq((9..18),1), Pseq((18..9),inf)],inf).asStream;
		~seq4 = Pseq([Pseq((18..27),1)],14).asStream;
		~op = Pseq((80..100), inf).asStream;
		
		28.do{
			var dur = Pseq([0.25, 0.25, 0.5, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
			var amp = Pseq((0.2..0.95), 28).asStream;
			~gou02.brt_(~kRD1 *0.89000).playBuf(0.001, 1.1, 5.1, mul:amp, out: ~strTek.choose);

			OF.img(
				~imageLib.at('uyan', ~seq1.next), 
				255, ~op.next, [0,0,0,0].choose, 0
			);
			dur.next.wait;
			
			
		};
		~gou01.brt_(~kRD3 *0.89000).playPV2(0.001, 1.1, 5.1, mul: 0.9, out: ~strTek.choose);
		
		0.25.wait;
		14.do{
			var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
			var amp = Pseq((0.2..0.55), 8).asStream;
			~gou02.brt_(~kRD3 *0.89000).playBuf(0.001, 1.1, 5.1, mul:amp, out: ~strTek.choose);
			
			OF.img(
				~imageLib.at('uyan', ~seq2.next), 
				255, ~op.next, [0,0,0,0].choose, 0
			);
			
			dur.next.wait;
			
			
		};
		~gou01.brt_(~kRD2 *0.89000).playPV2(0.001, 1.1, 5.1, mul: 0.9, out: ~strTek.choose);

		0.25.wait;
		14.do{
			var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
			var amp = Pseq((0.4..0.55), 8).asStream;
			~gou02.brt_(~kRD4 *0.89000).playBuf(0.001, 1.1, 5.1, mul:amp, out: ~strTek.choose);
			
			OF.img(
				~imageLib.at('uyan', ~seq3.next), 
				255, ~op.next, [0,0,0,0].choose, 0
			);
			
			dur.next.wait;
			
			
		};
		~gou01.brt_(~kRD5 *0.89000).playPV2(0.001, 1.1, 5.1, mul: 0.9, out: ~strTek.choose);
		~kik03.brt_(1.5).playPV5(0.001, 1.1, 1, mul:0.4, out: ~strTek.choose); // dum
		
		9.do{
			var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
			
			
			
			OF.img(
				~imageLib.at('uyan', ~seq4.next), 
				255, ~op.next, [0,0,0,0].choose, 0
			);
			
			dur.next.wait;
			
			
		};
		
		
	};

				
				}, 
			
		//-------------------------------------------lev5-4/4--24s-----------------------------------------------
			\layer_B_53 -> {//	|te

				
				}, 
			\layer_B_54 -> {//	ke
				
				}, 
			\layer_B_55 -> {//	|te
				
				}, 
			\layer_B_56 -> {//	ke

~tol01.brt_(~kRD4 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.4, room:55, rev:23.5, damp:0.71, out: ~strCok);
~gir04.brt_(~kRB4).playBufR(0.001, 1.1, 10.1, mul:0.9, out: ~strTek.choose);

fork{		
	
	~kik03.brt_(0.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum				
	KafSinVib.ar(0.1, 0.1, 8.0, mul:0.3, freq1: ~kA1, freq2: ~kA1+3, vib1: 2.1, vib2: 4).play;
	0.8.wait;
	fork{
		~mul01 = Pseq([0.5, 0.4, 0.3, 0.2, 0.1, 0.09, 0.07, 0.04]*0.9, inf).asStream;
		~dur01 = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/2, inf).asStream;
		8.do {|i|
			
			~kik03.brt_(1.5).playGverb(0.001, 1.1, 1, mul: ~mul01.next, room:8.4, rev:1, damp:0.91, out: ~strTek.choose);
			~dur01.next.wait;
		
		};
	};
	~gir04.brt_(~kRB4).playBufR(0.001, 1.1, 10.1, mul:1.9, out: ~strHep.choose);
	2.5.wait;
	~kik01.brt_(3.5).playGverb(0.001, 1.1, 1, mul: ~mul01.next, room:8.4, rev:1, damp:0.91, out: ~strCok.choose);


};
				
				},
			
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////-------------------------------------- BEREFSAN --------7 Levels-- 15 parts -- 3.2s -------------------------------------------------/////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//-------------------------------------------lev1-6/4--36s-----------------------------------------------
			\layer_B_57 -> {//	+dum2-3-4
"LayerB BEREFSAN".postln;				
			
~met02.brt_(~kRB1 *1.01000).playGverbR(0.001, 5.1, 2.1, mul:0.9, room:55, rev:3.5, damp:0.71, out:~strCok.choose);
//:--bMask
~bMask.stop;
~bMask={
	~fade = Pseq((0..0).reverse, 256).asStream;
	256.do{
		OF.bMask(255); 
		0.08.wait;
	};
}.fork;				
				
				}, 
			\layer_B_58 -> {//	|tek2

~bMask.stop;
~bMask={
	~fade = Pseq((0..0).reverse, 256).asStream;
	256.do{
		OF.bMask(255); 
		0.08.wait;
	};
}.fork;
				
				}, 
			
		//-------------------------------------------lev2-6/4--36s-----------------------------------------------
			\layer_B_59 -> {//	+dum2-3-4
				
~bMask.stop;
~bMask={
	~fade = Pseq((0..0).reverse, 256).asStream;
	256.do{
		OF.bMask(255); 
		0.08.wait;
	};
}.fork;				
				
				
				}, 
			\layer_B_60 -> {//	|tek2

			
				
				}, 
			
		//-------------------------------------------lev3-4/4--24s-----------------------------------------------
			\layer_B_61 -> {//	+dum2-3-4
				
				}, 
			
		//-------------------------------------------lev4-4/4--24s-----------------------------------------------
			\layer_B_62 -> {//	|dum2
				
				}, 
			\layer_B_63 -> {//	tek2

~met02.brt_(~kRC1 *1.01000).playGverb(0.001, 0.1, 8.1, mul:0.5, room:55, rev:3.5, damp:0.71, out:~strTek.choose);
				
				}, 
		//-------------------------------------------lev5-4/4--24s-----------------------------------------------
			\layer_B_64 -> {//	+dum2
~met02.brt_(~kRC3 *1.01000).playGverb(0.001, 0.1, 8.1, mul:0.8, room:55, rev:13.5, damp:0.71, out:~strTek.choose);
				
				}, 
			\layer_B_65 -> {//	|dum2

fork{		
	
	~kik03.brt_(1.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum				
	~kf = KafSinVib.ar(0.1, 0.1, 8.0, mul:0.3, freq1: ~kA1, freq2: ~kA1+3, vib1: 2.1, vib2: 4, out: ~strTek.choose).play;
	0.8.wait;
	fork{
		~mul01 = Pseq([0.5, 0.4, 0.3, 0.2, 0.1, 0.09, 0.07, 0.04]*0.9, inf).asStream;
		~mul02 = (0.1..0.9);
		~dur01 = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/2, inf).asStream;
		8.do {|i|
			
			~kik03.brt_(9.5).playGverb(0.001, 1.1, 1, mul: ~mul01.next, room:8.4, rev:1, damp:0.91, out: ~strTek.choose);
			~dur01.next.wait;
		
		};

		
	};
	2.5.wait;
	~kik02.brt_(5.5).playGverb(0.001, 1.1, 1, mul: ~mul01.next, room:8.4, rev:1, damp:0.91, out: ~strTek.choose);


};
				
				}, 
		//-------------------------------------------lev6-4/4--24s-----------------------------------------------
			\layer_B_66 -> {//	+ta2

fork{
	5.do{
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
		var amp = Pbrown(0.05, 0.5, 0.2, inf).asStream;
		~tht02.brt_(~kRA1 *1.05000).playBuf(0.01, 15, 1.1, mul:amp, out: ~strTek.choose);
		dur.next.wait;
		
		
	};
	~tht01.brt_(~kRA1 *1.05000).playBuf(0.01, 15, 1.1, mul:0.4, out: ~strTek.choose);
	~met02.brt_(~kRA7 *1.01000).playGverb(0.001, 0.1, 8.1, mul:0.8, room:55, rev:3.5, damp:0.71, out:~strTek.choose);	
};

				}, 
			\layer_B_67 -> {//	|hek

fork{
	5.do{
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
		var amp = Pbrown(0.05, 0.5, 0.2, inf).asStream;
		~tht02.brt_(~kRA1 *1.05000).playBuf(0.01, 15, 1.1, mul:amp, out: ~strTek.choose);
		dur.next.wait;
		
		
	};
	~tht01.brt_(~kRA1 *1.05000).playBuf(0.01, 15, 1.1, mul:0.4, out: ~strTek.choose);
	~met02.brt_(~kRA5 *1.01000).playGverb(0.001, 0.1, 8.1, mul:1.3, room:55, rev:3.5, damp:0.71, out:~strTek.choose);	
};
				
				}, 
			
		//-------------------------------------------lev7-4/4--24s-----------------------------------------------
			\layer_B_68 -> {//	|te

fork{
	5.do{
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
		var amp = Pbrown(0.05, 0.5, 0.2, inf).asStream;
		~tht02.brt_(~kRA1 *1.05000).playBuf(0.01, 15, 1.1, mul:amp, out: ~strTek.choose);
		dur.next.wait;
		
		
	};
	~tht01.brt_(~kRA1 *1.05000).playBuf(0.01, 15, 1.1, mul:0.4, out: ~strTek.choose);
	~met02.brt_(~kRA4 *1.01000).playGverb(0.001, 2.1, 18.1, mul:0.8, room:18.41, rev:13.5, damp:0.51, out:~strTek.choose);	
};
				
				}, 
			\layer_B_69 -> {//	ke
				
				}, 
			\layer_B_70 -> {//	|te
				
				}, 
			\layer_B_71 -> {//	ke
				
				}
		).play;
		

Pdef(\zencirLayerB, Posc(
	\msg, Pseq(
		[
		//cifteDuyek
		\layer_B_1, \layer_B_2, \layer_B_3, 
		\layer_B_4, \layer_B_5, \layer_B_6, \layer_B_7, \layer_B_8,
		//fahte
		\layer_B_9, \layer_B_10,\layer_B_11, 
		\layer_B_12, \layer_B_13, \layer_B_14, 
		\layer_B_15, \layer_B_16, \layer_B_17, 
		\layer_B_18, \layer_B_19, \layer_B_20, \layer_B_21, 
		//cember
		\layer_B_22, \layer_B_23, \layer_B_24, 
		\layer_B_25, \layer_B_26, \layer_B_27, 
		\layer_B_28, \layer_B_29, \layer_B_30,
		\layer_B_31, \layer_B_32, \layer_B_33, 
		\layer_B_34, \layer_B_35, \layer_B_36, \layer_B_37, 
		//devriKebir
		\layer_B_38, \layer_B_39, \layer_B_40, 
		\layer_B_41, \layer_B_42, \layer_B_43, \layer_B_44, \layer_B_45, 
		\layer_B_46, \layer_B_47, 
		\layer_B_48, \layer_B_49, \layer_B_50, \layer_B_51, \layer_B_52, 
		\layer_B_53, \layer_B_54, \layer_B_55, \layer_B_56, 
		//berefsan
		\layer_B_57, \layer_B_58, 
		\layer_B_59, \layer_B_60, 
		\layer_B_61, 
		\layer_B_62, \layer_B_63, \layer_B_64, \layer_B_65, \layer_B_66, \layer_B_67, 
		\layer_B_68, \layer_B_69, \layer_B_70, \layer_B_71
		
		
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
Pdef(\cifteDuyekLayerB, Posc(
	\msg, Pseq(
		[
		//cifteDuyek
		\layer_B_1, \layer_B_2, \layer_B_3, 
		\layer_B_4, \layer_B_5, \layer_B_6, \layer_B_7, \layer_B_8		
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
Pdef(\toFahteLayerB, Posc(
	\msg, Pseq(
		[
		\layer_B_7, \layer_B_8,
		//fahte
		\layer_B_9, \layer_B_10,\layer_B_11, 
		\layer_B_12, \layer_B_13, \layer_B_14, 
		\layer_B_15, \layer_B_16, \layer_B_17, 
		\layer_B_18, \layer_B_19, \layer_B_20, \layer_B_21, 
		//cember
		\layer_B_22, \layer_B_23, \layer_B_24, 
		\layer_B_25, \layer_B_26, \layer_B_27, 
		\layer_B_28, \layer_B_29, \layer_B_30,
		\layer_B_31, \layer_B_32, \layer_B_33, 
		\layer_B_34, \layer_B_35, \layer_B_36, \layer_B_37, 
		//devriKebir
		\layer_B_38, \layer_B_39, \layer_B_40, 
		\layer_B_41, \layer_B_42, \layer_B_43, \layer_B_44, \layer_B_45, 
		\layer_B_46, \layer_B_47, 
		\layer_B_48, \layer_B_49, \layer_B_50, \layer_B_51, \layer_B_52, 
		\layer_B_53, \layer_B_54, \layer_B_55, \layer_B_56, 
		//berefsan
		\layer_B_57, \layer_B_58, 
		\layer_B_59, \layer_B_60, 
		\layer_B_61, 
		\layer_B_62, \layer_B_63, \layer_B_64, \layer_B_65, \layer_B_66, \layer_B_67, 
		\layer_B_68, \layer_B_69, \layer_B_70, \layer_B_71
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
Pdef(\fahteLayerB, Posc(
	\msg, Pseq(
		[

		//fahte
		\layer_B_9, \layer_B_10,\layer_B_11, 
		\layer_B_12, \layer_B_13, \layer_B_14, 
		\layer_B_15, \layer_B_16, \layer_B_17, 
		\layer_B_18, \layer_B_19, \layer_B_20, \layer_B_21
		
		
		], inf
	),
	\dur, Pseq(
		[

		//fahte
		Pseq([2, 1, 1], 1),
		Pseq([2, 2, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1,1], 1)
		
		]*6, 1
	)
	)
);


//------toCember-------//
Pdef(\toCemberLayerB, Posc(
	\msg, Pseq(
		[
		\layer_B_20, \layer_B_21,
		//cember
		\layer_B_22, \layer_B_23, \layer_B_24, 
		\layer_B_25, \layer_B_26, \layer_B_27, 
		\layer_B_28, \layer_B_29, \layer_B_30,
		\layer_B_31, \layer_B_32, \layer_B_33, 
		\layer_B_34, \layer_B_35, \layer_B_36, \layer_B_37, 
		//devriKebir
		\layer_B_38, \layer_B_39, \layer_B_40, 
		\layer_B_41, \layer_B_42, \layer_B_43, \layer_B_44, \layer_B_45, 
		\layer_B_46, \layer_B_47, 
		\layer_B_48, \layer_B_49, \layer_B_50, \layer_B_51, \layer_B_52, 
		\layer_B_53, \layer_B_54, \layer_B_55, \layer_B_56, 
		//berefsan
		\layer_B_57, \layer_B_58, 
		\layer_B_59, \layer_B_60, 
		\layer_B_61, 
		\layer_B_62, \layer_B_63, \layer_B_64, \layer_B_65, \layer_B_66, \layer_B_67, 
		\layer_B_68, \layer_B_69, \layer_B_70, \layer_B_71
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
Pdef(\cemberLayerB, Posc(
	\msg, Pseq(
		[

		//cember
		\layer_B_22, \layer_B_23, \layer_B_24, 
		\layer_B_25, \layer_B_26, \layer_B_27, 
		\layer_B_28, \layer_B_29, \layer_B_30,
		\layer_B_31, \layer_B_32, \layer_B_33, 
		\layer_B_34, \layer_B_35, \layer_B_36, \layer_B_37
		
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
		
		]*6, 1
	)
	)
);

//------toDKebir-------//
Pdef(\toDevriKebirLayerB, Posc(
	\msg, Pseq(
		[
		\layer_B_31, \layer_B_32, \layer_B_33,
		\layer_B_34, \layer_B_35, \layer_B_36, \layer_B_37,
		//devriKebir
		\layer_B_38, \layer_B_39, \layer_B_40, 
		\layer_B_41, \layer_B_42, \layer_B_43, \layer_B_44, \layer_B_45, 
		\layer_B_46, \layer_B_47, 
		\layer_B_48, \layer_B_49, \layer_B_50, \layer_B_51, \layer_B_52, 
		\layer_B_53, \layer_B_54, \layer_B_55, \layer_B_56, 
		//berefsan
		\layer_B_57, \layer_B_58, 
		\layer_B_59, \layer_B_60, 
		\layer_B_61, 
		\layer_B_62, \layer_B_63, \layer_B_64, \layer_B_65, \layer_B_66, \layer_B_67, 
		\layer_B_68, \layer_B_69, \layer_B_70, \layer_B_71
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

//------devriKebirLayerB-------//
Pdef(\devriKebirLayerB, Posc(
	\msg, Pseq(
		[

		//devriKebir
		\layer_B_38, \layer_B_39, \layer_B_40, 
		\layer_B_41, \layer_B_42, \layer_B_43, \layer_B_44, \layer_B_45, 
		\layer_B_46, \layer_B_47, 
		\layer_B_48, \layer_B_49, \layer_B_50, \layer_B_51, \layer_B_52, 
		\layer_B_53, \layer_B_54, \layer_B_55, \layer_B_56
		
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
		Pseq([1, 1, 1, 1], 1)
		
		]*6, 1
	)
	)
);

//------toBerefsan-------//
Pdef(\toBerefsanLayerB, Posc(
	\msg, Pseq(
		[
		\layer_B_55, \layer_B_56, 
		//berefsan
		\layer_B_57, \layer_B_58, 
		\layer_B_59, \layer_B_60, 
		\layer_B_61, 
		\layer_B_62, \layer_B_63, \layer_B_64, \layer_B_65, \layer_B_66, \layer_B_67, 
		\layer_B_68, \layer_B_69, \layer_B_70, \layer_B_71
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
Pdef(\berefsanLayerB, Posc(
	\msg, Pseq(
		[

		//berefsan
		\layer_B_57, \layer_B_58, 
		\layer_B_59, \layer_B_60, 
		\layer_B_61, 
		\layer_B_62, \layer_B_63, \layer_B_64, \layer_B_65, \layer_B_66, \layer_B_67, 
		\layer_B_68, \layer_B_69, \layer_B_70, \layer_B_71
		
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