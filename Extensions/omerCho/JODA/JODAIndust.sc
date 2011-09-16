/*

JODAIndust.load;

*/

JODAIndust {
	
	*load {

	
SynthDef(\indust, {|out = 0, vol = 0.2, att = 0.01, sus = 1.1, rls = 5.1, gate=1, dist = 0.5, loop=0, sIn = 0,
				freqs = #[0,0,0,0,0,0,0,0,0,0,0,0], rings = #[0,0,0,0,0,0,0,0,0,0,0,0], industX = 0.1 |
		var  env, mix, ses, outdc, rek, n=8;
		env =  EnvGen.ar(
				Env.new([0, 1, 0.8,  0], [att, sus, rls], 4, loop, releaseNode: 1), 
				gate, 
				doneAction: 2
			);
		
		
		
		rek = LFNoise0.kr(rrand(0.4,1.0), 1,1).squared * industX;
		mix = Klank.ar(
			`[freqs,nil,rings], Blip.ar(rek, [rrand(2,5),rrand(2,5)], vol) * Amplitude.kr(SoundIn.ar(sIn, 0.8));
		).fold2(0.12).cubed * 12;
		mix = Mix.arFill(3, { CombL.ar(mix, 0.1, 0.03.linrand, 4.0.linrand) });
		ses = mix.distort * dist;
		8.do({ses = AllpassN.ar(ses, 0.05, [0.05.rand, 0.05.rand], 3) }) ;
		outdc = LeakDC.ar(ses);
		Out.ar(out, outdc *env);
}).send(Server.default);
		
		
//-----OSC------//

		~togindust.remove; ~togindust= OSCresponderNode(nil, '/bufP/togindust', { |t,r,m| 
			if (m[1] == 1) {
			~ind1 = Synth("indust", [
				[\att,\sus,\rls], [0.8, 1, 4],
				
				\freqs, {~kA5}.dup(12),
				\rings, {0.01.rrand(3)}.dup(12),
				
				\sIn, 0,
				\out, ~limBus
			]);
			}{
				~indust.release(2);
			}
		}).add;

		~industVolSpec = ControlSpec(0, 4.5, \lin);
		~industVol = OSCresponderNode(nil, '/bufP/industvol', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~ind1.set(\vol, ~industVolSpec.map(n1));
		
		}).add;


		~distortIndustSpec = ControlSpec(0.0, 4.0, \lin);
		~distIndust = OSCresponderNode(nil, '/bufP/indist', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~ind1.set(\dist, ~distortIndustSpec.map(n1));
		
		}).add;			
		
		~industXSpec = ControlSpec(0.0, 1.5, \lin);
		~industX = OSCresponderNode(nil, '/bufP/industX', { |t,r,m| 
			var n1;
			n1 = (m[1]);
			
			~ind1.set(\industX, ~industXSpec.map(n1));
		
		}).add;




	

	
	}
	
	*unLoad{
	
	
	}
	
}