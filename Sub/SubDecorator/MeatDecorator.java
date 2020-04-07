package Sub.SubDecorator;
import Sub.Sub;

public abstract class MeatDecorator extends Sub {
    Sub sub;
    public abstract String getDescription();
}
