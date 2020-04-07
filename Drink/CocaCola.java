package Drink;

public class CocaCola extends ColdDrink {
	
    @Override
    public double cost() {
        return 2.5;
    }

    @Override
    public String getDescription() {
        return "Coca Cola";
    }
}
