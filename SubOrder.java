
public class SubOrder implements Command{
    CreateOrder create;
    String[] meats; 
    String[] ingredients;
    String[] cheeses;
    String[] condiments;
    String type;

    public SubOrder(CreateOrder create, String type, String[] meats, String[] ingredients, String[] cheeses, String[] condiments){
        this.create = create;
        this.type = type;
        this.meats = meats;
        this.cheeses = cheeses;
        this.ingredients = ingredients;
        this.condiments = condiments;
    }

    @Override
    public void completeOrder() {
        CreateOrder.subType = type;
        CreateOrder.meats = this.meats;
        CreateOrder.ingredients = this.ingredients;
        CreateOrder.cheeses = this.cheeses;
        CreateOrder.condiments = this.condiments;
        create.getType("Sub");
    }
}
