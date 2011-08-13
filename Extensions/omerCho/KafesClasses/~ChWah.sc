/*

ChWah.load;

*/

ChWah {
	classvar <action;
	*load {
	var s;
	s = Server.default;
	
		SynthDef("wah", { |out = 0, in = 0, amp = 1, pan = 0, 
			rate = 0.005, cfreq = 9400, mfreq = 9200, rq=0.1, dist = 0.15,
			lvl = 0.9, durt = 0.01|
			
			var zin, zout, ses;
			
			zin = In.ar(in, 2);
			cfreq = Lag3.kr(cfreq, 0.1);
			mfreq = Lag3.kr(mfreq, 0.1);
			rq   = Ramp.kr(rq, 0.01);
			zout = RLPF.ar(zin, LFDNoise1.kr(rate, mfreq, cfreq), rq, amp).distort * dist;
			ses = Limiter.ar(zout, lvl, durt);
			ses = PanAz.ar(
					4, 						// numChans
					ses, 					// in
					SinOsc.kr(MouseX.kr(0.01,4, 'linear'), -0.1,0.1), 	// pos
					0.5,						// level
					2.5						// width
				);
			
			Out.ar( out , ses); 
		}).send(s);
		
		
/*
LFSaw.kr(MouseX.kr(0.2, 8, 'exponential'))


(
			~wah.set(
				\amp, 0.9,
				\rate, 0.005,
				\cfreq, 9400,
				\mfreq, 9200
 				
			);
)
*/
		/*~togFlow=�OSCresponderNode(nil,�'/outs/togWah', {�|t,r,m|�
			if (~wah.isNil) {
				~wah = Synth.after(~piges,"wah", 
					[\in,  ~wahBus, \out, 0]
				);
			}{
				~wah.free;
				~wah = nil;
			}
		}).add;*/

		~distortF =�OSCresponderNode(nil,�'/outs/distort', {�|t,r,m|�
			var�n1;
			n1�= (m[1]*2) ;
			~wah.set(\dist, n1);
		}).add;		
		~wahrqF =�OSCresponderNode(nil,�'/outs/wahrq', {�|t,r,m|�
			var�n1;
			n1�= (m[1])-0.05 ;
			~wah.set(\rq, n1);
		}).add;
		~wahampF =�OSCresponderNode(nil,�'/outs/wahamp', {�|t,r,m|�
			var�n1;
			n1�= (m[1]*6) ;
			~wah.set(\amp, n1);
		}).add;

		~wah1set =�OSCresponderNode(nil,�'/outs/wah1', {�|t,r,m|�
			~wah.set(
				\amp, 0.9,
				\rate, 0.005,
				\cfreq, 9400,
				\mfreq, 9200
 				
			);
		}).add;	

		~wah2set =�OSCresponderNode(nil,�'/outs/wah2', {�|t,r,m|�
			~wah.set(
				\amp, 0.9,
				\rate, 0.005,
				\cfreq, 9400,
				\mfreq, 9450
 				
			);
		}).add;
		~wah3set =�OSCresponderNode(nil,�'/outs/wah3', {�|t,r,m|�
			~wah.set(
				\amp, 0.9,
				\rate, 0.005,
				\cfreq, 4400,
				\mfreq, 4410
 				
			);
		}).add;
	}
	
	*play{
		~wah = Synth.after(~piges,"wah", 
					[\in,  ~wahBus, \out, 0, \amp, 0.0]
				);
	
	}
	
}