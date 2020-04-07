package Sub.SubDecorator;

import Sub.Sub;

public class Onion extends IngredientDecorator {
	
	public Onion(Sub sub) {
        this.sub = sub;
    }

    @Override
    public double cost() {
        return 0.85 + sub.cost();
    }

    @Override
    public String getDescription() {
        return sub.getDescription() + ", Onion";
    }
}
