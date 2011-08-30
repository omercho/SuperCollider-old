//A practical buffer player 
//Omer Chatziserif 
//Thu, 24 May 2011, 08:30
//Corfu

/*

//------------------------~ats-----------------------------------//
(
~ats01 = Kaffer.read(Server.default, "sounds/_kafes/atesh/01.aif");
~ats02 = Kaffer.read(Server.default, "sounds/_kafes/atesh/02.aif");
~ats03 = Kaffer.read(Server.default, "sounds/_kafes/atesh/03.aif");
~ats04 = Kaffer.read(Server.default, "sounds/_kafes/atesh/04.aif");
/*
~ats01.play;
~ats01.playBuf(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~ats01.brate_(-5).bufRd(0.01, 3, 4, loop:0, out:[0,1]);
~ats01.playPV1(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~ats01.playPV2( pv2a:0.09, pv2b:0.00, rls:1, rate: 1, loop:1, out:[~ch2]);
~ats01.playPV3( pv3a:2.0, rls:4, rate: 1, loop:1, out:[0,1]);
~ats01.playPV4( pv4a:-10, rls:4, rate: 1, loop:1, out:[0,1]);
~ats01.playPV5( pv5a:0.102, pv5b:0.90, rls:4, rate: 14, loop:1, out:[0,1]);

~ats02.play;
~ats02.playBuf(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~ats02.brate_(-5).bufRd(0.01, 3, 4, loop:0, out:[0,1]);
~ats02.playPV1(0.01, 1, 3, rate: 1, loop:0, out:[0,1]);
~ats02.playPV2( pv2a:0.09, pv2b:0.00, rls:1, rate: 1, loop:1, out:[0,1]);
~ats02.playPV3( pv3a:2.0, rls:4, rate: 1, loop:1, out:[0,1]);
~ats02.playPV4( pv4a:-10, rls:4, rate: 1, loop:1, out:[0,1]);
~ats02.playPV5( pv5a:0.102, pv5b:0.90, rls:4, rate: 4, loop:1, out:[0,1]);

~ats03.play;
~ats03.playBuf(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~ats03.brate_(-5).bufRd(0.01, 3, 4, loop:0, out:[0,1]);
~ats03.playPV1(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~ats03.playPV2( pv2a:0.09, pv2b:0.00, rls:1, rate: 1, loop:1, out:[~ch2]);
~ats03.playPV3( pv3a:2.0, rls:4, rate: 1, loop:1, out:[0,1]);
~ats03.playPV4( pv4a:-10, rls:4, rate: 1, loop:1, out:[0,1]);
~ats03.playPV5( pv5a:0.102, pv5b:0.90, rls:4, rate: 1, loop:1, out:[0,1]);

~ats04.play;
~ats04.playBuf(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~ats04.brate_(-5).bufRd(0.01, 3, 4, loop:0, out:[0,1]);
~ats04.playPV1(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~ats04.playPV2( pv2a:0.09, pv2b:0.00, rls:1, rate: 1, loop:1, out:[~ch2]);
~ats04.playPV3( pv3a:2.0, rls:4, rate: 1, loop:1, out:[0,1]);
~ats04.playPV4( pv4a:-10, rls:4, rate: 1, loop:1, out:[0,1]);
~ats04.playPV5( pv5a:0.102, pv5b:0.90, rls:4, rate: 14, loop:1, out:[0,1]);
*/




~bot01 = Kaffer.read(Server.default, "sounds/_kafes/bot/01.aif");
~bot02 = Kaffer.read(Server.default, "sounds/_kafes/bot/02.aif");
~bot03 = Kaffer.read(Server.default, "sounds/_kafes/bot/03.aif");
~bot04 = Kaffer.read(Server.default, "sounds/_kafes/bot/04.aif");
~bot05 = Kaffer.read(Server.default, "sounds/_kafes/bot/05.aif");
~botbas = Kaffer.read(Server.default, "sounds/_kafes/bot/bas.aif");
/*
~bot01.play;
~bot01.playBuf(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~bot01.brate_(-5).bufRd(0.01, 3, 4, loop:0, out:[0,1]);
~bot01.playPV1(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~bot01.playPV2( pv2a:0.09, pv2b:0.00, rls:1, rate: 1, loop:1, out:[~ch2]);
~bot01.playPV3( pv3a:2.0, rls:4, rate: 1, loop:1, out:[0,1]);
~bot01.playPV4( pv4a:-10, rls:4, rate: 1, loop:1, out:[0,1]);
~bot01.playPV5( pv5a:0.102, pv5b:0.90, rls:4, rate: 11, loop:0, out:[0,1]);

~bot02.play;
~bot02.playBuf(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~bot02.brate_(-1).bufRd(0.01, 3, 0.1, out:[0,1]);
~bot02.playPV1(0.01, 1, 3, rate: 1, loop:0, out:[0,1]);
~bot02.playPV2( pv2a:0.09, pv2b:0.00, rls:1, rate: 1, loop:1, out:[0,1]);
~bot02.playPV3( pv3a:2.0, rls:4, rate: 1, loop:1, out:[0,1]);
~bot02.playPV4( pv4a:-10, rls:4, rate: 1, loop:1, out:[0,1]);
~bot02.playPV5( pv5a:0.102, pv5b:0.90, rls:4, rate: 4, loop:1, out:[0,1]);

~bot03.play;
~bot03.playBuf(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~bot03.brate_(-5).bufRd(0.01, 3, 4, loop:0, out:[0,1]);
~bot03.playPV1(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~bot03.playPV2( pv2a:0.09, pv2b:0.00, rls:1, rate: 1, loop:1, out:[~ch2]);
~bot03.playPV3( pv3a:2.0, rls:4, rate: 1, loop:1, out:[0,1]);
~bot03.playPV4( pv4a:-10, rls:4, rate: 1, loop:1, out:[0,1]);
~bot03.playPV5( pv5a:0.102, pv5b:0.90, rls:4, rate: 1, loop:1, out:[0,1]);

~bot04.play;
~bot04.playBuf(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~bot04.brate_(-5).bufRd(0.01, 3, 4, loop:0, out:[0,1]);
~bot04.playPV1(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~bot04.playPV2( pv2a:0.09, pv2b:0.00, rls:1, rate: 1, loop:1, out:[~ch2]);
~bot04.playPV3( pv3a:2.0, rls:4, rate: 1, loop:1, out:[0,1]);
~bot04.playPV4( pv4a:-10, rls:4, rate: 1, loop:1, out:[0,1]);
~bot04.playPV5( pv5a:0.102, pv5b:0.90, rls:4, rate: 14, loop:1, out:[0,1]);
*/



~bth01 = Kaffer.read(Server.default, "sounds/_kafes/botaht/01.aif");
~bth02 = Kaffer.read(Server.default, "sounds/_kafes/botaht/02.aif");
~bth03 = Kaffer.read(Server.default, "sounds/_kafes/botaht/03.aif");
~bth04 = Kaffer.read(Server.default, "sounds/_kafes/botaht/04.aif");
~bth05 = Kaffer.read(Server.default, "sounds/_kafes/botaht/05.aif");
~bth06 = Kaffer.read(Server.default, "sounds/_kafes/botaht/06.aif");
~bth07 = Kaffer.read(Server.default, "sounds/_kafes/botaht/07.aif");
/*
(
~bth01.playPV2( pv2a:0.09, pv2b:0.00, rls:4, rate: 1, loop:1, out:[0,1]);
~bth01.playPV3( pv3a:2.0, rls:4, rate: 1, loop:1, out:[0,1]);
~bth01.playPV4( pv4a:-10, rls:4, rate: 1, loop:1, out:[0,1]);
~bth01.playPV5( pv5a:0.002, pv5b:0.00, rls:4, rate: 1, loop:1, out:[0,1]);
)

*/




~gir01 = Kaffer.read(Server.default, "sounds/_kafes/gir/01.aif");
~gir02 = Kaffer.read(Server.default, "sounds/_kafes/gir/02.aif");
~gir03 = Kaffer.read(Server.default, "sounds/_kafes/gir/03.aif");
(
~gir01.playBuf(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~gir01.brate_(-5).bufRd(0.01, 3, 4, loop:0, out:[0,1]);
~gir01.playPV1(0.01, 1, 1, rate: 1, loop:0, out:[0,1]);
~gir01.playPV2( pv2a:0.09, pv2b:0.00, rls:4, rate: 1, loop:1, out:[0,1]);
~gir01.playPV3( pv3a:2.0, rls:4, rate: 1, loop:1, out:[0,1]);
~gir01.playPV4( pv4a:-10, rls:4, rate: 1, loop:1, out:[0,1]);
~gir01.playPV5( pv5a:0.002, pv5b:0.00, rls:4, rate: 1, loop:1, out:[0,1]);
)

*/



~gou01 = Kaffer.read(Server.default, "sounds/_kafes/goun/01.aif");
~gou02 = Kaffer.read(Server.default, "sounds/_kafes/goun/02.aif");
~gou03 = Kaffer.read(Server.default, "sounds/_kafes/goun/03.aif");
~gou04 = Kaffer.read(Server.default, "sounds/_kafes/goun/04.aif");

~grn01 = Kaffer.read(Server.default, "sounds/_kafes/grain/01.aif");
~grn02 = Kaffer.read(Server.default, "sounds/_kafes/grain/02.aif");

~int01 = Kaffer.read(Server.default, "sounds/_kafes/int/01.aif");
~int02 = Kaffer.read(Server.default, "sounds/_kafes/int/02.aif");
~int03 = Kaffer.read(Server.default, "sounds/_kafes/int/03.aif");
~int04 = Kaffer.read(Server.default, "sounds/_kafes/int/04.aif");
~int05 = Kaffer.read(Server.default, "sounds/_kafes/int/05.aif");
~int06 = Kaffer.read(Server.default, "sounds/_kafes/int/06.aif");

~met01 = Kaffer.read(Server.default, "sounds/_kafes/metal/01.aif");
~met02 = Kaffer.read(Server.default, "sounds/_kafes/metal/02.aif");
~met03 = Kaffer.read(Server.default, "sounds/_kafes/metal/03.aif");
~met04 = Kaffer.read(Server.default, "sounds/_kafes/metal/04.aif");
~met05 = Kaffer.read(Server.default, "sounds/_kafes/metal/05.aif");
~met06 = Kaffer.read(Server.default, "sounds/_kafes/metal/06.aif");
~met07 = Kaffer.read(Server.default, "sounds/_kafes/metal/07.aif");
~met08 = Kaffer.read(Server.default, "sounds/_kafes/metal/08.aif");
~met09 = Kaffer.read(Server.default, "sounds/_kafes/metal/09.aif");
~met10 = Kaffer.read(Server.default, "sounds/_kafes/metal/10.aif");
/*
(
~met03.playPV2( pv2a:0.09, pv2b:10.00, rls:4, rate: 1, loop:1, out:[0,1]);
~met03.playPV3( pv3a:2.0, rls:4, rate: 1, loop:1, out:[0,1]);
~met03.playPV4( pv4a:10, rls:3, rate: 1, loop:1, out:[0,1]);
~met03.playPV5( pv5a:0.002, pv5b:0.00, rls:4, rate: 1, loop:1, out:[0,1]);
)

*/



~psl01 = Kaffer.read(Server.default, "sounds/_kafes/psiles/01.aif");

~sis01 = Kaffer.read(Server.default, "sounds/_kafes/sise/01.aif");
~sis02 = Kaffer.read(Server.default, "sounds/_kafes/sise/02.aif");
~sis03 = Kaffer.read(Server.default, "sounds/_kafes/sise/03.aif");
~sis04 = Kaffer.read(Server.default, "sounds/_kafes/sise/04.aif");
~sis05 = Kaffer.read(Server.default, "sounds/_kafes/sise/05.aif");
~sis06 = Kaffer.read(Server.default, "sounds/_kafes/sise/06.aif");
~sis07 = Kaffer.read(Server.default, "sounds/_kafes/sise/07.aif");
~sis08 = Kaffer.read(Server.default, "sounds/_kafes/sise/08.aif");
~sis09 = Kaffer.read(Server.default, "sounds/_kafes/sise/09.aif");

~tht01 = Kaffer.read(Server.default, "sounds/_kafes/tahta/01.aif");
~tht02 = Kaffer.read(Server.default, "sounds/_kafes/tahta/02.aif");
~tht03 = Kaffer.read(Server.default, "sounds/_kafes/tahta/03.aif");
~tht04 = Kaffer.read(Server.default, "sounds/_kafes/tahta/04.aif");
~tht05 = Kaffer.read(Server.default, "sounds/_kafes/tahta/05.aif");
~tht06 = Kaffer.read(Server.default, "sounds/_kafes/tahta/06.aif");
~tht07 = Kaffer.read(Server.default, "sounds/_kafes/tahta/07.aif");
~tht08 = Kaffer.read(Server.default, "sounds/_kafes/tahta/08.aif");
~tht09 = Kaffer.read(Server.default, "sounds/_kafes/tahta/09.aif");
/*
(
~tht04.playPV2( pv2a:0.09, pv2b:2.0, rls:4, rate: 1, loop:1, out:[0,1]);
~tht04.playPV3( pv3a:2.0, rls:4, rate: 1, loop:1, out:[0,1]);
~tht04.playPV4( pv4a:10, rls:3, rate: 1, loop:1, out:[0,1]);
~tht01.playPV5( pv5a:0.002, pv5b:0.00, rls:4, rate: 1, loop:1, out:[0,1]);
)

*/


~tol01 = Kaffer.read(Server.default, "sounds/_kafes/thol/01.aif");
~tol02 = Kaffer.read(Server.default, "sounds/_kafes/thol/02.aif");
~tol03 = Kaffer.read(Server.default, "sounds/_kafes/thol/03.aif");
~tol04 = Kaffer.read(Server.default, "sounds/_kafes/thol/04.aif");
~tol05 = Kaffer.read(Server.default, "sounds/_kafes/thol/05.aif");
~tol06 = Kaffer.read(Server.default, "sounds/_kafes/thol/06.aif");
~tol07 = Kaffer.read(Server.default, "sounds/_kafes/thol/07.aif");
~tol08 = Kaffer.read(Server.default, "sounds/_kafes/thol/08.aif");
)

~met01.playBuf(rate: 10);
~met01.bufRd(rate: 10);
~met01.playPV1(rate: 10);
~met01.playPV2(rate: 10);
~met01.playPV3(rate: 10);
~met01.playPV4(rate: 10);
~met03.playPV5(rls:4, rate: 10, loop:1);


(
~giris1 = {
	10.do{|i, frq = 24.8, dur = 1.05|
		var rates = frq + (0.1 *( i % 50)); 
		
		~gir03.bout_([0,1].choose).playPV4(0.01, 0.5, 3, rate: rates);
		"1".postln;
		( dur + (0.05*(i%16)) ).yield;
		~gir02.bout_([0, 1].choose).playPV2(0.01, 0.5, 3, rate: rates);
		"2".postln;
		( dur - (0.09*(i%8)) ).yield;
		~gir02.bout_([0, 1].choose).playPV5(0.01, 0.5, 3, rate: rates);
		"3".postln;
		( dur + (0.03*(i%2)) ).yield;
		~gir01.bout_([0, 1].choose).playPV3(0.01, 0.5, 3, rate: rates);
		"4".postln;
		( dur - (0.03*(i%6)) ).yield;
	}
}.fork;

)



*/

Kaffer : Buffer {
	
	var <>bout = 0, <>batt = 0.1, <>bsus = 2.0, <>brls = 2.5, <>bmul = 1.0, <>bloop = false;
	var <>btrig = 0, <>brate = 1.0, <>brate2 = 0.5, <>bstart = 0, <>bend = 1, <>breset = 0, <>bpan = 0;
	
	var <>bpv1a = 0.1, <>bpv1b = 0.1;
	var <>bpv2a = 0.1, <>bpv2b = 0.5;
	var <>bpv3a = 0.1, <>bpv3b = 0.1;
	var <>bpv4a = 0.1, <>bpv4b = 0.1;
	var <>bpv5a = 0.00001, <>bpv5b = 0.001; 
	


	// PV1 FFT with PV_BrickWall
	playPV1 { arg  att, sus, rls, mul, trig, rate, rate2, start, loop, pan, out;

		batt = att ? batt;
		bsus = sus ? bsus;
		brls = rls ? brls;
		bmul = mul ? bmul;
		btrig = trig ? btrig;
		brate = rate ? brate;
		brate2 = rate2 ? brate2;
		bstart = start ? bstart;
		bpan = pan ? bpan;
		bout = out ? bout;
		bloop = loop ? bloop;
		
		^SynthDef("playPV1", { 
			var player, chain, panlayer, env;
			
			env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [batt, bsus, brls], 'linear', loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			player = PlayBuf.ar(
						numChannels,
						bufnum, 
						BufRateScale.kr(bufnum) * brate,
						btrig,
						BufFrames.kr(bufnum) * bstart,
						loop: bloop.binaryValue
					);
			chain = FFT({LocalBuf(2048, 2)}.dup(2), player);
			chain = PV_BrickWall(chain, 
				SinOsc.kr(
					brate2 * XLine.kr(1, 15 * [1, 1.6], bsus), 
					Rand(0, pi)
				);
			); 
			Out.ar(bout, IFFT(chain) * bmul *env);
		}).play(~sources);
	}



	// PV2 FFT with PV_BinScramble
	playPV2 { arg  att, sus, rls, mul, trig, rate, rate2, start, loop, pv2a, pv2b, pan, out;

		batt = att ? batt;
		bsus = sus ? bsus;
		brls = rls ? brls;
		bmul = mul ? bmul;
		btrig = trig ? btrig;
		brate = rate ? brate;
		brate2 = rate2 ? brate2;
		bstart = start ? bstart;
		bpan = pan ? bpan;
		bout = out ? bout;
		bloop = loop ? bloop;
		
		bpv2a = pv2a ? bpv2a;
		bpv2b = pv2b ? bpv2b;
		
		^SynthDef("playPV2", { 
			var player, chain, panlayer, env;
			
			env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [batt, bsus, brls], 'linear', loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			player = PlayBuf.ar(
						numChannels,
						bufnum, 
						BufRateScale.kr(bufnum) * brate,
						btrig,
						BufFrames.kr(bufnum) * bstart,
						loop: bloop.binaryValue
					);
			chain = FFT(LocalBuf(2048), player);
			chain = PV_BinScramble(chain, bpv2a , 0.1, bpv2b );
			Out.ar(bout, IFFT(chain) * bmul *env);
		}).play(~sources);
	}


	// PV3 FFT with PV_BinShift
	playPV3 { arg  att, sus, rls, mul, trig, rate, rate2, start, loop, pv3a, pan, out;

		batt = att ? batt;
		bsus = sus ? bsus;
		brls = rls ? brls;
		bmul = mul ? bmul;
		btrig = trig ? btrig;
		brate = rate ? brate;
		brate2 = rate2 ? brate2;
		bstart = start ? bstart;
		bpan = pan ? bpan;
		bout = out ? bout;
		bloop = loop ? bloop;
		
		bpv3a = pv3a ? bpv3a;
		
		
		^SynthDef("playPV3", { 
			var player, chain, panlayer, env;
			
			env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [batt, bsus, brls], 'linear', loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			player = PlayBuf.ar(
						numChannels,
						bufnum, 
						BufRateScale.kr(bufnum) * brate,
						btrig,
						BufFrames.kr(bufnum) * bstart,
						loop: bloop.binaryValue
					);
			chain = FFT(LocalBuf(2048), player);
			chain = PV_BinShift(chain, 1, bpv3a ); 
			Out.ar(bout, IFFT(chain) * bmul *env);
		}).play(~sources);
	}


	// PV4 FFT with PV_MagShift
	playPV4 { arg  att, sus, rls, mul, trig, rate, rate2, start, loop, pv4a, pan, out;

		batt = att ? batt;
		bsus = sus ? bsus;
		brls = rls ? brls;
		bmul = mul ? bmul;
		btrig = trig ? btrig;
		brate = rate ? brate;
		brate2 = rate2 ? brate2;
		bstart = start ? bstart;
		bpan = pan ? bpan;
		bout = out ? bout;
		bloop = loop ? bloop;
		
		bpv4a = pv4a ? bpv4a;
		
		^SynthDef("playPV4", { 
			var player, chain, panlayer, env;
			
			env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [batt, bsus, brls], 'linear', loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			player = PlayBuf.ar(
						numChannels,
						bufnum, 
						BufRateScale.kr(bufnum) * brate,
						btrig,
						BufFrames.kr(bufnum) * bstart,
						loop: bloop.binaryValue
					);
			chain = FFT(LocalBuf(2048), player);
			chain = PV_MagShift(chain, 1, bpv4a ); 
			Out.ar(bout, IFFT(chain) * bmul *env);
		}).play(~sources);
	}



	// PV5 FFT with PV_ConformalMap
	playPV5 { arg  att, sus, rls, mul, trig, rate, rate2, start, loop, pv5a, pv5b, pan, out;

		batt = att ? batt;
		bsus = sus ? bsus;
		brls = rls ? brls;
		bmul = mul ? bmul;
		btrig = trig ? btrig;
		brate = rate ? brate;
		brate2 = rate2 ? brate2;
		bstart = start ? bstart;
		bpan = pan ? bpan;
		bout = out ? bout;
		bloop = loop ? bloop;
		
		bpv5a = pv5a ? bpv5a;
		bpv5b = pv5b ? bpv5b;
		
		^SynthDef("playPV5", { 
			var player, chain, panlayer, env;
			
			env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [batt, bsus, brls], 'linear', loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			player = PlayBuf.ar(
						numChannels,
						bufnum, 
						BufRateScale.kr(bufnum) * brate,
						btrig,
						BufFrames.kr(bufnum) * bstart,
						loop: bloop.binaryValue
					);
			chain = FFT(LocalBuf(2048), player);
			chain = PV_ConformalMap(chain, bpv5a, bpv5b); 
			// --- pvc1 -1.0 -> 1.0 ---- pvc1 -1.0 -> 1.0
			
			Out.ar(bout, IFFT(chain) * bmul *env);
		}).play(~sources);
	}


////// -------- TODO : add dseq for scale -------
	//with PlayBuf SynthDef
	playSD { arg  att, sus, rls, mul, trig, rate, start, loop, pan, out;

		batt = att ? batt;
		bsus = sus ? bsus;
		brls = rls ? brls;
		bmul = mul ? bmul;
		btrig = trig ? btrig;
		brate = rate ? brate;
		bstart = start ? bstart;
		bpan = pan ? bpan;
		bout = out ? bout;
		bloop = loop ? bloop;
		
		^SynthDef("playSD", { 
			var player, panlayer, env;
			
			env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [batt, bsus, brls], 'linear', loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			player = PlayBuf.ar(
						numChannels,
						bufnum, 
						BufRateScale.kr(bufnum) * brate,
						btrig,
						BufFrames.kr(bufnum) * bstart,
						loop: bloop.binaryValue
					);
			//player = Pan2.ar(player, bpan);
			Out.ar(bout, player * bmul *env);
		}).play(~sources);
	}



	//with PlayBuf
	playBuf { arg  att, sus, rls, mul, trig, rate, start, loop, pan, out;

		batt = att ? batt;
		bsus = sus ? bsus;
		brls = rls ? brls;
		bmul = mul ? bmul;
		btrig = trig ? btrig;
		brate = rate ? brate;
		bstart = start ? bstart;
		bpan = pan ? bpan;
		bout = out ? bout;
		bloop = loop ? bloop;
		
		^{ var player, panlayer, env;
			
			env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [batt, bsus, brls], 'linear', loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			player = PlayBuf.ar(
						numChannels,
						bufnum, 
						BufRateScale.kr(bufnum) * brate,
						btrig,
						BufFrames.kr(bufnum) * bstart,
						loop: bloop.binaryValue
					);
			//player = Pan2.ar(player, bpan);
			Out.ar(bout, player * bmul *env);
		}.play(~sources);
	}







	//with BufRD
	bufRd { arg  att, sus, rls, mul, trig, rate, start, end, reset, loop, pan, out;

		batt = att ? batt;
		bsus = sus ? bsus;
		brls = rls ? brls;
		bmul = mul ? bmul;
		btrig = trig ? btrig;
		brate = rate ? brate;
		bstart = start ? bstart;
		bend = end ? bend;
		breset = reset ? breset;
		bpan = pan ? bpan;
		bout = out ? bout;
		bloop = loop ? bloop;
		
		^{ var player, panlayer, env;
			
			env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [batt, bsus, brls], 'linear', loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			player = BufRd.ar(
						numChannels,
						bufnum, 
						Phasor.ar(
							btrig, 
							BufRateScale.kr(bufnum) * brate, 
							BufFrames.kr(bufnum) * bstart, 
							BufFrames.kr(bufnum) * bend, 
							BufFrames.kr(bufnum) * breset
						),
						loop: bloop.binaryValue
					);
			//player = Pan2.ar(player, bpan);
			Out.ar(bout, player * bmul *env);
		}.play(~sources2);
	}

	play { arg loop = false;
		^{ var player;
			player = PlayBuf.ar(
				numChannels,
				bufnum,
				BufRateScale.kr(bufnum),
				loop: loop.binaryValue
			);
			loop.not.if(FreeSelfWhenDone.kr(player));
			player * bmul;
		}.play(Server.default);
	}

}








/*


-------------  TO DO   ----------------

	(
	{
	var in, chain, n = 4;
		in = WhiteNoise.ar(0.1.dup(n));
		chain = FFT({LocalBuf(2048, 1)}.dup(n), in);
		chain = PV_BrickWall(chain, LFNoise2.kr(2.dup(n))); 
		Splay.ar(IFFT(chain)) // inverse FFT
	}.play;
	)

--------


-----------

//// Multiple Magnitude plots
(
x = { var in, chain, chainB, chainC;
	in = WhiteNoise.ar;
	chain = FFT(b, in);
	PV_Copy(chain, LocalBuf(2048)); // initial spectrum
	chain = PV_RectComb(chain, 20, 0, 0.2);
	PV_Copy(chain, LocalBuf(2048)); // after comb
	2.do({chain = PV_MagSquared(chain)}); 
	PV_Copy(chain, LocalBuf(2048)); // after magsquared
	0.00001 * Pan2.ar(IFFT(chain));
}.play(s);
)


--------------------------------------

*/


