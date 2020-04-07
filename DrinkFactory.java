import Drink.*;

public class DrinkFactory {

    public Drink makeDrink(String drinkType) {
        if (drinkType.equals(null)){
            return null;
        }
        else if(drinkType.equals("Tea")){
            return new Tea();
        }
        else if(drinkType.equals("Coffee")){
            return new Coffee();
        }
        else if(drinkType.equals("Coca Cola")){
            return new CocaCola();
        }
        else if(drinkType.equals("Red Bull")){
            return new RedBull();
        }
        else if(drinkType.equals("Sprite")){
            return new Sprite();
        }
        else if(drinkType.equals("Pepsi")){
            return new Pepsi();
        }
        return null;
    }
}
