

KafesSynthDefs {

	*initClass {
		StartUp add: {
			this.load;

		}
	}
	
	*load {
	
	Server.default.waitForBoot({
		SynthDef(\gendT, {|out, vol = 3, amp=1.0, freq =55 , rfreq = 355, gate =1, lagT = 0.05, vib = 0.01,
						att = 1.3, sus = 1.2, rls = 1.4 |
			var src, env, lag;
			env = EnvGen.kr( Env.adsr(att, 0.9, sus, rls), gate, doneAction: 2);
			lag = Lag.kr(freq, lagT);
			src = PanAz.ar(2,
				CombN.ar(
					Resonz.ar(
						Gendy1.ar(1, 3, minfreq:50, maxfreq: lag * SinOsc.kr(vib).range(0.97, 1.03), durscale:0.01, initCPs:10),
						rfreq+(lag/2), 
						0.1
					),
					0.1,
					0.5,
					3.5, 
					0.9
				), 
				SinOsc.kr(SinOsc.kr(0.01).range(0.05, 0.09)).range(-1, 1),
				0.8,
				2
			)*amp;
			Out.ar(out, src* vol*env);
		
		}).send(Server.default);
	
	
		SynthDef(\buf, { | out=0, bufnum = 0, 
						rate = 0.1, startPos = 0, amp = 1.0, 
						gate = 1, att = 0.1, dec = 1.1, sus = 1, rls = 0.2, 
						pan = 0, wid = 2, loop = 0|
			var env, audio;
			//rate = rate * BufRateScale.kr(bufnum);
			startPos = startPos * BufFrames.kr(bufnum);
			
			env = EnvGen.ar(Env.adsr(att, dec, sus, rls, 1, -1), gate, doneAction: 2);
			
			audio = PlayBuf.ar(1, bufnum, BufRateScale.kr(bufnum)*rate, startPos: startPos, loop:1);
			
			//audio = Pan2.ar(audio, pan, amp*6);
			audio = PanAz.ar( 2, audio, pan, amp*6, width: wid);
			Out.ar(out, audio* env);
		}).add;
	
	});
	
	
	
	
	}
	
	
}