UniqueWindow : UniqueObject {
	*mainKey { ^[UniqueWindow] } // all subclasses store instances under UniqueWindow
	*removedMessage { ^\closed }

	init { | windowFunc |
		super.init(windowFunc ?? { Window(key.last.asString).front });
		object.onClose = {
			this.remove;
			object.releaseDependants;
			object = nil;	
		}
	}
	
	*front { | windowName |
		var window;
		window = this.at(windowName);
		if (window.notNil) { window.front };
	}
	
	// shortcuts and synonyms
	window { ^object }
	name { ^object.name }
	bounds { ^object.bounds }
	front { object.front }
	close { { object.close }.defer(0.01); /* prevent crashing when closing from keyboard on window */ }
	
	// Utilities: types of commonly used windows
	*listWindow { | key = 'list', bounds, getItemsAction, getIndexAction, notifier, messages, title, delay = 0.0 |
		var ulistwindow, screenBounds, centerX, centerY, itemsHeight;
		ulistwindow = this.new(key, {
			var w, view, listview, searchview, items;
			w = Window(title ? key, bounds ?? { Rect(500, 500, 500, 500) });
			view = w.view;
			searchview = TextView(w, view.bounds.height = 20).font = Font("Helvetica", 12);
			searchview.focusColor = Color.red;
			searchview.keyDownAction = { | view, char, mod, unicode, key |
				switch (unicode, 
				13, {
					listview.doAction;
					{ view.string = ""; }.defer(0.01);
				},
				16rF700, { listview.value = listview.value - 1; },
				16rF701, { listview.value = listview.value + 1; },
				16rF702, { listview.value = 0; },
				16rF703, { listview.value = listview.items.size - 1; },
				{
					{	
						var string, item;
						string = view.string;
						item = items.select({ | i | ("^" ++ string).matchRegexp(i.key.asString) }).first;
						listview.value = items.indexOf(item) ? 0;
					}.defer(0.001); // must defer to get the latest string !!!
				})
			};
			listview = EZListView(w, view.bounds.insetBy(0, 12).top = 24);
//			listview.widget.font = Font("TrebuchetMS", 10);
			listview.widget.resize = 5;
			listview.widget.parent.resize = 5;
			listview.items = items = getItemsAction.value;
			w.addDependant({ | me |
				{	items;
					listview.items = items = getItemsAction.(ulistwindow);
					listview.value = getIndexAction.(items) ? 0;
				}.defer(delay);
			});
			w.toFrontAction = { searchview.focus };
			if (bounds.isNil) {
				screenBounds = Window.screenBounds;
				centerX = screenBounds.width / 2;
				itemsHeight = items.size max: 3 * 18 + 30 min: screenBounds.height;
				centerY = screenBounds.height - itemsHeight / 2;
				w.bounds = Rect(centerX - 200, centerY, 400, itemsHeight);
			};
			w;
		});
		messages.asArray do: { | m | 
			ulistwindow.addNotifier(notifier, m, { | me | me.window.changed; });
		};
		^ulistwindow.front;
	}
}

/* 
// Fonts tried out for listWindow / listview: 

// 			listview.widget.font = Font("Helvetica", 10);
//			listview.widget.font = Font("ArialNarrow", 12);
//			listview.widget.font = Font("Impact", 11);
//			listview.widget.font = Font("GillSans", 11);
//			listview.widget.font = Font("Futura", 12);
//			listview.widget.font = Font("Skia-Regular_Condensed", 12);
			listview.widget.font = Font("Optima", 10);
			listview.widget.font = Font("TrebuchetMS", 10);


*/