/*
( 
SynthDef(\smsBuf, { 
	 
	var in, fft, output; 
	 
	in=PlayBuf.ar(1,~sms01,BufRateScale.kr(~sms01),1,0,1);
	 
	output=SMS.ar(in, 60,60, 4.0, 0.2, MouseX.kr(0.5,4), MouseY.kr(0,1000), 1.0, mul:1.3);  
	 
	Out.ar(0,Pan2.ar(output[0])); 
}).play; 
)


KafSMS.ar(0.001, 12, 14, 0.5, bufnum:~sms01, out: [0]).play;
*/

KafSMS : UGen { 
	//var <>bbuf;



	*ar { arg  att= 0.01, sus = 0.1, rls = 2.5, mul = 0.6, loop = 0, bufnum,  out = 0;

		//bbuf = buf ? bbuf;
		
		
		
		^SynthDef(\smsBuf, { 
			var player, env;
			
			
			env =  EnvGen.ar(
				Env.new([0.0001, 1, 0.8,  0.0001], [att, sus, rls], 'exponential', loop, releaseNode: nil), 
				1, 
				doneAction: 2
			);
			

			player = PlayBuf.ar(1, bufnum, BufRateScale.kr(bufnum), 1, 0, 1);
			
			player = SMS.ar(player, 60,60, 4.0, 0.2, 0, 1000, 1.0, mul:mul);  
			
			Out.ar(out, player[0]  *env);
		}).play(Server.default);
	}




} 