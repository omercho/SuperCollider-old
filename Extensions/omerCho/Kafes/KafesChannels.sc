
KafesChannels {
	
	*ch1 {
	
		fork {
			//1
			~ch1Cln = Bus.new(\audio, 22, 1);
			~ch1Filt = Bus.new(\audio, 23, 1);
			
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
				\in ,~ch1Cln, 
				\out,  ~ch1Filt
				]
			);
			~ch1ND = Synth.tail(~effects, "ch1NDef",
				[ 
				\in ,~ch1Filt, 
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
			~ch2Cln = Bus.new(\audio, 24, 1);
			~ch2Filt = Bus.new(\audio, 25, 1);
			
			"channel 1 buses loaded".postln;
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
				
				ses = Formlet.ar(ses/MouseX.kr(18.5, 1.5), LFDNoise0.kr(10).range(59, 184), 0.01, 0.1).sin/4;
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
				\in , ~ch2Cln, 
				\out,  ~ch2Filt
				]
			);
			~ch2Flow = Synth.tail(~effects, "ch2flowZ",
				[ 
				\in ,~ch2Filt, 
				\out,  0
				]
			);

			"channel 1 Synths are playing".postln;
	
			0.5.wait;
			
			"OCS TO DO".postln;
			
		};
	
	}



}