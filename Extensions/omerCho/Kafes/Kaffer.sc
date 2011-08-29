//A practical buffer player 
//Omer Chatziserif 
//Thu, 24 May 2011, 08:30
//Corfu

/*

~ats01 = Kaffer.read(Server.default, "sounds/_kafes/atesh/01.aif");
~ats02 = Kaffer.read(Server.default, "sounds/_kafes/atesh/02.aif");
~ats03 = Kaffer.read(Server.default, "sounds/_kafes/atesh/03.aif");
~ats04 = Kaffer.read(Server.default, "sounds/_kafes/atesh/04.aif");


~bot01 = Kaffer.read(Server.default, "sounds/_kafes/bot/01.aif");
~bot02 = Kaffer.read(Server.default, "sounds/_kafes/bot/02.aif");
~bot03 = Kaffer.read(Server.default, "sounds/_kafes/bot/03.aif");
~bot04 = Kaffer.read(Server.default, "sounds/_kafes/bot/04.aif");
~bot05 = Kaffer.read(Server.default, "sounds/_kafes/bot/05.aif");
~botbas = Kaffer.read(Server.default, "sounds/_kafes/bot/bas.aif");

~bth01 = Kaffer.read(Server.default, "sounds/_kafes/botaht/01.aif");
~bth02 = Kaffer.read(Server.default, "sounds/_kafes/botaht/02.aif");
~bth03 = Kaffer.read(Server.default, "sounds/_kafes/botaht/03.aif");
~bth04 = Kaffer.read(Server.default, "sounds/_kafes/botaht/04.aif");
~bth05 = Kaffer.read(Server.default, "sounds/_kafes/botaht/05.aif");
~bth06 = Kaffer.read(Server.default, "sounds/_kafes/botaht/06.aif");
~bth07 = Kaffer.read(Server.default, "sounds/_kafes/botaht/07.aif");

~gir01 = Kaffer.read(Server.default, "sounds/_kafes/gir/01.aif");
~gir02 = Kaffer.read(Server.default, "sounds/_kafes/gir/02.aif");
~gir03 = Kaffer.read(Server.default, "sounds/_kafes/gir/03.aif");

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

~tol01 = Kaffer.read(Server.default, "sounds/_kafes/thol/01.aif");
~tol02 = Kaffer.read(Server.default, "sounds/_kafes/thol/02.aif");
~tol03 = Kaffer.read(Server.default, "sounds/_kafes/thol/03.aif");
~tol04 = Kaffer.read(Server.default, "sounds/_kafes/thol/04.aif");
~tol05 = Kaffer.read(Server.default, "sounds/_kafes/thol/05.aif");
~tol06 = Kaffer.read(Server.default, "sounds/_kafes/thol/06.aif");
~tol07 = Kaffer.read(Server.default, "sounds/_kafes/thol/07.aif");
~tol08 = Kaffer.read(Server.default, "sounds/_kafes/thol/08.aif");


~met01.playBuf(rate: 10);
~met01.bufRd(rate: 10);
~met01.playPV1(rate: 10);
~met01.playPV2(rate: 10);
~met01.playPV3(rate: 10);
~met01.playPV4(rate: 10);
~met01.playPV5(rate: 10);


(
~giris1 = {
	10.do{|i, frq = 24.8, dur = 0.05|
		var rates = frq + (0.1 *( i % 50)); 
		
		~gir3.bout_([0].choose).playPV4(0.01, 0.5, 3, rate: rates);
		"1".postln;
		( dur + (0.05*(i%16)) ).yield;
		~gir2.bout_([0, 1].choose).playPV2(0.01, 0.5, 3, rate: rates);
		"2".postln;
		( dur - (0.09*(i%8)) ).yield;
		~gir2.bout_([0, 1].choose).playPV5(0.01, 0.5, 3, rate: rates);
		"3".postln;
		( dur + (0.03*(i%2)) ).yield;
		~gir1.bout_([0, 1].choose).playPV3(0.01, 0.5, 3, rate: rates);
		"4".postln;
		( dur - (0.03*(i%6)) ).yield;
	}
}.fork;

)



*/

Kaffer : Buffer {
	
	var <>bout = 0, <>batt = 0.1, <>bsus = 2.0, <>brls = 2.5, <>bmul = 1.0, <>bloop = false;
	var <>btrig = 0, <>brate = 1.0, <>brate2 = 0.5, <>bstart = 0, <>bend = 1, <>breset = 0, <>bpan = 0;
	


	// FFT with PV_ConformalMap
	playPV5 { arg  att, sus, rls, mul, trig, rate, rate2, start, loop, pan, out;

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
			chain = PV_ConformalMap(chain, MouseX.kr(-1.0,1.0), MouseY.kr(-1.0,1.0)); 
			Out.ar(bout, IFFT(chain) * bmul *env);
		}).play(~sources);
	}

	// FFT with PV_MagShift
	playPV4 { arg  att, sus, rls, mul, trig, rate, rate2, start, loop, pan, out;

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
			chain = PV_MagShift(chain, 1, MouseX.kr(-128, 128) ); 
			Out.ar(bout, IFFT(chain) * bmul *env);
		}).play(~sources);
	}


	// FFT with PV_BinShift
	playPV3 { arg  att, sus, rls, mul, trig, rate, rate2, start, loop, pan, out;

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
			chain = PV_BinShift(chain, 1, MouseY.kr(-128, 128) ); 
			Out.ar(bout, IFFT(chain) * bmul *env);
		}).play(~sources);
	}


	// FFT with PV_BinScramble
	playPV2 { arg  att, sus, rls, mul, trig, rate, rate2, start, loop, pan, out;

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
			chain = PV_BinScramble(chain, MouseX.kr , 0.1, MouseY.kr > 0.5 );
			Out.ar(bout, IFFT(chain) * bmul *env);
		}).play(~sources);
	}


	// FFT with PV_BrickWall
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

/*		if (att.notNil) { batt = att };
		if (sus.notNil) { bsus = sus };
		.
		.
		.
*/		
		//SHORTCUTS

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


