
(
SynthDef(\pink, { arg out=0, mul = 0.8, freq=440, att = 0.1, sus = 0.02, rls = 0.1, gate = 1;
	var env, source;
		
			
			
		env = EnvGen.ar(Env.new([0, 0.5, 0.4,  0], [att, sus, rls], 'linear', releaseNode: 1), gate, doneAction: 2);
		source = PinkNoise.ar(0.5);
		source = BPF.ar(source, MouseX.kr(55, 3220));
		source = source!2;

		Out.ar(out, source*mul*env);

}).send(Server.default);
)




~pink = Synth(\pink, [\out, 0, \gate, 1]);




(	

f = {
	inf.do{
		var dur =0.6;
		
		~outs.set(\gate, 1);
		dur.wait;
		~outs.set(\gate, 0);
		dur.wait;
		~outs.set(\gate, 1);
		dur.wait;
		~outs.set(\gate, 0);
		dur.wait;
		~outs.set(\gate, 1);
		dur.wait;
		~outs.set(\gate, 0);
		dur.wait;
		~outs.set(\gate, 1);
		dur.wait;


	}
}.fork;

)


(	
~outs = Synth(\help_out, [\out, 0]);
f = {
	inf.do{
		var dur =0.05;
		
		~outs.set(\out, 0);
		dur.wait;
		~outs.set(\out, 1);
		dur.wait;
		~outs.set(\out, 2);
		dur.wait;
		~outs.set(\out, 3);
		dur.wait;
		~outs.set(\out, 4);
		dur.wait;
		~outs.set(\out, 5);
		dur.wait;
		~outs.set(\out, 6);
		dur.wait;
		~outs.set(\out, 7);
		dur.wait;
		~outs.set(\out, 8);
		dur.wait;
		~outs.set(\out, 9);
		dur.wait;
		~outs.set(\out, 10);
		dur.wait;
		~outs.set(\out, 11);
		dur.wait;
		~outs.set(\out, 12);
		dur.wait;
		~outs.set(\out, 13);
		dur.wait;
		~outs.set(\out, 14);
		dur.wait;
		~outs.set(\out, 15);
		dur.wait;
		~outs.set(\out, 16);
		dur.wait;
		~outs.set(\out, 17);
		dur.wait;
		~outs.set(\out, 18);
		dur.wait;
		~outs.set(\out, 19);
		dur.wait;
		~outs.set(\out, 20);
		dur.wait;
		~outs.set(\out, 21);
		dur.wait;
		~outs.set(\out, 22);
		dur.wait;
		~outs.set(\out, 23);
		dur.wait;

	}
}.fork;

)