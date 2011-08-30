
(
z = {
	var sig, freq;
	freq = MouseX.kr(20,12000,\exponential);
	sig = IIRFilter.ar(
		AudioIn.ar([1,2]),
		SinOsc.kr(SinOsc.kr(0.1),1.5pi,1550,1800),
		MouseY.kr(0.01,1,\linear));
	 (CombN.ar(sig, 0.4, [0.4,0.35],2) * 0.4) + (sig * 0.5);
}.play)
z.release

KafesChannels