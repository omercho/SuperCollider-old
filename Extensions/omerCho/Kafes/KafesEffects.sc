


KafesEffects {

//---------------------------------------------nDef--------------------------------------------------//
	*nDefPlay {
		SynthDef('nDef',{ |out, does = 7|
			var src, filt;
			src = In.ar(0, 1.1)+ 0.001;
			filt = BPF.ar( src, 6 ** Latch.ar(src, Dust.ar(src) ) * 2000,  0.5).sin;
			does.do{ filt = AllpassN.ar( filt, 0.2, {0.2.rand}!2, 9) };
			filt + filt.mean;
			Out.ar(out, filt);
		}).play(~effects);	
		
	}

}