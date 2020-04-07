import java.util.Scanner;

public class Client {
	static Scanner input = new Scanner(System. in);
	
	
	public static void main(String[] args) {
		int choice;
		Waiter waiter = new Waiter();
		CreateOrder order = new CreateOrder();
		
		while (true) {
			//This is the options menu
			System.out.println("What would you like to order?");
			System.out.println("1. Order a Sub");
			System.out.println("2. Order a Drink");
			System.out.println("3. Finish");
			choice = input.nextInt();
			
			
			//This will go through the process to make a sub
			if (choice == 1) {
				String subType = getSubType();
				String[] meat = getMeat();
				String[] ingredients = getIngredients();
				String[] cheeses = getCheese();
				String[] condiments = getCondiments();
				SubOrder subOrder = new SubOrder(order, subType, meat, ingredients, cheeses, condiments);
				waiter.takeOrder(subOrder);
			}
			//This will go through the process to get the drink
			else if (choice == 2) {
				String drink = getDrink(); 
				DrinkOrder drinkOrder = new DrinkOrder(order, drink);
				waiter.takeOrder(drinkOrder);
				
			}
			//This is if they finish their order
			else if (choice == 3) {
				break;
			}
			else {
				System.out.println("Invalid input, try again");
			}
		}
			
	}
	



	//*******************************************************************************************
	//Function to get drink
	//*******************************************************************************************
	private static String getDrink() {
		String drink;
		int choice;
		
		System.out.println("\n\n What drink would you like to order?");
		System.out.println("1. Tea");
		System.out.println("2. Coffee");
		System.out.println("3. Coca Cola");
		System.out.println("4. Red Bull");
		System.out.println("5. Sprite");
		System.out.println("6. Pepsi");
		
		
		while (true) {
			choice = input.nextInt();
			if (choice == 1) {
				drink = "Tea";
				break;
			}
			else if (choice == 2){
				drink = "Coffee";
				break;
			}
			else if (choice == 3){
				drink = "Coca Cola";
				break;
			}
			else if (choice == 4){
				drink = "Red Bull";
				break;
			}
			else if (choice == 5){
				drink = "Sprite";
				break;
			}
			else if (choice == 6) {
				drink = "Pepsi";
				break;
			} else {
				System.out.println("Invalid input, try again");
			}
			
		}
		
		
		return drink;
	}


	
	
	//*******************************************************************************************
	//Functions to get all the different sub items
	//*******************************************************************************************
	private static String[] getCondiments() {
		int choice;
		int amountOfCondiments;
		
		System.out.println("\n\n How many condiments do you want on your sub?");
		System.out.println("\nChoices: ");
		System.out.println("Mustard, Mayo");
		amountOfCondiments = input.nextInt();
		String [] condiments = new String[amountOfCondiments];
		
		System.out.println("\n\n What condiments would you like to have?");
		System.out.println("1. Mustard");
		System.out.println("2. Mayo");
		
		for (int i = 0; i < amountOfCondiments; i++) {
			choice = input.nextInt();
			
			if (choice == 1) {
				condiments[i] = "Mustard";
			} 
			else if (choice == 2) {
				condiments[i] = "Mayo";
			}
		}
		
		
		return condiments;
	}



	private static String[] getIngredients() {
		int choice;
		int amountOfIngredients;
		
		System.out.println("\n\n How many ingredients do you want on your sub?");
		System.out.println("\nChoices: ");
		System.out.println("Lettuce, Onion, Pepper, Tomato");
		amountOfIngredients = input.nextInt();
		String [] ingredients = new String[amountOfIngredients];
		
		System.out.println("\n\n What ingredients would you like to have?");
		System.out.println("1. Lettuce");
		System.out.println("2. Onion");
		System.out.println("3. Pepper");
		System.out.println("4. Tomato");
		
		
		for (int i = 0; i < amountOfIngredients; i++) {
			choice = input.nextInt();
			
			if (choice == 1) {
				ingredients[i] = "Lettuce";
			} 
			else if (choice == 2) {
				ingredients[i] = "Onion";
			}
			else if (choice == 3) {
				ingredients[i] = "Pepper";
			}
			else if (choice == 4) {
				ingredients[i] = "Tomato";
			}
		}
		
		
		return ingredients;
	}



	private static String[] getMeat() {
		int choice;
		int amountOfMeat;
		
		
		
		System.out.println("\n\n How many slices of meat do you want on your sub?");
		System.out.println("\nChoices: ");
		System.out.println("Chicken, Ham");
		amountOfMeat = input.nextInt();
		String [] meat = new String[amountOfMeat];
		
		System.out.println("\n\n What ingredients would you like to have?");
		System.out.println("1. Chicken");
		System.out.println("2. Ham");
		
		
		for (int i = 0; i < amountOfMeat; i++) {
			choice = input.nextInt();
			
			if (choice == 1) {
				meat[i] = "Chicken";
			} 
			else if (choice == 2) {
				meat[i] = "Ham";
			}
		}
		
		
		return meat;
	}



	public static String getSubType() {
		int choice;
		String order;
		
		System.out.println("\n\n What kind of bread would you like to have?");
		System.out.println("1. White Bread");
		System.out.println("2. Whole Wheat Bread");
		
		choice = input.nextInt();
		
		while (true) {
			if (choice == 1) {
				order = "White Bread";
				break;
			}
			else if (choice == 2){
				order = "Wheat Bread";
				break;
			}
			else {
				System.out.println("Invalid input, try again");
			}
		}
		
		return order;
	}
	
	
	private static String[] getCheese() {
		int choice;
		int amountOfCheese;
		
		
		
		System.out.println("\n\n How many slices of cheese do you want on your sub?");
		System.out.println("\nChoices: ");
		System.out.println("American, Swiss, Provolone");
		amountOfCheese = input.nextInt();
		String [] cheese = new String[amountOfCheese];
		
		System.out.println("\n\n What cheese would you like to have?");
		System.out.println("1. American");
		System.out.println("2. Swiss");
		System.out.println("3. Provolone");
		
		
		for (int i = 0; i < amountOfCheese; i++) {
			choice = input.nextInt();
			
			if (choice == 1) {
				cheese[i] = "American";
			} 
			else if (choice == 2) {
				cheese[i] = "Swiss";
			}
			else if (choice == 3) {
				cheese[i] = "Provolone";
			}
		}
		
		
		return cheese;
	}

}
