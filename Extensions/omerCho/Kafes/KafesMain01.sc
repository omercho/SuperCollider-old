
/*
KafesMain01.loadReceive;
KafesMain01.loadBuffers;

~th1A = Bummer.read(Server.default, "sounds/~kafes/~thol/thol1A.aif");

~th1A.playBuf;
~th1A.bufRd;

*/


KafesMain01 {
	
	*loadReceive {
///////////////////////////////////////
		~main1 = Preceive(
			\1 -> {
				
				~th1A.bufRd(att:0.001, sus:6, rls:5, rate:rrand(0.9, 0.4), mul:2);
				
				
				
				},
			\2 -> {},
			\3 -> {},
			\4 -> {},
			\5 -> {},
			\6 -> {},
			\7 -> {},
			\8 -> {},
			\9 -> {},
			\10 -> {},
			
			\11 -> {},
			\12 -> {},
			\13 -> {},
			\14 -> {},
			\15 -> {},
			\16 -> {},
			\17 -> {},
			\18 -> {},
			\19 -> {},
			\20 -> {},
			
			\21 -> {},
			\22 -> {},
			\23 -> {},
			\24 -> {},
			\25 -> {},
			\26 -> {},
			\27 -> {},
			\28 -> {},
			\29 -> {},
			\30 -> {},
			
			\31 -> {},
			\32 -> {},
			\33 -> {},
			\34 -> {},
			\35 -> {},
			\36 -> {},
			\37 -> {},
			\38 -> {},
			\39 -> {},
			\40 -> {},
			
			\41 -> {},
			\42 -> {},
			\43 -> {},
			\44 -> {},
			\45 -> {},
			\46 -> {},
			\47 -> {},
			\48 -> {},
			\49 -> {},
			\50 -> {},
			
			\61 -> {},
			\62 -> {},
			\63 -> {},
			\64 -> {},
			\65 -> {},
			\66 -> {},
			\67 -> {},
			\68 -> {},
			\69 -> {},
			\70 -> {},
			
			\71 -> {},
			\72 -> {},
			\73 -> {},
			\74 -> {},
			\75 -> {},
			\76 -> {},
			\77 -> {},
			\78 -> {},
			\79 -> {},
			\80 -> {},
			
			\81 -> {},
			\82 -> {},
			\83 -> {},
			\84 -> {},
			\85 -> {},
			\86 -> {},
			\87 -> {},
			\88 -> {},
			\89 -> {},
			\90 -> {},
			
			\91 -> {},
			\92 -> {},
			\93 -> {},
			\94 -> {},
			\95 -> {},
			\96 -> {},
			\97 -> {},
			\98 -> {},
			\99 -> {},
			\100 -> {},
			
			\101 -> {},
			\102 -> {},
			\103 -> {},
			\104 -> {},
			\105 -> {},
			\106 -> {},
			\107 -> {},
			\108 -> {},
			\109 -> {},
			\110 -> {},
			
			\111 -> {},
			\112 -> {},
			\113 -> {},
			\114 -> {},
			\115 -> {},
			\116 -> {},
			\117 -> {},
			\118 -> {},
			\119 -> {},
			\120 -> {},
			
			\121 -> {},
			\122 -> {},
			\123 -> {},
			\124 -> {},
			\125 -> {},
			\126 -> {},
			\127 -> {},
			\128 -> {},
			\129 -> {},
			\130 -> {},
			
			\131 -> {},
			\132 -> {},
			\133 -> {},
			\134 -> {},
			\135 -> {},
			\136 -> {},
			\137 -> {},
			\138 -> {},
			\139 -> {},
			\140 -> {},
			
			\141 -> {},
			\142 -> {},
			\143 -> {},
			\144 -> {},
			\145 -> {},
			\146 -> {},
			\147 -> {},
			\148 -> {},
			\149 -> {},
			\150 -> {},
			
			\161 -> {},
			\162 -> {},
			\163 -> {},
			\164 -> {},
			\165 -> {},
			\166 -> {},
			\167 -> {},
			\168 -> {},
			\169 -> {},
			\170 -> {},
			
			\171 -> {},
			\172 -> {},
			\173 -> {},
			\174 -> {},
			\175 -> {},
			\176 -> {},
			\177 -> {},
			\178 -> {},
			\179 -> {},
			\180 -> {},
			
			\181 -> {},
			\182 -> {},
			\183 -> {},
			\184 -> {},
			\185 -> {},
			\186 -> {},
			\187 -> {},
			\188 -> {},
			\189 -> {},
			\190 -> {},
			
			\191 -> {},
			\192 -> {},
			\193 -> {},
			\194 -> {},
			\195 -> {},
			\196 -> {},
			\197 -> {},
			\198 -> {},
			\199 -> {},
			\200 -> {}
			
		);
		
		~main1.play;
//////////////////////////////////////
	}
	
	*loadBuffers { 
		
		~int1 = Bummer.read(Server.default, "sounds/_Evfer/int01.aif");
		~int2 = Bummer.read(Server.default, "sounds/_Evfer/int02.aif");
		~int3 = Bummer.read(Server.default, "sounds/_Evfer/int03.aif");
		~int4 = Bummer.read(Server.default, "sounds/_Evfer/int04.aif");
		~int5 = Bummer.read(Server.default, "sounds/_Evfer/int05.aif");
		~int6 = Bummer.read(Server.default, "sounds/_Evfer/int06.aif");	}
}

/*

KafesMain01.loadReceive;
KafesMain01.loadBuffers;


Pdef(\kafes01).play;

(
Pdef(\kafes01, Posc(
	\dest, [NetAddr.localAddr, NetAddr("192.168.1.12", 57120)],
	
	\msg, Pseq([\1, \2,  \3, \4, \5, \6, \7], inf),
	\dur, Pseq([~duyekDur]*2, inf)
	)
);
)

Pdef(\kafes01).stop;





Pdef(\Ncircle, Posc(
	\msg, Prand(
		[
		\1, \2, \3, \4, \5, \6, \7, \8, \9, \10,
		\11, \12, \13, \14, \15, \16, \17, \18, \19, \20,
		\21, \22, \23, \24, \25, \26, \27, \28, \29, \30,
		\31, \32, \33, \34, \35, \36, \37, \38, \39, \40,
		\41, \42, \43, \44, \45, \46, \47, \48, \49, \50,
		\51, \52, \53, \54, \55, \56, \57, \58, \59, \60,
		\61, \62, \63, \64, \65, \66, \67, \68, \69, \70,
		\71, \72, \73, \74, \75, \76, \77, \78, \79, \80,
		\81, \82, \83, \84, \85, \86, \87, \88, \89, \90,
		\91, \92, \93, \94, \95, \96, \97, \98, \99, \100,
		
		\101, \102, \103, \104, \105, \106, \107, \108, \109, \110,
		\111, \112, \113, \114, \115, \116, \117, \118, \119, \120,
		\121, \122, \123, \124, \125, \126, \127, \128, \129, \130,
		\131, \132, \133, \134, \135, \136, \137, \138, \139, \140,
		\141, \142, \143, \144, \145, \146, \147, \148, \149, \150,
		\151, \152, \153, \154, \155, \156, \157, \158, \159, \160,
		\161, \162, \163, \164, \165, \166, \167, \168, \169, \170,
		\171, \172, \173, \174, \175, \176, \177, \178, \179, \180,
		\181, \182, \183, \184, \185, \186, \187, \188, \189, \190,
		\191, \192, \193, \194, \195, \196, \197, \198, \199, \200
		], inf
	),
	\dur, Pseq([~duyekKudDur], inf)
	)
);



*/