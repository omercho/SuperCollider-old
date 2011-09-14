/*

JODAFlowJer.load;

*/

JODAFlowJer {
	*load {

	
	SynthDef("flowerJer",{|out, vol = 0.0, dist = 0.0, does = 6, med = 1,
						att = 0.4, dec = 0.5, sus = 0.5, rls = 1.5, gate = 1 |
		var in, env, amp, freq, hasFreq, snd;
		var mx, my;
		
		env = EnvGen.ar(Env.adsr(att, dec, sus, rls, 0.5, 1), gate, doneAction:2);
		
		mx = MouseX.kr(1,118);
		my = MouseY.kr(0,3);
		in = Mix.new(SoundIn.ar(1));
		amp = Amplitude.kr(in, 0.05, 0.05);
		# freq, hasFreq = Pitch.kr(
							in,
							initFreq: ~c4, 
							minFreq: ~c1,
							maxFreq: 4000.0,
							execFreq: 100.0,
							maxBinsPerOctave: 16,
							median: med,
							ampThreshold: 0.02, 
							peakThreshold: 0.5,
							downSample: 1
						);
		snd = CombC.ar(LPF.ar(in, 1000), 0.1, (2 * freq).reciprocal, -6).distort * dist* 2;
		does.do({
			snd = AllpassN.ar(snd, 0.040, [0.040.rand,0.040.rand], 2)
		});
		Out.ar(out, snd *env * vol);
	}).send(Server.default);
		
		
///////flower

		~togFlower= OSCresponderNode(nil, '/bufP/togFlow', { |t,r,m| 
			if (m[1] == 1) {
				~flow = Synth.head(~piges,"flowerJer", 
					[
					\out, [~revBus]
					]
				);
			}{
				~flow.release(4);
				~flow = nil;
			}
		}).add;
		
		
		
		~medianFlowSpec = ControlSpec(0.0, 0.5, \lin);
		~doesFlowSpec = ControlSpec(1, 8, \lin);
		
		
		~distortFlowSpec = ControlSpec(0.0, 1.0, \lin);
		~distFlow = OSCresponderNode(nil, '/bufP/distAmpJer', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~flow.set(\vol, ~distortFlowSpec.map(n1));
		
		}).add;
		
		~medFlow = OSCresponderNode(nil, '/bufP/median', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~flow.set(\dist, ~distortFlowSpec.map(n1));
		
		}).add;

		~doesFlow = OSCresponderNode(nil, '/bufP/doesJer', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~flow.set(\does, ~doesFlowSpec.map(n1));
		
		}).add;

	
	
	
	}
	
	*unLoad{
	
	
	}
	
}