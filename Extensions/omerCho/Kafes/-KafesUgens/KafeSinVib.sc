/*
KafeSinVib.ar(0.01, 1.1, 5.0, freq:44, vib:1).play;
*/

KafeSinVib : UGen { 



	*ar { arg  att= 0.01, sus = 0.1, rls = 2.5, mul = 1.0, loop = 0, freq = 55, vib=2, out = 0;


		
		
		^SynthDef("sinBass", { 
			var player, depth, vibrato, env;
			
			depth = Line.kr(0, 5, 3);
			
			env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [att, sus, rls], 'linear', loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			
			vibrato = SinOsc.ar(freq: vib, mul: depth, add: freq);
			
			player = SinOsc.ar(vibrato, mul: 0.5);
			Out.ar(out, player *mul *env);
		}).play(~sources);
	}




}