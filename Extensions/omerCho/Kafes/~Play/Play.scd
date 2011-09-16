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



Pdef(\zencKick02, Posc(
	\msg, Pseq(
		[
		\kP1, \kP2, \kP3, 
		\kP4, \kP5, \kP6, \kP7, \kP8,
		
		//fahte
		\kP9, \kP10,\kP11, 
		\kP12, \kP13, \kP14, 
		\kP15, \kP16, \kP17, 
		\kP18, \kP19, \kP20, \kP21, 
		//cember
		\kP22, \kP23, \kP24, 
		\kP25, \kP26, \kP27, 
		\kP28, \kP29, \kP30,
		\kP31, \kP32, \kP33, 
		\kP34, \kP35, \kP36, \kP37, 
		//devriKebir
		\kP38, \kP39, \kP40, 
		\kP41, \kP42, \kP43, \kP44, \kP45, 
		\kP46, \kP47, 
		\kP48, \kP49, \kP50, \kP51, \kP52, 
		\kP53, \kP54, \kP55, \kP56, 
		//berefsan
		\kP57, \kP58, 
		\kP59, \kP60, 
		\kP61, 
		\kP62, \kP63, \kP64, \kP65, \kP66, \kP67, 
		\kP68, \kP69, \kP70, \kP71
		
		
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
		
		
		
		]/4, inf
	)
	)
).play;


