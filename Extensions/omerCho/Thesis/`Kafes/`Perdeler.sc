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
		~kcar=ÊOSCresponderNode(nil,Ê'/perde/kCargah', {Ê|t,r,m|Ê
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
		
		~knimhic=ÊOSCresponderNode(nil,Ê'/perde/kNimHicaz', {Ê|t,r,m|Ê
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

		~khic=ÊOSCresponderNode(nil,Ê'/perde/kHicaz', {Ê|t,r,m|Ê
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
		
		~kdikhic=ÊOSCresponderNode(nil,Ê'/perde/kDikHicaz', {Ê|t,r,m|Ê
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
		
		~yeg=ÊOSCresponderNode(nil,Ê'/perde/yegah', {Ê|t,r,m|Ê
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

		~knimhis=ÊOSCresponderNode(nil,Ê'/perde/kNimHisar', {Ê|t,r,m|Ê
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

		~khis=ÊOSCresponderNode(nil,Ê'/perde/kHisar', {Ê|t,r,m|Ê
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

		~kdikhis=ÊOSCresponderNode(nil,Ê'/perde/kDikHisar', {Ê|t,r,m|Ê
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

		~husas=ÊOSCresponderNode(nil,Ê'/perde/huseyniAsiran', {Ê|t,r,m|Ê
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

		~acas=ÊOSCresponderNode(nil,Ê'/perde/acemAsiran', {Ê|t,r,m|Ê
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

		~dikacas=ÊOSCresponderNode(nil,Ê'/perde/dikAcemAsiran', {Ê|t,r,m|Ê
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

		~ira=ÊOSCresponderNode(nil,Ê'/perde/irak', {Ê|t,r,m|Ê
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

		~gvs=ÊOSCresponderNode(nil,Ê'/perde/gevest', {Ê|t,r,m|Ê
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

		~dikgvs=ÊOSCresponderNode(nil,Ê'/perde/dikGevest', {Ê|t,r,m|Ê
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

		~rast=ÊOSCresponderNode(nil,Ê'/perde/rast', {Ê|t,r,m|Ê
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

		~nimzir=ÊOSCresponderNode(nil,Ê'/perde/nimZirgule', {Ê|t,r,m|Ê
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

		~zir=ÊOSCresponderNode(nil,Ê'/perde/zirgule', {Ê|t,r,m|Ê
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

		~dikzir=ÊOSCresponderNode(nil,Ê'/perde/dikZirgule', {Ê|t,r,m|Ê
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

		~dug=ÊOSCresponderNode(nil,Ê'/perde/dugah', {Ê|t,r,m|Ê
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

		~kur=ÊOSCresponderNode(nil,Ê'/perde/kurdi', {Ê|t,r,m|Ê
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

		~dikkur=ÊOSCresponderNode(nil,Ê'/perde/dikKurdi', {Ê|t,r,m|Ê
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

		~seg=ÊOSCresponderNode(nil,Ê'/perde/segah', {Ê|t,r,m|Ê
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

		~bus=ÊOSCresponderNode(nil,Ê'/perde/buselik', {Ê|t,r,m|Ê
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

		~dikbus=ÊOSCresponderNode(nil,Ê'/perde/dikBuselik', {Ê|t,r,m|Ê
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


		~car=ÊOSCresponderNode(nil,Ê'/perde/cargah', {Ê|t,r,m|Ê
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


		~nimhic=ÊOSCresponderNode(nil,Ê'/perde/nimHicaz', {Ê|t,r,m|Ê
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

		~hic=ÊOSCresponderNode(nil,Ê'/perde/hicaz', {Ê|t,r,m|Ê
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
		
		~dikhic=ÊOSCresponderNode(nil,Ê'/perde/dikHicaz', {Ê|t,r,m|Ê
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
		
		~nev=ÊOSCresponderNode(nil,Ê'/perde/neva', {Ê|t,r,m|Ê
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
		~nimhis=ÊOSCresponderNode(nil,Ê'/perde/nimHisar', {Ê|t,r,m|Ê
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

		~his=ÊOSCresponderNode(nil,Ê'/perde/hisar', {Ê|t,r,m|Ê
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

		~dikhis=ÊOSCresponderNode(nil,Ê'/perde/dikHisar', {Ê|t,r,m|Ê
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

		~hus=ÊOSCresponderNode(nil,Ê'/perde/huseyni', {Ê|t,r,m|Ê
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

		~ac=ÊOSCresponderNode(nil,Ê'/perde/acem', {Ê|t,r,m|Ê
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

		~dikacas=ÊOSCresponderNode(nil,Ê'/perde/dikAcem', {Ê|t,r,m|Ê
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

		~evc=ÊOSCresponderNode(nil,Ê'/perde/evic', {Ê|t,r,m|Ê
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

		~mhr=ÊOSCresponderNode(nil,Ê'/perde/mahur', {Ê|t,r,m|Ê
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

		~dikmhr=ÊOSCresponderNode(nil,Ê'/perde/dikMahur', {Ê|t,r,m|Ê
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

		~gerd=ÊOSCresponderNode(nil,Ê'/perde/gerdaniye', {Ê|t,r,m|Ê
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

		~nimseh=ÊOSCresponderNode(nil,Ê'/perde/nimSehnaz', {Ê|t,r,m|Ê
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

		~seh=ÊOSCresponderNode(nil,Ê'/perde/sehnaz', {Ê|t,r,m|Ê
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

		~dikseh=ÊOSCresponderNode(nil,Ê'/perde/dikSehnaz', {Ê|t,r,m|Ê
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

		~muh=ÊOSCresponderNode(nil,Ê'/perde/muhayyer', {Ê|t,r,m|Ê
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

		~sunb=ÊOSCresponderNode(nil,Ê'/perde/sunbule', {Ê|t,r,m|Ê
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

		~diksunb=ÊOSCresponderNode(nil,Ê'/perde/dikSunbule', {Ê|t,r,m|Ê
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

		~tizseg=ÊOSCresponderNode(nil,Ê'/perde/tizSegah', {Ê|t,r,m|Ê
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

		~tizbus=ÊOSCresponderNode(nil,Ê'/perde/tizBuselik', {Ê|t,r,m|Ê
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

		~tizdikbus=ÊOSCresponderNode(nil,Ê'/perde/tizDikBuselik', {Ê|t,r,m|Ê
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
		~tizcar=ÊOSCresponderNode(nil,Ê'/perde/tizCargah', {Ê|t,r,m|Ê
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

