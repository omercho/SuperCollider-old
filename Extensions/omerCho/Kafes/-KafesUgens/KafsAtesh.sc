/*
KafeSin.ar(0.01, 0.1, 5.0, freq:44).play;
*/

KafAtesh : UGen { 



	*ar { arg  att= 0.01, sus = 0.1, rls = 2.5, mul = 1.0, loop = 0, freq = 55, out = 0;


		
		
		^SynthDef("sinBass", { 
			var player, env;
			
			env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [att, sus, rls], 'linear', loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			player = SinOsc.ar([freq]);
			Out.ar(out, player.sum * mul *env);
		}).play(~sources);
	}




}

/*

(
a=SynthDef(\atesh, {|i, k, out, ffreq = 1250.0|
	var ses, ses0, ses1, ses2, ses3, lag, lag2;
	
	x = 1459.0.rand;
	p = Trig.ar(Saw.ar(x),0.6.tanh);
	c = SinOsc.ar(p*x.max(2.2));
	d = Dust.kr(1.1/0.2**i);
	
	lag2 = Lag2.kr(LFDNoise0.kr(0.1).range(0.2, 1.5), SinOsc.kr(0.1).range(0.2, 2.5));
	lag = Lag2.kr(LFDNoise0.kr(0.1).range(0.2, 1.5), SinOsc.kr(0.1).range(0.2, 2.5));
	
	ses = {
		z = {
			y = {
				var se;				
				se = SinOsc.ar(
				 	180* [0.5,1.2, 1.5]*x*k, //freq
				 		SinOsc.kr(
					 		x*(d*d*x/4).sin, //freq
					 		LFDNoise0.kr(1.1).range(0.0, 0.1), //phase
					 		LFDNoise0.kr(0.1).range(0.2, 1.5), // decayTime
					 		LFDNoise0.kr(0.1).range(0.6, 0.8) // mul
					 	),
					 SinOsc.ar(5.1/(-0.1)+8.1*c,k*1.9)
				);
				se = Ringz.ar(se, ffreq.rand, 0.01);
			}!1.01;
			y = y.sin/4
		}!1.1;
		z = z.sin/3;
	};
	ses0 = RLPF.ar((ses/4), ffreq.rand, 0.4);
	
	ses1 = GVerb.ar(GrainIn.ar(2,p*c,c/2,z,p*z,-1),2, mul:0.9)*ses0;
	
	ses2 = ses1+ses0.sin*8;
	
	ses3 = Pan2.ar(ses2, SinOsc.kr(1).range(-1.0, 1.0));
	
	Out.ar(out, ses3+ses1);

}).play;
)

a.set(\ffreq, 200);

*/