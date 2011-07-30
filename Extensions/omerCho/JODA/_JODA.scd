
(
//JODA.loadBuffers;
)
(
JODA.loadGroups;
JODA.loadBuses;
JODA.loadEffects;
//JODA.loadInstruments;
)
(
JODA.playEffects;
)
(
JODABaxx.load;
JODAFlowJer.load;
JODAFlowMic.load;
JODAKaos.load;

JODANeyDef.load;
//JODARecs.load;
//JODATapBuf.load;
)




f = {
	"1 of 3 loding".postln;
	JODA.loadBuffers;
	1.0.wait;
	
	"2 of 3 loading".postln;
	JODA.loadGroups;
	JODA.loadBuses;
	JODA.loadEffects;
	JODABaxx.load;
	JODAFlowJer.load;
	JODAFlowMic.load;
	JODAKaos.load;
	JODAMicPat.load;
	JODANeyDef.load;
	JODARecs.load;
	0.5.wait;
	
	"3 of 3 loading".postln;
	JODA.playEffects;
	0.5.wait;
	
	"JODA is ready".postln;
	
};
f.fork;
