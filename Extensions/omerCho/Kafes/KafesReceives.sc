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
			\lC4_1 -> { 
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.6, mul:0.3, start:[0.105, 0.132, 0.208, 0.05].choose, out:  ~strTek.choose); 
					},
			\lC4_2 -> { 
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.8, mul:0.35, start:[0.705, 0.632, 0.728, 0.605].choose, out:  ~strTek.choose); 
					},
			\lC4_3 -> { 

				~ats02.brt_(3.0).playBuf(0.01, 0.2, 2.1, mul:0.4, start:[0.3, 0.632, 0.28, 0.605].choose, out:  ~strTek.choose);
					},

			\lC4_1b -> { 
				~ats02.brt_(0.5).playPV1(0.01, 0.4, 0.6, mul:0.63, start:[0.105, 0.132, 0.208, 0.05].choose, out:  ~strTek.choose); 
					},
			\lC4_2b -> { 
				~ats01.brt_(0.5).playBuf(0.01, 1.2, 2.8, mul:0.5, start:[0.705, 0.632, 0.728, 0.605].choose, out:  ~strTek.choose); 
					},
			\lC4_3b -> { 

				~ats06.brt_(1.0).playBuf(0.01, 0.2, 2.1, mul:0.9, start:[0.3, 0.632, 0.28, 0.605].choose, out:  ~strTek.choose);
					},
			
			
			\lC22_1 -> { 
				~ats02.brt_(2.5).playPV1(0.01, 0.4, 0.1, mul:0.6, start:[0.105, 0.132, 0.208, 0.05].choose, out:  ~strTek.choose); 
					},
			\lC22_2 -> { 
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.5, pv5a:[3.3, 2.632, 4.28, 8.605].choose, out: ~strTek.choose);
					},
			\lC22_3 -> { 
				~ats02.brt_(1.5).playBuf(0.01, 0.2, 0.6, mul:0.6, start:[0.73, 0.32, 0.28, 0.57].choose, out:  ~strTek.choose);
					},
			\lC22_4 -> { 
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.32, 0.28, 0.57].choose, out:  ~strTek.choose); // ke
					},
			\lC22_5 -> { 
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.2, mul:0.7, start:0.705, out:  ~strTek.choose); // dum
					},
			\lC22_6 -> { 
				~kik02.brt_([1.3, 2.632, 3.28, 4.605].choose).playPV5(0.001, 1.1, 1, mul:0.5, pv5a:[0.3, 0.632, 0.28, 0.605].choose, out: ~strTek.choose);
					},
			\lC22_7 -> { 
				~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.32, 0.28, 0.57].choose, out: ~strTek.choose); // tek
				~ats03.brt_(~kRB1 *1.02006).playBuf(0.001, 0.004, 0.8, mul:0.5, start: [0.32, 0.35, 0.6, 0.66].choose, out: ~strTek.choose);
					},
			
			\lC31_1a -> { 
				fork{
					OF.img(~imageLib.at('exit', rrand(0,8)), 255, 255, 0, 0);
					
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
					OF.img(~imageLib.at('exit', rrand(0,8)), 255, 255, 0, 0);
					
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
				OF.img(~imageLib.at('exit', rrand(0,8)), 255, 255, 0, 0);
				
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
				OF.img(~imageLib.at('exit', rrand(0,8)), 255, 255, 0, 0);
				
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
				OF.img(~imageLib.at('exit', rrand(0,8)), 255, 255, 0, 0);
				
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
				
				
					},
			\lC31_3 -> { 
				~kik02.brt_(19.5).playPV5(0.001, 1.1, 1, mul:[0.73, 0.8, 0.28, 0.57].choose, out: ~strTek.choose);
					},
					
					
			\lC34_1 -> { 
				~kik02.brt_(2.5).playPV5(0.001, 1.1, 1, mul:0.6, out: ~strTek.choose);
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
				}, 
			\aP24 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				},
			
		//4/4	
			\aP25 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\aP26 -> {//	|dum
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum

				}, 
			\aP27 -> {//	dum
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				},
			
		//6/4
			\aP28 -> {//	+tek2
				~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				
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
				}, 
			\aP32 -> {//	|ta2
				
				}, 
			\aP33 -> {//	hek2
				
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			
		//4/4
			\aP34 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\aP35 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			\aP36 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\aP37 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}
		).play;



		
	}
	

//------------------------------------------------------bt-----------------------------------------------------------//

	*bt {
		
		Preceive(


//CIFTE DUYEK --------------------------------------
		//8/4
			\bt1 -> {//	|dum2
				~bth02.brt_(~kRC1 *1.00011).playBuf(0.001, 0.3, 0.1, mul:0.6, out: ~strCok.choose);

				}, 
			\bt2 -> {//	+tek2-3-4

		~bth04.brt_(~kRB1 *1.05190).playGverb(0.001, 1.1, 0.1, mul:0.4, room:2, rev:1, damp:0.99, out: ~strCok.choose);

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
				~bth02.brt_(~kRC1 *1.00011).playPV5(0.001, 0.1, 0.3, mul:0.8, out: ~strCok.choose);
				
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
				~bth02.brt_(~kRC1 *1.00011).playPV5(0.001, 0.1, 0.3, mul:0.5, out: ~strCok.choose);
				~bth02.brt_(~kRC1 *1.00011).playPV2(0.001, 1.3, 0.3, mul:0.5, out: ~strCok.choose);
				~bth04.brt_(~kRB6 *1.05190).playPV1(0.001, 3.1, 1.2, mul:0.5, out: ~strCok.choose);
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
				~bth02.brt_(~kRC4 *1.00011).playPV2(0.001, 0.1, 0.3, mul:0.5, out: ~strCok.choose);
				~bth02.brt_(~kRC4 *1.00011).playBufR(0.001, 1.3, 0.3, mul:0.5, out: ~strCok.choose);
				}, 
			\bt29 -> {//	|tek2
				~bth06.brt_(~kRC5 *1.10100).playPV4(0.001, 1.1, 1, mul:0.3, out: ~strCok.choose);
				~bth06.brt_(~kRC5 *1.10100).playPV1(0.001, 1.1, 1, mul:0.3, out: ~strCok.choose);
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
				~bth04.brt_(~kRB2 *1.05190).playGverb(0.001, 2.1, 4, mul:0.07, damp:0.99, out: ~strCok.choose); 
				}, 
			\bt37 -> {//	ke
				
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
				}, 
			\kP2 -> {//	+tek2-3-4
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				
				}, 
			\kP3 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				},
		//8/4
			\kP4 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP5 -> {//	|dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP6 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP7 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				}, 
			\kP8 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
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
				}, 
			\kP10 -> {//	|dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);

				}, 
			\kP11 -> {//	|dum
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);

				}, 
			
		//6/4
			\kP12 -> {//	+tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				
				}, 
			\kP13 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP14 -> {//	tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			
		//6/4
			\kP15 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP16 -> {//	|ta2
				
				}, 
			\kP17 -> {//	hek2
				
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				}, 
			
		//4/4
			\kP18 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				}, 
			\kP19 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				}, 
			\kP20 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				}, 
			\kP21 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
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
				};
			}, 
			\kP23 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
			}, 
			\kP24 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				},
			
		//4/4	
			\kP25 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP26 -> {//	|dum
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);

				}, 
			\kP27 -> {//	dum
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				},
			
		//6/4
			\kP28 -> {//	+tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				
				}, 
			\kP29 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP30 -> {//	tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			
		//6/4
			\kP31 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP32 -> {//	|ta2
				
				}, 
			\kP33 -> {//	hek2
				
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				}, 
			
		//4/4
			\kP34 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				}, 
			\kP35 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				}, 
			\kP36 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				}, 
			\kP37 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
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
				}, 
			\kP39 -> {//	|dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);

				}, 
			\kP40 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				},
			
		//4/4
			\kP41 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP42 -> {//	|tek
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP43 -> {//	te'
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				}, 
			\kP44 -> {//	ke'
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				},
			\kP45 -> {//	dum
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			
		//	4/4
			\kP46 -> {//	+tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				
				}, 
			\kP47 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				},
			
			
		// 	6/4
			\kP48 -> {//	+tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP49 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP50 -> {//	|dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);

				}, 
			
			\kP51 -> {//	+ta2
				
				}, 
			\kP52 -> {//	|hek
				
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kP53 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				}, 
			\kP54 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				}, 
			\kP55 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				}, 
			\kP56 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
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
				}, 
			\kP58 -> {//	|tek2
				
				}, 
			
		// 6/4
			\kP59 -> {//	+dum2-3-4
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP60 -> {//	|tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			
		//4/4
			\kP61 -> {//	+dum2-3-4
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			
		//4/4
			\kP62 -> {//	|dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);

				}, 
			\kP63 -> {//	tek2
				~kik02.brt_(9.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
		//4/4
			\kP64 -> {//	+dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				}, 
			\kP65 -> {//	|dum2
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);

				}, 
		//4/4	
			\kP66 -> {//	+ta2

				}, 
			\kP67 -> {//	|hek
				
				~kik02.brt_(3.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose);
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kP68 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				}, 
			\kP69 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				}, 
			\kP70 -> {//	|te
				~kik02.brt_(4.0).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // te
				}, 
			\kP71 -> {//	ke
				~kik02.brt_(11.5).playPV4B(0.001, 1.1, 1, mul:0.7, out: ~strTek.choose); // ke
				}
		).play;		

	
	}

	*kk{
	
		Preceive(


//CIFTE DUYEK --------------------------------------
		//8/4
			\kk1 -> {//	|dum2
				
				~kik02.brt_(2.2).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			\kk2 -> {//	+tek2-3-4
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				
				}, 
			\kk3 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				},
		//8/4
			\kk4 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk5 -> {//	|dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk6 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			\kk7 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk8 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 			
			
//FAHTE --------------------------------------------
		//4/4
			\kk9 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk10 -> {//	|dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			\kk11 -> {//	|dum
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			
		//6/4
			\kk12 -> {//	+tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				
				}, 
			\kk13 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			\kk14 -> {//	tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			
		//6/4
			\kk15 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk16 -> {//	|ta2
				
				}, 
			\kk17 -> {//	hek2
				
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			
		//4/4
			\kk18 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk19 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			\kk20 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk21 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
	
//CEMBER -------------------------------------------
		//4/4
			\kk22 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk23 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk24 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				},
			
		//4/4	
			\kk25 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk26 -> {//	|dum
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			\kk27 -> {//	dum
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.3, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				},
			
		//6/4
			\kk28 -> {//	+tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				
				}, 
			\kk29 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			\kk30 -> {//	tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			
		//6/4
			\kk31 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk32 -> {//	|ta2
				
				}, 
			\kk33 -> {//	hek2
				
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			
		//4/4
			\kk34 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk35 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			\kk36 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk37 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				},

// DEVR-i KEBIR -----------------------------
		//6/4
			\kk38 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk39 -> {//	|dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			\kk40 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				},
			
		//4/4
			\kk41 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk42 -> {//	|tek
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			\kk43 -> {//	te'
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk44 -> {//	ke'
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				},
			\kk45 -> {//	dum
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.3, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			
		//	4/4
			\kk46 -> {//	+tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				
				}, 
			\kk47 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				},
			
			
		// 	6/4
			\kk48 -> {//	+tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			\kk49 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk50 -> {//	|dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			
			\kk51 -> {//	+ta2
				
				}, 
			\kk52 -> {//	|hek
				
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kk53 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk54 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			\kk55 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk56 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				},
			
//BEREFSAN
		// 6/4
			\kk57 -> {//	+dum2-3-4
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk58 -> {//	|tek2
				
				}, 
			
		// 6/4
			\kk59 -> {//	+dum2-3-4
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk60 -> {//	|tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			
		//4/4
			\kk61 -> {//	+dum2-3-4
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			
		//4/4
			\kk62 -> {//	|dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			\kk63 -> {//	tek2
				~kik02.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
		//4/4
			\kk64 -> {//	+dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk65 -> {//	|dum2
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
		//4/4	
			\kk66 -> {//	+ta2

				}, 
			\kk67 -> {//	|hek
				
				~kik02.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kk68 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk69 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			\kk70 -> {//	|te
				~kik02.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk71 -> {//	ke
				~kik02.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}
		).play;
		
	}
	
}




