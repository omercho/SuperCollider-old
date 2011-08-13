/*

TransBeings1Osc.load;

*/

TransBeings1Osc {
	classvar <action;
	*load {


			//REVERB
				~roomF =�OSCresponderNode(nil,�'/pg1/room', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*300);
					~rev.set(\roomsize, n1);
					}).add;
		
				~revtimeF =�OSCresponderNode(nil,�'/pg1/revtime', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*100);
					~rev.set(\revtime, n1);
					}).add;
		
				~dampF =�OSCresponderNode(nil,�'/pg1/damp', {�|t,r,m|�
					var�n1;
					n1�= (m[1]);
					~rev.set(\damping, n1);
					}).add;			
		
				~revampF =�OSCresponderNode(nil,�'/pg1/revamp', {�|t,r,m|�
					var�n1;
					n1�= (m[1]) ;
					~rev.set(\amp, n1);
				}).add;
				
				~revmain = OSCresponderNode(nil,�'/pg1/setmain', {�|t,r,m|
					~rev.set(
						\revtime, 20, \roomsize, 120, \damping, 0.9, 
						\inputbw, 0.3, \drylevel -9, 
						\earlylevel, -10, \taillevel, -10.1, \amp, 0.0005
					);
				}).add;
				~bath = OSCresponderNode(nil,�'/pg1/bath', {�|t,r,m|
					~rev.set(
						\roomsize, 5, \revtime, 0.6, \damping, 0.62,
						\earlylevel, -11, \taillevel, -13
					);
				}).add;
				~church = OSCresponderNode(nil,�'/pg1/church', {�|t,r,m|
						~rev.set(
							\roomsize, 80, \revtime, 4.85, \damping, 0.41, 
							\inputbw, 0.19, \drylevel -3, 
							\earlylevel, -9, \taillevel, -11
						);
				}).add;
				~cathedral = OSCresponderNode(nil,�'/pg1/cath', {�|t,r,m|
						~rev.set(
							\roomsize, 243, \revtime, 1, \damping, 0.1, 
							\inputbw, 0.34, \drylevel -3, 
							\earlylevel, -11, \taillevel, -9
						);
				}).add;
				~canyon = OSCresponderNode(nil,�'/pg1/canyon', {�|t,r,m|
						~rev.set(
							\roomsize, 300, \revtime, 103, \damping, 0.43, 
							\inputbw, 0.51, \drylevel -5, 
							\earlylevel, -26, \taillevel, -20
						);
				}).add;		
				
				
				//DELAY
				~delayF =�OSCresponderNode(nil,�'/pg1/delay', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*5);
					~dly.set(\delay, n1);
					}).add;
				~decayF =�OSCresponderNode(nil,�'/pg1/decay', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*15) +0.1;
					~dly.set(\decay, n1);
					}).add;
				~dlyampF =�OSCresponderNode(nil,�'/pg1/dlyamp', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*2);
					~dly.set(\amp, n1);
					}).add;
				~dlyMain = OSCresponderNode(nil,�'/pg1/dlymain', {�|t,r,m|
					~dly.set(\delay, 0, \decay, 3);
				}).add;
				~dly1Set = OSCresponderNode(nil,�'/pg1/dly1', {�|t,r,m|
					~dly.set(\delay, 1, \decay, 3);
				}).add;		
				~dly2Set = OSCresponderNode(nil,�'/pg1/dly2', {�|t,r,m|
					~dly.set(\delay, 2, \decay, 3);
				}).add;		
				~dly3Set = OSCresponderNode(nil,�'/pg1/dly3', {�|t,r,m|
					~dly.set(\delay, 3, \decay, 3);
				}).add;		
				~dly4Set = OSCresponderNode(nil,�'/pg1/dly4', {�|t,r,m|
					~dly.set(\delay, 4, \decay, 3);
				}).add;		
				
				//RLPF
				~rlpfreqF =�OSCresponderNode(nil,�'/pg1/rlpfreq', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*5400)+ 20 ;
					~rlp.set(\ffreq, n1);
				}).add;		
				~rlprqF =�OSCresponderNode(nil,�'/pg1/rlprq', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*10)-2 ;
					~rlp.set(\rq, n1);
				}).add;		
				~rlpampF =�OSCresponderNode(nil,�'/pg1/rlpamp', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*4) ;
					~rlp.set(\amp, n1);
				}).add;		
				
				~limlevF =�OSCresponderNode(nil,�'/pg1/limlev', {�|t,r,m|�
					var�n1;
					n1�= (m[1]) ;
					~lim.set(\lvl, n1);
				}).add;
				~limdurtF =�OSCresponderNode(nil,�'/pg1/limdurt', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*2) ;
					~lim.set(\durt, n1);
				}).add;		
				
				~distortF =�OSCresponderNode(nil,�'/pg1/distort', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*50) ;
					~wah.set(\dist, n1);
				}).add;		
				~wahrqF =�OSCresponderNode(nil,�'/pg1/wahrq', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*20)-5 ;
					~wah.set(\rq, n1);
				}).add;
				~wahampF =�OSCresponderNode(nil,�'/pg1/wahamp', {�|t,r,m|�
					var�n1;
					n1�= (m[1]*6) ;
					~wah.set(\amp, n1);
				}).add;
		
				//PANNING
				~panSpec = ControlSpec(-1, 1, \lin);
				~rlpPanF =�OSCresponderNode(nil,�'/pg1/pans/1', {�|t,r,m|�
					var�n1;
					n1�= (m[1]);
					~rlp.set(\pan,~panSpec.map(n1));
					}).add;
		
				~dlyPanF =�OSCresponderNode(nil,�'/pg1/pans/2', {�|t,r,m|�
					var�n1;
					n1�= (m[1]);
					~dly.set(\pan,~panSpec.map(n1));
					}).add;
		
				~wahPanF =�OSCresponderNode(nil,�'/pg1/pans/3', {�|t,r,m|�
					var�n1;
					n1�= (m[1]);
					~wah.set(\pan,~panSpec.map(n1));
					}).add;
		
				~revPanF =�OSCresponderNode(nil,�'/pg1/pans/4', {�|t,r,m|�
					var�n1;
					n1�= (m[1]);
					~rev.set(\pan,~panSpec.map(n1));
					}).add;

			
		
	}
	
	*unLoad{
	
	
	}
	
}