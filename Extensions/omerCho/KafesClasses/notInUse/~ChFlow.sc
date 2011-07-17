/*

ChFlow.load;

*/

ChFlow {
	classvar <action;
	*load {
	var s;
	s = Server.default;
	
	SynthDef("flower",{|out, in = 0, vol = 0.0, dist = 0.0, does = 6, med = 1|
		var input, amp, freq, hasFreq, snd;
		var mx, my;
		mx = MouseX.kr(1,118);
		my = MouseY.kr(0,3);
		input = Mix.new(In.ar(in, 2));
		amp = Amplitude.kr(input, 0.05, 0.05);
		# freq, hasFreq = Pitch.kr(
							input,
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
		snd = CombC.ar(LPF.ar(input, 1000), 0.1, (2 * freq).reciprocal, -6).distort * dist*my;
		6.do({
		snd = AllpassN.ar(snd, 0.040, [0.040.rand,0.040.rand], 2)
		});
		Out.ar(out, snd * vol);
	}).send(s);
		
		
///////flowerMic

		~togFlow=�OSCresponderNode(nil,�'/outs/togFlow', {�|t,r,m|�
			if (~flow.isNil) {
				~flow = Synth.after(~piges,"flower", 
					[
					\in, ~flowBus,
					\out, 0
					]
				);
			}{
				~flow.free;
				~flow = nil;
			}
		}).add;

		
		
		

		~distortFlowSpec = ControlSpec(0.0, 1.0, \lin);
		~distFlowMic =�OSCresponderNode(nil,�'/outs/distAmp', {�|t,r,m|�
			var�n1;
			n1�= (m[1]);
			
			~flow.set(\vol, ~distortFlowSpec.map(n1));
		
		}).add;		


/*(		~distortFlowMicSpec = ControlSpec(0, 1, \lin);
		~distFlowMic =�OSCresponderNode(nil,�'/outs/distAmpMic', {�|t,r,m|�
			var�n1;
			n1�= (m[1]);
			
			~flow.set(\dist, ~distortFlowSpec.map(n1));
		
		}).add;)*/
		
		~medianFlowSpec = ControlSpec(0.0, 0.5, \lin);
		~medFlowMic =�OSCresponderNode(nil,�'/outs/median', {�|t,r,m|�
			var�n1;
			n1�= (m[1]);
			
			~flow.set(\dist, ~medianFlowSpec.map(n1));
		
		}).add;

		~doesFlowSpec = ControlSpec(1, 8, \lin);
		~doesFlowMic =�OSCresponderNode(nil,�'/outs/does', {�|t,r,m|�
			var�n1;
			n1�= (m[1]);
			
			~flow.set(\does, ~doesFlowSpec.map(n1));
		
		}).add;

	
	
	
	}
	
	*unLoad{
	
	
	}
	
}