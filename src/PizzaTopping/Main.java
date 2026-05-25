package PizzaTopping;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();

        pizza = new CheeseDecorator(pizza);

        pizza = new MushroomDecorator(pizza);

        pizza = new OliveDecorator(pizza);

        System.out.println(pizza.getDescription());

        System.out.println("Total Cost: " + pizza.cost());
    }
}
