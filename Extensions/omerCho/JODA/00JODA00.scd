
(
f = {
	"1 of 3 loding".postln;
	JODA.loadGroups;
	JODA.loadBuses;
	JODA.loadEffects;
	1.0.wait;
	
	"2 of 3 loading".postln;
	JODA.playEffects;
	0.5.wait;
	
	"3 of 3 loading".postln;
	JODABaxx.load;
	
	JODAFlowMic.load;
	JODAFlowJer.load;
	
	
	
	JODAKaos.load;
	JODANeyDef.load;
	0.5.wait;
	
	JODAIndust.load;
	"JODA is ready".postln;
	
};
f.fork;
)


(
JODA.loadGroups;
JODA.loadBuses;
JODA.loadEffects;
)
(
JODA.playEffects;
)
(
JODABaxx.load;

JODAFlowMic.load;
JODAFlowJer.load;

JODAKaos.load;
JODANeyDef.load;
)

(
JODAKlankReceive.load;
RastMakam.load;
)





SynthDef(\indust, {|out = 0, vol = 0.2, att = 0.01, sus = 1.1, rls = 5.1, gate=1, dist = 0.5, loop=0, sIn = 0,
				freqs = #[0,0,0,0,0,0,0,0,0,0,0,0], rings = #[0,0,0,0,0,0,0,0,0,0,0,0] |
		var  env, mix, ses, outdc, rek, n=8;
		env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [att, sus, rls], 4, loop, releaseNode: 1), 
				gate, 
				doneAction: 2
			);
		
		
		
		rek = LFNoise0.kr(rrand(0.4,1.0), 1,1).squared * MouseX.kr(0, 1);
		mix = Klank.ar(
			`[freqs,nil,rings], Blip.ar(rek, [rrand(2,5),rrand(2,5)], vol) * Amplitude.kr(SoundIn.ar(sIn, 0.8));
		).fold2(0.12).cubed * 12;
		mix = Mix.arFill(3, { CombL.ar(mix, 0.1, 0.03.linrand, 4.0.linrand) });
		ses = mix.distort * dist;
		8.do({ses = AllpassN.ar(ses, 0.05, [0.05.rand, 0.05.rand], 3) }) ;
		outdc = LeakDC.ar(ses);
		Out.ar(out, outdc *env);
}).send(Server.default);



~ind1 = Synth("indust", [
	[\att,\sus,\rls], [0.8, 1, 4],
	
	\freqs, {~kA5}.dup(12),
	\rings, {0.01.rrand(3)}.dup(12),
	
	\sIn, 0,
	\out, ~limBus
]);

~ind1.release(2);


~ind2 = Synth("indust", [
	[\att,\sus,\rls], [0.8, 1, 4],
	
	\freqs, {~kA1}.dup(12),
	\rings, {0.01.rrand(3)}.dup(12),
	\sIn, 2,
	\out, 0
]);

~ind2.release(2);




//////

Ndef('x1',{
	x = Ndef('x1').ar + 1.01;
	a = BPF.ar(x, 8**Latch.ar(x, Saw.ar(x*0.2pi)) *1040,0.1).sin;
	9.do{ a = AllpassN.ar(a,0.2,{0.2.rand}!2.9)};
	a+a.mean+a.product
	}
).play

Ndef('x1').stop;



///////






b = NetAddr.new("192.0.0.21", 57120); 

SynthDef("help-<= trig", {
	SendTrig.kr(Amplitude.kr(SoundIn.ar(0)) <= 0.05);
}).play(s);

// responder to trigger synth
OSCresponderNode(s.addr,'/tr',{b.sendMsg("/mertrig", 53,3);}).add;


