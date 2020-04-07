package Sub.SubDecorator;

import Sub.Sub;

public class Chicken extends MeatDecorator {
	
	public Chicken(Sub sub) {
        this.sub = sub;
    }

    @Override
    public double cost() {
        return 1.25 + sub.cost();
    }

    @Override
    public String getDescription() {
        return sub.getDescription() + ", Chicken";
    }
}
