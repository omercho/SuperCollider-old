/* Example of a class 2

Igoumeninja 2010 11 17: 00:12 am


p = Posc(\msg, Pseq([['alpha', 100], ['beta', 200]], inf)).play;



p = Posc(\msg, Pseq([['alpha', 100], [['beta', 200], [\gamma, 300]]], inf)).play;


*/

Posc : Pbind {
	*initClass {
		Class.initClassTree(Event);
		Event.addEventType(\osc, {
			if (~msg.rank > 1) {
				~msg do: ~dest.sendBundle(~latency, _)
			}{
				~dest.sendBundle(~latency, ~msg);
			}
			});
	}

	*new { arg ... pairs; 	// add the type - osc pair, so we dont have to provide it explicitly
		pairs = pairs addAll: [\type, \osc];
		if (pairs includes: \dest) {} { pairs = pairs addAll: [\dest, NetAddr.localAddr] };
		^super.new(*pairs);
	}
}
