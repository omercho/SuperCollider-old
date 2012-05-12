


KafesLayerC {
	
	
	*load {
		
	
		~zencirLayerA = Preceive(


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////-------------------------------------- CiFTE DUYEK --------2 Levels-- 8 parts -- 1.6s -------------------------------------------------/////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//-------------------------------------------lev1-8/4--48s-----------------------------------------------KafesChannels
			\layer_C_1 -> {//	|dum2 ---------------- 12 
				
			
			
				
				}, 
			\layer_C_2 -> {//	+tek2-3-4------------- 24
			

				}, 
			\layer_C_3 -> {//	|tek2 ---------------- 12

				},
		
		//-------------------------------------------lev2-8/4--48s-----------------------------------------------
			\layer_C_4 -> {//	+dum2



~fot01 = Pdef(\zencAtsh01, Posc(
	\msg, Pseq(
		[
		 \lC4_A, \es, \lC4_B, \es, \es, \es, \lC4_C, \es, \es
		], inf
	),
	\dur, Pseq(
		[
		Pseq([2, 2, 2, 2, 1, 1, 2, 4, 8], 1)
		]/2, 8
	)
	)
).play;


				
				}, 
			\layer_C_5 -> {//	|dum2
			
				}, 
			\layer_C_6 -> {//	|tek2

	
				}, 
			\layer_C_7 -> {//	|te


				
				}, 
			\layer_C_8 -> {//	ke

~fot01.stop;
				
				}, 			
			
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////------------------------------------------- FAHTE --------4 Levels-- 13 parts -- 2.0s -------------------------------------------------/////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//-------------------------------------------lev1-4/4--24s-----------------------------------------------
			\layer_C_9 -> {//	+dum2



				
				
				}, 
			\layer_C_10 -> {//	|dum
				
				}, 
			\layer_C_11 -> {//	dum

				
				}, 
			
		//-------------------------------------------lev2-6/4--36s-----------------------------------------------
			\layer_C_12 -> {//	+tek2

				
				}, 
			\layer_C_13 -> {//	|tek2

				
				}, 
			\layer_C_14 -> {//	_tek2

				}, 
			
		//-------------------------------------------lev3-6/4--36s-----------------------------------------------
			\layer_C_15 -> {//	+dum2


				
				}, 
			\layer_C_16 -> {//	|ta2



				
				}, 
			\layer_C_17 -> {//	hek2
			
				
				}, 
			
		//-------------------------------------------lev4-4/4--24s-----------------------------------------------
			\layer_C_18 -> {//	|te
				
				}, 
			\layer_C_19 -> {//	ke
			
				}, 
			\layer_C_20 -> {//	|te
			
				}, 
			\layer_C_21 -> {//	ke

		

			
				}, 
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////------------------------------------------- Cember --------4 Levels-- 13 parts -- 2.4s -------------------------------------------------////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//-------------------------------------------lev1-4/4--24s-----------------------------------------------
			\layer_C_22 -> {//	+dum2


fork{

	2.5.wait;
	
	
	~layC22 = Posc(
		\msg, Pseq([ \lC22_1, \lC22_2, \lC22_3, \lC22_4, \es, \lC22_5, \lC22_6, \lC22_7, \es], inf),
		\dur, Pseq([Pseq([2, 2, 2, 2, 1, 1, 2, 4, 8], 1)]/4, 8)
	).play;

};

				}, 
			\layer_C_23 -> {//	|te
			


				}, 
			\layer_C_24 -> {//	ke


				
				},
			
		//-------------------------------------------lev2-4/4--24s-----------------------------------------------	
			\layer_C_25 -> {//	+dum2
				

				
				}, 
			\layer_C_26 -> {//	|dum


	
				}, 
			\layer_C_27 -> {//	_dum


				
				},
			
		//-------------------------------------------lev3-6/4--36s-----------------------------------------------
			\layer_C_28 -> {//	+tek2


				
				}, 
			\layer_C_29 -> {//	|tek2

			
				}, 
			\layer_C_30 -> {//	tek2
		
				}, 


			
		//-------------------------------------------lev4-6/4--36s-----------------------------------------------
			\layer_C_31 -> {//	+dum2
	
~layC22.stop;
~layC31 = Posc(
	\msg, Pseq([	Pseq([\lC31_A, \lC31_D], 8), Pseq([\lC31_E], 1) ], inf),
	\dur, Pseq([	Pseq([0.5], 8), Pseq([2], 1) ]*2, 9)
).play;

				
				}, 
			\layer_C_32 -> {//	|ta2


~layC31.stop;
~layC32 = Posc(
	\msg, Pseq([	Pseq([\lC31_B, \lC31_D], 8), Pseq([\lC31_E], 1) ], inf),
	\dur, Pseq([	Pseq([0.5], 8), Pseq([2.5], 1) ]*2, 9)
).play;



		
				}, 
			\layer_C_33 -> {//	hek2
	

~layC32.stop;
~layC33 = Posc(
	\msg, Pseq([	Pseq([\lC31_C, \lC31_D], 4), Pseq([\lC31_E], 1) ], inf),
	\dur, Pseq([	Pseq([0.5], 4), Pseq([2.5], 1) ]*2, 1)
).play;		
		

				}, 
			
		//-------------------------------------------lev5-4/4--24s-----------------------------------------------
			\layer_C_34 -> {//	|te
/*
~layC34 = Posc(
	\msg, Pseq([ Pseq([\lC31_1a], 1),	Pseq([\lC4_2, \lC31_3, \bitA1], 7), Pseq([\lC4_2], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 9)
).play;


~cemb01 = Posc(
	\msg, Pseq(
		[
		//cember
		\kk1, \aP23, \aP24, 
		\aP25, \aP26, \aP27, 
		\aP28, \aP29, \aP30,
		\aP31, \aP32, \aP33, 
		\aP34, \aP35, \aP36, \aP37
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
		]/4, 4
	)
).play;

*/
				}, 
			\layer_C_35 -> {//	ke
				
				}, 
			\layer_C_36 -> {//	|te


				}, 
			\layer_C_37 -> {//	ke




fork{		
	~cemb01.stop;
	~layC34.stop;


	2.5.wait;

	~layC33.stop;

};


				},

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////-------------------------------------------DEVR-i KEBIR --------5 Levels--19 parts--2.8s-----------------------------------------------/////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//-------------------------------------------lev1-6/4--36s-----------------------------------------------
			\layer_C_38 -> {//	+dum2

		
				
				}, 
			\layer_C_39 -> {//	|dum2

				
				}, 
			\layer_C_40 -> {//	|tek2


				

				},
			
		//-------------------------------------------lev2-4/4--24s-----------------------------------------------
			\layer_C_41 -> {//	+dum




				}, 
			\layer_C_42 -> {//	|tek

				
				}, 
			\layer_C_43 -> {//	te'
				
				}, 
			\layer_C_44 -> {//	ke'
				
				},
			\layer_C_45 -> {//	|dum

				}, 
			
		//-------------------------------------------lev3-4/4--24s-----------------------------------------------
			\layer_C_46 -> {//	+tek2




				
				}, 
			\layer_C_47 -> {//	|tek2

				

				},
			
			
		//-------------------------------------------lev4-6/4--36s-----------------------------------------------
			\layer_C_48 -> {//	+tek2


	


				}, 
			\layer_C_49 -> {//	+dum2



				
				}, 
			\layer_C_50 -> {//	|dum
				
				}, 
			
			\layer_C_51 -> {//	+ta2

				}, 
			\layer_C_52 -> {//	|hek
				
				}, 
			
		//-------------------------------------------lev5-4/4--24s-----------------------------------------------
			\layer_C_53 -> {//	|te



				
				}, 
			\layer_C_54 -> {//	ke
				
				}, 
			\layer_C_55 -> {//	|te
				
				}, 
			\layer_C_56 -> {//	ke
				
				
				
				},
			
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////-------------------------------------- BEREFSAN --------7 Levels-- 15 parts -- 3.2s -------------------------------------------------/////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//-------------------------------------------lev1-6/4--36s-----------------------------------------------
			\layer_C_57 -> {//	+dum2-3-4

~layC34 = Posc(
	\msg, Pseq([ Pseq([\lC31_1a], 1),	Pseq([\lC4_1, \lC31_3, \bitA1], 7), Pseq([\lC4_2], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 11)
).play;


~cemb01 = Posc(
	\msg, Pseq(
		[
		//cember
		\kk1, \aP23, \aP24, 
		\aP25, \nil, \aP27, 
		\aP28, \nil, \aP30,
		\aP31, \nil, \aP33, 
		\aP34, \nil, \aP36, \nil
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
		]/4, 6
	)
).play;

			
				
				}, 
			\layer_C_58 -> {//	|tek2


~layC34.stop;
~layC34 = Posc(
	\msg, Pseq([ Pseq([\lC31_1d], 1),	Pseq([\lC4_2, \lC31_3, \es], 6), Pseq([\lC4_2], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 4)
).play;

~cemb01.stop;
~cemb01 = Posc(
	\msg, Pseq(
		[
		//cember
		\kk1, \bt1, \aP24, 
		\kk4, \kP26, \aP27, 
		\bt2, \kP29, \kP30,
		\kP31, \kP32, \aP33, 
		\aP34, \kP35, \kk46, \aP37
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

				
				}, 
			
		//-------------------------------------------lev2-6/4--36s-----------------------------------------------
			\layer_C_59 -> {//	+dum2-3-4
				
~layC34.stop;
~layC34 = Posc(
	\msg, Pseq([ Pseq([\lC31_1c], 1),	Pxrand([\lC4_2, \lC31_3, \es], 7), Pseq([\lC4_2], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 6)
).play;

~cemb01.stop;
~cemb01 = Posc(
	\msg, Pseq(
		[
		//cember
		\kk1, \aP23, \aP24, 
		\kk4, \kP26, \aP27, 
		\aP28, \aP29, \kP30,
		\kP31, \kP32, \aP33, 
		\aP34, \kP35, \kk46, \aP37
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
		]/4, 4
	)
).play;				

				
				
				}, 
			\layer_C_60 -> {//	|tek2



~layC34.stop;
~layC34 = Posc(
	\msg, Pseq([ Pseq([\bitA1], 1),	Pseq([\lC4_2, \lC31_3, \bitA1], 7), Pseq([\lC4_2], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 9)
).play;

~cemb01.stop;
~cemb01 = Posc(
	\msg, Pseq(
		[
		//cember
		\kk1, \aP23, \aP24, 
		\aP25, \kP26, \aP27, 
		\kP28, \aP29, \kP30,
		\kP31, \aP32, \aP33, 
		\aP34, \kP35, \aP46, \aP37
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
		]/4, 4
	)
).play;

				
				}, 
			
		//-------------------------------------------lev3-4/4--24s-----------------------------------------------
			\layer_C_61 -> {//	+dum2-3-4

~layC34.stop;
~layC34 = Posc(
	\msg, Pseq([ Pseq([\lC31_1a], 1),	Pseq([\lC4_2b, \lC31_3, \bitA1], 7), Pseq([\lC4_3b], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 12)
).play;

~cemb01.stop;
~cemb01 = Posc(
	\msg, Pseq(
		[
		//cember
		\kk1, \aP23, \aP24, 
		\kk4, \kP26, \aP27, 
		\kP28, \kk29, \kP30,
		\kP31, \kP32, \aP33, 
		\kk34, \kP35, \kk46, \kP17
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
		]/4, 8
	)
).play;

				
				}, 
			
		//-------------------------------------------lev4-4/4--24s-----------------------------------------------
			\layer_C_62 -> {//	|dum2


~layC34.stop;
~layC34 = Posc(
	\msg, Pseq([  Pseq([\lC31_1a], 1),Pshuf([\bt1, \lC31_3, \bitB2], 7),  Pseq([\bitA1], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 4), Pseq([0.5], 4), Pseq([1], 1) ], 12)
).play;

~cemb01.stop;
~cemb01 = Posc(
	\msg, Pxrand(
		[
		//cember
		\kk1, \nil, \kP24, 
		\kk4, \kP26, \bt2, 
		\aP28, \kk29, \kP30,
		\kP31, \nil, \aP33, 
		\kk34, \kP35, \kk46, \kP18
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
		]/4, 8
	)
).play;

				
				}, 
			\layer_C_63 -> {//	tek2


~layC34.stop;
~layC34 = Posc(
	\msg, Pseq([ Pseq([\bitB3], 1),	Pseq([\aP22, \kk22, \kP9], 7), Pseq([\bitA1], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 11)
).play;

~cemb01.stop;
~cemb01 = Posc(
	\msg, Pxrand(
		[
		//cember
		\kP9, \bt2, \bt3, 
		\kk4, \kP26, \bitA5, 
		\bt5, \kk29, \kk3,
		\kP31, \bt1, \kP13, 
		\kk24, \kP35, \kk46, \bt2
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
		]/4, 6
	)
).play;
			
				}, 
		//-------------------------------------------lev5-4/4--24s-----------------------------------------------
			\layer_C_64 -> {//	+dum2

~layC34.stop;
~layC34 = Posc(
	\msg, Pseq([ Pseq([\bitA1], 1),	Pseq([\es, \es, \kk2], 7), Pseq([\es], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 11)
).play;

~cemb01.stop;
~cemb01 = Posc(
	\msg, Pseq(
		[
		//cember
		\kP9, \aP13, \bt3, 
		\kk4, \kP26, \bitA5, 
		\bt5, \kk29, \bt4,
		\kP31, \bt2, \kp13, 
		\aP24, \kP35, \kk46, \aP17
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
		]/4, 6
	)
).play;

				
				}, 
			\layer_C_65 -> {//	|dum2


~layC34.stop;
~layC34 = Posc(
	\msg, Pseq([ Pseq([\lC31_1b], 1),	Pxrand([\lC4_1b, \bitA1, \bitA3], 7), Pseq([\lC4_2b], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 9)
).play;

~cemb01.stop;
~cemb01 = Posc(
	\msg, Pseq(
		[
		//cember
		\kk1, \kP23, \kP24, 
		\kk25, \kP26, \kk27, 
		\kk28, \bt2, \kk30,
		\kP31, \aP32, \bt3, 
		\aP34, \kP35, \aP46, \bt4
		], inf
	),
	\dur, Pseq(
		[
		//cember
		Pseq([1, 1, 1], 1),
		Pseq([1, 1, 1], 1),
		Pseq([1, 1, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1, 1], 1)
		]/4, 4
	)
).play;
				
				}, 
		//-------------------------------------------lev6-4/4--24s-----------------------------------------------
			\layer_C_66 -> {//	+ta2

~layC34.stop;
~layC34 = Posc(
	\msg, Pseq([ Pseq([\lC31_1b], 1),	Pseq([\lC4_2, \lC31_3, \bitA1], 7), Pseq([\lC4_2], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 9)
).play;

~cemb01.stop;
~cemb01 = Posc(
	\msg, Pseq(
		[
		//cember
		\kk1, \aP23, \aP24, 
		\aP25, \kP26, \aP27, 
		\aP28, \kP29, \kP30,
		\kP31, \aP32, \aP33, 
		\aP34, \kP35, \aP46, \aP37
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
		]/4, 4
	)
).play;

				}, 
			\layer_C_67 -> {//	|hek


~layC34.stop;
~layC34 = Posc(
	\msg, Pseq([ Pseq([\kP5], 1),	Pxrand([\kk2, \lC31_3, \kP6], 7), Pseq([\lC4_2], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 9)
).play;

~cemb01.stop;
~cemb01 = Posc(
	\msg, Pseq(
		[
		//cember
		\kk1, \kP23, \kP24, 
		\kk25, \aP26, \kk27, 
		\kk28, \aP29, \kP30,
		\kP31, \aP32, \kP33, 
		\aP34, \aP35, \kP46, \kk37
		], inf
	),
	\dur, Pseq(
		[
		//cember
		Pseq([1, 1, 1], 1),
		Pseq([1, 1, 1], 1),
		Pseq([1, 1, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1, 1], 1)
		]/4, 4
	)
).play;
				
				}, 
			
		//-------------------------------------------lev7-4/4--24s-----------------------------------------------
			\layer_C_68 -> {//	|te
~layC34.stop;
/*~layC34 = Posc(
	\msg, Pseq([ Pseq([\lC31_1a], 1),	Pseq([\lC4_2b, \lC31_4, \bitA1], 7), Pseq([\lC4_2], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 9)
).play;*/

~cemb01.stop;
/*~cemb01 = Posc(
	\msg, Pseq(
		[
		//cember
		\kk1, \kP23, \kP24, 
		\kk25, \kP26, \kk27, 
		\kk28, \kP29, \kP30,
		\kP31, \kP32, \kk33, 
		\bt1, \kP35, \bt3, \bt4
		], inf
	),
	\dur, Pseq(
		[
		//cember
		Pseq([1, 1, 1], 1),
		Pseq([1, 1, 1], 1),
		Pseq([1, 1, 2], 1),
		Pseq([2, 2, 2], 1),
		Pseq([1, 1, 1, 1], 1)
		]/4, 4
	)
).play;*/
				
				}, 
			\layer_C_69 -> {//	ke
				
				}, 
			\layer_C_70 -> {//	|te
				
				}, 
			\layer_C_71 -> {//	ke

/*~layC34.stop;
~layC34 = Posc(
	\msg, Pseq([ Pseq([\kP22], 1),	Pseq([\kP63, \kP51, \kP14], 7), Pseq([\kk34], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 1)
).play;

~cemb01.stop;
~cemb01 = Posc(
	\msg, Pseq(
		[
		//cember
		\kP11, \bt1, \kk24, 
		\kk4, \kP13, \kP2, 
		\bt3, \kP49, \kP14,
		\kP31, \kP8, \kP22
		], inf
	),
	\dur, Pseq(
		[
		//cember
		Pseq([2, 1, 1], 1),
		Pseq([2, 1, 1], 1),
		Pseq([2/4, 1, 2/4], 1),
		Pseq([1, 1, 1], 1)
		]/2, 1
	)
).play;*/
				
				}
		).play;
		
//------Zencir-------//
Pdef(\zencirLayerC, Posc(
	\msg, Pseq(
		[
		//cifteDuyek
		\layer_C_1, \layer_C_2, \layer_C_3, 
		\layer_C_4, \layer_C_5, \layer_C_6, \layer_C_7, \layer_C_8,
		//fahte
		\layer_C_9, \layer_C_10,\layer_C_11, 
		\layer_C_12, \layer_C_13, \layer_C_14, 
		\layer_C_15, \layer_C_16, \layer_C_17, 
		\layer_C_18, \layer_C_19, \layer_C_20, \layer_C_21, 
		//cember
		\layer_C_22, \layer_C_23, \layer_C_24, 
		\layer_C_25, \layer_C_26, \layer_C_27, 
		\layer_C_28, \layer_C_29, \layer_C_30,
		\layer_C_31, \layer_C_32, \layer_C_33, 
		\layer_C_34, \layer_C_35, \layer_C_36, \layer_C_37, 
		//devriKebir
		\layer_C_38, \layer_C_39, \layer_C_40, 
		\layer_C_41, \layer_C_42, \layer_C_43, \layer_C_44, \layer_C_45, 
		\layer_C_46, \layer_C_47, 
		\layer_C_48, \layer_C_49, \layer_C_50, \layer_C_51, \layer_C_52, 
		\layer_C_53, \layer_C_54, \layer_C_55, \layer_C_56, 
		//berefsan
		\layer_C_57, \layer_C_58, 
		\layer_C_59, \layer_C_60, 
		\layer_C_61, 
		\layer_C_62, \layer_C_63, \layer_C_64, \layer_C_65, \layer_C_66, \layer_C_67, 
		\layer_C_68, \layer_C_69, \layer_C_70, \layer_C_71
		
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
Pdef(\cifteDuyekLayerC, Posc(
	\msg, Pseq(
		[
		//cifteDuyek
		\layer_C_1, \layer_C_2, \layer_C_3, 
		\layer_C_4, \layer_C_5, \layer_C_6, \layer_C_7, \layer_C_8		
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
Pdef(\toFahteLayerC, Posc(
	\msg, Pseq(
		[
		\layer_C_7, \layer_C_8,
		//fahte
		\layer_C_9, \layer_C_10,\layer_C_11, 
		\layer_C_12, \layer_C_13, \layer_C_14, 
		\layer_C_15, \layer_C_16, \layer_C_17, 
		\layer_C_18, \layer_C_19, \layer_C_20, \layer_C_21, 
		//cember
		\layer_C_22, \layer_C_23, \layer_C_24, 
		\layer_C_25, \layer_C_26, \layer_C_27, 
		\layer_C_28, \layer_C_29, \layer_C_30,
		\layer_C_31, \layer_C_32, \layer_C_33, 
		\layer_C_34, \layer_C_35, \layer_C_36, \layer_C_37, 
		//devriKebir
		\layer_C_38, \layer_C_39, \layer_C_40, 
		\layer_C_41, \layer_C_42, \layer_C_43, \layer_C_44, \layer_C_45, 
		\layer_C_46, \layer_C_47, 
		\layer_C_48, \layer_C_49, \layer_C_50, \layer_C_51, \layer_C_52, 
		\layer_C_53, \layer_C_54, \layer_C_55, \layer_C_56, 
		//berefsan
		\layer_C_57, \layer_C_58, 
		\layer_C_59, \layer_C_60, 
		\layer_C_61, 
		\layer_C_62, \layer_C_63, \layer_C_64, \layer_C_65, \layer_C_66, \layer_C_67, 
		\layer_C_68, \layer_C_69, \layer_C_70, \layer_C_71
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
Pdef(\fahteLayerC, Posc(
	\msg, Pseq(
		[

		//fahte
		\layer_C_9, \layer_C_10,\layer_C_11, 
		\layer_C_12, \layer_C_13, \layer_C_14, 
		\layer_C_15, \layer_C_16, \layer_C_17, 
		\layer_C_18, \layer_C_19, \layer_C_20, \layer_C_21
		
		
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
Pdef(\toCemberLayerC, Posc(
	\msg, Pseq(
		[
		\layer_C_20, \layer_C_21,
		//cember
		\layer_C_22, \layer_C_23, \layer_C_24, 
		\layer_C_25, \layer_C_26, \layer_C_27, 
		\layer_C_28, \layer_C_29, \layer_C_30,
		\layer_C_31, \layer_C_32, \layer_C_33, 
		\layer_C_34, \layer_C_35, \layer_C_36, \layer_C_37, 
		//devriKebir
		\layer_C_38, \layer_C_39, \layer_C_40, 
		\layer_C_41, \layer_C_42, \layer_C_43, \layer_C_44, \layer_C_45, 
		\layer_C_46, \layer_C_47, 
		\layer_C_48, \layer_C_49, \layer_C_50, \layer_C_51, \layer_C_52, 
		\layer_C_53, \layer_C_54, \layer_C_55, \layer_C_56, 
		//berefsan
		\layer_C_57, \layer_C_58, 
		\layer_C_59, \layer_C_60, 
		\layer_C_61, 
		\layer_C_62, \layer_C_63, \layer_C_64, \layer_C_65, \layer_C_66, \layer_C_67, 
		\layer_C_68, \layer_C_69, \layer_C_70, \layer_C_71
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
Pdef(\cemberLayerC, Posc(
	\msg, Pseq(
		[

		//cember
		\layer_C_22, \layer_C_23, \layer_C_24, 
		\layer_C_25, \layer_C_26, \layer_C_27, 
		\layer_C_28, \layer_C_29, \layer_C_30,
		\layer_C_31, \layer_C_32, \layer_C_33, 
		\layer_C_34, \layer_C_35, \layer_C_36, \layer_C_37
		
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
Pdef(\toDevriKebirLayerC, Posc(
	\msg, Pseq(
		[
		\layer_C_31, \layer_C_32, \layer_C_33,
		\layer_C_34, \layer_C_35, \layer_C_36, \layer_C_37,
		//devriKebir
		\layer_C_38, \layer_C_39, \layer_C_40, 
		\layer_C_41, \layer_C_42, \layer_C_43, \layer_C_44, \layer_C_45, 
		\layer_C_46, \layer_C_47, 
		\layer_C_48, \layer_C_49, \layer_C_50, \layer_C_51, \layer_C_52, 
		\layer_C_53, \layer_C_54, \layer_C_55, \layer_C_56, 
		//berefsan
		\layer_C_57, \layer_C_58, 
		\layer_C_59, \layer_C_60, 
		\layer_C_61, 
		\layer_C_62, \layer_C_63, \layer_C_64, \layer_C_65, \layer_C_66, \layer_C_67, 
		\layer_C_68, \layer_C_69, \layer_C_70, \layer_C_71
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

//------devriKebirLayerC-------//
Pdef(\devriKebirLayerC, Posc(
	\msg, Pseq(
		[

		//devriKebir
		\layer_C_38, \layer_C_39, \layer_C_40, 
		\layer_C_41, \layer_C_42, \layer_C_43, \layer_C_44, \layer_C_45, 
		\layer_C_46, \layer_C_47, 
		\layer_C_48, \layer_C_49, \layer_C_50, \layer_C_51, \layer_C_52, 
		\layer_C_53, \layer_C_54, \layer_C_55, \layer_C_56
		
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
Pdef(\toBerefsanLayerC, Posc(
	\msg, Pseq(
		[
		\layer_C_55, \layer_C_56, 
		//berefsan
		\layer_C_57, \layer_C_58, 
		\layer_C_59, \layer_C_60, 
		\layer_C_61, 
		\layer_C_62, \layer_C_63, \layer_C_64, \layer_C_65, \layer_C_66, \layer_C_67, 
		\layer_C_68, \layer_C_69, \layer_C_70, \layer_C_71
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
Pdef(\berefsanLayerC, Posc(
	\msg, Pseq(
		[

		//berefsan
		\layer_C_57, \layer_C_58, 
		\layer_C_59, \layer_C_60, 
		\layer_C_61, 
		\layer_C_62, \layer_C_63, \layer_C_64, \layer_C_65, \layer_C_66, \layer_C_67, 
		\layer_C_68, \layer_C_69, \layer_C_70, \layer_C_71
		
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