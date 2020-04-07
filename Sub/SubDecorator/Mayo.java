package Sub.SubDecorator;

import Sub.Sub;

public class Mayo extends CondimentDecorator {
	
	public Mayo(Sub sub) {
        this.sub = sub;
    }

    @Override
    public double cost() {
        return 0.35 + sub.cost();
    }

    @Override
    public String getDescription() {
        return sub.getDescription() + ", Mayo";
    }
}
