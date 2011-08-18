


KafesChannels {
	
	*ch1 {
	
		fork {
			//1
			~ch1Bus = Bus.new(\audio, 22, 1);
			~ch1Dust = Bus.new(\audio, 23, 1);
			
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
				src = In.ar(in, 6)+ 0.001;
				filt = BPF.ar( src, 6 ** Latch.ar(src, Dust.ar(src) ) * 2000,  0.5).sin;
				does.do{ filt = AllpassN.ar( filt, 0.2, {0.2.rand}!2, 9) };
				filt + filt.mean;
				Out.ar(out, filt);
			}).send(Server.default);	
			
			"channel 1 SynthDefs loaded".postln;
			1.0.wait;
			
			//3
			~ch1Cln = Synth.tail(~effects, "ch1Clean",
				[ 
				\in ,0, 
				\out,  0
				]
			);
			~ch1ND = Synth.tail(~effects, "ch1NDef",
				[ 
				\in ,~ch1Bus, 
				\out,  0
				]
			);



			"channel 1 Synths are playing".postln;
	
			0.5.wait;
			
			"OCS TO DO".postln;
			
		};
	
	}
	


}