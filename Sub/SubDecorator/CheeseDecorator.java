package Sub.SubDecorator;

import Sub.Sub;

public abstract class CheeseDecorator extends Sub {
    Sub sub;
	public abstract String getDescription();
}
