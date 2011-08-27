


/*


(
KafPMO.ar(0.001, 0.02, 0.5, 2.5,
	
	cfreq: 1678,
	mfreq: 1130
		

).play
)
*/

KafPMO : UGen {
	
	
	*ar { |att = 0.01, dec = 0.2, sus = 2, rls = 3, mul = 1.0, cfreq = 555, mfreq = 155, gate = 1, out = 0|
	
		^SynthDef(\pmosc,{
			var env, ses, ses1, penv;
			penv = Env.linen(2, 5, 2);
			env = EnvGen.kr(Env.adsr(att, dec, sus, rls, 1, -1),gate, doneAction: 2);
			ses = LinPan2.ar(EnvGen.ar(penv) *
				PMOsc.ar(cfreq ,mfreq, Line.kr(0.0, 12.0.rand,9),0,0.1), 1.0.rand2);
			ses1 = SinOsc.ar(cfreq/2);
			Out.ar(out, ses * mul* env);
		}).play(~sources);
	
		
	}
		
	
	
}