/*
KafesReceives.kP;
KafesReceives.kk;
*/

KafesReceives {

	*initClass {
		StartUp add: {
			this.lC1;
			this.devriKebir;
			this.aP;
			this.kP;
			this.kk;
			this.bit;

		}
	}	


	*devriKebir {
	
		Preceive(
			\dum01 -> { 
				~bth04.brt_(~kRD1 *1.05190).playPV2(0.001, 0.1, 1, mul:0.5, out: ~strCok.choose);
				~bth04.brt_(~kRB1 *1.05190).playGverb(0.001, 2.1, 4, mul:0.8, damp:0.99, out: ~strCok.choose);
					},
			\dumG -> { 
				~kik02.brt_(2.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
					},
			\dumO -> { 
				~kik02.brt_(2.0).playGverb(0.001, 1.1, 2, mul:0.6, room:8, rev:5, damp:0.95, out: ~strTek.choose);
					}				
		).play;
	}


	*lC1 {
	
		Preceive(
			
			////////////////////////////////////////////////////
			////---------Cifteduyek from C_4 to C_8--------/////
			
			\lC4_A -> { 
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.6, mul:0.3, start:[0.105, 0.132, 0.208, 0.05].choose, out:  ~strTek.choose); 
				//:mirrorMode
				~mirorMod = {
					3.do{
						OF.int("mirrorMode", [1,2,3,4,5].choose);
						0.25.wait;
					}; 
					1.2.wait; 
					OF.int("mirrorMode", 0);
				}.fork;
					},
			\lC4_B -> { 
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.8, mul:0.35, start:[0.705, 0.632, 0.728, 0.605].choose, out:  ~strTek.choose); 
				//:mirrorMode
				~mirorMod = {
					3.do{
						OF.int("mirrorMode", [1,2,3,4,5].choose);
						0.25.wait;
					}; 
					1.2.wait; 
					OF.int("mirrorMode", 0);
				}.fork;	
					
					},
			\lC4_C -> { 

				~ats02.brt_(3.0).playBuf(0.01, 0.2, 2.1, mul:0.4, start:[0.3, 0.632, 0.28, 0.605].choose, out:  ~strTek.choose);
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.8, mul:0.35, start:[0.705, 0.632, 0.728, 0.605].choose, out:  ~strTek.choose); 
				//:mirrorMode
				~mirorMod = {
					3.do{
						OF.int("mirrorMode", [1,2,3,4,5].choose);
						0.25.wait;
					}; 
					1.2.wait; 
					OF.int("mirrorMode", 0);
				}.fork;
					
					},
			////---------------from C_4 to C_8-------------/////
			////////////////////////////////////////////////////

			
			////////////////////////////////////////////////////
			////-------------from C_22 to C_31-------------/////
			
			\lC22_1 -> { 
				~ats02.brt_(2.5).playPV1(0.01, 0.4, 0.1, mul:0.6, start:[0.105, 0.132, 0.208, 0.05].choose, out:  ~strTek.choose);
~visRout.stop;
~visRout = {
	~seq = Pseq((0..11).mirror,inf).asStream;
	~op = Pseq((100..100), inf).asStream;
	5.do{
		
		OF.img(
			~imageLib.at('ceket', ~seq.next), 
			255, ~op.next, [0,0,0,0].choose, 0
		);
		0.1.wait;
		//OF.black(255); 0.1.wait;
		
	};
	OF.img(~imageLib.at('sleep', rrand(0,28)), 255, 127, [90, 180, 270].choose, 0);
}.fork;
					},
			\lC22_2 -> { 
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.5, pv5a:[3.3, 2.632, 4.28, 8.605].choose, out: ~strTek.choose);
~visRout.stop;
~visRout = {
	~seq = Pseq((0..11).mirror,inf).asStream;
	~op = Pseq((100..100), inf).asStream;
	3.do{
		
		OF.img(
			~imageLib.at('ceket', ~seq.next), 
			255, ~op.next, [0,0,0,0].choose, 0
		);
		0.1.wait;
		//OF.black(255); 0.1.wait;
		
	};
	OF.img(~imageLib.at('sleep', rrand(0,28)), 255, 127, [90, 180, 270].choose, 0);
}.fork;
					},
			\lC22_3 -> { 
				~ats02.brt_(1.5).playBuf(0.01, 0.2, 0.6, mul:0.6, start:[0.73, 0.32, 0.28, 0.57].choose, out:  ~strTek.choose);
~visRout.stop;
~visRout = {
	~seq = Pseq((0..11).mirror,inf).asStream;
	~op = Pseq((100..100), inf).asStream;
	OF.img(~imageLib.at('sleep', rrand(0,28)), 255, 127, [90, 180, 270].choose, 0);
	0.01.wait;
	5.do{
		
		OF.img(
			~imageLib.at('ceket', ~seq.next), 
			255, ~op.next, [0,0,0,0].choose, 0
		);
		0.1.wait;
		//OF.black(255); 0.1.wait;
		
	};
	OF.img(~imageLib.at('sleep', rrand(0,28)), 255, 127, [90, 180, 270].choose, 0);
}.fork;
					},
			\lC22_4 -> { 
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.32, 0.28, 0.57].choose, out:  ~strTek.choose); // ke
~visRout.stop;
~visRout = {
	~seq = Pseq((0..11).mirror,inf).asStream;
	~op = Pseq((100..100), inf).asStream;
	5.do{
		
		OF.img(
			~imageLib.at('ceket', ~seq.next), 
			255, ~op.next, [0,0,0,0].choose, 0
		);
		0.1.wait;
		//OF.black(255); 0.1.wait;
		
	};
	OF.img(~imageLib.at('sleep', rrand(0,28)), 255, 127, [90, 180, 270].choose, 0);
}.fork;
					},
			\lC22_5 -> { 
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.2, mul:0.7, start:0.705, out:  ~strTek.choose); // dum
~visRout.stop;
~visRout = {
	~seq = Pseq((0..11).mirror,inf).asStream;
	~op = Pseq((100..100), inf).asStream;
	5.do{
		
		OF.img(
			~imageLib.at('ceket', ~seq.next), 
			255, ~op.next, [0,0,0,0].choose, 0
		);
		0.1.wait;
		//OF.black(255); 0.1.wait;
		
	};
	OF.img(~imageLib.at('sleep', rrand(0,28)), 255, 127, [90, 180, 270].choose, 0);
}.fork;
					},
			\lC22_6 -> { 
				~kik02.brt_([1.3, 2.632, 3.28, 4.605].choose).playPV5(0.001, 1.1, 1, mul:0.5, pv5a:[0.3, 0.632, 0.28, 0.605].choose, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 225, [0, 90, 180, 270].choose, 0 );
					},
			\lC22_7 -> { 
				~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.32, 0.28, 0.57].choose, out: ~strTek.choose); // tek
				~ats03.brt_(~kRB1 *1.02006).playBuf(0.001, 0.004, 0.8, mul:0.5, start: [0.32, 0.35, 0.6, 0.66].choose, out: ~strTek.choose);
~visRout.stop;
~visRout = {
	~seq = Pseq((0..11).mirror,inf).asStream;
	~op = Pseq((100..100), inf).asStream;
	6.do{
		
		OF.img(
			~imageLib.at('ceket', ~seq.next), 
			255, ~op.next, [0,0,0,0].choose, 0
		);
		0.1.wait;
		//OF.black(255); 0.1.wait;
		
	};
	OF.img(~imageLib.at('sleep', rrand(0,28)), 255, 127, [90, 180, 270].choose, 0);
}.fork;
					},
			
			
			////---------------from C_22 to C_31-----------/////
			////////////////////////////////////////////////////		
			
			////////////////////////////////////////////////////
			////-------------from C_31 to C_33-------------/////
			

			\lC31_A -> { 
				fork{
					OF.img(~imageLib.at(['yumruk'], rrand(0,7)), 205, 127, [90, 180, 270].choose, 0);
					fork{
						OF.destructBig;
						0.04.wait;
						OF.destruct;
					};
					
					~bth02.brt_(~kRC1 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
					0.005.wait;
					~kik02.brt_(1.0).playPV2(0.001, 1.1, 2, mul:0.5, out: ~strTek.choose);
					0.005.wait;
					~ff = ~kA1;
					KafGendy.ar(1.1, 0.1, 0.3, 0.8,
						freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
						freqrlp1: ~kA1/2, 
						freqrlp2: ~ff*2,
						mul: 0.4,
						out: ~strTek.choose
					).play;
					0.005.wait;
					~tht08.brt_(~kRB1 *1.10000).playPV4(1, 0.1, 1.1, pv4a:0.92, loop:0, out: ~strTek.choose); //ok
				};
					},
			\lC31_B -> { 
				fork{
					OF.img(~imageLib.at(['yumruk'], rrand(0,7)), 205, 127, [90, 180, 270].choose, 0);
					fork{
						OF.destructBig;
						0.04.wait;
						OF.destruct;
					};
					
					~bth02.brt_(~kRB4 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
					0.005.wait;
					~kik02.brt_(1.0).playPV2(0.001, 1.1, 2, mul:0.5, out: ~strTek.choose);
					0.005.wait;
					~ff = ~kA4;
					KafGendy.ar(1.1, 0.1, 0.3, 0.8,
						freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
						freqrlp1: ~kA1/2, 
						freqrlp2: ~ff*2,
						mul: 0.6,
						out: ~strTek.choose
					).play;
					0.005.wait;
					~tht08.brt_(~kRB2 *1.10000).playPV4(1, 0.1, 1.1, pv4a:1.12, loop:0, out: ~strTek.choose); //ok
				};
					},
			\lC31_C -> { 

				
				fork{
					OF.img(~imageLib.at(['yumruk'], rrand(0,7)), 205, 127, [90, 180, 270].choose, 0);
					fork{
						OF.destructBig;
						0.04.wait;
						OF.destruct;
					};
					~bth02.brt_(~kRB7 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
					0.005.wait;
					~kik02.brt_(1.0).playPV2(0.001, 1.1, 2, mul:0.5, out: ~strTek.choose);
					0.005.wait;
					~ff = ~kA7/2;
					KafGendy.ar(1.1, 0.1, 0.3, 0.8,
						freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
						freqrlp1: ~kA1, 
						freqrlp2: ~ff*2,
						mul: 0.4,
						out: ~strTek.choose
					).play;
					0.005.wait;
					~tht08.brt_(~kRA7 *1.10000).playPV4(1, 0.1, 1.1, pv4a:1.02, loop:0, out: ~strTek.choose); //ok
				};
					},

			\lC31_D -> { 
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 5.1, mul:0.8, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				
				
					},
			\lC31_E -> { 
				~kik02.brt_(19.5).playPV5(0.001, 1.1, 1, mul:[0.73, 0.8, 0.28, 0.57].choose, out: ~strTek.choose);
					},			
			////-------------from C_31 to C_33-------------/////
			////////////////////////////////////////////////////
			
			
			
			
			
			
			
			
			
			
			\lC4_1 -> { 
				~ats02.brt_((0.5..2.5).choose).playPV1(0.01, 0.4, 0.6, mul:0.3, start:[0.105, 0.132, 0.208, 0.05].choose, out:  ~strTek.choose); 
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

					},
			\lC4_2 -> { 
				~ats02.brt_((0.5..2.5).choose).playBuf(0.01, 0.2, 0.8, mul:0.35, start:[0.705, 0.632, 0.728, 0.605].choose, out:  ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 ); 
	
					
					},
			\lC4_3 -> { 

				~ats02.brt_(3.0).playBuf(0.01, 0.2, 2.1, mul:0.4, start:[0.3, 0.632, 0.28, 0.605].choose, out:  ~strTek.choose);
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.8, mul:0.35, start:[0.705, 0.632, 0.728, 0.605].choose, out:  ~strTek.choose); 

					
					},


			\lC4_1b -> { 
				~ats02.brt_(0.5).playPV1(0.01, 0.4, 0.6, mul:0.63, start:[0.105, 0.132, 0.208, 0.05].choose, out:  ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				 
					},
			\lC4_2b -> { 
				~ats01.brt_(0.5).playBuf(0.01, 1.2, 2.8, mul:0.5, start:[0.705, 0.632, 0.728, 0.605].choose, out:  ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 ); 
					},
			\lC4_3b -> { 

				~ats06.brt_(1.0).playBuf(0.01, 0.2, 2.1, mul:0.9, start:[0.3, 0.632, 0.28, 0.605].choose, out:  ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
					},
			
			
			


			
			\lC31_1a -> { 
				fork{
					OF.img(~imageLib.at('exit', rrand(0,28)), 255, 255, 0, 0);
					
					~bth02.brt_(~kRC1 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
					0.005.wait;
					~kik02.brt_(1.0).playPV2(0.001, 1.1, 2, mul:0.5, out: ~strTek.choose);
					0.005.wait;
					~ff = ~kA1;
					KafGendy.ar(1.1, 0.1, 0.3, 0.8,
						freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
						freqrlp1: ~kA1/2, 
						freqrlp2: ~ff*2,
						mul: 0.4,
						out: ~strTek.choose
					).play;
					0.005.wait;
					~tht08.brt_(~kRB1 *1.10000).playPV4(1, 0.1, 1.1, pv4a:0.92, loop:0, out: ~strTek.choose); //ok
				};
					},
			\lC31_1b -> { 
				fork{
					OF.img(~imageLib.at('exit', rrand(0,39)), 255, 255, 0, 0);
					
					~bth02.brt_(~kRB4 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
					0.005.wait;
					~kik02.brt_(1.0).playPV2(0.001, 1.1, 2, mul:0.5, out: ~strTek.choose);
					0.005.wait;
					~ff = ~kA4;
					KafGendy.ar(1.1, 0.1, 0.3, 0.8,
						freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
						freqrlp1: ~kA1/2, 
						freqrlp2: ~ff*2,
						mul: 0.6,
						out: ~strTek.choose
					).play;
					0.005.wait;
					~tht08.brt_(~kRB2 *1.10000).playPV4(1, 0.1, 1.1, pv4a:1.12, loop:0, out: ~strTek.choose); //ok
				};
					},
			\lC31_1c -> { 
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, 0, 0);
				
				fork{
					~bth02.brt_(~kRB7 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
					0.005.wait;
					~kik02.brt_(1.0).playPV2(0.001, 1.1, 2, mul:0.5, out: ~strTek.choose);
					0.005.wait;
					~ff = ~kA7/2;
					KafGendy.ar(1.1, 0.1, 0.3, 0.8,
						freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
						freqrlp1: ~kA1, 
						freqrlp2: ~ff*2,
						mul: 0.4,
						out: ~strTek.choose
					).play;
					0.005.wait;
					~tht08.brt_(~kRA7 *1.10000).playPV4(1, 0.1, 1.1, pv4a:1.02, loop:0, out: ~strTek.choose); //ok
				};
					},
			\lC31_1d -> { 
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, 0, 0);
				
				fork{
					~bth02.brt_(~kRC2 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
					0.005.wait;
					~kik02.brt_(1.0).playPV2(0.001, 1.1, 2, mul:0.5, out: ~strTek.choose);
					0.005.wait;
					~ff = ~kA2;
					KafGendy.ar(1.1, 0.1, 0.3, 0.8,
						freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
						freqrlp1: ~kA1/2, 
						freqrlp2: ~ff*2,
						mul: 0.4,
						out: ~strTek.choose
					).play;
					0.005.wait;
					~tht08.brt_(~kRB2 *1.10000).playPV4(1, 0.1, 1.1, pv4a:0.42, loop:0, out: ~strTek.choose); //ok
				};
					},
			\lC31_1d2 -> { 
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, 0, 0);
				
				fork{
					~bth02.brt_(~kRC2 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
					0.005.wait;
					~kik02.brt_(1.0).playPV2(0.001, 1.1, 2, mul:0.5, out: ~strTek.choose);
					0.005.wait;
					~ff = ~kA2;
					KafGendy.ar(1.1, 0.1, 0.3, 0.8,
						freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
						freqrlp1: ~kA1/2, 
						freqrlp2: ~ff*2,
						mul: 0.4,
						out: 0
					).play;
					0.005.wait;
					~tht08.brt_(~kRB2 *1.10000).playPV4(1, 0.1, 1.1, pv4a:0.42, loop:0, out: ~strTek.choose); //ok
				};
					},



			\lC31_2 -> { 
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 5.1, mul:0.8, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				
				
					},
			\lC31_3 -> { 
				~kik02.brt_(19.5).playPV5(0.001, 1.1, 1, mul:[0.73, 0.8, 0.28, 0.57].choose, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
					},
					
					
			\lC34_1 -> { 
				~kik02.brt_(2.5).playPV5(0.001, 1.1, 1, mul:0.6, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
					}
					
				
		).play;
	}

	
	*bit {
	
		Preceive(
			\bitA1 -> { 
				~tht08.brt_(~kRA1 *1.10000).playPV4(1, 2.1, 3.1, mul:0.9, pv4a: 4.2, start:0, out: [~strTek.choose, ~strCok.choose].choose); 
					},
			\bitA5 -> { 
				~tht08.brt_(~kRC1 *1.10000).playPV4(1, 2.1, 3.1, mul:0.9, pv4a: 4.2, start:0, out: [~strTek.choose, ~strCok.choose].choose); 
					},
			\bitB1 -> { 
				~tht08.brt_(~kRB1 *1.10000).playPV4(0.1, 4.1, 1.1, mul:0.9, pv4a: 4.2, start:0, out: [~strTek.choose, ~strCok.choose].choose); 
					},
			\bitB2 -> { 
				~tht08.brt_(~kRB2 *1.10000).playPV4(1, 4.1, 1.1, mul:0.9, pv4a: 4.2, start:0, out: [~strTek.choose, ~strCok.choose].choose); 
					},
			\bitB3 -> { 
				~tht08.brt_(~kRB3 *1.10000).playPV4(0.5, 4.1, 1.1, mul:0.9, pv4a: 4.2, start:0, out: [~strTek.choose, ~strCok.choose].choose); 
					},
			\bitB4 -> { 
				~tht08.brt_(~kRB4 *1.10000).playPV4(0.5, 4.1, 1.1, mul:0.9, pv4a: 4.2, start:0, out: [~strTek.choose, ~strCok.choose].choose); 
					}
		).play;
	}


	
	
	*aP {
	
		Preceive(


			\aP23 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				//OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\aP24 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				//OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			
		//4/4	
			\aP25 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				//OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\aP26 -> {//	|dum
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum

				}, 
			\aP27 -> {//	dum
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				//OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			
		//6/4
			\aP28 -> {//	+tek2
				~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				//OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				
				
				}, 
			\aP29 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				}, 
			\aP30 -> {//	tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				}, 
			
		//6/4
			\aP31 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				//OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\aP32 -> {//	|ta2
				
				}, 
			\aP33 -> {//	hek2
				
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				//OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//4/4
			\aP34 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				//OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\aP35 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				//OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\aP36 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				//OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\aP37 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				//OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}
		).play;



		
	}
	

//------------------------------------------------------bt-----------------------------------------------------------//

	*bt {
		
		Preceive(


//CIFTE DUYEK --------------------------------------
		//8/4
			\bt1 -> {//	|dum2
				~bth02.brt_([~kRC4, ~kRC3, ~kRC2, ~kRC1].choose *1.00011).playBuf(0.001, 0.3, 0.1, mul:0.6, out: ~strCok.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			\bt2 -> {//	+tek2-3-4

		~bth04.brt_([~kRB4, ~kRB3, ~kRB2, ~kRB1].choose *1.05190).playGverb(0.001, 1.1, 0.1, mul:0.4, room:2, rev:1, damp:0.99, out: ~strCok.choose);
		OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			\bt3 -> {//	|tek2
				~bth01.brt_(~kRD1 *0.99100).playPV5(0.001, 0.4, 0.1, mul:0.5, out: ~strCok.choose);
		~bth04.brt_(~kRB1 *1.05190).playGverb(0.001, 2.1, 4, mul:0.2, damp:0.89, out: ~strCok.choose);
				},
		//8/4
			\bt4 -> {//	+dum2
				~bth02.brt_(~kRC1 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
				~bth02.brt_(~kRC1 *1.00011).playBufR(0.001, 0.7, 1.4, mul:0.8, out: ~strCok.choose);
				}, 
			\bt5 -> {//	|dum2
				~bth02.brt_(~kRC1 *1.00011).playPV2(0.001, 0.1, 0.3, mul:0.6, out: ~strCok.choose);
				~bth02.brt_(~kRC3 *1.00011).playBufR(0.001, 1.3, 0.3, mul:1.5, out: ~strCok.choose);
				}, 
			\bt6 -> {//	|tek2
				~bth04.brt_(~kRD1 *1.05190).playPV2(0.001, 0.1, 1, mul:0.5, out: ~strCok.choose);
				~bth04.brt_(~kRB1 *1.05190).playGverb(0.001, 2.1, 4, mul:0.8, damp:0.99, out: ~strCok.choose);
				
				}, 
			\bt7 -> {//	|te
				~bth02.brt_(~kRB6 *1.00011).playPV5(0.001, 0.3, 0.3, mul:0.4, out: ~strCok.choose);
				}, 
			\bt8 -> {//	ke
				~bth04.brt_(~kRD1 *1.05190).playPV1(0.001, 0.1, 1.2, mul:0.2, out: ~strCok.choose);
				}, 			
			
//FAHTE --------------------------------------------
		//4/4
			\bt9 -> {//	+dum2
				~bth02.brt_([~kRB4, ~kRB3, ~kRB2, ~kRB1].choose *1.00011/2).playPV5(0.001, 0.1, 0.3, mul:0.8, out: ~strCok.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				
				}, 
			\bt10 -> {//	|dum
				~bth02.brt_(~kRB7 *1.00011).playPV5(0.001, 0.3, 0.3, mul:0.4, out: ~strCok.choose);
				~bth02.brt_(~kRB7 *1.00011).playPV1(0.001, 0.3, 0.3, mul:0.4, out: ~strCok.choose);
				}, 
			\bt11 -> {//	|dum
				~bth02.brt_(~kRB5 *1.00011).playBuf(0.001, 0.3, 0.3, mul:0.4, out: ~strCok.choose);
				}, 
			
		//6/4
			\bt12 -> {//	+tek2
				~bth06.brt_(~kRA4 *1.10100).playGverb(0.001, 0.5, 4.01, mul:0.8, room:18, rev:3.5, damp:0.81, out: ~strCok.choose);
				}, 
			\bt13 -> {//	|tek2
				~bth06.brt_(~kRD4 *1.10100).playGverb(0.001, 0.5, 4.01, mul:0.5, room:18, rev:3.5, damp:0.81, out: ~strCok.choose);
				}, 
			\bt14 -> {//	tek2
				~bth06.brt_(~kRC4 *1.10100).playGverb(0.001, 0.5, 4.01, mul:0.2, room:18, rev:3.5, damp:0.81, out: ~strCok.choose);
				}, 
			
		//6/4
			\bt15 -> {//	+dum2
	~bth04.brt_(~kRA2 *1.05190).playGverb(0.001, 2.1, 6.1, mul:0.7, room:55, rev:13.5, damp:0.81, out: ~strCok.choose);
				}, 
			\bt16 -> {//	|ta2
				~bth04.brt_(~kRC4 *1.05190).playPV1(0.001, 3.1, 1.2, mul:0.5, out: ~strCok.choose);
				}, 
			\bt17 -> {//	hek2
				~bth02.brt_([~kRB4, ~kRB3, ~kRB2, ~kRB1].choose *1.00011).playPV5(0.001, 0.1, 0.3, mul:0.5, out: ~strCok.choose);
				~bth02.brt_(~kRC1 *1.00011).playPV2(0.001, 1.3, 0.3, mul:0.5, out: ~strCok.choose);
				~bth04.brt_([~kRB4, ~kRB3, ~kRB2, ~kRB1].choose *1.05190).playPV1(0.001, 3.1, 1.2, mul:0.5, out: ~strCok.choose);
				}, 
			
		//4/4
			\bt18 -> {//	|te
				~bth06.brt_(~kRD7 *1.10100).playPV1(0.001, 1.1, 1, mul:0.6, out: ~strCok.choose);
				}, 
			\bt19 -> {//	ke
				~bth04.brt_(~kRC5 *1.05190).playPV2(0.001, 0.1, 1, mul:0.2, out: ~strCok.choose);
				}, 
			\bt20 -> {//	|te
				~bth04.brt_(~kRB2 *1.05190).playGverb(0.001, 2.1, 4, mul:0.7, damp:0.99, out: ~strCok.choose); 
				}, 
			\bt21 -> {//	ke
				~bth05.brt_(~kRC3 *1.12993).playPV1(0.001, 1.1, 1, mul:0.4, out: ~strCok.choose);
				}, 
	
//CEMBER -------------------------------------------
		//4/4
			\bt22 -> {//	+dum2
				~bth02.brt_(~kRC3 *1.00011).playBuf(0.001, 0.3, 0.3, mul:0.5, out: ~strCok.choose);
				~bth05.brt_(~kRC3 *1.12993).playPV5(0.001, 1.1, 1, mul:0.4, out: ~strCok.choose);
				~bth04.brt_(~kRB3 *1.05190).playPV1(0.001, 0.1, 1, mul:0.2, out: ~strCok.choose);
				}, 
			\bt23 -> {//	|te
				~bth01.brt_(~kRC4 *0.99100).playBuf(0.001, 0.4, 0.1, mul:0.5, out: ~strCok.choose);
				~bth04.brt_(~kRB4 *1.05190).playBuf(0.001, 0.1, 1, mul:0.2, out: ~strCok.choose);
				}, 
			\bt24 -> {//	ke
				~bth01.brt_(~kRC4 *0.99100).playBuf(0.001, 0.4, 0.1, mul:0.5, out: ~strCok.choose);
				~bth04.brt_(~kRC4 *1.05190).playPV1(0.001, 0.1, 1, mul:0.2, out: ~strCok.choose);
				~bth04.brt_(~kRB4 *1.05190).playBuf(0.001, 0.1, 1, mul:0.2, out: ~strCok.choose);
				},
			
		//4/4	
			\bt25 -> {//	+dum2
				~bth02.brt_(~kRC4 *1.00011).playPV3(0.001, 0.3, 0.3, mul:0.2, out: ~strCok.choose);
				~bth04.brt_([~kRB4, ~kRB5, ~kRB6].choose *1.05190).playBuf(0.001, 0.1, 1, mul:0.2, out: ~strCok.choose);
				}, 
			\bt26 -> {//	|dum
	~bth04.brt_(~kRB3 *1.05190).playGverb(0.001, 1.1, 6.1, mul:0.4, room:200, rev:1, damp:0.66, out: ~strCok.choose);
				}, 
			\bt27 -> {//	_dum
	~bth04.brt_(~kRB2 *1.05190).playGverb(0.001, 1.1, 6.1, mul:0.4, room:200, rev:1, damp:0.66, out: ~strCok.choose);			
				},
			
		//6/4
			\bt28 -> {//	+tek2
				~bth02.brt_([~kRB4, ~kRB3, ~kRB2, ~kRB1].choose *1.00011).playPV2(0.001, 0.1, 0.3, mul:0.5, out: ~strCok.choose);
				~bth02.brt_(~kRC4 *1.00011).playBufR(0.001, 1.3, 1.3, mul:0.5, out: ~strCok.choose);
				}, 
			\bt29 -> {//	|tek2
				~bth06.brt_(~kRC5 *1.10100).playPV4(0.001, 1.1, 1, mul:0.3, out: ~strCok.choose);
				~bth06.brt_(~kRC5 *1.10100).playPV1(0.001, 1.1, 1, mul:0.3, out: ~strCok.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				
				}, 
			\bt30 -> {//	tek2
				~bth04.brt_(~kRC4 *1.05190).playPV5(0.001, 0.1, 1, mul:0.2, out: ~strCok.choose);
				}, 
			
		//6/4
			\bt31 -> {//	+dum2
				~bth04.brt_(~kRB4 *1.05190).playGverb(0.001, 2.1, 4, mul:0.2, damp:0.99, out: ~strCok.choose);
				}, 
			\bt32 -> {//	|ta2
				~bth04.brt_(~kRC4 *1.05190).playPV2(0.001, 0.1, 1.2, mul:0.1, out: ~strCok.choose);
				~bth04.brt_(~kRC4 *1.05190).playPV1(0.001, 0.1, 1.2, mul:0.1, out: ~strCok.choose);
				}, 
			\bt33 -> {//	hek2
				~bth02.brt_(~kRC4 *1.00011).playPV5(0.001, 0.1, 0.3, mul:0.5, out: ~strCok.choose);
				~bth02.brt_(~kRC4 *1.00011).playGverb(0.001, 1.3, 5.3, mul:0.5, out: ~strCok.choose);
				}, 
			
		//4/4
			\bt34 -> {//	|te
				~bth06.brt_(~kRC7 *1.10100).playPV3(0.001, 1.1, 1, mul:0.3, out: ~strCok.choose);
				}, 
			\bt35 -> {//	ke
				~bth04.brt_(~kRC5 *1.05190).playPV2(0.001, 0.1, 1, mul:0.2, out: ~strCok.choose);
				}, 
			\bt36 -> {//	|te
				~bth04.brt_(~kRB2 *1.05190).playGverb(0.001, 2.1, 4, mul:0.7, damp:0.99, out: ~strCok.choose); 
				}, 
			\bt37 -> {//	ke
				~bth04.brt_([~kRB4, ~kRB3, ~kRB2, ~kRB1].choose *1.05190).playGverb(0.001, 2.1, 4, mul:0.7, damp:0.99, out: ~strCok.choose); 
				
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				
				}
		).play;
	
	
	
	}



	
	//------------------------------------------------------kP-----------------------------------------------------------//

	*kP {
		
Preceive(


//CIFTE DUYEK --------------------------------------
		//8/4
			\kP1 -> {//	|dum2
				~bth02.brt_(~kRC1 *1.00011).playPV4B(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
				~kik02.brt_(2.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				
				~ff = ~kA4;
				KafGendy.ar(1.1, 0.1, 1.3, 0.8,
					freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
					freqrlp1: ~kA1/2, 
					freqrlp2: ~ff*2,
					mul: 0.4,
					out: ~strTek.choose
				).play;
				~tht08.brt_(~kRA4 *1.10000).playPV4B(1, 0.1, 2.1, pv4a:[1.2, 2.3, 3.8].choose, loop:0, out: ~strTek.choose); //ok
				OF.img(~imageLib.at('exit', ~exit01.next), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP2 -> {//	+tek2-3-4
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', ~exit01.next), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP3 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
		//8/4
			\kP4 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP5 -> {//	|dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP6 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP7 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP8 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 			
			
//FAHTE --------------------------------------------
		//4/4
			\kP9 -> {//	+dum2
				~bth02.brt_(~kRB4 *1.00011).playPV4B(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
				~kik02.brt_(1.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				
				~ff = ~kA7/2;
				KafGendy.ar(1.1, 0.1, 0.3, 6.8,
					freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
					freqrlp1: ~kA1/2, 
					freqrlp2: ~ff*2,
					mul: 0.4,
					out: ~strTek.choose
				).play;
				~tht08.brt_(~kRB1 *1.10000).playPV4B(1, 1.1, 5.1, pv4a:1.0, loop:0, out: ~strTek.choose); //ok
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP10 -> {//	|dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			\kP11 -> {//	|dum
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			
		//6/4
			\kP12 -> {//	+tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				
				}, 
			\kP13 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP14 -> {//	tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//6/4
			\kP15 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP16 -> {//	|ta2
				
				}, 
			\kP17 -> {//	hek2
				
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//4/4
			\kP18 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP19 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP20 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP21 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
	
//CEMBER -------------------------------------------
		//4/4
			\kP22 -> {//	+dum2
			
				fork{
					~bth02.brt_(~kRC1 *1.00011).playPV4B(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
					0.005.wait;
					~kik02.brt_(1.0).playPV2(0.001, 1.1, 2, mul:0.5, out: ~strTek.choose);
					0.005.wait;
					~ff = ~kA1;
					KafGendy.ar(1.1, 0.1, 0.3, 0.8,
						freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
						freqrlp1: ~kA1/2, 
						freqrlp2: ~ff*2,
						mul: 0.4,
						out: ~strTek.choose
					).play;
					0.005.wait;
					~tht08.brt_(~kRB1 *1.10000).playPV4B(1, 0.1, 1.1, pv4a:0.02, loop:0, out: ~strTek.choose); //ok
					OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				};
			}, 
			\kP23 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
			}, 
			\kP24 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			
		//4/4	
			\kP25 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP26 -> {//	|dum
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			\kP27 -> {//	dum
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			
		//6/4
			\kP28 -> {//	+tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				
				}, 
			\kP29 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP30 -> {//	tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//6/4
			\kP31 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP32 -> {//	|ta2
				
				}, 
			\kP33 -> {//	hek2
				
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				}, 
			
		//4/4
			\kP34 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP35 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP36 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP37 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},

// DEVR-i KEBIR -----------------------------
		//6/4
			\kP38 -> {//	+dum2
				~bth02.brt_(~kRC1 *1.00011).playPV4B(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				
				~ff = ~kA1;
				KafGendy.ar(1.1, 0.1, 4.3, 6.8,
					freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
					freqrlp1: ~kA1/2, 
					freqrlp2: ~ff*2,
					mul: 0.4,
					out: ~strTek.choose
				).play;
				~tht08.brt_(~kRB1 *1.10000).playPV4B(1, 4.1, 5.1, pv4a:1.2, loop:0, out: ~strTek.choose); //ok
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP39 -> {//	|dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			\kP40 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			
		//4/4
			\kP41 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP42 -> {//	|tek
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP43 -> {//	te'
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP44 -> {//	ke'
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			\kP45 -> {//	dum
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//	4/4
			\kP46 -> {//	+tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				
				}, 
			\kP47 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			
			
		// 	6/4
			\kP48 -> {//	+tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP49 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP50 -> {//	|dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			
			\kP51 -> {//	+ta2
				
				}, 
			\kP52 -> {//	|hek
				
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kP53 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP54 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP55 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP56 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			
//BEREFSAN
		// 6/4
			\kP57 -> {//	+dum2-3-4
				~bth02.brt_(~kRC1 *1.00011).playPV4B(0.001, 0.1, 0.5, mul:0.8, out: ~strCok.choose);
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				
				~ff = ~kA4;
				KafGendy.ar(1.1, 0.1, 4.3, 6.8,
					freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
					freqrlp1: ~kA1/2, 
					freqrlp2: ~ff*2,
					mul: 0.4,
					out: ~strTek.choose
				).play;
				~tht08.brt_(~kRB4 *1.10000).playPV4B(1, 4.1, 5.1, pv4a:1.2, loop:0, out: ~strTek.choose); //ok
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP58 -> {//	|tek2
				
				}, 
			
		// 6/4
			\kP59 -> {//	+dum2-3-4
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP60 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//4/4
			\kP61 -> {//	+dum2-3-4
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//4/4
			\kP62 -> {//	|dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			\kP63 -> {//	tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
		//4/4
			\kP64 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP65 -> {//	|dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
		//4/4	
			\kP66 -> {//	+ta2

				}, 
			\kP67 -> {//	|hek
				
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kP68 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP69 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP70 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kP71 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}
		).play;		

	
	}

	*kk{
	
		Preceive(


//CIFTE DUYEK --------------------------------------
		//8/4
			\kk1 -> {//	|dum2
				
				~kik02.brt_(2.2).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			\kk2 -> {//	+tek2-3-4
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				
				}, 
			\kk3 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
		//8/4
			\kk4 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk5 -> {//	|dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk6 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk7 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk8 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 			
			
//FAHTE --------------------------------------------
		//4/4
			\kk9 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk10 -> {//	|dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			\kk11 -> {//	|dum
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			
		//6/4
			\kk12 -> {//	+tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				
				}, 
			\kk13 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk14 -> {//	tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//6/4
			\kk15 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk16 -> {//	|ta2
				
				}, 
			\kk17 -> {//	hek2
				
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//4/4
			\kk18 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk19 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk20 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk21 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
	
//CEMBER -------------------------------------------
		//4/4
			\kk22 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk23 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk24 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			
		//4/4	
			\kk25 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk26 -> {//	|dum
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk27 -> {//	dum
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.3, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			
		//6/4
			\kk28 -> {//	+tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				
				}, 
			\kk29 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk30 -> {//	tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//6/4
			\kk31 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk32 -> {//	|ta2
				
				}, 
			\kk33 -> {//	hek2
				
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//4/4
			\kk34 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk35 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk36 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk37 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},

// DEVR-i KEBIR -----------------------------
		//6/4
			\kk38 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk39 -> {//	|dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			\kk40 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			
		//4/4
			\kk41 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk42 -> {//	|tek
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk43 -> {//	te'
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk44 -> {//	ke'
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			\kk45 -> {//	dum
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.3, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//	4/4
			\kk46 -> {//	+tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				
				}, 
			\kk47 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			
			
		// 	6/4
			\kk48 -> {//	+tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk49 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk50 -> {//	|dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			
			\kk51 -> {//	+ta2
				
				}, 
			\kk52 -> {//	|hek
				
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kk53 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk54 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk55 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk56 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				},
			
//BEREFSAN
		// 6/4
			\kk57 -> {//	+dum2-3-4
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk58 -> {//	|tek2
				
				}, 
			
		// 6/4
			\kk59 -> {//	+dum2-3-4
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk60 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//4/4
			\kk61 -> {//	+dum2-3-4
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			
		//4/4
			\kk62 -> {//	|dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
			\kk63 -> {//	tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
		//4/4
			\kk64 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk65 -> {//	|dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );

				}, 
		//4/4	
			\kk66 -> {//	+ta2

				}, 
			\kk67 -> {//	|hek
				
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kk68 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk69 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk70 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}, 
			\kk71 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				OF.img(~imageLib.at('exit', rrand(0,48)), 255, 255, [0, 90, 180, 270].choose, 0 );
				}
		).play;
		
	}
	
}




