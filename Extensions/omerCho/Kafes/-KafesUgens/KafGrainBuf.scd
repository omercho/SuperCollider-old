//simple playbuf grain synthdef - note the all important doneAction
(
SynthDef(\sfgrain, {|out, bufnum=0, pan=0.0, startPos=0.0, amp=0.1, dur=0.04| 
var grain; 

grain= PlayBuf.ar(1,bufnum, BufRateScale.kr(bufnum), 1, BufFrames.ir(bufnum)*startPos, 0)*(EnvGen.kr(Env.perc(0.01,dur),doneAction:2)-0.001);

Out.ar(out,Pan2.ar(grain, pan))}).send(s); 
)


b = Buffer.read(s,"sounds/agacDonguRev.aif");


//individual grain
Synth(\sfgrain,[\bufnum, b.bufnum, \startPos,rrand(0.5,1.0),\amp, exprand(0.005,0.1), \pan, 1.0.rand2]);  


//schedule 200 random soundfile playback grains over time, with random offset positions into the soundfile and lowering the density over time
(
{
200.do{arg i; 
var timeprop = (i/199.0)**3;

	Synth(\sfgrain,[
		\bufnum, b.bufnum, 
		\startPos,rrand(0.5,timeprop),
		\amp, exprand(0.005,0.1), 
		\pan, 1.0.rand2,
		\out, [~ch1, ~ch2, ~ch3, ~ch4].choose
	]);  
	rrand((timeprop*0.2).max(0.01),timeprop*0.4).wait;
}; 
}.fork
)
