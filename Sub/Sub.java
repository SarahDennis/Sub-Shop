// Component

package Sub;

public abstract class Sub {
    String description = "";

    public abstract double cost();

    public String getDescription( ){
        return description;
    }

    public void prepareToBake(String type) {
        System.out.println("Preparing to bake "+ type);
    }

    public void bakingBread(String type) {
        System.out.println("Baking the " + type);
    }

    public void completePrep(String type) {
        System.out.println("Placing the " + type + " on the counter");
    }
}
