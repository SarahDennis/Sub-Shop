
public class DrinkOrder implements Command{
    CreateOrder create;
    String type;
    
    public DrinkOrder(CreateOrder create, String type){
        this.create = create;
        this.type = type;
    }

    @Override
    public void completeOrder() {
        CreateOrder.drinkType = type;
        create.getType("Drink");
    }
}
