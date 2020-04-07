package Sub.SubDecorator;

import Sub.Sub;

public class Swiss extends CheeseDecorator {
	
	public Swiss(Sub sub) {
		this.sub = sub;
	}
	
	@Override
	public String getDescription() {
		return sub.getDescription() + ", Swiss Cheese";
	}

	@Override
	public double cost() {
		return 0.50 + sub.cost();
	}

}
