

KafesReceives {

	*initClass {
		StartUp add: {
			this.aP;
			this.aT;
			this.kPV1;
			this.kP;
			this.kk;
			this.bit;

		}
	}	
	
	*bit {
	
		Preceive(
			\bitA1 -> { 
				~tht08.brt_(~kRA1 *1.10000).playPV4(1, 2.1, 3.1, mul:0.9, pv4a: 4.2, start:0, out: [~strTek.choose, ~strCok.choose].choose); 
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

/*

fork{
	~pvPs = Pseq([2.25, 0.25, 4.25, 0.25, 6.25, 0.25, 8.25, 0.25]*2, inf).asStream;
	~kRPs = Pseq([~kRB3, ~kRB2, ~kRB1, ~kRB2, ~kRB3, ~kRB1, ~kRB2, ~kRB1], inf).asStream;
	~dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]*2, inf).asStream;
	~amp = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/1.5, inf).asStream;
	7.do {
		~tht08.brt_(~kRPs*1.10000).playPV4(1, 1.1, 2.1, mul:~amp, pv4a:~pvPs, start:0, out: [~strTek.choose, ~strCok.choose].choose); 
		~dur.next.wait;
	};
	0.5.wait;
	~tht08.brt_(~kRPs*1.10000).playPV4(1, 1.1, 9.1, mul:~amp, pv4a:~pvPs, start:0, out: [~strTek.choose, ~strCok.choose].choose); 
};

fork{
	~pvPs = Pseq([2.25, 0.25, 4.25, 0.25, 6.25, 0.25, 8.25, 0.25].scramble*2, inf).asStream;
	~kRPs = Pseq([~kRB3, ~kRB2, ~kRB1, ~kRB2, ~kRB3, ~kRB4, ~kRB4, ~kRB5].reverse, inf).asStream;
	~dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]*2, inf).asStream;
	~amp = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/1.5, inf).asStream;
	7.do {
		~tht08.brt_(~kRPs*1.10000).playPV4(1, 1.1, 2.1, mul:~amp, pv4a:~pvPs, start:0, out: [~strTek.choose, ~strCok.choose].choose); 
		~dur.next.wait;
	};
	0.5.wait;
	~tht08.brt_(~kRPs*1.10000).playPV4(1, 1.1, 9.1, mul:~amp, pv4a:~pvPs, start:0, out: [~strTek.choose, ~strCok.choose].choose); 
};

fork{
	~pvPs = Pseq([2.25, 0.25, 4.25, 0.25, 6.25, 0.25, 8.25, 0.25].scramble*2, inf).asStream;
	~kRPs = Pseq([~kRB3, ~kRB2, ~kRB1, ~kRB2, ~kRB3, ~kRB4, ~kRB4, ~kRB5].reverse, inf).asStream;
	~dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]*2, inf).asStream;
	~amp = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/1.5, inf).asStream;
	7.do {
		~tht08.brt_(~kRPs*1.10000).playPV4(1, 1.1, 2.1, pv4a: 4.2, start:0, out: [~strTek.choose, ~strCok.choose].choose); 
		~dur.next.wait;
	};
	0.5.wait;
	~tht08.brt_(~kRPs*1.10000).playPV4(1, 3.1, 9.1, mul:~amp, pv4a:~pvPs, start:0, out: [~strTek.choose, ~strCok.choose].choose); 
};

*/

	
	
	*aP {
	
		Preceive(


//CIFTE DUYEK --------------------------------------
		//8/4
			\aP1 -> {//	|dum2
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum

				}, 
			\aP2 -> {//	+tek2-3-4
				~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				
				}, 
			\aP3 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				},
		//8/4
			\aP4 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\aP5 -> {//	|dum2
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum
				}, 
			\aP6 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				}, 
			\aP7 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\aP8 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 			
			
//FAHTE --------------------------------------------
		//4/4
			\aP9 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\aP10 -> {//	|dum2
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum

				}, 
			\aP11 -> {//	|dum
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum

				}, 
			
		//6/4
			\aP12 -> {//	+tek2
				~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				
				}, 
			\aP13 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				}, 
			\aP14 -> {//	tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				}, 
			
		//6/4
			\aP15 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\aP16 -> {//	|ta2
				
				}, 
			\aP17 -> {//	hek2
				
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			
		//4/4
			\aP18 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\aP19 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			\aP20 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\aP21 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
	
//CEMBER -------------------------------------------
		//4/4
			\aP22 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
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
				},

// DEVR-i KEBIR -----------------------------
		//6/4
			\aP38 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\aP39 -> {//	|dum2
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum

				}, 
			\aP40 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				},
			
		//4/4
			\aP41 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\aP42 -> {//	|tek
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				}, 
			\aP43 -> {//	te'
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\aP44 -> {//	ke'
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				},
			\aP45 -> {//	dum
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			
		//	4/4
			\aP46 -> {//	+tek2
				~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				
				}, 
			\aP47 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				},
			
			
		// 	6/4
			\aP48 -> {//	+tek2
				~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				}, 
			\aP49 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\aP50 -> {//	|dum2
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum

				}, 
			
			\aP51 -> {//	+ta2
				
				}, 
			\aP52 -> {//	|hek
				
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\aP53 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\aP54 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			\aP55 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\aP56 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				},
			
//BEREFSAN
		// 6/4
			\aP57 -> {//	+dum2-3-4
				~ats02.brt_(3.5).playPV1(0.01, 1.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\aP58 -> {//	|tek2
				
				}, 
			
		// 6/4
			\aP59 -> {//	+dum2-3-4
				~ats02.brt_(3.5).playPV1(0.01, 1.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\aP60 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				}, 
			
		//4/4
			\aP61 -> {//	+dum2-3-4
				~ats02.brt_(3.5).playPV1(0.01, 1.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			
		//4/4
			\aP62 -> {//	|dum2
				~ats02.brt_(3.5).playPV1(0.01, 1.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum

				}, 
			\aP63 -> {//	tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				}, 
		//4/4
			\aP64 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 1.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\aP65 -> {//	|dum2
				~ats02.brt_(3.5).playPV1(0.01, 1.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum

				}, 
		//4/4	
			\aP66 -> {//	+ta2
				
				~ats03.brt_(~kRD1 *1.82101).playPV3(0.01, 1.0, 0.1, mul:0.5, pv3a:6.0, start:[0.73, 0.1, 0.28, 0.57, 0.9].choose, out:[0,1]);
				
				}, 
			\aP67 -> {//	|hek
				
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\aP68 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\aP69 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // ke
				}, 
			\aP70 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\aP71 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // ke
				}
		).play;



		
	}
	
	//---------------------------------------------aT---------------------------------------------------------------//
	
	
	
	
	*aT {
		
		Preceive(


//CIFTE DUYEK --------------------------------------
		//8/4
			\at1 -> {//	|dum2
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum

				}, 
			\at2 -> {//	+tek2-3-4
				~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.32, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				~ats03.brt_(~kRB1 *1.02006).playBuf(0.001, 0.004, 0.8, mul:0.3, start: [0.3, 0.35, 0.4, 0.5].choose, out: [0,1]);
				}, 
			\at3 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				},
		//8/4
			\at4 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\at5 -> {//	|dum2
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum
				}, 
			\at6 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				
				~ats03.brt_(~kRF1 *1.02006).playBuf(0.001, 0.004, 0.8, mul:0.3, start: [0.3, 0.39, 0.1, 0.7].choose, out: [0,1]);
				
				}, 
			\at7 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\at8 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 			
			
//FAHTE --------------------------------------------
		//4/4
			\at9 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\at10 -> {//	|dum2
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum

				}, 
			\at11 -> {//	|dum
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum

				}, 
			
		//6/4
			\at12 -> {//	+tek2
				~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				
				}, 
			\at13 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				}, 
			\at14 -> {//	tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				}, 
			
		//6/4
			\at15 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\at16 -> {//	|ta2
				
				}, 
			\at17 -> {//	hek2
				
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			
		//4/4
			\at18 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\at19 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			\at20 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\at21 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
	
//CEMBER -------------------------------------------
		//4/4
			\at22 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\at23 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\at24 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				},
			
		//4/4	
			\at25 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\at26 -> {//	|dum
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum

				}, 
			\at27 -> {//	dum
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				},
			
		//6/4
			\at28 -> {//	+tek2
				~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				
				}, 
			\at29 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				}, 
			\at30 -> {//	tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				}, 
			
		//6/4
			\at31 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\at32 -> {//	|ta2
				
				}, 
			\at33 -> {//	hek2
				
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			
		//4/4
			\at34 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\at35 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			\at36 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\at37 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				},

// DEVR-i KEBIR -----------------------------
		//6/4
			\at38 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\at39 -> {//	|dum2
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum

				}, 
			\at40 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				},
			
		//4/4
			\at41 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\at42 -> {//	|tek
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				}, 
			\at43 -> {//	te'
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\at44 -> {//	ke'
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				},
			\at45 -> {//	dum
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			
		//	4/4
			\at46 -> {//	+tek2
				~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				
				}, 
			\at47 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				},
			
			
		// 	6/4
			\at48 -> {//	+tek2
				~ats02.brt_(17.5).playPV1(0.01, 0.2, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				}, 
			\at49 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\at50 -> {//	|dum2
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum

				}, 
			
			\at51 -> {//	+ta2
				
				}, 
			\at52 -> {//	|hek
				
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\at53 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\at54 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			\at55 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\at56 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				},
			
//BEREFSAN
		// 6/4
			\at57 -> {//	+dum2-3-4
				~ats02.brt_(3.5).playPV1(0.01, 1.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\at58 -> {//	|tek2
				
				}, 
			
		// 6/4
			\at59 -> {//	+dum2-3-4
				~ats02.brt_(3.5).playPV1(0.01, 1.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\at60 -> {//	|tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // tek
				}, 
			
		//4/4
			\at61 -> {//	+dum2-3-4
				~ats02.brt_(3.5).playPV1(0.01, 1.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			
		//4/4
			\at62 -> {//	|dum2
				~ats02.brt_(3.5).playPV1(0.01, 1.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum

				}, 
			\at63 -> {//	tek2
				~ats02.brt_(9.5).playPV1(0.01, 0.4, 0.1, mul:0.27, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // tek
				}, 
		//4/4
			\at64 -> {//	+dum2
				~ats02.brt_(3.5).playPV1(0.01, 1.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum
				}, 
			\at65 -> {//	|dum2
				~ats02.brt_(3.5).playPV1(0.01, 1.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // dum

				}, 
		//4/4	
			\at66 -> {//	+ta2

				}, 
			\at67 -> {//	|hek
				
				~ats02.brt_(3.5).playBuf(0.01, 0.2, 0.1, mul:0.2, start:0.705, out:  ~strTek.choose); // dum
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:0.2, out:  ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\at68 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\at69 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // ke
				}, 
			\at70 -> {//	|te
				~ats02.brt_(1.0).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // te
				}, 
			\at71 -> {//	ke
				~ats02.brt_(11.5).playPV1(0.01, 0.4, 0.1, mul:0.2, start:[0.73, 0.1, 0.28, 0.57].choose, out:  ~strTek.choose); // ke
				}
		).play;
	
	}

	//------------------------------------------------------kP-----------------------------------------------------------//

	*kPV1 {
		
Preceive(


//CIFTE DUYEK --------------------------------------
		//8/4
			\kPV1_1 -> {//	|dum2
				~bth02.brt_(~kRC1 *1.00011).playPV3(0.001, 0.1, 0.5, mul:0.8, out: [0, 1, [0,1]].choose);
				
				
				
				}, 
			\kPV1_2 -> {//	+tek2-3-4
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				
				}, 
			\kPV1_3 -> {//	|tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				},
		//8/4
			\kPV1_4 -> {//	+dum2
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_5 -> {//	|dum2
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_6 -> {//	|tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_7 -> {//	|te
				~kik01.brt_(4.0).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kPV1_8 -> {//	ke
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 			
			
//FAHTE --------------------------------------------
		//4/4
			\kPV1_9 -> {//	+dum2
				~bth02.brt_(~kRC1 *1.00011).playPV3(0.001, 0.1, 0.5, mul:0.8, out: [0, 1, [0,1]].choose);
				
				}, 
			\kPV1_10 -> {//	|dum2
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
			\kPV1_11 -> {//	|dum
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
			
		//6/4
			\kPV1_12 -> {//	+tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				
				}, 
			\kPV1_13 -> {//	|tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_14 -> {//	tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			
		//6/4
			\kPV1_15 -> {//	+dum2
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_16 -> {//	|ta2
				
				}, 
			\kPV1_17 -> {//	hek2
				
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			
		//4/4
			\kPV1_18 -> {//	|te
				~kik01.brt_(4.0).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kPV1_19 -> {//	ke
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			\kPV1_20 -> {//	|te
				~kik01.brt_(4.0).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kPV1_21 -> {//	ke
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
	
//CEMBER -------------------------------------------
		//4/4
			\kPV1_22 -> {//	+dum2
				~bth02.brt_(~kRC1 *1.00011).playPV3(0.001, 0.1, 0.5, mul:0.8, out: [0, 1, [0,1]].choose);
				
				}, 
			\kPV1_23 -> {//	|te
				~kik01.brt_(4.0).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kPV1_24 -> {//	ke
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				},
			
		//4/4	
			\kPV1_25 -> {//	+dum2
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_26 -> {//	|dum
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
			\kPV1_27 -> {//	dum
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				},
			
		//6/4
			\kPV1_28 -> {//	+tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				
				}, 
			\kPV1_29 -> {//	|tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_30 -> {//	tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			
		//6/4
			\kPV1_31 -> {//	+dum2
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_32 -> {//	|ta2
				
				}, 
			\kPV1_33 -> {//	hek2
				
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			
		//4/4
			\kPV1_34 -> {//	|te
				~kik01.brt_(4.0).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kPV1_35 -> {//	ke
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			\kPV1_36 -> {//	|te
				~kik01.brt_(4.0).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kPV1_37 -> {//	ke
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				},

// DEVR-i KEBIR -----------------------------
		//6/4
			\kPV1_38 -> {//	+dum2
				~bth02.brt_(~kRC1 *1.00011).playPV3(0.001, 0.1, 0.5, mul:0.8, out: [0, 1, [0,1]].choose);
				
				}, 
			\kPV1_39 -> {//	|dum2
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
			\kPV1_40 -> {//	|tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				},
			
		//4/4
			\kPV1_41 -> {//	+dum2
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_42 -> {//	|tek
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_43 -> {//	te'
				~kik01.brt_(4.0).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kPV1_44 -> {//	ke'
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				},
			\kPV1_45 -> {//	dum
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			
		//	4/4
			\kPV1_46 -> {//	+tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				
				}, 
			\kPV1_47 -> {//	|tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				},
			
			
		// 	6/4
			\kPV1_48 -> {//	+tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_49 -> {//	+dum2
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_50 -> {//	|dum2
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
			
			\kPV1_51 -> {//	+ta2
				
				}, 
			\kPV1_52 -> {//	|hek
				
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kPV1_53 -> {//	|te
				~kik01.brt_(4.0).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kPV1_54 -> {//	ke
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			\kPV1_55 -> {//	|te
				~kik01.brt_(4.0).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kPV1_56 -> {//	ke
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				},
			
//BEREFSAN
		// 6/4
			\kPV1_57 -> {//	+dum2-3-4
				~bth02.brt_(~kRC1 *1.00011).playPV3(0.001, 0.1, 0.5, mul:0.8, out: [0, 1, [0,1]].choose);
				
				}, 
			\kPV1_58 -> {//	|tek2
				
				}, 
			
		// 6/4
			\kPV1_59 -> {//	+dum2-3-4
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_60 -> {//	|tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			
		//4/4
			\kPV1_61 -> {//	+dum2-3-4
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			
		//4/4
			\kPV1_62 -> {//	|dum2
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
			\kPV1_63 -> {//	tek2
				~kik01.brt_(9.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
		//4/4
			\kPV1_64 -> {//	+dum2
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kPV1_65 -> {//	|dum2
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
		//4/4	
			\kPV1_66 -> {//	+ta2

				}, 
			\kPV1_67 -> {//	|hek
				
				~kik01.brt_(3.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kPV1_68 -> {//	|te
				~kik01.brt_(4.0).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kPV1_69 -> {//	ke
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			\kPV1_70 -> {//	|te
				~kik01.brt_(4.0).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kPV1_71 -> {//	ke
				~kik01.brt_(11.5).playPV1(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}
		).play;		

	
	}


	
	//------------------------------------------------------kP-----------------------------------------------------------//

	*kP {
		
Preceive(


//CIFTE DUYEK --------------------------------------
		//8/4
			\kP1 -> {//	|dum2
				~bth02.brt_(~kRC1 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: [0, 1, [0,1]].choose);
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				
				~ff = ~kA4;
				KafGendy.ar(1.1, 0.1, 1.3, 0.8,
					freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
					freqrlp1: ~kA1/2, 
					freqrlp2: ~ff*2,
					mul: 0.4,
					out: ~strTek.choose
				).play;
				~tht08.brt_(~kRB4 *1.10000).playPV4(1, 0.1, 2.1, pv4a:[1.2, 2.3, 3.8].choose, loop:0, out: ~strTek.choose); //ok
				}, 
			\kP2 -> {//	+tek2-3-4
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				
				}, 
			\kP3 -> {//	|tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				},
		//8/4
			\kP4 -> {//	+dum2
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP5 -> {//	|dum2
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP6 -> {//	|tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP7 -> {//	|te
				~kik01.brt_(4.0).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kP8 -> {//	ke
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 			
			
//FAHTE --------------------------------------------
		//4/4
			\kP9 -> {//	+dum2
				~bth02.brt_(~kRC1 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: [0, 1, [0,1]].choose);
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				
				~ff = ~kA1;
				KafGendy.ar(1.1, 0.1, 4.3, 6.8,
					freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
					freqrlp1: ~kA1/2, 
					freqrlp2: ~ff*2,
					mul: 0.4,
					out: ~strTek.choose
				).play;
				~tht08.brt_(~kRB1 *1.10000).playPV4(1, 4.1, 5.1, pv4a:1.2, loop:0, out: ~strTek.choose); //ok
				}, 
			\kP10 -> {//	|dum2
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
			\kP11 -> {//	|dum
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
			
		//6/4
			\kP12 -> {//	+tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				
				}, 
			\kP13 -> {//	|tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP14 -> {//	tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			
		//6/4
			\kP15 -> {//	+dum2
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP16 -> {//	|ta2
				
				}, 
			\kP17 -> {//	hek2
				
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			
		//4/4
			\kP18 -> {//	|te
				~kik01.brt_(4.0).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kP19 -> {//	ke
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			\kP20 -> {//	|te
				~kik01.brt_(4.0).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kP21 -> {//	ke
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
	
//CEMBER -------------------------------------------
		//4/4
			\kP22 -> {//	+dum2
				~bth02.brt_(~kRC1 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: [0, 1, [0,1]].choose);
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				
				~ff = ~kA1;
				KafGendy.ar(1.1, 0.1, 0.3, 0.8,
					freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
					freqrlp1: ~kA1/2, 
					freqrlp2: ~ff*2,
					mul: 0.4,
					out: ~strTek.choose
				).play;
				~tht08.brt_(~kRB1 *1.10000).playPV4(1, 0.1, 1.1, pv4a:0.02, loop:0, out: ~strTek.choose); //ok
				}, 
			\kP23 -> {//	|te
				~kik01.brt_(4.0).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kP24 -> {//	ke
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				},
			
		//4/4	
			\kP25 -> {//	+dum2
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP26 -> {//	|dum
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
			\kP27 -> {//	dum
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				},
			
		//6/4
			\kP28 -> {//	+tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				
				}, 
			\kP29 -> {//	|tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP30 -> {//	tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			
		//6/4
			\kP31 -> {//	+dum2
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP32 -> {//	|ta2
				
				}, 
			\kP33 -> {//	hek2
				
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			
		//4/4
			\kP34 -> {//	|te
				~kik01.brt_(4.0).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kP35 -> {//	ke
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			\kP36 -> {//	|te
				~kik01.brt_(4.0).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kP37 -> {//	ke
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				},

// DEVR-i KEBIR -----------------------------
		//6/4
			\kP38 -> {//	+dum2
				~bth02.brt_(~kRC1 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: [0, 1, [0,1]].choose);
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				
				~ff = ~kA1;
				KafGendy.ar(1.1, 0.1, 4.3, 6.8,
					freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
					freqrlp1: ~kA1/2, 
					freqrlp2: ~ff*2,
					mul: 0.4,
					out: ~strTek.choose
				).play;
				~tht08.brt_(~kRB1 *1.10000).playPV4(1, 4.1, 5.1, pv4a:1.2, loop:0, out: ~strTek.choose); //ok
				}, 
			\kP39 -> {//	|dum2
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
			\kP40 -> {//	|tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				},
			
		//4/4
			\kP41 -> {//	+dum2
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP42 -> {//	|tek
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP43 -> {//	te'
				~kik01.brt_(4.0).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kP44 -> {//	ke'
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				},
			\kP45 -> {//	dum
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			
		//	4/4
			\kP46 -> {//	+tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				
				}, 
			\kP47 -> {//	|tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				},
			
			
		// 	6/4
			\kP48 -> {//	+tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP49 -> {//	+dum2
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP50 -> {//	|dum2
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
			
			\kP51 -> {//	+ta2
				
				}, 
			\kP52 -> {//	|hek
				
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kP53 -> {//	|te
				~kik01.brt_(4.0).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kP54 -> {//	ke
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			\kP55 -> {//	|te
				~kik01.brt_(4.0).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kP56 -> {//	ke
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				},
			
//BEREFSAN
		// 6/4
			\kP57 -> {//	+dum2-3-4
				~bth02.brt_(~kRC1 *1.00011).playPV4(0.001, 0.1, 0.5, mul:0.8, out: [0, 1, [0,1]].choose);
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				
				~ff = ~kA4;
				KafGendy.ar(1.1, 0.1, 4.3, 6.8,
					freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
					freqrlp1: ~kA1/2, 
					freqrlp2: ~ff*2,
					mul: 0.4,
					out: ~strTek.choose
				).play;
				~tht08.brt_(~kRB4 *1.10000).playPV4(1, 4.1, 5.1, pv4a:1.2, loop:0, out: ~strTek.choose); //ok
				}, 
			\kP58 -> {//	|tek2
				
				}, 
			
		// 6/4
			\kP59 -> {//	+dum2-3-4
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP60 -> {//	|tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			
		//4/4
			\kP61 -> {//	+dum2-3-4
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			
		//4/4
			\kP62 -> {//	|dum2
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
			\kP63 -> {//	tek2
				~kik01.brt_(9.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
		//4/4
			\kP64 -> {//	+dum2
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				}, 
			\kP65 -> {//	|dum2
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);

				}, 
		//4/4	
			\kP66 -> {//	+ta2

				}, 
			\kP67 -> {//	|hek
				
				~kik01.brt_(3.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose);
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kP68 -> {//	|te
				~kik01.brt_(4.0).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kP69 -> {//	ke
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}, 
			\kP70 -> {//	|te
				~kik01.brt_(4.0).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // te
				}, 
			\kP71 -> {//	ke
				~kik01.brt_(11.5).playPV5(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // ke
				}
		).play;		

	
	}

	*kk{
	
		Preceive(


//CIFTE DUYEK --------------------------------------
		//8/4
			\kk1 -> {//	|dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			\kk2 -> {//	+tek2-3-4
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				
				}, 
			\kk3 -> {//	|tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				},
		//8/4
			\kk4 -> {//	+dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk5 -> {//	|dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk6 -> {//	|tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			\kk7 -> {//	|te
				~kik01.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk8 -> {//	ke
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 			
			
//FAHTE --------------------------------------------
		//4/4
			\kk9 -> {//	+dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk10 -> {//	|dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			\kk11 -> {//	|dum
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			
		//6/4
			\kk12 -> {//	+tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				
				}, 
			\kk13 -> {//	|tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			\kk14 -> {//	tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			
		//6/4
			\kk15 -> {//	+dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk16 -> {//	|ta2
				
				}, 
			\kk17 -> {//	hek2
				
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			
		//4/4
			\kk18 -> {//	|te
				~kik01.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk19 -> {//	ke
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			\kk20 -> {//	|te
				~kik01.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk21 -> {//	ke
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
	
//CEMBER -------------------------------------------
		//4/4
			\kk22 -> {//	+dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk23 -> {//	|te
				~kik01.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk24 -> {//	ke
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				},
			
		//4/4	
			\kk25 -> {//	+dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk26 -> {//	|dum
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			\kk27 -> {//	dum
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.3, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				},
			
		//6/4
			\kk28 -> {//	+tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				
				}, 
			\kk29 -> {//	|tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			\kk30 -> {//	tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			
		//6/4
			\kk31 -> {//	+dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk32 -> {//	|ta2
				
				}, 
			\kk33 -> {//	hek2
				
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			
		//4/4
			\kk34 -> {//	|te
				~kik01.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk35 -> {//	ke
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			\kk36 -> {//	|te
				~kik01.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk37 -> {//	ke
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				},

// DEVR-i KEBIR -----------------------------
		//6/4
			\kk38 -> {//	+dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk39 -> {//	|dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			\kk40 -> {//	|tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				},
			
		//4/4
			\kk41 -> {//	+dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk42 -> {//	|tek
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			\kk43 -> {//	te'
				~kik01.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk44 -> {//	ke'
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				},
			\kk45 -> {//	dum
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.3, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			
		//	4/4
			\kk46 -> {//	+tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				
				}, 
			\kk47 -> {//	|tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				},
			
			
		// 	6/4
			\kk48 -> {//	+tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.9, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			\kk49 -> {//	+dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk50 -> {//	|dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			
			\kk51 -> {//	+ta2
				
				}, 
			\kk52 -> {//	|hek
				
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kk53 -> {//	|te
				~kik01.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk54 -> {//	ke
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			\kk55 -> {//	|te
				~kik01.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk56 -> {//	ke
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				},
			
//BEREFSAN
		// 6/4
			\kk57 -> {//	+dum2-3-4
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk58 -> {//	|tek2
				
				}, 
			
		// 6/4
			\kk59 -> {//	+dum2-3-4
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk60 -> {//	|tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
			
		//4/4
			\kk61 -> {//	+dum2-3-4
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			
		//4/4
			\kk62 -> {//	|dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
			\kk63 -> {//	tek2
				~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose);
				}, 
		//4/4
			\kk64 -> {//	+dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.8, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				}, 
			\kk65 -> {//	|dum2
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);

				}, 
		//4/4	
			\kk66 -> {//	+ta2

				}, 
			\kk67 -> {//	|hek
				
				~kik01.brt_(3.5).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose);
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.5, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			
		//	 4/4
			\kk68 -> {//	|te
				~kik01.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk69 -> {//	ke
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}, 
			\kk70 -> {//	|te
				~kik01.brt_(4.0).playGverb(0.001, 1.1, 2, mul:0.5, room:8, rev:6, damp:0.95, out: ~strTek.choose); // te
				}, 
			\kk71 -> {//	ke
				~kik01.brt_(11.5).playGverb(0.001, 1.1, 1, mul:0.3, room:8.4, rev:6, damp:0.91, out: ~strTek.choose); // ke
				}
		).play;
		
	}
	
}




