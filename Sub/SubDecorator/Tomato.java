package Sub.SubDecorator;

import Sub.Sub;

public class Tomato extends IngredientDecorator {
	
	public Tomato(Sub sub) {
        this.sub = sub;
    }

    @Override
    public double cost() {
        return 0.75 + sub.cost();
    }

    @Override
    public String getDescription() {
        return sub.getDescription() + ", Tomato";
    }
}
