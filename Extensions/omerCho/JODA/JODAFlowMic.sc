/*

JODAFlowMic.load;

*/

JODAFlowMic {
	
	*load {

	
	SynthDef("flowerMic",{|out, vol = 0.0, dist = 0.0, does = 6, med = 1,
						att = 0.4, dec = 0.5, sus = 0.5, rls = 1.5, gate = 1|
		var in, amp, env, freq, hasFreq, snd;
		var mx, my;
		
		env = EnvGen.ar(Env.adsr(att, dec, sus, rls, 0.5, 1), gate, doneAction:2);
		
		mx = MouseX.kr(1,118);
		my = MouseY.kr(0,3);
		in = Mix.new(SoundIn.ar(0));
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
		snd = CombC.ar(LPF.ar(in, 1000), 0.1, (2 * freq).reciprocal, -6).distort * dist *2;
		does.do({
		snd = AllpassN.ar(snd, 0.040, [0.040.rand,0.040.rand], 2)
		});
		Out.ar(out, snd *env * vol);
	}).send(Server.default);
		
		
//-----OSC------//

		~togFlowerMic.remove; ~togFlowerMic= OSCresponderNode(nil, '/bufP/togMicFlow', { |t,r,m| 
			if (m[1] == 1) {
				~flowMic = Synth.head(~piges,"flowerMic", 
					[
					\out, [~revBus]
					]
				);
			}{
				~flowMic.free;
				~flowMic = nil;
			}
		}).add;

		~distortFlowMicSpec = ControlSpec(0.0, 1.0, \lin);
		~distFlowMic = OSCresponderNode(nil, '/bufP/distAmpMic', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~flowMic.set(\vol, ~distortFlowMicSpec.map(n1));
		
		}).add;			
		
		~medianFlowMicSpec = ControlSpec(0.0, 0.5, \lin);
		~medFlowMic = OSCresponderNode(nil, '/bufP/medianMic', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~flowMic.set(\dist, ~medianFlowMicSpec.map(n1));
		
		}).add;

		~doesFlowMicSpec = ControlSpec(1, 8, \lin);
		~doesFlowMic = OSCresponderNode(nil, '/bufP/doesMic', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~flowMic.set(\does, ~doesFlowMicSpec.map(n1));
		
		}).add;


	

	
	}
	
	*unLoad{
	
	
	}
	
}