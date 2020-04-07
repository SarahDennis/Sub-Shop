import Sub.*;

public class SubFactory {

    public Sub makeSub(String subType) {
        if (subType.equals(null)){
            return null;
        }
        else if (subType.equals("White Bread")){
            return new WhiteBread();
        }
        else if (subType.equals("Wheat Bread")){
            return new WheatBread();
        }
        return null;
    }
}
