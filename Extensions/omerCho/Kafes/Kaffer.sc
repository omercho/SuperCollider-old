//A practical buffer player 
//Omer Chatziserif 
//Thu, 24 May 2011, 08:30
//Corfu

// playBuf(att, sus, rls, mul, trig, rate, start, loop, pan, out)
// bufRd(att, sus, rls, mul, trig, rate, start, end, reset, loop, pan, out)

/*
~int1 = Kaffer.read(s, "sounds/_Evfer/int01.aif");
~int2 = Kaffer.read(s, "sounds/_Evfer/int02.aif");
~int3 = Kaffer.read(s, "sounds/_Evfer/int03.aif");
~int4 = Kaffer.read(s, "sounds/_Evfer/int04.aif");
~int5 = Kaffer.read(s, "sounds/_Evfer/int05.aif");
~int6 = Kaffer.read(s, "sounds/_Evfer/int06.aif");
~gir1 = Kaffer.read(s, "sounds/_Evfer/gir01.aif");
~gir2 = Kaffer.read(s, "sounds/_Evfer/gir02.aif");
~gir3 = Kaffer.read(s, "sounds/_Evfer/gir03.aif");
~brdk1 = Kaffer.read(s, "sounds/_Evfer/bardak1.aif");
~dlStr = Kaffer.read(s, "sounds/_Evfer/dlStr.aif");
~dlyStr1 = Kaffer.read(s, "sounds/_Evfer/dlyStrA1.aif");
~dlyStr2 = Kaffer.read(s, "sounds/_Evfer/dlyStrA2.aif");
~dlyStr3 = Kaffer.read(s, "sounds/_Evfer/dlyStrA3.aif");



~gir1 = Kaffer.read(s, "sounds/_Evfer/gir01.aif");

~gir1.playBuf(rate: 5);
~gir1.playBuf(rate: 5, loop: 1);
~gir1.bmul_(1.2).playBuf(rate: 1);



	var in, chain;
	in = PlayBuf.ar(1, bufnum, BufRateScale.kr(bufnum)*rate/1.2, loop: 1);
	chain = FFT({LocalBuf(2048, 2)}.dup(8), in);
	chain = PV_BrickWall(chain, 
		SinOsc.kr(
			rate2 * XLine.kr(1, 15 * [1, 1.6], sustain), 
			Rand(0, pi)
		);
	); 
	Out.ar(out, IFFT(chain) * XLine.kr(2, 0.001, sustain, doneAction: 2)*3) // inverse FFT


*/

Kaffer : Buffer {
	
	var <>bout = 0, <>batt = 0.1, <>bsus = 2.0, <>brls = 2.5, <>bmul = 1.0, <>bloop = false;
	var <>btrig = 0, <>brate = 1.0, <>brate2 = 1.0, <>bstart = 0, <>bend = 1, <>breset = 0, <>bpan = 0;
	

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


	//with PlayBuf SynthDef
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
		
		^SynthDef("kafferPB", { 
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
			chain = FFT({LocalBuf(2048, 2)}.dup(4), player);
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
		
		^SynthDef("kafferPB", { 
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




/*
	play0 { arg  att, sus, rls, mul, trig, rate, start, end, reset, loop, pan, out;
		
		//if (att.notNil) { batt = att }; ->
		// SHORTCUT: 
		
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
			
			env =  EnvGen.ar(Env.new([0, 1, 0.8,  0], [batt, bsus, brls], 'linear', releaseNode: nil), 1, doneAction: 2);
			player = BufRd.ar(
						numChannels,
						bufnum, 
						Phasor.ar(
							btrig, 
							BufRateScale.kr(bufnum) * brate, 
							bstart * BufFrames.kr(bufnum), 
							BufFrames.kr(bufnum) * bend, 
							BufFrames.kr(bufnum) * breset
						),
						loop: bloop
					);
			loop.not.if(FreeSelfWhenDone.kr(player));
			panlayer = Pan4.ar(player, FSinOsc.kr(bpan), FSinOsc.kr(pan), 0.3);
			Out.ar(bout, panlayer * bmul *env);
		}.play(Server.default);
	}
*/

/*	play0 { arg  att = 0.1, sus = 2.0, rls = 3.9, mul = 1, trig = 0, rate = 1, start = 0, end = 1, reset = 0, loop = true, pan = 0, out = 0 ;
		
		batt = att;
		bsus = sus;
		brls = rls;
		bmul = mul;
		btrig = trig;
		brate = rate;
		bstart = start;
		bend = end;
		breset = reset;
		bpan = pan;
		bout = out;
		
		^{ var player, panlayer, env;
			
			env =  EnvGen.ar(Env.new([0, 1, 0.8,  0], [batt, bsus, brls], 'linear', releaseNode: nil), 1, doneAction: 2);
			player = BufRd.ar(
						numChannels,
						bufnum, 
						Phasor.ar(
							trig, 
							BufRateScale.kr(bufnum) * rate, 
							start * BufFrames.kr(bufnum), 
							BufFrames.kr(bufnum) * end, 
							BufFrames.kr(bufnum) * reset
						),
						loop: loop.binaryValue
					);
			loop.not.if(FreeSelfWhenDone.kr(player));
			panlayer =Pan4.ar(player, FSinOsc.kr(pan), FSinOsc.kr(pan), 0.3);
			Out.ar(out, panlayer * mul *env);
		}.play(Server.default);
	}*/
/*
	playUp { arg loop = true;
		^{ var player, panlayer, env;
			
			env =  EnvGen.ar(Env.new([0, 1, 0.8,  0], [att, sus, rls], 'linear', releaseNode: nil), 1, doneAction: 2);
			player = BufRd.ar(
						numChannels,
						bufnum, 
						Phasor.ar(
							trig, 
							BufRateScale.kr(bufnum) * rate*XLine.kr(0.1, 1.9, 4), 
							start * BufFrames.kr(bufnum), 
							BufFrames.kr(bufnum) * end, 
							BufFrames.kr(bufnum) * reset
						),
						loop: loop.binaryValue
					);
			loop.not.if(FreeSelfWhenDone.kr(player));
			panlayer = Pan4.ar(player, FSinOsc.kr(pan), FSinOsc.kr(pan), 0.3);
			Out.ar(out, panlayer * mul *env);
		}.play(Server.default);
	}

	playDown { arg loop = true;
		^{ var player, panlayer, env;
			
			env =  EnvGen.ar(Env.new([0, 1, 0.8,  0], [att, sus, rls], 'linear', releaseNode: nil), 1, doneAction: 2);
			player = BufRd.ar(
						numChannels,
						bufnum, 
						Phasor.ar(
							trig, 
							BufRateScale.kr(bufnum) * rate*XLine.kr(1.9, 0.1, 4), 
							start * BufFrames.kr(bufnum), 
							BufFrames.kr(bufnum) * end, 
							BufFrames.kr(bufnum) * reset
						),
						loop: loop.binaryValue
					);
			loop.not.if(FreeSelfWhenDone.kr(player));
			panlayer = Pan4.ar(player, FSinOsc.kr(pan), FSinOsc.kr(pan), 0.3);
			Out.ar(out, panlayer * mul *env);
		}.play(Server.default);
	}

	playVib { arg loop = true;
		^{ var player, panlayer, env;
			
			env =  EnvGen.ar(Env.new([0, 1, 0.8,  0], [att, sus, rls], 'linear', releaseNode: nil), 1, doneAction: 2);
			player = BufRd.ar(
						numChannels,
						bufnum, 
						Phasor.ar(
							trig, 
							BufRateScale.kr(bufnum) * rate*SinOsc.ar(freq: 3, mul: Line.kr(0, 15, 3), add: 1.0), 
							start * BufFrames.kr(bufnum), 
							BufFrames.kr(bufnum) * end, 
							BufFrames.kr(bufnum) * reset
						),
						loop: loop.binaryValue
					);
			loop.not.if(FreeSelfWhenDone.kr(player));
			panlayer = Pan4.ar(player, FSinOsc.kr(pan), FSinOsc.kr(pan), 0.3);
			Out.ar(out, panlayer * mul *env);
		}.play(Server.default);
	}


*/
/*
~ats1 = Kaffer.read(s, "sounds/_Evfer/ates01.aif");
~ats2 = Kaffer.read(s, "sounds/_Evfer/ates02.aif");
~ats3 = Kaffer.read(s, "sounds/_Evfer/ates03.aif");
~ats4 = Kaffer.read(s, "sounds/_Evfer/ates04.aif");

~kick1 = Kaffer.read(s, "sounds/_Evfer/kick1.aif");
~bass1 = Kaffer.read(s, "sounds/_Evfer/bass01.aif");
~bass2 = Kaffer.read(s, "sounds/_Evfer/bassGen01.aif");
~bass3 = Kaffer.read(s, "sounds/_Evfer/bassStr01.aif");

~citMin = Kaffer.read(s, "sounds/_Evfer/citMin.aif");
~cirMin = Kaffer.read(s, "sounds/_Evfer/cirMin.aif");
~circir1 = Kaffer.read(s, "sounds/_Evfer/circir1.aif");

~dlStr = Kaffer.read(s, "sounds/_Evfer/dlStr.aif");
~dlyStr1 = Kaffer.read(s, "sounds/_Evfer/dlyStrA1.aif");
~dlyStr2 = Kaffer.read(s, "sounds/_Evfer/dlyStrA2.aif");
~dlyStr3 = Kaffer.read(s, "sounds/_Evfer/dlyStrA3.aif");

~fub1 = Kaffer.read(s, "sounds/_Evfer/fub1.aif");

~dran1 = Kaffer.read(s, "sounds/_Evfer/dran01.aif");
~dran2 = Kaffer.read(s, "sounds/_Evfer/dran02.aif");

~brdk1 = Kaffer.read(s, "sounds/_Evfer/bardak1.aif");

~gtr1 = Kaffer.read(s, "sounds/_Evfer/gtr1.aif");
~git1 = Kaffer.read(s, "sounds/_Evfer/git1.aif");

~gir1 = Kaffer.read(s, "sounds/_Evfer/gir01.aif");
~gir2 = Kaffer.read(s, "sounds/_Evfer/gir02.aif");
~gir3 = Kaffer.read(s, "sounds/_Evfer/gir03.aif");

~int1 = Kaffer.read(s, "sounds/_Evfer/int01.aif");
~int2 = Kaffer.read(s, "sounds/_Evfer/int02.aif");
~int3 = Kaffer.read(s, "sounds/_Evfer/int03.aif");
~int4 = Kaffer.read(s, "sounds/_Evfer/int04.aif");
~int5 = Kaffer.read(s, "sounds/_Evfer/int05.aif");
~int6 = Kaffer.read(s, "sounds/_Evfer/int06.aif");

~zil01 = Kaffer.read(s, "sounds/~zkm1/zilA01.aif");
~zil02 = Kaffer.read(s, "sounds/~zkm1/zilA02.aif");
~zil03 = Kaffer.read(s, "sounds/~zkm1/zilA03.aif");
~zil04 = Kaffer.read(s, "sounds/~zkm1/zilA04.aif");




*/

//{ | rate = 1 | BufRd.ar(1, b, LFDNoise1.ar(rate, BufFrames.ir(b))) }
/*	
	| trig = 0, rate = 1, start = 0, end = 1, reset = 0 | 
	BufRd.ar(
		1, 
		b, 
		Phasor.ar(
			trig, 
			BufRateScale.kr(b) * rate, 
			start * BufFrames.kr(b), 
			BufFrames.kr(b) * end, 
			BufFrames.kr(b) * reset
		)
	) 
*/



/*	play0 { arg loop = true, out = 0, mul = 1;
		^{ var player, brate, env;
			
			env =  EnvGen.ar(Env.new([0, 1, 0.8,  0], [att, sus, rls], 'linear', releaseNode: nil), 1, doneAction: 2);
			brate = BufRateScale.kr(bufnum);
			player = PlayBuf.ar(
						numChannels,
						bufnum, 
						brate*rate,
						loop: loop.binaryValue
					)!2;
			loop.not.if(FreeSelfWhenDone.kr(player));
			
			Out.ar(outSet, player * mul *env);
		}.play(Server.default);
	}

	play2 { arg loop = false, mul = 1;
		^{ var player, rate;
			rate = BufRateScale.kr(bufnum);
			player = PlayBuf.ar(
						numChannels,
						bufnum, 
						rate*rateSet,
						loop: loop.binaryValue
					)!2;
			loop.not.if(FreeSelfWhenDone.kr(player));
			player * mul;
		}.play(Server.default);
	}

	play1 { arg loop = false, out = 0, mul = 1;
		^{ var player, rate;
			rate = BufRateScale.kr(bufnum);
			player = PlayBuf.ar(
						numChannels,
						bufnum, 
						rate*rateSet,
						loop: loop.binaryValue
					)!2;
			loop.not.if(FreeSelfWhenDone.kr(player));
			
			Out.ar(outSet, player * mul);
		}.play(Server.default);
	}



	play_mousex { arg loop = false, mul = 1, rate = 1;
		^{ var player, rate;
			rate = BufRateScale.kr(bufnum)*MouseX.kr(0.1, 1.9, 2);
			player = PlayBuf.ar(
						numChannels,
						bufnum, 
						rate*rateSet,
						loop: loop.binaryValue
					)!2;
			loop.not.if(FreeSelfWhenDone.kr(player));
			player * mul;
		}.play(Server.default);
	}

*/


}