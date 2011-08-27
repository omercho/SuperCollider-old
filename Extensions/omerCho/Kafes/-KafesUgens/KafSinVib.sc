/*
default args  att= 0.01, sus = 0.1, rls = 2.5, mul = 0.8, loop = 0, freq = 55, vib=4, out = 0;
KafSinVib.ar(1.0, 0.4, 5.0, freq1: 44, freq2: 87, vib: 4.1).play;
*/

KafSinVib : UGen { 



	*ar { arg  att= 0.01, sus = 0.1, rls = 2.5, mul = 0.6, loop = 0, freq1 = 55, freq2 = 55, vib=4, out = 0;


		
		
		^SynthDef("sinBass", { 
			var player, depth, vibrato1, vibrato2, env;
			
			depth = Line.kr(0.1, 5, 3);
			
			env =  EnvGen.ar(
				Env.new([0, 1, sus,  0], [att, 0.8, rls], 'linear', loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			
			vibrato1 = SinOsc.ar(freq: vib, mul: depth, add: freq1);
			vibrato2 = SinOsc.ar(freq: vib, mul: depth, add: freq2);
			
			player = Mix.ar([
				SinOsc.ar(vibrato1, mul: 0.5),
				SinOsc.ar(vibrato2, mul: 0.3)
			]);
			Out.ar(out, player *mul *env);
		}).play(~sources);
	}




}