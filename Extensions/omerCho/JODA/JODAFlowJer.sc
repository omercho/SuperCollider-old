/*

JODAFlowJer.load;

*/

JODAFlowJer {
	*load {

	
	SynthDef("flowerJer",{|out, vol = 0.0, dist = 0.0, does = 6, med = 1|
		var in, amp, freq, hasFreq, snd;
		var mx, my;
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
		snd = CombC.ar(LPF.ar(in, 1000), 0.1, (2 * freq).reciprocal, -6).distort * dist*my;
		does.do({
			snd = AllpassN.ar(snd, 0.040, [0.040.rand,0.040.rand], 2)
		});
		Out.ar(out, snd * vol);
	}).send(Server.default);
		
		
///////flower

		~togFlower= OSCresponderNode(nil, '/bufP/togFlow', { |t,r,m| 
			if (~flow.isNil) {
				~flow = Synth.head(~piges,"flowerJer", 
					[
					\out, 0
					]
				);
			}{
				~flow.free;
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