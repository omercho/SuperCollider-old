/*
Prepering reAfesi performance

[Aris Bezas, Omer Chatziserif] Wed, 01 June 2011, 23:24


*/
["af1","af2","af3","af4","af5","af6","af7"].choose
(0..60).choose

//:mirrow effect
OF.img(4,0,0,1280,1024)
OF.int("sketch",1)


//:Many images
k = {
	~delayTime = 0.021;
	~countX = 0; 
	~countY = 0;
	~screenWidth = 1280;
	~screenHeight = 1024;
	~fotoWidth = ~fotoHeight = ~screenWidth/10;
	~fotoHeight = ~fotoWidth;
	
	inf.do{ |i|
				
		OF.img((0..7).choose.round, ~countX, ~countY, ~fotoWidth, ~fotoHeight);
		~countX = ~countX + ~fotoWidth;
		if (~countX>~screenWidth, {~countX = 0;~countY = ~countY + ~fotoHeight});
		if (~countY>~screenHeight, {~countY = 0;});
		~delayTime.wait;
	}
	
}.fork 


//:Many images Experiment
k = {
	~delayTime = 0.0091;
	~countX = 5; 
	~countY = 10;
	~screenWidth = 1280;
	~screenHeight = 1024;
	~fotoWidth = ~fotoHeight = ~screenWidth/20;
	~fotoHeight = ~fotoWidth;
	
	inf.do{ |i|
				
		OF.img(
			4, 
			~countX.rand, 
			~countY.rand, 
			~fotoWidth, 
			~fotoHeight
		);
		~countX = ~countX + ~fotoWidth;
		if (~countX>~screenWidth, {~countX = 0;~countY = ~countY + ~fotoHeight});
		if (~countY>~screenHeight, {~countY = 0;});
		~delayTime.wait;
	}
	
}.fork 

//: OC tests

OF.bck;


OF.img(
	0 rrand: 7,
	0 rrand: 1280,
	0 rrand: 1024,
	200 rrand: 1280,
	200 rrand: 1024
);


//:--

OF.int("yPosImage", 100)
OF.int("xPosImage", 100)
OF.int("wImg", 100 rrand: 500)
OF.int("mirrorMode",0);

//:Play with width and height
k = {
	inf.do	{
	OF.int("wImg", 100 rrand: 1500);
	OF.int("hImg", 100 rrand: 1500);			
	0.3.wait
	}
	
}.fork;
//:Play with width and height
k = {
	inf.do	{ |i|
	OF.int("wImg", i);
	OF.int("hImg", i);			
	0.3.wait
	}
	
}.fork;

//:Precieve
Preceive(
	
	'af0' -> {
		OF.bck;
		OF.img(
			0 rrand: 7,
			0 rrand: 1280 - 50,
			0 rrand: 1024 - 80,
			200 rrand: 1280 - 200,
			200 rrand: 1024 - 200
		);
		OF.int("mirrorMode",4);
	},
	'af1' -> {
		OF.img(
			0 rrand: 7,
			0 rrand: 1280 - 150,
			0 rrand: 1024 - 150,
			200 rrand: 1280,
			200 rrand: 1024
		);
		OF.int("mirrorMode",5);
	},
	'af2' -> {
		OF.img(
			0 rrand: 7,
			0 rrand: 1280,
			0 rrand: 1024,
			200 rrand: 1280 - 200,
			200 rrand: 1024 - 200
		);
		OF.int("mirrorMode",5);
	},
	'af3' -> {
		OF.img(
			0 rrand: 7,
			0 rrand: 1280,
			0 rrand: 1024,
			200 rrand: 1280,
			200 rrand: 1024
		);
		//OF.int("mirrorMode",5);
	},
	'af4' -> {
		OF.bck;
		OF.img(
			0 rrand: 7,
			0 rrand: 1280 - 50,
			0 rrand: 1024 - 250,
			200 rrand: 1280,
			200 rrand: 1024
		);
		//OF.int("mirrorMode",4);
	},
	'af5' -> {
		OF.img(
			0 rrand: 7,
			0 rrand: 1280,
			0 rrand: 1024 - 550,
			200 rrand: 1280,
			200 rrand: 1024
		);
		OF.int("mirrorMode",5);
	},
	'af6' -> {
		OF.img(
			0 rrand: 7,
			0 rrand: 1280- 350,
			0 rrand: 1024,
			200 rrand: 1280,
			200 rrand: 1024
		);
		//OF.int("mirrorMode",0);
	},
	'af7' -> {
		OF.img(
			0 rrand: 7,
			0 rrand: 1280 - 550,
			0 rrand: 1024,
			200 rrand: 1280,
			200 rrand: 1024
		);
		OF.int("mirrorMode",4);
	}
).play;


//:Play Pdef
Pdef(\fullScreen).play;	


//:Fill the screen with a foto
Pdef(\fullScreen, Posc(
		\msg, Pseq([\af0, \af1, \af2, \af3], inf),
		\dur, Pseq([~duyekDur]/8, inf),
		\dest,  [NetAddr.localAddr, NetAddr("localhost", 12345)]
		)
	);

//:Duyek
Pdef(\klank, Posc(
	\msg, Pseq([\af1, \af2, \af3, \af4, \af5, \af6, \af7], 1),
	\dur, Pseries(0.1, 2, 12),
	\dest,  [NetAddr.localAddr, NetAddr("localhost", 12345)]
	)
);
//:duyekKudDur
Pdef(\klank, Posc(
		\msg, Pseq([\af1, \af2], inf),
		\dur, Pseq([~duyekKudDur]*0.5, inf),
		\dest,  [NetAddr.localAddr, NetAddr("localhost", 12345)]
		)
	);

//:Posc with predefine TempoClock
Pdef(\klank, Posc(
		\msg, Pseq([\1, \2, \3, \4], inf),
		\dur, Pseq([~duyekDur]*4, inf),
		\dest,  [NetAddr.localAddr, NetAddr("localhost", 12345)]
		)
	).play(~clock1);
//:Other

Posc.play(
	[0,1,2,3,4],
	\dur, 2
	
);
//:--


