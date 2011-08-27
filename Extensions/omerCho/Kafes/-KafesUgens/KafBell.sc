/*
fork{
	20.do{|i, frq = 2240, dur = 0.1|
		var freqs = frq + (12 *( i % 20)); 
		
		KafBell.ar(freq: freqs, out: [~ch1, ~ch2, ~ch3, ~ch4].choose).play;
		( dur + (0.1*(i%10)) ).yield;
	}
}
*/

KafBell : UGen {

	*ar { |out = 0, freq = 431, accent = 1, amp = 0.4, decayScale = 1.01|
		
		^SynthDef(\bell, { 
			var	exc = PinkNoise.ar(amp)
					* Decay2.kr(Impulse.kr(0), 0.01, 0.05),
				sig = Klank.ar(`[
					[freq, freq*2, freq*3.2, freq*4],
					1 ! 4,
					{ ExpRand(0.1, 0.4) } ! 4
				], exc, freqscale: accent + 1, decayscale: decayScale);
			DetectSilence.ar(sig, doneAction: 2);
			Out.ar(out, sig)
		});
	
	}
	
}


/*
fork{
	inf.do{|i|
		SynthDef(\bell, { |out, freq = 431, accent = 1, amp = 0.4, decayScale = 1.01|
			var	exc = PinkNoise.ar(amp)
					* Decay2.kr(Impulse.kr(0), 0.01, 0.05),
				sig = Klank.ar(`[
					[freq, freq*2, freq*3.2, freq*4],
					1 ! 4,
					{ ExpRand(0.1, 0.4) } ! 4
				], exc, freqscale: accent + 1, decayscale: decayScale);
			DetectSilence.ar(sig, doneAction: 2);
			Out.ar(out, sig ! 2)
		}).play;
		( 0.05 + (0.1*(i%10)) ).wait;
	}
}


(
var r;
r = Routine.new({
	16.do({ arg i; 
		
		Synth(\bleep, [ \note, 36+(3*i) ]);
		0.25.yield;  //  yield and wait mean the same thing 
	
	});
});

r.play;
)



inf.do can be used to keep going forever; but you must be very careful never to miss out some positive time .wait command. Because otherwise, the loop will go infinitely fast and SuperCollider (and possibly also your computer) will crash. 

(
var r;
r = Routine.new({
	inf.do({ arg i; 
		
		Synth(\bleep, [ \note, 36+(3*(i%10)) ]); //added %10 to stop it going up forever
		0.25.wait;   //do not miss me out!
	
	});
});

r.play;
)

*/