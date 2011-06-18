/*

JODSynths.load;

*/

JODSynths {
	classvar <action;
	*load {

		~rev = Synth.tail(~effe,"reverb", 
			[\in,  ~revBus, \out, 0, \amp, 0.5
			]
		);
		~dly = Synth.tail(~effe,"delay", 
			[\in,  ~dlyBus, \out, 0, \amp, 0.8
			]
		);
		~rlp = Synth.tail(~effe,"rlpf", 
			[\in,  ~rlpBus, \out, 0, 
			\ffreq, 220, \rq, 1.5, \amp, 0.1
			]
		);
		~wah = Synth.tail(~effe,"wah", 
			[\in,  ~wahBus, \out, 0
			]
		);
		~lim = Synth.tail(~effe, "limiter",
			[ \in ,~limBus, \out, 0,  
			\lvl, 0.6, \durt, 0.01
			]
		);

	
	}
	
	*unLoad{
	
		~rev.free;
		~dly.free;
		~rlp.free;
		~wah.free;
		~lim.free;
	
	}
	
}