package Drink;

public abstract class HotDrink implements Drink {
    public abstract double cost();
    public abstract String getDescription();

    @Override
    public void createDrink() {
        boil();
        brew();
        pour();
    }

    public void boil(){
        System.out.println("Boiling the water");
    }

    public abstract void brew();

    public void pour(){
        System.out.println("Pouring into cup");
    }
}
