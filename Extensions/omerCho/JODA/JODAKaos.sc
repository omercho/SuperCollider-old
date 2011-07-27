JODAKaos { 

	
	*load {

		var s;
		
		s = Server.default;	



		SynthDef("abs",{|i, k, j, out = 0, gate =1, vol = 0.5, 
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

//----------------OSC---------------//

		~mNois=�OSCresponderNode(nil,�'/bufP/kaos', {�|t,r,m|�
			if (~mNoise.isNil) {
				~mNoise = Synth(\abs);
			}{
				~mNoise.release(5);
				~mNoise = nil;
			}
		}).add;
		
		
		
		
		
		
		~mx1Spec = ControlSpec(0.1, 3.0, \exp);
		~mx2Spec = ControlSpec(3.0, 0.1, \exp);
		
		~my1Spec = ControlSpec(0.1, 3.0, \exp);
		~my2Spec = ControlSpec(3.0, 0.1, \exp);
		
		~xyK =�OSCresponderNode(nil,�'/bufP/xyKaos', {�|t,r,m|�
			var�n1, n2;
			n1�= (m[1]);
			n2�= (m[2]);
			
			~mNoise.set(\mx1, ~mx1Spec.map(n1));
			~mNoise.set(\mx2, ~mx2Spec.map(n1));
		
			~mNoise.set(\my1, ~mx1Spec.map(n2));
			~mNoise.set(\my2, ~mx2Spec.map(n2));
			 
			}).add;
		
		
		~kaosVolSpec = ControlSpec(0.0, 1.1, \lin);
		~kaosVol =�OSCresponderNode(nil,�'/bufP/kaosvol', {�|t,r,m|�
			var�n1;
			n1�= (m[1]);
			~mNoise.set(\vol, ~kaosVolSpec.map(n1));
		}).add;




	}
}