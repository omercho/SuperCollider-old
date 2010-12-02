

// disabled -- remove ...
+ Collection {
	*newFrom { | aCollection |
		var newCollection = this.new(aCollection.size);
		aCollection.do {| item | newCollection.add(item) };
		[this.class.name, thisMethod.name].postln;
		^newCollection
	}
	*with { | ... args |
		var newColl;
		// answer a collection of my class of the given arguments
		// the class Array has a simpler implementation
		newColl = this.new(args.size);
		newColl.addAll(args);
		[this.class.name, thisMethod.name].postln;
		^newColl
	}
	*fill { | size, function |
		var obj;
		obj = this.new(size);
		size.do { | i |
			obj.add(function.value(i));
		};
		[this.class.name, thisMethod.name].postln;
		^obj
	}	
}

/*

List[1, 2, 3];

[1, 2, 3];

*/