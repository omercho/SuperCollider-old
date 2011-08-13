

JODATapBuf {
	*load{
		var s;
		s = Server.default;
		
		SynthDef(\tapBuf, {|out, bufnum, vol = 0.5, delay1, delay2, rate = 2.9|
			var source, capture, tap, env; 
			
			source= SoundIn.ar(6); //use headphones to avoid feedback
			capture= BufWr.ar(source, bufnum, Phasor.ar(0,1, 0 , BufFrames.ir(bufnum) * rate,1));
			tap = Tap.ar(bufnum, 1, [delay1, delay2]);
			//env = EnvGen.ar(Env.sine, 1.5, timeScale:5, doneAction: 2);
			//tap = CombN.ar(tap, 0.2, 0.2, 3, mul:1.1);
		 
			Out.ar(out, tap*2*vol); //multichannel expansion, so one tap each ear  
		}).add;
		
//////////////////////////OSC		
		~togTap1= OSCresponderNode(nil, '/bufP/togTapA', { |t,r,m| 
			if (~tapBuf1.isNil) {
				~tapBuf1 = Synth.tail(~piges,\tapBuf, 
					[
					\bufnum, ~bufTap, 
					\out, [~revBus, ~dlyBus, ~rlpBus, ~wahBus]
					]
				);
			}{
				~tapBuf1.free;
				~tapBuf1 = nil;
			}
		}).add;
		
		
		~delayA1Spec = ControlSpec(0, 3, \lin);
		~delayA2Spec = ControlSpec(0, 8, \lin);
		
		~dly1Tap = OSCresponderNode(nil, '/bufP/dly1Tap', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~tapBuf1.set(\delay1, ~delayA1Spec.map(n1));
		
		}).add;
		
		~dlyT2ap = OSCresponderNode(nil, '/bufP/dly1Tap', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~tapBuf1.set(\delay2, ~delayA2Spec.map(n1));
		
		}).add;
		
		~set1Tap = OSCresponderNode(nil, '/bufP/push4', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~tapBuf1.set(\delay1, 0.01);
		
		}).add;
		
		~set2Tap = OSCresponderNode(nil, '/bufP/push5', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~tapBuf1.set(\delay2, 0.02);
		
		}).add;
		
		
		~volTap = OSCresponderNode(nil, '/bufP/volTapA', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~tapBuf1.set(\vol, n1);
			 
		}).add;
	}

}



