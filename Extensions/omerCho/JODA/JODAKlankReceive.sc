
/*
KlankReceive.load;
RastMakam.load;
*/


JODAKlankReceive {
	*load {
///////////////////////////////////////

SynthDef("klkOver", {|out = 0, 
	att = 5, sus = 8, rls = 5, lvl = 0.8, pan = 0,
	freqs = #[0,0,0,0,0,0,0,0,0,0,0,0],
	rings = #[0,0,0,0,0,0,0,0,0,0,0,0]|
	
	var e = EnvGen.kr(Env.linen(att, sus, rls, 1, 4), doneAction:2);
	var i = PinkNoise.ar(0.0002);
	//var i = SoundIn.ar(0, 2);
	var z = DynKlank.ar(
		`[freqs, nil, rings],	// specs
		i					// input
	);
	Out.ar(out, Pan2.ar(z*e, pan));
}).send(Server.default);



//	Tags
~klankA01 = Preceive(
	
	\intA1 -> {
		~klk = Synth.head(~piges, "klkOver", [
			[\att,\sus,\rls], [0.1, 1, 3],
			\lvl, 0.8,
			\pan, 0.2,
			
			\freqs,  {~rastA7}.dup(12),
			\rings, {0.1.rrand(3)}.dup(12),
			
			\out, 		~limBus
		]);
		},
	\intA2 -> {
		~klk = Synth.head(~piges, "klkOver", [
			[\att,\sus,\rls], [0.8, 1, 4],
			\lvl, 0.8,
			\pan, 1.0.rand2,
			
			\freqs,  {~rastB4}.dup(12),
			\rings, {0.1.rrand(3)}.dup(12),
			
			\out, 		~limBus
		]);
		},
	\intA3 -> {
		~klk = Synth.head(~piges, "klkOver", [
			[\att,\sus,\rls], [0.8, 1, 4],
			\lvl, 0.6,
			\pan, 1.0.rand2,
			
			\freqs,  {~rastC1}.dup(12),
			\rings, {0.1.rrand(3)}.dup(12),
			
			\out, 		~limBus
		]);
		},
	\intA4 -> {
		~klk = Synth.head(~piges, "klkOver", [
			[\att,\sus,\rls], [0.8, 1, 4],
			\lvl, 0.8,
			\pan, -0.2,
			
			\freqs,  {~rastD2}.dup(12),
			\rings, {0.1.rrand(3)}.dup(12),
			
			\out, 		~limBus
		]);
		},
	\intA5 -> {
		~klk = Synth.head(~piges, "klkOver", [
			[\att,\sus,\rls], [0.8, 1, 4],
			\lvl, 0.8,
			\pan, 1.0.rand2,
			
			\freqs,  {~rastB1}.dup(12),
			\rings, {0.1.rrand(3)}.dup(12),
			\out, 		~limBus
		]);
		}
).play;

//////////////////////////////////////
	}
	*unLoad { 
	}
}

/*

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
JODAFlowJer.load;
JODAFlowMic.load;
JODAKaos.load;
JODANeyDef.load;
)

(
JODAKlankReceive.load;
RastMakam.load;
)




Pdef(\klkA01).play;

(
Pdef(\klkA01, Posc(
	[\msg, \dur ], 
	Pseq([ 
		[\intA1, 6]
	], inf)
	)
);
)

(
Pdef(\klkA01, Posc(
	[\msg, \dur ], 
	Pseq([ 
		[\klk1, 3], [\klk2, 2], [\klk3, 1], [\klk4, 1], [\klk5, 2]
	], inf)
	)
);
)

Pdef(\klkA01).stop;


s.queryAllNodes;

*/