~piges = Group.head(s);
~effe = Group.head(s);


~dlyBus = Bus.new(\audio, 28, 2);
~rlpBus = Bus.new(\audio, 30, 2);
~wahBus = Bus.new(\audio, 32, 2);

~forGal1 = Bummer.read(s, "sounds/deneme1p1.aif");


~forGal1.bout_(~wahBus).bufRd;





//MainBus Ready

~mainBus = Bus.new(\audio, 22, 2);

		SynthDef("mainVolCtrl", { |out1, out2,  out3, out4, out5, 
			in = 0, pan = 0, amp = 0.0|
			var ses;
			ses =  In.ar(in, 2);
			ses = Pan2.ar(ses, pan);
			/*ses =  PanAz.ar(
					2, 						// numChans
					ses, 					// in
					SinOsc.kr(MouseX.kr(4.0,0.001, 'linear'), -0.1,0.1), // pos
					0.5,						// level
					3.0						// width
				);*/
			Out.ar([out1, out2, out3, out4, out5], ses*amp);
		}).send(s);


		~mainVolF = OSCresponderNode(nil, '/outs/pigesVol', { |t,r,m| 
			var n1;
			n1 = (m[1]) ;
			~main.set(\amp, n1);
		}).add;

		
		~main = Synth.tail(~piges, "mainVolCtrl",
			[ 
			\in ,~mainBus, 
			\out1,  0
			]
		);


//LimBus Ready

~limBus = Bus.new(\audio, 24, 2);

 {

	
		SynthDef("limiter",{ arg out=0, in = 0, lvl = 0.0, durt = 0.01;
			var src;
			src = Limiter.ar( In.ar(in, 2), lvl, durt);
			src = PanAz.ar(
					4, 						// numChans
					src, 					// in
					SinOsc.kr(MouseX.kr(0.02, 8, 'exponential')), // pos
					0.5,						// level
					2.5						// width
				);
			Out.ar( out, src )
		}).send(s);
		
			
		
		~limlevF = OSCresponderNode(nil, '/outs/limlev', { |t,r,m| 
			var n1;
			n1 = (m[1]*2) ;
			~lim.set(\lvl, n1);
		}).add;	
	
	
	}
	
	{
		~lim = Synth.after(~piges, "limiter",
			[ \in ,~limBus, \out, 0 ]
		);
	
	}
	



//RevBus Ready

~revBus = Bus.new(\audio, 26, 2);

 {


			
			SynthDef("reverb", { | out, in = 0, amp=0.8, pan=0.0, 
				roomsize = 10, revtime = 1, damping = 0.2, inputbw = 0.19, spread = 15,
				drylevel = -3, earlylevel = -9, taillevel = -11,
				lvl = 0.9, durt = 0.01 |
				
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
					roomsize, 
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
				Out.ar(out, ses );
			}).send(s);

	
			~roomF = OSCresponderNode(nil, '/outs/room', { |t,r,m| 
				var n1;
				n1 = (m[1]*300);
				~rev.set(\roomsize, n1);
				}).add;
	
			~room2 = OSCresponderNode(nil, '/outs/room2', { |t,r,m| 
				var n1;
				n1 = (m[1]*3);
				~rev.set(\roomsize, n1);
				}).add;
	
			~revtimeF = OSCresponderNode(nil, '/outs/revtime', { |t,r,m| 
				var n1;
				n1 = (m[1]*100);
				~rev.set(\revtime, n1);
				}).add;
	
			~dampF = OSCresponderNode(nil, '/outs/damp', { |t,r,m| 
				var n1;
				n1 = (m[1]);
				~rev.set(\damping, n1);
				}).add;			
	
			~revampF = OSCresponderNode(nil, '/outs/revamp', { |t,r,m| 
				var n1;
				n1 = (m[1]) ;
				~rev.set(\amp, n1);
			}).add;
			
			~revmain = OSCresponderNode(nil, '/outs/revMain', { |t,r,m|
				~rev.set(
					\revtime, 20, \roomsize, 120, \damping, 0.9, 
					\inputbw, 0.3, \drylevel -9, 
					\earlylevel, -10, \taillevel, -10.1, \amp, 0.005
				);
			}).add;
			~bath = OSCresponderNode(nil, '/outs/bath', { |t,r,m|
				~rev.set(
					\roomsize, 5, \revtime, 0.6, \damping, 0.62,
					\earlylevel, -11, \taillevel, -13
				);
			}).add;
			~church = OSCresponderNode(nil, '/outs/church', { |t,r,m|
					~rev.set(
						\roomsize, 80, \revtime, 4.85, \damping, 0.41, 
						\inputbw, 0.19, \drylevel -3, 
						\earlylevel, -9, \taillevel, -11
					);
			}).add;
			~cathedral = OSCresponderNode(nil, '/outs/cath', { |t,r,m|
					~rev.set(
						\roomsize, 243, \revtime, 1, \damping, 0.1, 
						\inputbw, 0.34, \drylevel -3, 
						\earlylevel, -11, \taillevel, -9
					);
			}).add;
			~canyon = OSCresponderNode(nil, '/outs/canyon', { |t,r,m|
					~rev.set(
						\roomsize, 300, \revtime, 103, \damping, 0.43, 
						\inputbw, 0.51, \drylevel -5, 
						\earlylevel, -26, \taillevel, -20
					);
			}).add;
	
	
	
	}
	
{
		
		~rev = Synth.after(~piges,"reverb", 
					[
					\in,  ~revBus, \out, 0, 
					\amp, 0.0
					]
				);
	
	
	}
	
}

//DlyBus Ready

 {

		
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
			

	
			~delayF = OSCresponderNode(nil, '/outs/delay', { |t,r,m| 
				var n1;
				n1 = (m[1]*5);
				~dly.set(\delay, n1);
				}).add;
			~decayF = OSCresponderNode(nil, '/outs/decay', { |t,r,m| 
				var n1;
				n1 = (m[1]*25) +0.1;
				~dly.set(\decay, n1);
				}).add;
			~dlyampF = OSCresponderNode(nil, '/outs/dlyamp', { |t,r,m| 
				var n1;
				n1 = (m[1]*2);
				~dly.set(\amp, n1);
				}).add;
			~dlyMain = OSCresponderNode(nil, '/outs/dlyMain', { |t,r,m|
				~dly.set(\delay, 0);
			}).add;
			~dly1Set = OSCresponderNode(nil, '/outs/dly1', { |t,r,m|
				~dly.set(\delay, 1);
			}).add;		
			~dly2Set = OSCresponderNode(nil, '/outs/dly2', { |t,r,m|
				~dly.set(\delay, 2);
			}).add;		
			~dly3Set = OSCresponderNode(nil, '/outs/dly3', { |t,r,m|
				~dly.set(\delay, 3);
			}).add;		
			~dly4Set = OSCresponderNode(nil, '/outs/dly4', { |t,r,m|
				~dly.set(\delay, 4);
			}).add;
	
	
	
	}
	
{
		
		~dly = Synth.after(~piges,"delay", 
					[\in,  ~dlyBus, \out, 0, 
					\amp, 0.0
					]
				);
	
	}




//RLPF Ready

{

	
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
					2, 						// numChans
					ses, 					// in
					SinOsc.kr(MouseX.kr(4.0,0.001, 'linear'), -0.1,0.1), // pos
					0.5,						// level
					3.0						// width
				);
			
			ReplaceOut.ar( out, ses)
		}).send(s);



		
		



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

{
		~rlp = Synth.after(~piges,"rlpf", 
					[
					\in,  ~rlpBus, \out, 0, 
					\ffreq, 4220, \rq, 1.5, \amp, 0.0
					]
				);
		
}



/*
~rlp.free;
~wah.free;
(
			~rlp.set(
				\ffreq, 2388.5, \rq, 0.00234
			);
)
*/	



{

	
		SynthDef("wah", { |out = 0, in = 0, amp = 1, pan = 0, 
			rate = 0.005, cfreq = 9400, mfreq = 9200, rq=-0.1, dist = 0.25,
			lvl = 0.9, durt = 0.01|
			
			var zin, zout, ses;
			
			zin = In.ar(in, 2);
			cfreq = Lag3.kr(cfreq, 0.1);
			mfreq = Lag3.kr(mfreq, 0.1);
			rq   = Ramp.kr(rq, 0.01);
			zout = RLPF.ar(zin, LFDNoise1.kr(rate, mfreq, cfreq), rq, amp).distort * dist;
			ses = Limiter.ar(zout, lvl, durt);
			ses = PanAz.ar(
					2, 						// numChans
					ses, 					// in
					SinOsc.kr(MouseX.kr(0.01,4, 'linear'), -0.1,0.1), // pos
					0.5,						// level
					2.5						// width
				);
			
			ReplaceOut.ar( out , ses); 
		}).send(s);

		~distortF = OSCresponderNode(nil, '/outs/distort', { |t,r,m| 
			var n1;
			n1 = (m[1]*2) ;
			~wah.set(\dist, n1);
		}).add;		
		~wahrqF = OSCresponderNode(nil, '/outs/wahrq', { |t,r,m| 
			var n1;
			n1 = (m[1])-0.05 ;
			~wah.set(\rq, n1);
		}).add;
		~wahampF = OSCresponderNode(nil, '/outs/wahamp', { |t,r,m| 
			var n1;
			n1 = (m[1]*6) ;
			~wah.set(\amp, n1);
		}).add;

		~wah1set = OSCresponderNode(nil, '/outs/wah1', { |t,r,m| 
			~wah.set(
				\amp, 0.9,
				\rate, 0.005,
				\cfreq, 9400,
				\mfreq, 9200
 				
			);
		}).add;	

		~wah2set = OSCresponderNode(nil, '/outs/wah2', { |t,r,m| 
			~wah.set(
				\amp, 0.9,
				\rate, 0.005,
				\cfreq, 9400,
				\mfreq, 9450
 				
			);
		}).add;
		~wah3set = OSCresponderNode(nil, '/outs/wah3', { |t,r,m| 
			~wah.set(
				\amp, 0.9,
				\rate, 0.005,
				\cfreq, 4400,
				\mfreq, 4410
 				
			);
		}).add;
	}
	
	{
		~wah = Synth.after(~piges,"wah", 
					[\in,  ~wahBus, \out, 0, \amp, 0.0, \rq, -0.1]
				);
	
	}
(
			~wah.set(
				\rq, -0.234,
				\rate, 0.005
			);
)

{

	
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


		~distortFlowSpec = ControlSpec(0.0, 1.0, \lin);
		~distFlowMic = OSCresponderNode(nil, '/outs/distAmp', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~flow.set(\vol, ~distortFlowSpec.map(n1));
		
		}).add;		


/*(		~distortFlowMicSpec = ControlSpec(0, 1, \lin);
		~distFlowMic = OSCresponderNode(nil, '/outs/distAmpMic', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~flow.set(\dist, ~distortFlowSpec.map(n1));
		
		}).add;)*/
		
		~medianFlowSpec = ControlSpec(0.0, 0.5, \lin);
		~medFlowMic = OSCresponderNode(nil, '/outs/median', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~flow.set(\dist, ~medianFlowSpec.map(n1));
		
		}).add;

		~doesFlowSpec = ControlSpec(1, 8, \lin);
		~doesFlowMic = OSCresponderNode(nil, '/outs/does', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~flow.set(\does, ~doesFlowSpec.map(n1));
		
		}).add;

	
	
	
	}

