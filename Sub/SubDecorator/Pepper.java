package Sub.SubDecorator;

import Sub.Sub;

public class Pepper extends CondimentDecorator {
	
	public Pepper(Sub sub) {
        this.sub = sub;
    }

    @Override
    public double cost() {
        return 2.5 + sub.cost();
    }

    @Override
    public String getDescription() {
        return sub.getDescription() + ", Pepper";
    }
}
