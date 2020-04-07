package Drink;

public class RedBull extends ColdDrink {
	
    @Override
    public double cost() {
        return 6.0;
    }

    @Override
    public String getDescription() {
        return "Red Bull";
    }
}
