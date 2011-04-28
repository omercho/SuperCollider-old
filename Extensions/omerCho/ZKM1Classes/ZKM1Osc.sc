/*

ZKM1Osc.load;

*/

ZKM1Osc {
	classvar <action;
	*load {



		~recA=�OSCresponderNode(nil,�'/bufP/recA', {�|t,r,m|�
			if (~recBufA.isNil) {
				~recBufA = Synth(\recToBufA, [\bufnum, ~bufA]);
			}{
				~recBufA.free;
				~recBufA = nil;
			}
		}).add;
		
		~recB=�OSCresponderNode(nil,�'/bufP/recB', {�|t,r,m|�
			if (~recBufB.isNil) {
				~recBufB = Synth(\recToBufB, [\bufnum, ~bufB]);
			}{
				~recBufB.free;
				~recBufB = nil;
			}
		}).add;
		
		~recJer1=�OSCresponderNode(nil,�'/bufP/toggle2', {�|t,r,m|�
			if (~recBufJer1.isNil) {
				~recBufJer1 = Synth(\recToBufJer1, [\bufnum, ~bufJer1]);
			}{
				~recBufJer1.free;
				~recBufJer1 = nil;
			}
		}).add;		
		
		~recJer2=�OSCresponderNode(nil,�'/bufP/toggle3', {�|t,r,m|�
			if (~recBufJer2.isNil) {
				~recBufJer2 = Synth(\recToBufJer1, [\bufnum, ~bufJer2]);
			}{
				~recBufJer2.free;
				~recBufJer2 = nil;
			}
		}).add;
		
		~recIn1=�OSCresponderNode(nil,�'/bufP/recIn', {�|t,r,m|�
			if (~recBufIn.isNil) {
				~recBufIn = Synth.after(~rev, \recToBufIn, [\bufnum, ~bufIn, \in, 0, \out, ~limBus]);
			}{
				~recBufIn.free;
				~recBufIn = nil;
			}
		}).add;


////////////////////////MainPattern








~randA = PatternProxy ( Pn(0.5, inf) );
~randASpec = ControlSpec(0.001, 2, \lin);
/*
~attA = PatternProxy ( Pn(0.1, inf) );
~attASpec = ControlSpec(0.05, 2, \lin);

~decA = PatternProxy ( Pn(0.5, inf) );
~decASpec = ControlSpec(0.3, 1.5, \lin);

~susA = PatternProxy ( Pn(1, inf) );
~susASpec = ControlSpec(0.5, 2, \lin);


~rlsA = PatternProxy ( Pn(1, inf) );
~rlsASpec = ControlSpec(0.4, 2, \lin);

~lvlA = PatternProxy ( Pn(0.8, inf) );
~lvlASpec = ControlSpec(0, 1, \lin);
*/


~volA = PatternProxy ( Pn(1.0, inf) );
~vol1 =�OSCresponderNode(nil,�'/bufP/volA', {�|t,r,m|�
	~volA.source = (m[1]);	 
}).add;

~durationA = PatternProxy ( Pn(1.0, inf) );
~durationASpec = ControlSpec(1.0, 3, \lin);
~dur1 =�OSCresponderNode(nil,�'/bufP/durA', {�|t,r,m|�
	
	~durationA.source = (m[1]);	 
	
	}).add;


~positionA = PatternProxy ( Pn(0, inf) );
~positionASpec = ControlSpec(0, 1, \lin);

~rateA = PatternProxy ( Pn(0.5, inf) );
~rateASpec = ControlSpec(0.1, 8, \lin);
~xy1 =�OSCresponderNode(nil,�'/bufP/xyA', {�|t,r,m|�
	var�n1, n2;
	n1�= (m[1]);
	n2�= (m[2]);
	
	~rateA.source = ~rateASpec.map(n1);
	~positionA.source = ~positionASpec.map(n2);
	 
	}).add;

~randomA =�OSCresponderNode(nil,�'/bufP/randA', {�|t,r,m|�
	var n1;
	n1�= (m[1]);
	~randA.source = ~randASpec.map(n1);
	}).add;
/*
~envAatt =�OSCresponderNode(nil,�'/bufP/envA/1', {�|t,r,m|�
	var n1;
	n1�= (m[1]);
	~attA.source = ~attASpec.map(n1);
	}).add;

~envAdec =�OSCresponderNode(nil,�'/bufP/envA/2', {�|t,r,m|�
	var n1;
	n1�= (m[1]);
	~decA.source = ~decASpec.map(n1);
	}).add;

~envAsus =�OSCresponderNode(nil,�'/bufP/envA/3', {�|t,r,m|�
	var n1;
	n1�= (m[1]);
	~susA.source = ~susASpec.map(n1);
	}).add;

~envArls =�OSCresponderNode(nil,�'/bufP/envA/4', {�|t,r,m|�
	var n1;
	n1�= (m[1]);
	~rlsA.source = ~rlsASpec.map(n1);
	}).add;

~envAlvl =�OSCresponderNode(nil,�'/bufP/envA/5', {�|t,r,m|�
	var n1;
	n1�= (m[1]);
	~lvlA.source = ~lvlASpec.map(n1);
	}).add;

*/





//////////////////////////TAP		
		~togTap1=�OSCresponderNode(nil,�'/bufP/togTapA', {�|t,r,m|�
			if (~tapBuf1.isNil) {
				~tapBuf1 = Synth.tail(~piges,\tapBuf, 
					[
					\bufnum, ~bufTap, 
					\out, [~revBus, ~dlyBus, ~rlpBus, ~wahBus]
					]
				);
			}{
				~tapBuf1.free;
				~tapBuf1 = nil;
			}
		}).add;
		
		
		~delayA1Spec = ControlSpec(0, 3, \lin);
		~delayA2Spec = ControlSpec(0, 8, \lin);
		
		~dly1Tap =�OSCresponderNode(nil,�'/bufP/dly1Tap', {�|t,r,m|�
			var�n1;
			n1�= (m[1]);
			
			~tapBuf1.set(\delay1, ~delayA1Spec.map(n1));
		
		}).add;
		
		~dlyT2ap =�OSCresponderNode(nil,�'/bufP/dly1Tap', {�|t,r,m|�
			var�n1;
			n1�= (m[1]);
			
			~tapBuf1.set(\delay2, ~delayA2Spec.map(n1));
		
		}).add;
		
		~set1Tap =�OSCresponderNode(nil,�'/bufP/push4', {�|t,r,m|�
			var�n1;
			n1�= (m[1]);
			
			~tapBuf1.set(\delay1, 0.01);
		
		}).add;
		
		~set2Tap =�OSCresponderNode(nil,�'/bufP/push5', {�|t,r,m|�
			var�n1;
			n1�= (m[1]);
			
			~tapBuf1.set(\delay2, 0.02);
		
		}).add;
		
		
		~volTap =�OSCresponderNode(nil,�'/bufP/volTapA', {�|t,r,m|�
			var�n1;
			n1�= (m[1]);
			
			~tapBuf1.set(\vol, n1);
			 
		}).add;
		

///////flower

		~togFlower=�OSCresponderNode(nil,�'/bufP/togFlow', {�|t,r,m|�
			if (~flow.isNil) {
				~flow = Synth.head(~piges,"flowerJer", 
					[
					\out, [~revBus, ~dlyBus, ~wahBus, ~rlpBus]
					]
				);
			}{
				~flow.free;
				~flow = nil;
			}
		}).add;
		
		
		~distortFlowSpec = ControlSpec(0, 1, \lin);
		~medianFlowSpec = ControlSpec(0.1, 8, \lin);
		
		~distFlow =�OSCresponderNode(nil,�'/bufP/distAmp', {�|t,r,m|�
			var�n1;
			n1�= (m[1]);
			
			~flow.set(\dist, ~distortFlowSpec.map(n1));
		
		}).add;
		
		~medFlow =�OSCresponderNode(nil,�'/bufP/median', {�|t,r,m|�
			var�n1;
			n1�= (m[1]);
			
			~flow.set(\med, ~medianFlowSpec.map(n1));
		
		}).add;









////////////////////////////////////////Effects///////////////////////////////////////////////
			//REVERB
				~roomF =�OSCresponderNode(nil,�'/bufP/room', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*300);
					~rev.set(\roomsize, n1);
					}).add;
		
				~revtimeF =�OSCresponderNode(nil,�'/bufP/revtime', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*100);
					~rev.set(\revtime, n1);
					}).add;
		
				~dampF =�OSCresponderNode(nil,�'/bufP/damp', {�|t,r,m|�
					var�n1;
					n1�= (m[1]);
					~rev.set(\damping, n1);
					}).add;			
		
				~revampF =�OSCresponderNode(nil,�'/bufP/revamp', {�|t,r,m|�
					var�n1;
					n1�= (m[1]) ;
					~rev.set(\amp, n1);
				}).add;
				
				~revmain = OSCresponderNode(nil,�'/bufP/revmain', {�|t,r,m|
					~rev.set(
						\revtime, 20, \roomsize, 120, \damping, 0.9, 
						\inputbw, 0.3, \drylevel -9, 
						\earlylevel, -10, \taillevel, -10.1, \amp, 0.0005
					);
				}).add;
				~bath = OSCresponderNode(nil,�'/bufP/bath', {�|t,r,m|
					~rev.set(
						\roomsize, 5, \revtime, 0.6, \damping, 0.62,
						\earlylevel, -11, \taillevel, -13
					);
				}).add;
				~church = OSCresponderNode(nil,�'/bufP/church', {�|t,r,m|
						~rev.set(
							\roomsize, 80, \revtime, 4.85, \damping, 0.41, 
							\inputbw, 0.19, \drylevel -3, 
							\earlylevel, -9, \taillevel, -11
						);
				}).add;
				~cathedral = OSCresponderNode(nil,�'/bufP/cath', {�|t,r,m|
						~rev.set(
							\roomsize, 243, \revtime, 1, \damping, 0.1, 
							\inputbw, 0.34, \drylevel -3, 
							\earlylevel, -11, \taillevel, -9
						);
				}).add;
				~canyon = OSCresponderNode(nil,�'/bufP/canyon', {�|t,r,m|
						~rev.set(
							\roomsize, 300, \revtime, 103, \damping, 0.43, 
							\inputbw, 0.51, \drylevel -5, 
							\earlylevel, -26, \taillevel, -20
						);
				}).add;		
				
				
				//DELAY
				~delayF =�OSCresponderNode(nil,�'/bufP/delay', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*5);
					~dly.set(\delay, n1);
					}).add;
				~decayF =�OSCresponderNode(nil,�'/bufP/decay', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*15) +0.1;
					~dly.set(\decay, n1);
					}).add;
				~dlyampF =�OSCresponderNode(nil,�'/bufP/dlyamp', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*2);
					~dly.set(\amp, n1);
					}).add;
				~dlyMain = OSCresponderNode(nil,�'/bufP/dlymain', {�|t,r,m|
					~dly.set(\delay, 0, \decay, 3);
				}).add;
				~dly1Set = OSCresponderNode(nil,�'/bufP/dly1', {�|t,r,m|
					~dly.set(\delay, 1, \decay, 3);
				}).add;		
				~dly2Set = OSCresponderNode(nil,�'/bufP/dly2', {�|t,r,m|
					~dly.set(\delay, 2, \decay, 3);
				}).add;		
				~dly3Set = OSCresponderNode(nil,�'/bufP/dly3', {�|t,r,m|
					~dly.set(\delay, 3, \decay, 3);
				}).add;		
				~dly4Set = OSCresponderNode(nil,�'/bufP/dly4', {�|t,r,m|
					~dly.set(\delay, 4, \decay, 3);
				}).add;		
				
				//RLPF
				~rlpfreqF =�OSCresponderNode(nil,�'/bufP/rlpfreq', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*5400)+ 20 ;
					~rlp.set(\ffreq, n1);
				}).add;		
				~rlprqF =�OSCresponderNode(nil,�'/bufP/rlprq', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*10)-2 ;
					~rlp.set(\rq, n1);
				}).add;		
				~rlpampF =�OSCresponderNode(nil,�'/bufP/rlpamp', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*4) ;
					~rlp.set(\amp, n1);
				}).add;		
				
				~limlevF =�OSCresponderNode(nil,�'/bufP/limlev', {�|t,r,m|�
					var�n1;
					n1�= (m[1]) ;
					~lim.set(\lvl, n1);
				}).add;
				~limdurtF =�OSCresponderNode(nil,�'/bufP/limdurt', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*2) ;
					~lim.set(\durt, n1);
				}).add;		
				
				~distortF =�OSCresponderNode(nil,�'/bufP/distort', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*50) ;
					~wah.set(\dist, n1);
				}).add;		
				~wahrqF =�OSCresponderNode(nil,�'/bufP/wahrq', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*20)-5 ;
					~wah.set(\rq, n1);
				}).add;
				~wahampF =�OSCresponderNode(nil,�'/bufP/wahamp', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*6) ;
					~wah.set(\amp, n1);
				}).add;
		
				//PANNING
				~panSpec = ControlSpec(-1, 1, \lin);
				~rlpPanF =�OSCresponderNode(nil,�'/bufP/pans/1', {�|t,r,m|�
					var�n1;
					n1�= (m[1]);
					~rlp.set(\pan,~panSpec.map(n1));
					}).add;
		
				~dlyPanF =�OSCresponderNode(nil,�'/bufP/pans/2', {�|t,r,m|�
					var�n1;
					n1�= (m[1]);
					~dly.set(\pan,~panSpec.map(n1));
					}).add;
		
				~wahPanF =�OSCresponderNode(nil,�'/bufP/pans/3', {�|t,r,m|�
					var�n1;
					n1�= (m[1]);
					~wah.set(\pan,~panSpec.map(n1));
					}).add;
		
				~revPanF =�OSCresponderNode(nil,�'/bufP/pans/4', {�|t,r,m|�
					var�n1;
					n1�= (m[1]);
					~rev.set(\pan,~panSpec.map(n1));
					}).add;

			
		
	}
	
	*unLoad{
	
	
	}
	
}