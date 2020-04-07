package Sub.SubDecorator;

import Sub.Sub;

public class American extends CheeseDecorator {
	
	public American(Sub sub) {
		this.sub = sub;
	}
	
	@Override
	public String getDescription() {
		return sub.getDescription() + ", American Cheese";
	}

	@Override
	public double cost() {
		return 0.25 + sub.cost();
	}

}
