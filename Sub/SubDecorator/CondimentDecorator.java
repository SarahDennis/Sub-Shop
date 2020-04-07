package Sub.SubDecorator;

import Sub.Sub;

public abstract class CondimentDecorator extends Sub {
	Sub sub;
    public abstract String getDescription();
}
