package PizzaTopping;

public class OliveDecorator extends ToppingDecorator {

    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olive";
    }

    @Override
    public int cost() {
        return pizza.cost() + 40;
    }
}
