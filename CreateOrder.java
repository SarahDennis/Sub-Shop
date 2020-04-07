import Drink.Drink;
import Sub.Sub;
import Sub.SubDecorator.*;

public class CreateOrder {
	Sub sub;
	Drink drink;
	
    public static String subType;
    public static String drinkType;
    public static String[] meats;
    public static String[] ingredients;
    public static String[] cheeses;
    public static String[] condiments;
   
    
    public void getType(String factoryType){
        if (factoryType.equalsIgnoreCase("Sub")) {
            System.out.println("Order: " + subType + " is received.");

            SubFactory factory =  new SubFactory();
            sub = factory.makeSub(subType);

            sub.prepareToBake(subType);
            sub.bakingBread(subType);
            sub.completePrep(subType);
            sub = decorate(meats, ingredients, cheeses, condiments);
            
            double cost = Math.round(sub.cost() * 100.0) / 100.0;

            System.out.println(sub.getDescription() + " order completed.");
            System.out.println("Cost: $" + cost);

        }
        else if (factoryType.equalsIgnoreCase("Drink")) {
            System.out.println("Order: " + drinkType + " is received.");

            DrinkFactory factory = new DrinkFactory();
            drink = factory.makeDrink(drinkType);
            drink.createDrink();

            System.out.println("Order: " + drink.getDescription() + " is complete.");
            System.out.println("Cost: $" + drink.cost());
        }
        System.out.println("");
    }

    public Sub decorate(String[] meats, String[] ingredients, String[] cheeses, String[] condiments) {
        for (int i = 0; i < meats.length; i++) {
            String meat = meats[i];
            
            if(meat.equals("Ham")){
                sub = new Ham(sub);
            }
            else if(meat.equals("Chicken")){
                sub = new Chicken(sub);
            }
        }

        for (int i = 0; i < ingredients.length; i++) {
            String ingredient = ingredients[i];
            
            if(ingredient.equals("Tomato")){
                sub = new Tomato(sub);
            }
            else if(ingredient.equals("Lettuce")){
                sub = new Lettuce(sub);
            }
            else if(ingredient.equals("Onion")){
                sub = new Onion(sub);
            }
        }
        
        for (int i = 0; i < cheeses.length; i++) {
        	String cheese = cheeses[i];
        	
        	if (cheese.equals("Provolone")) {
        		sub = new Provolone(sub);
        	}
        	else if (cheese.equals("Swiss")) {
        		sub = new Swiss(sub);
        	}
        	else if (cheese.equals("American")) {
        		sub = new American(sub);
        	}
        	
        }

        for (int i = 0; i < condiments.length; i++) {
            String condiment = condiments[i];
            
            if(condiment.equals("Mayo")){
                sub = new Mayo(sub);
            }
            else if(condiment.equals("Mustard")){
                sub = new Mustard(sub);
            }
            else if(condiment.equals("Pepper")){
                sub = new Pepper(sub);
            }
        }
        return sub;
    }
}
