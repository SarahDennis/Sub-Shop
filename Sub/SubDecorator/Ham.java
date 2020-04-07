package Sub.SubDecorator;

import Sub.Sub;

public class Ham extends MeatDecorator {
	
	public Ham(Sub sub) {
        this.sub = sub;
    }

    @Override
    public double cost() {
        return 1.50 + sub.cost();
    }

    @Override
    public String getDescription() {
        return sub.getDescription() + ", Ham";
    }
}
