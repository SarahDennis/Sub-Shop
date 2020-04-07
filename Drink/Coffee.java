package Drink;

public class Coffee extends HotDrink {
    double cost = 5.0;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }
}
