package Drink;

public class Tea extends HotDrink {
    double cost = 2.0;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Tea";
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }
}
