/*

ChClean.load;

*/

ChClean {
	*load {
	var s;
	s = Server.default;
	
		SynthDef("limiter",{ arg out=0, in = 0, lvl = 0.0, durt = 0.01;
			var src;
			src = Limiter.ar( In.ar(in, 2), lvl, durt);
			src = PanAz.ar(
					4, 						// numChans
					src, 					// in
					SinOsc.kr(MouseX.kr(0.02, 8, 'exponential')), // pos
					0.5,						// level
					2.5						// width
				);
			Out.ar( out, src )
		}).send(s);
		
			
		
		~limlevF = OSCresponderNode(nil, '/outs/limlev', { |t,r,m| 
			var n1;
			n1 = (m[1]*2) ;
			~lim.set(\lvl, n1);
		}).add;
		~limdurtF = OSCresponderNode(nil, '/outs/limdurt', { |t,r,m| 
			var n1;
			n1 = (m[1]*2) ;
			~lim.set(\durt, n1);
		}).add;
	
	
	
	}
	
	*play{
		~lim = Synth.after(~piges, "limiter",
			[ \in ,~limBus, \out, 0 ]
		);
	
	}
	
}