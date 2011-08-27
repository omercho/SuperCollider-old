/*
KafSin.ar(0.01, 0.1, 5.0, freq:44).play;


*/

KafSin : UGen { 



	*ar { arg  att= 0.01, sus = 0.1, rls = 2.5, mul = 1.0, loop = 0, freq = 55, out = 0;


		
		
		^SynthDef("sinBass", { 
			var player, env;
			
			env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [att, sus, rls], 'linear', loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			player = SinOsc.ar([freq], mul:0.6);
			Out.ar(out, player.sum * mul *env);
		}).play(~sources);
	}




}