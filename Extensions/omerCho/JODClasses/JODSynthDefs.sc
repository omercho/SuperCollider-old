/* Draft of simple class for synthdefs for a project 


JODSynthDefs.load;

*/

JODSynthDefs { 

	
	*load {

		var s;
		
		s = Server.default;	

SynthDef(\baxx,{|out = 6, amp = 0.1, vol = 0.1, gate = 1,
	freq = 50, pan = 0,
	att = 0.1, dec = 0.005, sus = 0.5, rls = 1.5 |
	
	var env, ses;
	env = EnvGen.ar(Env.adsr(att, dec, sus, rls, 0.5, 1), gate, doneAction:2);

	ses = SinOsc.ar(freq,0,amp);
	ses = ses.sin**2/20.abs+ ses;
	ses = DelayL.ar(ses, 0.5, 0.006, 0.5, ses);
	
	Out.ar(out, Pan2.ar(ses, pan) *env  *vol);
}).send(s);


SynthDef("abs",{|i, k, j, out, gate =1, vol = 0.5, 
	mx1=0.2, mx2=0.5, my1=0.4,my2=1.3|
	var mul,decay, ses, comb, ses1, pulse, env;
	
	env = EnvGen.kr(Env.cutoff(3), gate, doneAction:2);
	
	pulse = Pulse.ar([
				300*mx1.exp(10),
				200*my1.exp(10),
				200*my2.exp(10),
				100*mx2.exp(10)
				],0.5);
	mul = -2*i absdif: FSinOsc.ar(2.6, 0.1*i, 0.5*i);
	comb = CombN.ar(
				Decay.ar(
					Decay.ar(pulse.sin, 0.1), 
					0.8.sin, 
					pulse/20), 
				mul, 
				mul, 
				0.1.sin/3
				).tanh/4;
	ses = comb.sin/4;
	ses1 = Pan4.ar(ses,Saw.ar(0.5,2,ses),Saw.ar(0.5,2,ses) ,ses.sin**ses.cos**ses.sin.exp.cos);

	Out.ar(out,DelayN.ar(ses1,0.4, [0.19,0.26]*comb)*vol*4);
}).send(s);

SynthDef(\tapBuf, {|out, bufnum, vol = 0.5, delay1, delay2, rate = 2.9|
	var source, capture, tap, env; 
	
	source= SoundIn.ar(6); //use headphones to avoid feedback
	capture= BufWr.ar(source, bufnum, Phasor.ar(0,1, 0 , BufFrames.ir(bufnum) * rate,1));
	tap = Tap.ar(bufnum, 1, [delay1, delay2]);
	//env = EnvGen.ar(Env.sine, 1.5, timeScale:5, doneAction: 2);
	//tap = CombN.ar(tap, 0.2, 0.2, 3, mul:1.1);
 
	Out.ar(out, tap*2*vol); //multichannel expansion, so one tap each ear  
}).add;




SynthDef("flowerMic",{|out, vol = 0.0, dist = 0.05, does = 6, med = 1|
	var in, amp, freq, hasFreq, snd;
	var mx, my;
	mx = MouseX.kr(1,118);
	my = MouseY.kr(0,3);
	in = Mix.new(SoundIn.ar([0,1]));
	amp = Amplitude.kr(in, 0.05, 0.05);
	# freq, hasFreq = Pitch.kr(
						in,
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
	snd = CombC.ar(LPF.ar(in, 1000), 0.1, (2 * freq).reciprocal, -6).distort * dist*my;
	does.do({
	snd = AllpassN.ar(snd, 0.040, [0.040.rand,0.040.rand], 2)
	});
	Out.ar(out, snd * vol);
}).send(s);


//Effects SynyhDefs
		SynthDef("limiter",{ arg out=0, in = 0, lvl = 0.9, durt = 0.01;
			ReplaceOut.ar( out, Limiter.ar( In.ar(in, 2), lvl, durt) )
		}).send(s);
		
		
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
		}).send(s);
			
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
		}).send(s);
		
		SynthDef("rlpf",{ |out = 0, amp = 0.8 in = 0, ffreq = 600, rq = 0.1, pan = 0|
			Out.ar( out, Pan2.ar(RLPF.ar( In.ar(in), ffreq, rq, amp), pan))
		}).send(s);
		
		
		SynthDef("wah", { arg out = 0, in = 0, rate = 0.5, amp = 1, pan = 0, cfreq = 1400, mfreq = 1200, rq=0.1, dist = 0.15;
			var zin, zout;
			zin = In.ar(in, 2);
			cfreq = Lag3.kr(cfreq, 0.1);
			mfreq = Lag3.kr(mfreq, 0.1);
			rq   = Ramp.kr(rq, 0.1);
			zout = RLPF.ar(zin, LFNoise1.kr(rate, mfreq, cfreq), rq, amp).distort * dist;
			Out.ar( out , Pan2.ar(zout, pan) ); 
		}).send(s);


	}
}