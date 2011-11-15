~kaf01.play;
~kaf01.playPV1;
~kaf01.playPV2;
~kaf01.playPV3;
~kaf01.playGverb;

~kaf01.playGverb(rate:0.5);
~kaf01.brt_(2).playGverb;
~kaf01.brt_(2).playGverb(0.001, 2.2, 2.2, 0.2);


~kaf01.brt_(2).brev_(10).playGverb;


~kaf01.brt_(2).playGverb(0.001, 2.2, 2.2, 0.2);


//:playPV2
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

		~kaf01.brt_(~kP01.next *0.89000).playPV2(0.001, 1.1, 5.1, mul:~amp.next, out: 0);
		dur.next.wait;
		
		
	};
	
}.fork;

//:playPV1
~gouA2.stop;
~gouA2 = {
	 ~kP01 = Pseq([
				~kRA1, ~kRA2, ~kRA3, ~kRA4, ~kRA5, ~kRA6, ~kRA7, 
				~kRB1, ~kRB2, ~kRB3, ~kRB4, ~kRB5, ~kRB6, ~kRB7,
				~kRC1, ~kRC2, ~kRC3, ~kRC4, ~kRC5, ~kRC6, ~kRC7,
				~kRD1, ~kRD2, ~kRD3, ~kRD4, ~kRD5, ~kRD6, ~kRD7,
				~kRE1, ~kRE2, ~kRE3, ~kRE4, ~kRE5, ~kRE6, ~kRE7,
				~kRF1, ~kRF2, ~kRF3, ~kRF4, ~kRF5, ~kRF6, ~kRF7
	], inf).asStream;
	~amp = Pseq([0.8, 0.5, 0.15], inf).asStream;
	~dur = Pseq([1, 1, 1]/2, inf).asStream;
	42.do{
	

		~kaf01.brt_(~kP01.next *0.89000).playPV1(0.001, 0.5, 0.1, mul:~amp.next, out: 0);
		~dur.next.wait;
		
		
	};
	
}.fork;


//:playBuf
~gouA2.stop;
~gouA2 = {
	 ~kP01 = Pseq([~kRD1], inf).asStream;
	~amp = Pseq([0.8, 0.5, 0.15], inf).asStream;
	~dur = Pseq([1, 1, 1]/15, inf).asStream;
	42.do{
	

		~kaf01.brt_(~kP01.next *0.89000).playBuf(0.01, 0.2, 0.01, mul:~amp.next, start: 0.2);
		~dur.next.wait;
		
		
	};
	
}.fork;


//:transBuf
~kaf03
	.brt1_(~kRC7).brt1Dur_(2.2)
	.btrDur_(0.5)
	.brt2_(~kRD1).brt2Dur_(3)
.transBuf(0.02, 2.78, 8.0, mul:0.5, loop:1);
//:-
~kaf03
	.brt1_(~kRC7).brt1Dur_(2.2)
	.btrDur_(0.5)
	.brt2_(~kRD1).brt2Dur_(3)
.transBuf(0.02, 2.78, 8.0, mul:0.5, loop:1);

//:kontBass
~kont.stop;
~kont = {
	 ~kP01 = Pseq([
				~kRA1, ~kRA2, ~kRA3, ~kRA4, ~kRA5, ~kRA6, ~kRA7, 
				~kRB1, ~kRB2, ~kRB3, ~kRB4, ~kRB5, ~kRB6, ~kRB7,
				~kRC1, ~kRC2, ~kRC3, ~kRC4, ~kRC5, ~kRC6, ~kRC7,
				~kRD1, ~kRD2, ~kRD3, ~kRD4, ~kRD5, ~kRD6, ~kRD7,
				~kRE1, ~kRE2, ~kRE3, ~kRE4, ~kRE5, ~kRE6, ~kRE7,
				~kRF1, ~kRF2, ~kRF3, ~kRF4, ~kRF5, ~kRF6, ~kRF7
	], inf).asStream;
	~amp = Pseq([0.8, 0.5, 0.15], inf).asStream;
	~dur = Pseq([1, 1, 1]/15, inf).asStream;
	inf.do{
	

		~kontraBass.brt_(~kP01.next *0.89000).playBuf(0.01, 0.2, 0.01, mul:~amp.next, start: 0.2);
		~dur.next.wait;
		
		
	};
	
}.fork;

//:-
~kont.stop;
~kont = {
	 ~kP01 = Pslide([
				~kRA1, ~kRA2, ~kRA3, ~kRA4, ~kRA5, ~kRA6, ~kRA7, 
				~kRB1, ~kRB2, ~kRB3, ~kRB4, ~kRB5, ~kRB6, ~kRB7,
				~kRC1, ~kRC2, ~kRC3, ~kRC4, ~kRC5, ~kRC6, ~kRC7,
				~kRD1, ~kRD2, ~kRD3, ~kRD4, ~kRD5, ~kRD6, ~kRD7,
				~kRE1, ~kRE2, ~kRE3, ~kRE4, ~kRE5, ~kRE6, ~kRE7,
				~kRF1, ~kRF2, ~kRF3, ~kRF4, ~kRF5, ~kRF6, ~kRF7
	], inf, 6, 1, 0).asStream;
	~amp = Pseq([0.8, 0.5, 0.15], inf).asStream;
	~dur = Pseq([1, 1, 1]/20, inf).asStream;
	inf.do{
		~kontraBass.brt_(~kP01.next *0.89000).playBuf(0.01, 0.2, 0.01, mul:~amp.next, start: 0.2);
		~dur.next.wait;
	};
	
}.fork;

//:-


