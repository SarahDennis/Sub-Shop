package Sub.SubDecorator;

import Sub.Sub;

public class Mustard extends CondimentDecorator {
    public Mustard(Sub sub) {
        this.sub = sub;
    }

    @Override
    public double cost() {
        return 0.10 + sub.cost();
    }

    @Override
    public String getDescription() {
        return sub.getDescription() + ", Mustard";
    }
}
