/* 

Simplify the adding and removing of OSCresponders. 

Organize responders in groups. 

o = Org(\alpha->{ "alpha".postln }, \beta->{ "beta".postln; });


NetAddr.localAddr.sendMsg(\alpha);

o.deactivate;

*/


// OscResponder Group: 
Org : IdentityDictionary {

	*new { | ... args |
		var responders;
		responders = args collect: { | assoc |
			(assoc.key)->(OSCresponder(nil, assoc.key, assoc.value));
		};
		^super.new.addAll(responders).activate;
	}
	
	activate {
		this do: _.add;
	}
	
	deactivate {
		this do: _.remove;
	}
}