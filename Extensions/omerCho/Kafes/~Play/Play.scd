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



//=================================================VISUALS===================================================//


//:Load images to oF
//:=================

//:Create the hashTable
~imageLib = MultiLevelIdentityDictionary.new;
~loadImages2oF = { | path = "/Users/omerchatziserif/Media/Pics/\~KafesImages/*" |
	
	var folders, files, imageDict;
	imageDict = IdentityDictionary.new;
	folders = path.pathMatch;
	folders do: { | f |
		f.basename.postln;
		imageDict[f.basename.asSymbol] = format("%*", f).pathMatch;
		postf("FOLDER LOADED: \n%\n", f);
	};
	{
		var index = 0;
		imageDict keysValuesDo: { | folder, files |
 			files do: { | path, i |
	 			postf("LOADING: %, %, %\n", index, folder, path.basename);
	 			OF.loadImage(index, path);
				~imageLib.put(folder, i, index);
	 			index = index + 1;
				0.01.wait;
 			}
		}
	
	}.fork;
};
OF.video("playVideo",0);
OF.video("deleteVideo");

//:evaluate the function
~loadImages2oF.value;

//:---




fork{
	~tol08.brt_(~kRC1 *1.07500).playBuf(0.001, 0.3, 0.1, mul:1.1, out: ~strHep);
	
	0.265.wait;
	
	//KafSinVib.ar(0.1, 0.1, 18.0, mul:0.3, freq1: ~kA1, freq2: ~kA1+3, vib1: 2.1, vib2: 4, out: ~strCok.choose).play;
	
	~tol06.brt_(~kRB1 *1.23700).playGverb(0.001, 1.1, 16.1, mul:0.1, room:165, rev:23.5, damp:0.71, out: ~strHep);
	
	//~tol06.brt_(~kRC1 *1.23700).playBuf(0.001, 1.1, 16.1, mul:0.4, out: ~strHep);
	
	5.6.wait;
	
	~tol06.brt_(~kRB1 *1.23700).playGverbR(0.001, 1.1, 10.1, mul:0.5, room:55, rev:13.5, damp:0.71, out: ~strTek.choose);
	
	2.9.wait;
	
	~tol06.brt_(~kRB4 *1.23700).playBufR(0.01, 3.5, 0.1, mul:0.5, out: ~strTek.choose);
	
	0.01.wait;
	
	~tol06.brt_(~kRB1 *1.23700).playBufR(0.01, 4.5, 0.1, mul:0.5, out: ~strTek.choose);
	
	2.5.wait;
	
	fork{
		
		~botbs.brt_(~kRD1 *1.36619).playBuf(0.001, 1.1, 3, mul:0.7, out: ~strTek.choose);
		0.25.wait;
		~botbs.brt_(~kRD4 *1.36619).playBuf(0.001, 1.1, 3, mul:0.5, out: ~strTek.choose);
		
	};
	
	0.25.wait;
	
	~tol03.brt_(~kRD1 *1.07600).playBufR(0.001, 0.8, 1,4, mul:0.5, out: ~strTek.choose);
	
	1.5.wait;
	
	~gir01.brt_(2.8).playGverbR(0.001, 1.1, 10.1, mul:0.5, room:55, rev:13.5, damp:0.71, out: ~strTek.choose);

};




//:-


fork{
	144.do{|i|
		var dur = Pseq([0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
		~gou02.brt_([~kRE2, ~kRC6].choose *0.89000).playBuf(0.001, 1.1, 5.1, mul:0.0001+0.001*(i%70), out: ~strTek.choose);
		OF.img(~imageLib.at('kafSleepA', (0..15).choose), 0, 0, 600, 600, 4.0+1.001*(i%70));
		dur.next.wait;
		
		
	};
};

//:-

fork{
	144.do{|i|
		var dur = Pseq([0.5, 0.25, 0.25, 0.5, 0.25, 0.25, 0.25, 0.25]/4, inf).asStream;
		~gou02.brt_([~kRE2, ~kRC6].choose *0.89000).playBuf(0.001, 1.1, 5.1, mul:0.0001+0.001*(i%70), out: ~strTek.choose);
		OF.img(~imageLib.at('kafSleepA', (15..35).choose), 0, 0, 600, 600, 4.0+1.001*(i%70));
		dur.next.wait;
		
		
	};
};

//:-



//===========================================================================================================//


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

fork{		
	
	~kik01.brt_(1.5).playPV2(0.001, 1.1, 1, mul:0.1, out: ~strTek.choose); // dum				
	~kf = KafSinVib.ar(0.1, 0.1, 8.0, mul:0.3, freq1: ~kA1, freq2: ~kA1+3, vib1: 2.1, vib2: 4, out: ~strTek.choose).play;
	0.8.wait;
	fork{
		~mul01 = Pseq([0.5, 0.4, 0.3, 0.2, 0.1, 0.09, 0.07, 0.04]*0.9, inf).asStream;
		~mul02 = (0.1..0.9);
		~dur01 = Pseq([0.25, 0.36, 0.47, 0.58, 0.69, 0.80, 0.91, 0.94]/2, inf).asStream;
		8.do {|i|
			
			~kik01.brt_(9.5).playGverb(0.001, 1.1, 1, mul: ~mul01.next, room:8.4, rev:1, damp:0.91, out: ~strTek.choose);
			~dur01.next.wait;
		
		};
		16.do{
			~tht08.brt_([~kRB1, ~kRB1, ~kRB1].choose *1.10000).playPV5(1, 0.1, 0.4, mul: ~mul02.next, pv5a:0.92, loop:0, out: ~strTek.choose); //ok
			0.8.wait;
		};
		
	};
	2.5.wait;
	~kik01.brt_(5.5).playGverb(0.001, 1.1, 1, mul: ~mul01.next, room:8.4, rev:1, damp:0.91, out: ~strTek.choose);


};

)


(

~layC34.stop;
~layC34 = Posc(
	\msg, Pshuf([ Pseq([\bt12], 1),	Pseq([\kP63, \kP51, \kP14], 7), Pseq([\kk34], 1) ], inf),
	\dur, Pseq([	Pseq([0.25], 8), Pseq([1], 1) ], 1)
).play;

~cemb01.stop;
~cemb01 = Posc(
	\msg, Pseq(
		[
		//cember
		\kP9, \bt11, \kk24, 
		\kk4, \kP13, \kp22, 
		\bt18, \kP49, \kP14,
		\kP31, \kP8, \kP9, 
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
		]/2, 2
	)
).play;

)




