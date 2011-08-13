/*
Perdeler.load;
*/


Perdeler {
	*load{
		var s;
		s = Server.default;
/*		
		
		SynthDef(\gendy02,{|i, k, out, amp = 0.5, gate = 1,
			mfreq = 440, 
			attime = 0.2, decaytime = 2, suslev = 4, rls = 1|
			var ses, env, mix, rlpf1, rlpf2, norm, lag;
			
			env = EnvGen.kr(Env.cutoff(1), gate, doneAction:2);
			mix = RLPF.ar(
				Gendy1.ar(
					2,
					3,
					minfreq: mfreq, 
					maxfreq: mfreq,
					durscale:0.0, 
					initCPs:40
				), 
				~a2,
				MouseX.kr(0.0,3.0), 
				0.2
			);
			norm = Normalizer.ar(mix, 0.5);
			lag = Lag.kr(LFNoise2.kr(0.1,1.9),0.5);
			ses = Pan2.ar(norm, lag);
		
			//ses = ses.sin;
			ses = ses*env;
			Out.ar(out, ses* amp);
		}).send(s);

*/

		SynthDef(\gendy02,{|i, k, out, amp = 0.5, gate = 1,
			mfreq = 440, 
			attime = 0.2, decaytime = 2, suslev = 4, rls = 1|
			var ses, env, mix, rlpf1, rlpf2, norm, lag;
			
			env = EnvGen.kr(Env.cutoff(0.2), gate, doneAction:2);
			mix = RLPF.ar(
				Blip.ar(mfreq, 1), 
				~a2,
				MouseX.kr(0.0,3.0), 
				0.2
			);
			norm = Normalizer.ar(mix, 0.5);
			lag = Lag.kr(LFDNoise1.kr(0.1,1.9),0.2);
			ses = Pan2.ar(norm, lag);
		
			//ses = ses.sin;
			ses = ses*env;
			Out.ar(out, ses* amp);
		}).send(s);




//
		~kcar=�OSCresponderNode(nil,�'/perde/kCargah', {�|t,r,m|�
			if (m[1] == 1) {
			~kcargah = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~kabaCargah
				]
			);
			}{
				~kcargah.release(1);
			}
		}).add;
		
		~knimhic=�OSCresponderNode(nil,�'/perde/kNimHicaz', {�|t,r,m|�
			if (m[1] == 1) {
			~knimhicaz = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~kabaNimHicaz
				]
			);
			}{
				~knimhicaz.release(1);
			}
		}).add;

		~khic=�OSCresponderNode(nil,�'/perde/kHicaz', {�|t,r,m|�
			if (m[1] == 1) {
			~khicaz = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~kabaHicaz
				]
			);
			}{
				~khicaz.release(1);
			}
		}).add;
		
		~kdikhic=�OSCresponderNode(nil,�'/perde/kDikHicaz', {�|t,r,m|�
			if (m[1] == 1) {
			~kdikhicaz = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~kabaDikHicaz
				]
			);
			}{
				~kdikhicaz.release(1);
			}
		}).add;
		
		~yeg=�OSCresponderNode(nil,�'/perde/yegah', {�|t,r,m|�
			if (m[1] == 1) {
			~yegahh = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~yegah
				]
			);
			}{
				~yegahh.release(1);
			}
		}).add;		

		~knimhis=�OSCresponderNode(nil,�'/perde/kNimHisar', {�|t,r,m|�
			if (m[1] == 1) {
			~knimhisar = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~kabaNimHisar
				]
			);
			}{
				~knimhisar.release(1);
			}
		}).add;

		~khis=�OSCresponderNode(nil,�'/perde/kHisar', {�|t,r,m|�
			if (m[1] == 1) {
			~khisar = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~kabaHisar
				]
			);
			}{
				~khisar.release(1);
			}
		}).add;

		~kdikhis=�OSCresponderNode(nil,�'/perde/kDikHisar', {�|t,r,m|�
			if (m[1] == 1) {
			~kdikhisar = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~kabaDikHisar
				]
			);
			}{
				~kdikhisar.release(1);
			}
		}).add;

		~husas=�OSCresponderNode(nil,�'/perde/huseyniAsiran', {�|t,r,m|�
			if (m[1] == 1) {
			~huseyniasiran = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~huseyniAsiran
				]
			);
			}{
				~huseyniasiran.release(1);
			}
		}).add;

		~acas=�OSCresponderNode(nil,�'/perde/acemAsiran', {�|t,r,m|�
			if (m[1] == 1) {
			~acemasiran = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~acemAsiran
				]
			);
			}{
				~acemasiran.release(1);
			}
		}).add;

		~dikacas=�OSCresponderNode(nil,�'/perde/dikAcemAsiran', {�|t,r,m|�
			if (m[1] == 1) {
			~dikacemasiran = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~dikAcemAsiran
				]
			);
			}{
				~dikacemasiran.release(1);
			}
		}).add;

		~ira=�OSCresponderNode(nil,�'/perde/irak', {�|t,r,m|�
			if (m[1] == 1) {
			~irakk = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~irak
				]
			);
			}{
				~irakk.release(1);
			}
		}).add;

		~gvs=�OSCresponderNode(nil,�'/perde/gevest', {�|t,r,m|�
			if (m[1] == 1) {
			~gevestt = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~gevest
				]
			);
			}{
				~gevestt.release(1);
			}
		}).add;

		~dikgvs=�OSCresponderNode(nil,�'/perde/dikGevest', {�|t,r,m|�
			if (m[1] == 1) {
			~dikgevestt = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~dikGevest
				]
			);
			}{
				~dikgevestt.release(1);
			}
		}).add;

		~rast=�OSCresponderNode(nil,�'/perde/rast', {�|t,r,m|�
			if (m[1] == 1) {
			~rastt = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~rast
				]
			);
			}{
				~rastt.release(1);
			}
		}).add;

		~nimzir=�OSCresponderNode(nil,�'/perde/nimZirgule', {�|t,r,m|�
			if (m[1] == 1) {
			~nimzirgule = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~nimZirgule
				]
			);
			}{
				~nimzirgule.release(1);
			}
		}).add;

		~zir=�OSCresponderNode(nil,�'/perde/zirgule', {�|t,r,m|�
			if (m[1] == 1) {
			~zirgulee = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~zirgule
				]
			);
			}{
				~zirgulee.release(1);
			}
		}).add;

		~dikzir=�OSCresponderNode(nil,�'/perde/dikZirgule', {�|t,r,m|�
			if (m[1] == 1) {
			~dikzirgule = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~dikZirgule
				]
			);
			}{
				~dikzirgule.release(1);
			}
		}).add;

		~dug=�OSCresponderNode(nil,�'/perde/dugah', {�|t,r,m|�
			if (m[1] == 1) {
			~dugahh = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~dugah
				]
			);
			}{
				~dugahh.release(1);
			}
		}).add;

		~kur=�OSCresponderNode(nil,�'/perde/kurdi', {�|t,r,m|�
			if (m[1] == 1) {
			~kurdii = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~kurdi
				]
			);
			}{
				~kurdii.release(1);
			}
		}).add;

		~dikkur=�OSCresponderNode(nil,�'/perde/dikKurdi', {�|t,r,m|�
			if (m[1] == 1) {
			~dikkurdi = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~dikKurdi
				]
			);
			}{
				~dikkurdi.release(1);
			}
		}).add;

		~seg=�OSCresponderNode(nil,�'/perde/segah', {�|t,r,m|�
			if (m[1] == 1) {
			~segahh = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~segah
				]
			);
			}{
				~segahh.release(1);
			}
		}).add;

		~bus=�OSCresponderNode(nil,�'/perde/buselik', {�|t,r,m|�
			if (m[1] == 1) {
			~buselikk = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~buselik
				]
			);
			}{
				~buselikk.release(1);
			}
		}).add;

		~dikbus=�OSCresponderNode(nil,�'/perde/dikBuselik', {�|t,r,m|�
			if (m[1] == 1) {
			~dikbuselik = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~dikBuselik
				]
			);
			}{
				~dikbuselik.release(1);
			}
		}).add;


		~car=�OSCresponderNode(nil,�'/perde/cargah', {�|t,r,m|�
			if (m[1] == 1) {
			~cargahh = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~cargah
				]
			);
			}{
				~cargahh.release(1);
			}
		}).add;


		~nimhic=�OSCresponderNode(nil,�'/perde/nimHicaz', {�|t,r,m|�
			if (m[1] == 1) {
			~nimhicaz = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~nimHicaz
				]
			);
			}{
				~nimhicaz.release(1);
			}
		}).add;

		~hic=�OSCresponderNode(nil,�'/perde/hicaz', {�|t,r,m|�
			if (m[1] == 1) {
			~hicazz = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~hicaz
				]
			);
			}{
				~hicazz.release(1);
			}
		}).add;
		
		~dikhic=�OSCresponderNode(nil,�'/perde/dikHicaz', {�|t,r,m|�
			if (m[1] == 1) {
			~dikhicaz = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~dikHicaz
				]
			);
			}{
				~dikhicaz.release(1);
			}
		}).add;
		
		~nev=�OSCresponderNode(nil,�'/perde/neva', {�|t,r,m|�
			if (m[1] == 1) {
			~nevaa = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~neva
				]
			);
			}{
				~nevaa.release(1);
			}
		}).add;		
//
		~nimhis=�OSCresponderNode(nil,�'/perde/nimHisar', {�|t,r,m|�
			if (m[1] == 1) {
			~nimhisar = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~nimHisar
				]
			);
			}{
				~nimhisar.release(1);
			}
		}).add;

		~his=�OSCresponderNode(nil,�'/perde/hisar', {�|t,r,m|�
			if (m[1] == 1) {
			~hisarr = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~hisar
				]
			);
			}{
				~hisarr.release(1);
			}
		}).add;

		~dikhis=�OSCresponderNode(nil,�'/perde/dikHisar', {�|t,r,m|�
			if (m[1] == 1) {
			~dikhisar = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~dikHisar
				]
			);
			}{
				~dikhisar.release(1);
			}
		}).add;

		~hus=�OSCresponderNode(nil,�'/perde/huseyni', {�|t,r,m|�
			if (m[1] == 1) {
			~huseynii = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~huseyni
				]
			);
			}{
				~huseynii.release(1);
			}
		}).add;

		~ac=�OSCresponderNode(nil,�'/perde/acem', {�|t,r,m|�
			if (m[1] == 1) {
			~acem = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~acem
				]
			);
			}{
				~acem.release(1);
			}
		}).add;

		~dikacas=�OSCresponderNode(nil,�'/perde/dikAcem', {�|t,r,m|�
			if (m[1] == 1) {
			~dikacem = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~dikAcem
				]
			);
			}{
				~dikacem.release(1);
			}
		}).add;

		~evc=�OSCresponderNode(nil,�'/perde/evic', {�|t,r,m|�
			if (m[1] == 1) {
			~evicc = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~evic
				]
			);
			}{
				~evicc.release(1);
			}
		}).add;

		~mhr=�OSCresponderNode(nil,�'/perde/mahur', {�|t,r,m|�
			if (m[1] == 1) {
			~mahurr = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~mahur
				]
			);
			}{
				~mahurr.release(1);
			}
		}).add;

		~dikmhr=�OSCresponderNode(nil,�'/perde/dikMahur', {�|t,r,m|�
			if (m[1] == 1) {
			~dikmahurr = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~dikMahur
				]
			);
			}{
				~dikmahurr.release(1);
			}
		}).add;

		~gerd=�OSCresponderNode(nil,�'/perde/gerdaniye', {�|t,r,m|�
			if (m[1] == 1) {
			~gerdaniyee = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~gerdaniye
				]
			);
			}{
				~gerdaniyee.release(1);
			}
		}).add;

		~nimseh=�OSCresponderNode(nil,�'/perde/nimSehnaz', {�|t,r,m|�
			if (m[1] == 1) {
			~nimsehnaz = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~nimSehnaz
				]
			);
			}{
				~nimsehnaz.release(1);
			}
		}).add;

		~seh=�OSCresponderNode(nil,�'/perde/sehnaz', {�|t,r,m|�
			if (m[1] == 1) {
			~sehnazz = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~sehnaz
				]
			);
			}{
				~sehnazz.release(1);
			}
		}).add;

		~dikseh=�OSCresponderNode(nil,�'/perde/dikSehnaz', {�|t,r,m|�
			if (m[1] == 1) {
			~diksehnazz = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~dikSehnaz
				]
			);
			}{
				~diksehnazz.release(1);
			}
		}).add;

		~muh=�OSCresponderNode(nil,�'/perde/muhayyer', {�|t,r,m|�
			if (m[1] == 1) {
			~muhayyerr = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~muhayyer
				]
			);
			}{
				~muhayyerr.release(1);
			}
		}).add;

		~sunb=�OSCresponderNode(nil,�'/perde/sunbule', {�|t,r,m|�
			if (m[1] == 1) {
			~sunbulee = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~sunbule
				]
			);
			}{
				~sunbulee.release(1);
			}
		}).add;

		~diksunb=�OSCresponderNode(nil,�'/perde/dikSunbule', {�|t,r,m|�
			if (m[1] == 1) {
			~diksunbulee = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~dikSunbule
				]
			);
			}{
				~diksunbulee.release(1);
			}
		}).add;

		~tizseg=�OSCresponderNode(nil,�'/perde/tizSegah', {�|t,r,m|�
			if (m[1] == 1) {
			~tizsegahh = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~tizSegah
				]
			);
			}{
				~tizsegahh.release(1);
			}
		}).add;

		~tizbus=�OSCresponderNode(nil,�'/perde/tizBuselik', {�|t,r,m|�
			if (m[1] == 1) {
			~tizbuselikk = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~tizBuselik
				]
			);
			}{
				~tizbuselikk.release(1);
			}
		}).add;

		~tizdikbus=�OSCresponderNode(nil,�'/perde/tizDikBuselik', {�|t,r,m|�
			if (m[1] == 1) {
			~tizdikbuselik = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~tizDikBuselik
				]
			);
			}{
				~tizdikbuselik.release(1);
			}
		}).add;

//
		~tizcar=�OSCresponderNode(nil,�'/perde/tizCargah', {�|t,r,m|�
			if (m[1] == 1) {
			~tizcargahh = Synth.head(~piges,"gendy02", 
				[
				\out, 0, 
				\amp, 0.8,
				\mfreq, ~tizCargah
				]
			);
			}{
				~tizcargahh.release(1);
			}
		}).add;

	}
}

