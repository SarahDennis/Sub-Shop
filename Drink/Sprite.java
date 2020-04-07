package Drink;

public class Sprite extends ColdDrink {
	
    @Override
    public double cost() {
        return 2.5;
    }

    @Override
    public String getDescription() {
        return "Sprite";
    }
}
