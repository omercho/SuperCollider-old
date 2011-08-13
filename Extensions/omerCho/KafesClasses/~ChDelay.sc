/*

ChDelay.load;

*/

ChDelay {
	*load {
		var s;
		s = Server.default;
		
			SynthDef("delay", { |out = 0, in = 0, pan = 0, amp =0.8,
				maxdelay = 0.25,  delay = 1.0, decay = 0.05, 
				lvl = 0.9, durt = 0.01|
				var ses;
				ses =  In.ar(in, 2);
				ses = CombN.ar(
						ses,
						maxdelay,
						delay,
						decay, 
						amp
					);
				ses = Limiter.ar( ses, lvl, durt);
				ses = PanAz.ar(
						4, 						// numChans
						ses, 					// in
						SinOsc.kr(0.01, -0.1,0.1), 	// pos
						0.5,						// level
						2.5						// width
					);
				Out.ar(out,  ses);
			}).send(s);
			
			
	//DELAY
	
	//tog
			/*~togFlow= OSCresponderNode(nil, '/outs/togDly', { |t,r,m| 
				if (~dly.isNil) {
				~dly = Synth.after(~piges,"delay", 
					[\in,  ~dlyBus, \out, 0, 
					\amp, 0.8
					]
				);
				}{
					~dly.free;
					~dly = nil;
				}
			}).add;*/
	
			~delayF = OSCresponderNode(nil, '/outs/delay', { |t,r,m| 
				var n1;
				n1 = (m[1]*5);
				~dly.set(\delay, n1);
				}).add;
			~decayF = OSCresponderNode(nil, '/outs/decay', { |t,r,m| 
				var n1;
				n1 = (m[1]*15) +0.1;
				~dly.set(\decay, n1);
				}).add;
			~dlyampF = OSCresponderNode(nil, '/outs/dlyamp', { |t,r,m| 
				var n1;
				n1 = (m[1]*2);
				~dly.set(\amp, n1);
				}).add;
			~dlyMain = OSCresponderNode(nil, '/outs/dlyMain', { |t,r,m|
				~dly.set(\delay, 0, \decay, 3);
			}).add;
			~dly1Set = OSCresponderNode(nil, '/outs/dly1', { |t,r,m|
				~dly.set(\delay, 1, \decay, 3);
			}).add;		
			~dly2Set = OSCresponderNode(nil, '/outs/dly2', { |t,r,m|
				~dly.set(\delay, 2, \decay, 3);
			}).add;		
			~dly3Set = OSCresponderNode(nil, '/outs/dly3', { |t,r,m|
				~dly.set(\delay, 3, \decay, 3);
			}).add;		
			~dly4Set = OSCresponderNode(nil, '/outs/dly4', { |t,r,m|
				~dly.set(\delay, 4, \decay, 3);
			}).add;
	
	
	
	}
	
	*play{
		
		~dly = Synth.after(~piges,"delay", 
					[\in,  ~dlyBus, \out, 0, 
					\amp, 0.0
					]
				);
	
	}
	
}