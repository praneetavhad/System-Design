package PizzaTopping;

public class MargheritaPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public int cost() {
        return 200;
    }
}
