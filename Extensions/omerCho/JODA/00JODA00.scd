
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


