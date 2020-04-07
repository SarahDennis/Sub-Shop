package Drink;

public abstract class ColdDrink implements Drink {
    public abstract double cost();
    public abstract String getDescription();

    @Override
    public void createDrink() {
        openDrink();
        pour();
        drinkingStraw();
    }

    public void openDrink(){
        System.out.println("Opening the container");
    }

    public void pour(){
        System.out.println("Pouring the drink into the cup");
    }

    public void drinkingStraw(){
        System.out.println("Putting the straw into the cup");
    }
}
