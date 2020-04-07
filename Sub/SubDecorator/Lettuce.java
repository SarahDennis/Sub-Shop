package Sub.SubDecorator;

import Sub.Sub;

public class Lettuce extends IngredientDecorator {
	
	public Lettuce(Sub sub) {
        this.sub = sub;
    }

    @Override
    public double cost() {
        return 0.60 + sub.cost();
    }

    @Override
    public String getDescription() {
        return sub.getDescription() + ", Lettuce";
    }
}
