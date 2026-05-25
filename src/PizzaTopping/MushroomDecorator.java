package PizzaTopping;

public class MushroomDecorator extends ToppingDecorator {

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushroom";
    }

    @Override
    public int cost() {
        return pizza.cost() + 70;
    }
}
