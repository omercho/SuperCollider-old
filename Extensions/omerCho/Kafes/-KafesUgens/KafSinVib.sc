/*

	SynthDef(\baxx,{|out = 6, amp = 0.1, vol = 0.9, gate = 1,
		freq = 50, pan = 0,
		att = 0.1, dec = 0.005, sus = 0.5, rls = 1.5 |
		
		var env, ses;
		env = EnvGen.ar(Env.adsr(att, dec, sus, rls, 0.5, 1), gate, doneAction:2);
	
		ses = SinOsc.ar(freq,0,amp);
		ses = ses.sin**2/20.abs+ ses;
		ses = DelayL.ar(ses, 0.5, 0.006, 0.5, ses);
		
		Out.ar(out, Pan2.ar(ses, pan) *env  *vol);
	}).send(s);

default args  att= 0.01, sus = 0.1, rls = 2.5, mul = 0.8, loop = 0, freq = 55, vib=4, out = 0;
KafSinVib.ar(0.1, 0.1, 8.0, mul:0.8, freq1: 55, freq2: 57, vib1: 2.1, vib2: 4, out: [0,1]).play;
*/

KafSinVib : UGen { 



	*ar { arg  att= 0.01, sus = 0.1, rls = 2.5, mul = 0.6, loop = 0, freq1 = 55, freq2 = 55, vib1=4, vib2=2, out = 0;


		
		
		^SynthDef("sinBass", { 
			var player, depth, vibrato1, vibrato2, env;
			
			depth = Line.kr(2.1, 4, 3);
			
			env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [att, sus, rls], -4, loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			
			vibrato1 = SinOsc.ar(freq: vib1, mul: depth, add: freq1);
			vibrato2 = SinOsc.ar(freq: vib2, mul: depth, add: freq2);
			
			player = Mix.ar([
				SinOsc.ar(vibrato1, mul: 0.5),
				SinOsc.ar(vibrato2, mul: 0.3)
			]);
			
			player = player.sin**2/20+ player;
			player = DelayL.ar(player, 0.5, 0.006, 0.5, player);
			
			player = PanAz.ar(~pCh,
				player, 
				SinOsc.kr(SinOsc.kr(0.01).range(0.05, 0.09)).range(-1, 1),
				0.8,
				2
			);
			
			Out.ar(out, player *mul *env);
		}).play(~sources);
	}




}