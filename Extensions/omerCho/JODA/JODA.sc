

/*
JODA.loadBuffers;
*/


JODA {

//------Buffers------//
	*loadBuffers {

		
		~bufA = Buffer.alloc(Server.default, Server.default.sampleRate * 8, 1);
		~bufB = Buffer.alloc(Server.default, Server.default.sampleRate * 8, 1);
		
		~bufIn = Buffer.alloc(Server.default, Server.default.sampleRate * 8, 1);
		~bufTap = Buffer.alloc(Server.default, Server.default.sampleRate * 8, 1);
		
		~bufJer1 = Buffer.alloc(Server.default, Server.default.sampleRate * 8, 1);
		~bufJer2 = Buffer.alloc(Server.default, Server.default.sampleRate * 8, 1);
		
		
	}
	
	*unLoadBuffers { 
		
		~bufA.free;
		~bufB.free;
		
		~bufIn.free;
		~bufTap.free;
		
		~bufJer1.free;
		~bufJer2.free;


	}
	
//-------Groups------//
	*loadGroups {

		
		~piges = Group.head(Server.default);
		~effe = Group.tail(Server.default);
		"groups loaded".postln;
	}
	
	*unLoadGroups { 

		~piges.free;
		~effe.free;
		//~recorders.free;		

	}

//---------Buses-----//
	*loadBuses {
		~limBus = Bus.new(\audio, 20, 2);
		~revBus = Bus.new(\audio, 22, 2);
		~dlyBus = Bus.new(\audio, 24, 2);
		~rlpBus = Bus.new(\audio, 26, 2);
		~wahBus = Bus.new(\audio, 28, 2);
		"buses loaded".postln;

	}
	
	*unLoadBuses { 
		
		~limBus.free;
		~revBus.free;
		~dlyBus.free;
		~rlpBus.free;
		~wahBus.free;
	}


	*loadEffects {
	


		SynthDef("limiter",{ arg out=0, in = 0, lvl = 0.9, durt = 0.01;
			ReplaceOut.ar( out, Limiter.ar( In.ar(in, 2), lvl, durt) )
		}).send(Server.default);
		
		
		SynthDef("reverb", { | out, in = 0, amp=0.05, pan=0.0, 
		roomsize = 10, revtime = 1, damping = 0.2, inputbw = 0.19, spread = 15,
		drylevel = -3, earlylevel = -9, taillevel = -11 |
			var input, ses;
			input = In.ar(in, 2);
			ses = GVerb.ar(
				input,
				roomsize,
				revtime,
				damping,
				inputbw,
				spread,
				drylevel.dbamp,
				earlylevel.dbamp,
				taillevel.dbamp,
				roomsize, amp);
			
			Out.ar(out, Pan2.ar(ses, pan) );
		}).send(Server.default);
			
		SynthDef("delay", { |out = 0, in = 0, maxdelay = 0.25,  delay = 1.0, decay = 0.05, pan = 0, amp =0.5|
			var ses, filt;
			ses =  In.ar(in, 2);
			filt = CombN.ar(
					ses,
					maxdelay,
					delay,
					decay, 
					amp
				);
			Out.ar(out,  Pan2.ar(filt, pan));
		}).send(Server.default);
		
		SynthDef("rlpf",{ |out = 0, amp = 0.8 in = 0, ffreq = 600, rq = 0.1, pan = 0|
			Out.ar( out, Pan2.ar(RLPF.ar( In.ar(in), ffreq, rq, amp), pan))
		}).send(Server.default);
		
		
		SynthDef("wah", { arg out = 0, in = 0, rate = 0.5, amp = 1, pan = 0, cfreq = 1400, mfreq = 1200, rq=0.1, dist = 0.15;
			var zin, zout;
			zin = In.ar(in, 2);
			cfreq = Lag3.kr(cfreq, 0.1);
			mfreq = Lag3.kr(mfreq, 0.1);
			rq   = Ramp.kr(rq, 0.1);
			zout = RLPF.ar(zin, LFNoise1.kr(rate, mfreq, cfreq), rq, amp).distort * dist;
			Out.ar( out , Pan2.ar(zout, pan) ); 
		}).send(Server.default);
		
		"effects SynthDefs loaded".postln;

////////////////////////////////////////EffectsOSC///////////////////////////////////////////////
	//REVERB
		~roomF = OSCresponderNode(nil, '/bufP/room', { |t,r,m| 
			var n1;
			n1 = (m[1]*300);
			~rev.set(\roomsize, n1);
			}).add;

		~room2 = OSCresponderNode(nil, '/bufP/room2', { |t,r,m| 
			var n1;
			n1 = (m[1]*3);
			~rev.set(\roomsize, n1);
			}).add;

		~revtimeF = OSCresponderNode(nil, '/bufP/revtime', { |t,r,m| 
			var n1;
			n1 = (m[1]*100);
			~rev.set(\revtime, n1);
			}).add;

		~dampF = OSCresponderNode(nil, '/bufP/damp', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			~rev.set(\damping, n1);
			}).add;			

		~revampF = OSCresponderNode(nil, '/bufP/revamp', { |t,r,m| 
			var n1;
			n1 = (m[1]) ;
			~rev.set(\amp, n1);
		}).add;
		
		~revmain = OSCresponderNode(nil, '/bufP/revmain', { |t,r,m|
			~rev.set(
				\revtime, 20, \roomsize, 120, \damping, 0.9, 
				\inputbw, 0.3, \drylevel -9, 
				\earlylevel, -10, \taillevel, -10.1, \amp, 0.0005
			);
		}).add;
		~bath = OSCresponderNode(nil, '/bufP/bath', { |t,r,m|
			~rev.set(
				\roomsize, 5, \revtime, 0.6, \damping, 0.62,
				\earlylevel, -11, \taillevel, -13
			);
		}).add;
		~church = OSCresponderNode(nil, '/bufP/church', { |t,r,m|
				~rev.set(
					\roomsize, 80, \revtime, 4.85, \damping, 0.41, 
					\inputbw, 0.19, \drylevel -3, 
					\earlylevel, -9, \taillevel, -11
				);
		}).add;
		~cathedral = OSCresponderNode(nil, '/bufP/cath', { |t,r,m|
				~rev.set(
					\roomsize, 243, \revtime, 1, \damping, 0.1, 
					\inputbw, 0.34, \drylevel -3, 
					\earlylevel, -11, \taillevel, -9
				);
		}).add;
		~canyon = OSCresponderNode(nil, '/bufP/canyon', { |t,r,m|
				~rev.set(
					\roomsize, 300, \revtime, 103, \damping, 0.43, 
					\inputbw, 0.51, \drylevel -5, 
					\earlylevel, -26, \taillevel, -20
				);
		}).add;		
		
		
		//DELAY
		~delayF = OSCresponderNode(nil, '/bufP/delay', { |t,r,m| 
			var n1;
			n1 = (m[1]*5);
			~dly.set(\delay, n1);
			}).add;
		~decayF = OSCresponderNode(nil, '/bufP/decay', { |t,r,m| 
			var n1;
			n1 = (m[1]*15) +0.1;
			~dly.set(\decay, n1);
			}).add;
		~dlyampF = OSCresponderNode(nil, '/bufP/dlyamp', { |t,r,m| 
			var n1;
			n1 = (m[1]*2);
			~dly.set(\amp, n1);
			}).add;
		~dlyMain = OSCresponderNode(nil, '/bufP/dlymain', { |t,r,m|
			~dly.set(\delay, 0, \decay, 3);
		}).add;
		~dly1Set = OSCresponderNode(nil, '/bufP/dly1', { |t,r,m|
			~dly.set(\delay, 1, \decay, 3);
		}).add;		
		~dly2Set = OSCresponderNode(nil, '/bufP/dly2', { |t,r,m|
			~dly.set(\delay, 2, \decay, 3);
		}).add;		
		~dly3Set = OSCresponderNode(nil, '/bufP/dly3', { |t,r,m|
			~dly.set(\delay, 3, \decay, 3);
		}).add;		
		~dly4Set = OSCresponderNode(nil, '/bufP/dly4', { |t,r,m|
			~dly.set(\delay, 4, \decay, 3);
		}).add;		
		
		//RLPF
		~rlpfreqF = OSCresponderNode(nil, '/bufP/rlpfreq', { |t,r,m| 
			var n1;
			n1 = (m[1]*5400)+ 20 ;
			~rlp.set(\ffreq, n1);
		}).add;		
		~rlprqF = OSCresponderNode(nil, '/bufP/rlprq', { |t,r,m| 
			var n1;
			n1 = (m[1]*10)-2 ;
			~rlp.set(\rq, n1);
		}).add;		
		~rlpampF = OSCresponderNode(nil, '/bufP/rlpamp', { |t,r,m| 
			var n1;
			n1 = (m[1]*4) ;
			~rlp.set(\amp, n1);
		}).add;		
		
		~limlevF = OSCresponderNode(nil, '/bufP/limlev', { |t,r,m| 
			var n1;
			n1 = (m[1]) ;
			~lim.set(\lvl, n1);
		}).add;
		~limdurtF = OSCresponderNode(nil, '/bufP/limdurt', { |t,r,m| 
			var n1;
			n1 = (m[1]*2) ;
			~lim.set(\durt, n1);
		}).add;		
		
		~distortF = OSCresponderNode(nil, '/bufP/distort', { |t,r,m| 
			var n1;
			n1 = (m[1]*50) ;
			~wah.set(\dist, n1);
		}).add;		
		~wahrqF = OSCresponderNode(nil, '/bufP/wahrq', { |t,r,m| 
			var n1;
			n1 = (m[1]*20)-5 ;
			~wah.set(\rq, n1);
		}).add;
		~wahampF = OSCresponderNode(nil, '/bufP/wahamp', { |t,r,m| 
			var n1;
			n1 = (m[1]*6) ;
			~wah.set(\amp, n1);
		}).add;

		"effects OSC loaded".postln;

	}


	*playEffects {

		~rev = Synth.tail(~effe, "reverb", 
			[\in,  ~revBus, \out, ~limBus, \amp, 0.5
			]
		);
		~dly = Synth.tail(~effe,"delay", 
			[\in,  ~dlyBus, \out, ~limBus, \amp, 0.0
			]
		);
		~rlp = Synth.tail(~effe,"rlpf", 
			[\in,  ~rlpBus, \out, ~limBus, 
			\ffreq, 220, \rq, 1.5, \amp, 0.1
			]
		);
		~wah = Synth.tail(~effe,"wah", 
			[\in,  ~wahBus, \out, ~limBus
			]
		);
		~lim = Synth.tail(~effe, "limiter",
			[ \in ,~limBus, \out, 0,  
			\lvl, 0.6, \durt, 0.01
			]
		);
		"effects are playing".postln;
	
	}
	
	*stopEffects {
	
		~rev.free;
		~dly.free;
		~rlp.free;
		~wah.free;
		~lim.free;
	
	}


	*loadInstruments {
	
		JODABaxx.load;
		JODAFlowJer.load;
		JODAFlowMic.load;
		JODAKaos.load;
		JODAMicPat.load;
		JODANeyDef.load;
		JODARecs.load;
		JODATapBuf.load;
	
	}





}