/*

ChRlpf.load;

*/

ChRlpf {
	*load {
	var s;
	s = Server.default;
	
		SynthDef("rlpf",{ |out = 0, amp = 0.8 in = 0, pan = 0,
			ffreq = 600, rq = 0.1, lagup=1.2, lagdown=1.5, 
			lvl = 0.9, durt = 0.01|
			var ses;
			ses =  In.ar(in, 2);
			ses = RLPF.ar( 
				ses, 
				Lag2UD.kr( // lag the frequency
					ffreq,
					lagup,
					lagdown
				), 
				rq, 
				amp
			);
			ses = Limiter.ar( ses, lvl, durt);
			ses = PanAz.ar(
					4, 						// numChans
					ses, 					// in
					SinOsc.kr(MouseX.kr(4.0,0.001, 'linear'), -0.1,0.1), 	// pos
					0.5,						// level
					3.0						// width
				);
			
			Out.ar( out, ses)
		}).send(s);
		
		
//RLPF
//tog
		/*~togFlow= OSCresponderNode(nil, '/outs/togRlp', { |t,r,m| 
			if (~rlp.isNil) {
				~rlp = Synth.after(~piges,"rlpf", 
					[
					\in,  ~rlpBus, \out, 0, 
					\ffreq, 220, \rq, 1.5, \amp, 0.1
					]
				);
			}{
				~rlp.free;
				~rlp = nil;
			}
		}).add;*/

		~rlpfreqF = OSCresponderNode(nil, '/outs/rlpfreq', { |t,r,m| 
			var n1;
			n1 = (m[1]*5400)+ 20 ;
			~rlp.set(\ffreq, n1);
		}).add;		
		~rlprqF = OSCresponderNode(nil, '/outs/rlprq', { |t,r,m| 
			var n1;
			n1 = (m[1]*10)-2 ;
			~rlp.set(\rq, n1);
		}).add;		
		~rlpampF = OSCresponderNode(nil, '/outs/rlpamp', { |t,r,m| 
			var n1;
			n1 = (m[1]*4) ;
			~rlp.set(\amp, n1);
		}).add;
	
		~rlpMain = OSCresponderNode(nil, '/outs/rlpMain', { |t,r,m|
			~rlp.set(\ffreq, ~rastC3, \rq, 1.53);
		}).add;

		~rlpSet1 = OSCresponderNode(nil, '/outs/rlp1', { |t,r,m|
			~rlp.set(
				\ffreq, 2400, \rq, 9.23
			);
		}).add;

		~rlpSet2 = OSCresponderNode(nil, '/outs/rlp2', { |t,r,m|
			~rlp.set(
				\ffreq, 2401, \rq, 9.27
			);
		}).add;

		~rlpSet3 = OSCresponderNode(nil, '/outs/rlp3', { |t,r,m|
			~rlp.set(
				\ffreq, 2410, \rq, 9.35
			);
		}).add;

	}

/*
~rlp.set(\ffreq, ~rastC3, \rq, 1.53);
*/
	
	*play{
		~rlp = Synth.after(~piges,"rlpf", 
					[
					\in,  ~rlpBus, \out, 0, 
					\ffreq, 220, \rq, 1.5, \amp, 0.0
					]
				);
	
	}
	
}



/*
(
			~rlp.set(
				\ffreq, 2388.5, \rq, 0.00234
			);
)
*/