/*

JODABaxx.load;

*/

JODABaxx {
	
	*load {

	
	SynthDef(\baxx,{|out = 0, amp = 0.1, vol = 0.1,
		freq = 50, pan = 0,
		att = 0.1, dec = 0.005, sus = 0.5, rls = 1.5, gate = 1 |
		
		var env, ses;
		env = EnvGen.ar(Env.adsr(att, dec, sus, rls, 0.5, 1), gate, doneAction:2);
	
		ses = SinOsc.ar(freq,0,amp);
		ses = ses.sin**2/20.abs+ ses;
		ses = DelayL.ar(ses, 0.5, 0.006, 0.5, ses);
		
		Out.ar(out, Pan2.ar(ses, pan) *env  *vol);
	}).send(Server.default);
		
		
//-----OSC------//

	~bax=ÊOSCresponderNode(nil,Ê'/bufP/basset', {Ê|t,r,m|Ê
		if (~baxx.isNil) {
			~baxx = Synth.head(~piges,"baxx", 
					[
					\freq, [49.0 rrand: 52.9],
					\pan, [-1.0 rrand: 1.0],
					\out, [~limBus, ~revBus], \amp, 0.9
					]
				);
		}{
			~baxx.release(4);
			~baxx = nil;
		}
	}).add;		

	
	}
	
}