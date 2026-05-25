package PizzaTopping;

public class VeggiePizza implements Pizza {

    @Override
    public String getDescription() {
        return "Veggie Pizza";
    }

    @Override
    public int cost() {
        return 250;
    }
}
