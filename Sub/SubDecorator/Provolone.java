package Sub.SubDecorator;

import Sub.Sub;

public class Provolone extends CheeseDecorator {
	
	public Provolone(Sub sub) {
		this.sub = sub;
	}
	
	@Override
	public String getDescription() {
		return sub.getDescription() + ", Provolone Cheese";
	}

	@Override
	public double cost() {
		return 0.45 + sub.cost();
	}
}
