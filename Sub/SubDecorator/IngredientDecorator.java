package Sub.SubDecorator;

import Sub.Sub;

public abstract class IngredientDecorator extends Sub {
    Sub sub;
    public abstract String getDescription();
}
