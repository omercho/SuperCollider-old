
KafesChannels {
	
	*ch1 {
	
		fork {
			//1
			~ch1 = Bus.new(\audio, 22, 1);
			
			"channel 1 buses loaded".postln;
			0.1.wait;
			
			//2
			SynthDef("ch1Clean", { |out, 
				in = 0, pan = 0, amp = 1|
				var ses;
				ses =  In.ar(in, 1);
				Out.ar(out, ses*amp);
			}).send(Server.default);
			
			SynthDef('ch1NDef',{ |out, does = 7, in = 0|
				var src, filt;
				src = In.ar(in, 18)+ 0.001;
				filt = BPF.ar( src, 6 ** Latch.ar(src, Dust.ar(src) ) * 3000,  0.5).sin;
				does.do{ filt = AllpassN.ar( filt, 0.2, {0.2.rand}!2, 9) };
				filt + filt.mean;
				Out.ar(out, filt);
			}).send(Server.default);	
			
			"channel 1 SynthDefs loaded".postln;
			1.0.wait;
			
			//3
			~ch1Cl = Synth.tail(~effects, "ch1Clean",
				[ 
				\in ,~ch1, 
				\out,  0
				]
			);
			~ch1ND = Synth.tail(~effects, "ch1NDef",
				[ 
				\in ,~ch1, 
				\out,  0
				]
			);



			"channel 1 Synths are playing".postln;
	
			0.5.wait;
			
			"OCS TO DO".postln;
			
		};
	
	}
	
	
	*ch2 {
	
		fork {
			//1
			~ch2 = Bus.new(\audio, 24, 1);
			
			"channel 2 buses loaded".postln;
			0.1.wait;
			
			//2
			SynthDef("ch2Clean", { |out, 
				in = 0, pan = 0, amp = 1|
				var ses;
				ses =  In.ar(in, 1);
				Out.ar(out, ses*amp);
			}).send(Server.default);
			
			SynthDef("ch2flowZ",{ | out, in = 0,
								ampInc = 0, ampExp = 0.5, ampScale = 0.1, bufnum = 0, 
								f1 = 0.5, f2 = 1.2, f3 = 1.5, f4 = 1.7, f5 = 2.2|
				var inp, amp, freq, hasFreq, ses;
				inp = In.ar(in);
				//in = SoundIn.ar(1);
				amp = Amplitude.kr(inp, 0.05, 0.05);
				# freq, hasFreq = Pitch.kr(inp, ampThreshold: 0.02, median: 1);
				freq = Lag.kr(freq, 0.05);
				ses = Mix.new(
					SinOsc.ar(
						freq * [f1, f2, f3, f4, f5]*2.5 , 
						0, 
						LFNoise1.kr(0.2,0.1,0.1), 
						amp + ampInc pow: ampExp * ampScale
					)
				);
				
				ses = Formlet.ar(ses/19, ~karcigarD1, 0.01, 0.1, mul:Amplitude.kr(inp, 0.05, 0.5);).sin/4;
				6.do({
					ses = AllpassN.ar(ses, 0.040, [0.060.rand,0.060.rand], 2)
				});
				ses = Mix.fill(1, ses);
				Out.ar(out, ses);
			}).send(Server.default);	
			
			"channel 2 SynthDefs loaded".postln;
			1.0.wait;
			
			//3
			~ch2Cl = Synth.tail(~effects, "ch2Clean",
				[ 
				\in , ~ch2, 
				\out,  0
				]
			);
			~ch2Flow = Synth.tail(~effects, "ch2flowZ",
				[ 
				\in ,~ch2, 
				\out,  0
				]
			);

			"channel 2 Synths are playing".postln;
	
			0.5.wait;
			
			"OCS TO DO".postln;
			
		};
	
	}


	*ch3 {
	
		fork {
			//1
			~ch3 = Bus.new(\audio, 26, 1);
			
			"channel 1 buses loaded".postln;
			0.1.wait;
			
			//2
			SynthDef("ch3Clean", { |out, 
				in = 0, pan = 0, amp = 1|
				var ses;
				ses =  In.ar(in, 1);
				Out.ar(out, ses*amp);
			}).send(Server.default);
			
			SynthDef("reverb", { | out, in = 0, amp=0.8, pan=0.0, 
				roomsize = 4, revtime = 2, damping = 0.5, inputbw = 0.19, spread = 15,
				drylevel = -3, earlylevel = -9, taillevel = -11,
				lvl = 0.9, durt = 0.01 |
				
				var input, ses;
				
				input = In.ar(in, 1);
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
/*				ses = PanAz.ar(
						4, 						// numChans
						ses, 					// in
						SinOsc.kr(0.01, -0.1,0.1), 	// pos
						0.5,						// level
						2.5						// width
					);*/
				Out.ar(out, ses );
			}).send(Server.default);	
			
			"channel 3 SynthDefs loaded".postln;
			1.0.wait;
			
			//3
			~ch3Cl = Synth.tail(~effects, "ch3Clean",
				[ 
				\in ,~ch3, 
				\out,  0
				]
			);
			~rev = Synth.tail(~effects, "reverb",
				[ 
				\in ,~ch3, 
				\out,  0
				]
			);



			"channel 3 Synths are playing".postln;
	
			0.5.wait;
			
			"OCS TO DO".postln;
			
		};
	
	}
	*ch4 {
	
		fork {
			//1
			~ch4 = Bus.new(\audio, 28, 1);
			
			"channel 4 buses loaded".postln;
			0.1.wait;
			
			//2
			SynthDef("ch4Clean", { |out, 
				in = 0, pan = 0, amp = 1|
				var ses;
				ses =  In.ar(in, 1);
				Out.ar(out, ses*amp);
			}).send(Server.default);
			
			SynthDef("dustr",{ |out = 0, amp = 0.8, in = 0, ffreq = 1190, rq = 0.01, ampInc = 0.7, ampExp = 2.1, ampScale = 0.5|
				var src, src1, src2, ampl;
				var ctl;
				var inp, freq, hasFreq, ses;
				
				inp = In.ar(in, 6);
				//inp = SoundIn.ar(0,4);
				ampl = Amplitude.kr(inp, 0.05, 0.05)<= 2.1;
				# freq, hasFreq = Pitch.kr(inp, ampThreshold: 0.02, median: 7);
				freq = Lag.kr(freq, 0.05);
			
				
			
				src = Dust.ar(ampl*8, 2)*inp;
				
				src = SinOsc.ar(freq * [0.5,1.2, 1.5, 1.7, 2.2] / 2.5, 0, 2)*src;
				
				src1 = RLPF.ar( src, freq, rq/2, 1);
				
				src2 = RHPF.ar(src, freq*4, rq,  1.2);
				
				src = Mix.new(src1 , src2, ampl + ampInc pow: ampExp * ampScale);
				6.do({
					src = AllpassN.ar(src, 0.040, [0.060.rand,0.060.rand], 2);
				});
				
				
				Out.ar( out, src*8)
			}).play(Server.default);
			
			"channel 4 SynthDefs loaded".postln;
			1.0.wait;
			
			//3
			~ch4Cl = Synth.tail(~effects, "ch4Clean",
				[ 
				\in ,~ch4, 
				\out,  
				]
			);
			~dustr = Synth.tail(~effects, "dustr",
				[ 
				\in ,~ch4, 
				\out,   0
				]
			);



			"channel 4 Synths are playing".postln;
	
			0.5.wait;
			
			"OCS TO DO".postln;
			
		};
	
	}

}