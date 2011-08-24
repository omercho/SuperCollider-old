/*

	~mx1Spec = ControlSpec(0.1, 3.0, \exp);
	~mx2Spec = ControlSpec(3.0, 0.1, \exp);
	
	~my1Spec = ControlSpec(0.1, 3.0, \exp);
	~my2Spec = ControlSpec(3.0, 0.1, \exp);
	
	~xyK = OSCresponderNode(nil, '/harmP/xyKaos', { |t,r,m| 
		var n1, n2;
		n1 = (m[1]);
		n2 = (m[2]);
		
		~mNoise.set(\mx1, ~mx1Spec.map(n1));
		~mNoise.set(\mx2, ~mx2Spec.map(n1));
	
		~mNoise.set(\my1, ~mx1Spec.map(n2));
		~mNoise.set(\my2, ~mx2Spec.map(n2));
		 
		}).add;
	
	
	~kaosVolSpec = ControlSpec(0.0, 1.1, \lin);
	~kaosVol = OSCresponderNode(nil, '/harmP/kaosvol', { |t,r,m| 
		var n1;
		n1 = (m[1]);
		~mNoise.set(\vol, ~kaosVolSpec.map(n1));
	}).add;


*/


KafesChannels {

//----------------------------------------------------------------------------//
//-------------------------------CHANNEL1-------------------------------------//
//----------------------------------------------------------------------------//


	
	*ch1 {
	
		fork {
			//-----------CH1-Buses------------//
			~ch1 = Bus.new(\audio, 21, 1);
			//~ch1CLim = Bus.new(\audio, 22, 1);
			~ch1FLim = Bus.new(\audio, 23, 1);
			
			"CHANNEL 1 buses loaded".postln;
			0.1.wait;
			
			//-----------CH1-SynthDefs------------//		
			SynthDef("ch1Clean", { |out, 
				in = 0, pan = 0, vol = 0.5|
				var ses;
				ses =  In.ar(in, 1);
				ses = Limiter.ar(ses, vol, 0.05);
				Out.ar(out, ses);
			}).send(Server.default);

			
			
			SynthDef(\oscFol, {|out,vol=0.8, in, bufnum, balance=2.8, smooth=1.01,
							resFreq=158,
							f1=0.5, f2=1.2, f3=2.0, f4=3.99,
							dia=32, wem=1.1, mixDia=2|
				var input,freq,hasFreq,amp,mix,wet, harm;	
				input = In.ar(in); // get first channel of sound input
				#freq,hasFreq = Pitch.kr(input); // pitch of input signal
				amp = Amplitude.ar(input); // amplitude of input signal
				wet = SinOsc.ar(freq, 0, amp);
				wet = Resonz.ar(wet, resFreq, 0.5);
				harm = SinOsc.ar(freq * [f1, f2, f3, f4].sum/0.238/dia, 0, amp * hasFreq);
				
				mix = (harm * (1-balance)) + (wem*wet * (harm+balance)/mixDia); 	
				mix = CombC.ar(
					mix+harm, 
					SinOsc.kr(0.1).range(1.13, 2.69), 
					SinOsc.kr(0.1).range(5.10, 6.11), 
					SinOsc.kr(0.05).range(0.001, 0.005), 
					0.4, 
					mix+harm
				);
				Out.ar(out, (mix+harm)*vol);
			}).send(Server.default);

/*
(
~ch1Flt.set(\balance, 2.5, \smooth, 1.1);

~ch1Flt.set(\dia, 200.09);

~ch1Flt.set( \wem, 220.5);

~ch1Flt.set(\mixDia, 100.09);

~ch1Flt.set(\resFreq, 220.09);

~ch1Flt.set(\f1, 0.2, \f2, 1.2, \f3, 2.2, \f4, 3.2);
)
*/
			
			
			SynthDef("ch1Limiter", { |out, 
				in1=0, in2=0, pan = -4, vol = 2|
				var ses;
				ses =  In.ar(in1, 1);
				ses = Limiter.ar(ses, 0.8, 0.05);
				ses = Pan2.ar(ses, pan);
				Out.ar(out, ses/vol);
			}).send(Server.default);
			
			"CHANNEL 1 SynthDefs loaded".postln;
			1.0.wait;
			
			//--------------CH1-Synths------------//
			~ch1Cln = Synth.tail(~effects, "ch1Clean",
				[ 
				\in ,~ch1, 
				\out,  0
				]
			);
			~ch1Flt = Synth.tail(~effects, "oscFol",
				[ 
				\in ,~ch1, 
				\out,  ~ch1FLim
				]
			);
			~ch1FltLim = Synth.tail(~effects, "ch1Limiter",
				[ 
				\in1 ,~ch1FLim, 
				\out,  0
				]
			);


			
			"CHANNEL 1 Synths are playing".postln;
			0.5.wait;
			
			//----------------CH1-OSC----------------//
			
			~ch1ClnVolSpec = ControlSpec(0.0, 0.8, \lin);
			~ch1FltVolSpec = ControlSpec(0.0, 1.0, \lin);
			

			~xy1 = OSCresponderNode(nil, '/1/xy1', { |t,r,m| 
				var n1, n2;
				n1 = (m[1]);
				n2 = (m[2]);
				
				~ch1Flt.set(\vol, ~ch1FltVolSpec.map(n2));				~ch1Cln.set(\vol, ~ch1ClnVolSpec.map(n1));
							 
			}).add;

			
			"CHANNEL 1 OSC Responders are loaded".postln;
			
		};
	
	}
	

//----------------------------------------------------------------------------//
//-------------------------------CHANNEL2-------------------------------------//
//----------------------------------------------------------------------------//

	
	*ch2 {
	
		fork {
			//-----------CH2-Buses------------//
			~ch2 = Bus.new(\audio, 24, 1);
			
			"CHANNEL 2 buses loaded".postln;
			0.1.wait;
			
			//-----------CH2-SynthDefs------------//
			SynthDef("ch2Clean", { |out, 
				in = 0, pan = 0, vol = 1|
				var ses;
				ses =  In.ar(in, 1);
				ses = Limiter.ar(ses, vol, 0.05);
				Out.ar(out, ses);
			}).send(Server.default);
			
			SynthDef("ch2flowZ",{ | out, in = 0, vol = 1,
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
						freq * [f1, f2, f3, f4, f5].sum*2.5 , 
						0, 
						LFNoise1.kr(0.2,0.1,0.1), 
						amp + ampInc pow: ampExp * ampScale
					)
				);
				
				ses = Formlet.ar(ses/19, ~karcigarD1, 0.01, 0.1, mul:Amplitude.kr(inp, 0.05, 0.5);).sin/4;
				6.do({
					ses = AllpassN.ar(ses, 0.040, [0.060.rand,0.060.rand], 2)
				});
				Out.ar(out, ses*8*vol);
			}).send(Server.default);	

/*
(
~ch1Flt.set(\balance, 2.5, \smooth, 1.1);

~ch1Flt.set(\dia, 200.09);

~ch1Flt.set( \wem, 220.5);

~ch1Flt.set(\mixDia, 100.09);

~ch1Flt.set(\resFreq, 220.09);

~ch1Flt.set(\f1, 0.2, \f2, 1.2, \f3, 2.2, \f4, 3.2);
)
*/

			
			"CHANNEL 2 SynthDefs loaded".postln;
			1.0.wait;
			
			//--------------CH2-Synths------------//
			~ch2Cln = Synth.tail(~effects, "ch2Clean",
				[ 
				\in , ~ch2, 
				\out,  1
				]
			);
			~ch2Flt = Synth.tail(~effects, "ch2flowZ",
				[ 
				\in ,~ch2, 
				\out,  1
				]
			);

			"CHANNEL 2 Synths are playing".postln;
			0.5.wait;
			
			//----------------CH2-OSC----------------//
			
			~ch2ClnVolSpec = ControlSpec(0.0, 0.5, \lin);
			~ch2FltVolSpec = ControlSpec(0.0, 3.0, \lin);
			

			~xy2 = OSCresponderNode(nil, '/1/xy2', { |t,r,m| 
				var n1, n2;
				n1 = (m[1]);
				n2 = (m[2]);
				
				~ch2Cln.set(\vol, ~ch2ClnVolSpec.map(n1));
				~ch2Flt.set(\vol, ~ch2FltVolSpec.map(n2));							 
			}).add;

			
			"CHANNEL 2 OSC Responders are loaded".postln;
		};
	
	}


//----------------------------------------------------------------------------//
//-------------------------------CHANNEL3-------------------------------------//
//----------------------------------------------------------------------------//


	*ch3 {
	
		fork {
			//-----------CH3-Buses------------//
			~ch3 = Bus.new(\audio, 26, 1);
			
			"CHANNEL 3 buses loaded".postln;
			0.1.wait;
			
			//-----------CH3-SynthDefs------------//
			SynthDef("ch3Clean", { |out, 
				in = 0, pan = 0, vol = 0.5|
				var ses;
				ses =  In.ar(in, 1);
				Out.ar(out, ses*vol);
			}).send(Server.default);
			
			SynthDef("reverb", { | out, in = 0, vol=0.8, pan=0.0, 
				roomsize = 28.7, revtime = 1.01, damping = 0.2, inputbw = 0.19, spread = 15,
				drylevel = -3, earlylevel = -9, taillevel = -11,
				lvl = 0.4, durt = 0.01 |
				
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
					vol
				);
				ses = Limiter.ar( ses, lvl, durt);

				Out.ar(out, ses.sum );
			}).send(Server.default);	
			
			"CHANNEL 3 SynthDefs loaded".postln;
			1.0.wait;
			
			//--------------CH3-Synths------------//
			~ch3Cln = Synth.tail(~effects, "ch3Clean",
				[ 
				\in ,~ch3, 
				\out,  2
				]
			);
			~ch3Flt = Synth.tail(~effects, "reverb",
				[ 
				\in ,~ch3, 
				\out,  2
				]
			);
/*
(
~ch3Flt.set(
	\roomsize, 38.7,
	\revtime, 9.01
);
)
*/
			"CHANNEL 3 Synths are playing".postln;
			0.5.wait;
			
			//----------------CH3-OSC----------------//
			
			~ch3ClnVolSpec = ControlSpec(0.0, 3.0, \lin);
			~ch3FltVolSpec = ControlSpec(0.0, 3.0, \lin);
			

			~xy3 = OSCresponderNode(nil, '/1/xy3', { |t,r,m| 
				var n1, n2;
				n1 = (m[1]);
				n2 = (m[2]);
				
				~ch3Cln.set(\vol, ~ch3ClnVolSpec.map(n1));
				~ch3Flt.set(\vol, ~ch3FltVolSpec.map(n2));							 
			}).add;

			
			"CHANNEL 3 OSC Responders are loaded".postln;
			
		};
	
	}


//----------------------------------------------------------------------------//
//-------------------------------CHANNEL4-------------------------------------//
//----------------------------------------------------------------------------//

	*ch4 {
	
		fork {
			//-----------CH4-Buses------------//
			~ch4 = Bus.new(\audio, 28, 1);
			
			"CHANNEL 4 buses loaded".postln;
			0.1.wait;
			
			//-----------CH4-SynthDefs------------//
			SynthDef("ch4Clean", { |out, 
				in = 0, pan = 0, vol = 0.8|
				var ses;
				ses =  In.ar(in, 1);
				Out.ar(out, ses*vol);
			}).send(Server.default);
			
			SynthDef("dustr",{ |out = 0, vol = 1, in = 0, ffreq = 1190, rq = 0.01, ampInc = 0.7, ampExp = 2.1, ampScale = 0.5|
				var src, src1, src2, ampl;
				var ctl;
				var inp, freq, hasFreq, ses;
				
				inp = In.ar(in, 6);
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
				
				
				Out.ar( out, src.sum*vol)
			}).play(Server.default);
			
			"CHANNEL 4 SynthDefs loaded".postln;
			1.0.wait;
			
			//--------------CH4-Synths------------//
			~ch4Cln = Synth.tail(~effects, "ch4Clean",
				[ 
				\in ,~ch4, 
				\out, 3 
				]
			);
			~ch4Flt = Synth.tail(~effects, "dustr",
				[ 
				\in ,~ch4, 
				\out,   3
				]
			);



			"CHANNEL 4 Synths are playing".postln;
			0.5.wait;
			
			//----------------CH4-OSC----------------//
			~ch4ClnVolSpec = ControlSpec(0.0, 3.0, \lin);
			~ch4FltVolSpec = ControlSpec(0.0, 3.0, \lin);
			

			~xy4 = OSCresponderNode(nil, '/1/xy4', { |t,r,m| 
				var n1, n2;
				n1 = (m[1]);
				n2 = (m[2]);
				
				~ch4Cln.set(\vol, ~ch4ClnVolSpec.map(n1));
				~ch4Flt.set(\vol, ~ch4FltVolSpec.map(n2));							 
			}).add;

			
			"CHANNEL 4 OSC Responders are loaded".postln;
			
		};
	
	}

}