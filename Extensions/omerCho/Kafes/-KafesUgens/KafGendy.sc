/*

SynthDef(\gendy01,{|i, k, out, amp = 0.5, gate = 1,
	freqrlp1 = 400, freqrlp2 = 350, 
	attime = 0.2, decaytime = 2, suslev = 4, rls = 1|
	var ses, env, mix, rlpf1, rlpf2, norm, lag;
	
	
	env = EnvGen.ar(Env.new([1, 2.0, 2, 0], [attime, 2, 3], [1, -3, -1]), doneAction:2);
	mix = Mix.new(Gendy3.ar(freq:[430.log/6+6.abs, 419, 546.sin*4, 789]));
	rlpf1 = RLPF.ar(mix, freqrlp1.abs/1.5**0.01.cos, 0.005pi);
	rlpf2 = RLPF.ar(rlpf1, freqrlp2, 0.005pi);
	norm = Normalizer.ar(rlpf2, 0.3);
	lag = Lag.kr(LFNoise2.kr(0.1,1.9),0.5);
	ses = Pan2.ar(norm, lag);

	ses = ses.sin;
	ses = ses*env;
	Out.ar(out, ses* amp);
}).send(s);

(
~ff = ~kA1;

KafGendy.ar(1.1, 0.1, 14.3, 4.8,
	freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
	freqrlp1: ~kA1/2, 
	freqrlp2: ~ff*2,
	mul: 0.4,
	out: [0]
).play;
)
*/


KafGendy : UGen { 



	*ar { arg  att= 0.1, dec = 1.8, sus = 2.1, rls = 2.5, mul = 0.8, loop = 0, freq = #[430, 419, 546, 789], freqrlp1 = 400, freqrlp2 = 350, out = 0;
		
		^SynthDef(\gendy01,{|i, k, gate = 1|
			var ses, env, mix, rlpf1, rlpf2, norm, lag;
			
			
			env = EnvGen.ar(Env.new([0, 0.8, 1.0, 0.8, 0], [att, dec, sus, rls], [-4, -3, -3]), doneAction:2);
			ses = Mix.new(Gendy3.ar(freq:freq));
			ses = RLPF.ar(ses, freqrlp1.abs/2.0**0.01.cos, 0.005pi);
			ses = RHPF.ar(ses, freqrlp2, 0.005pi);
			ses = Limiter.ar(ses, 0.3);
		
			ses = ses.sin;
			ses = PanAz.ar(~pCh,
				ses, 
				SinOsc.kr(SinOsc.kr(0.01).range(0.05, 0.09)).range(-1, 1),
				0.8,
				2
			);
			
			
			ses = ses*env;
			Out.ar(out, ses* mul);
		}).play(Server.default);
		
	}


}

/*
(
fork {
	~ff = ~kA1;
	KafGendy.ar(1.1, 0.1, 4.3, 16.8,
		freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
		freqrlp1: ~kA1/2, 
		freqrlp2: ~ff*2,
		mul: 0.4,
		out: [0,1]
	).play;
	
	9.5.wait;
	
	~ff = ~kA4;
	KafGendy.ar(1.1, 0.1, 4.3, 4.8,
		freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
		freqrlp1: ~kA1/2, 
		freqrlp2: ~ff*2,
		mul: 0.4,
		out: [0,1]
	).play;

	5.5.wait;
	
	~ff = ~kA3;
	KafGendy.ar(1.1, 0.1, 4.3, 4.8,
		freq: [~ff*2, ~ff*3, ~ff*4, ~ff*5], 
		freqrlp1: ~kA1/2, 
		freqrlp2: ~ff*2,
		mul: 0.4,
		out: [0,1]
	).play;

	
};	



)


*/