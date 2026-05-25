package VendingMachine;

public class IdleState implements State {

    @Override
    public void insertMoney(VendingMachine vm, int amount) {

        vm.setBalance(vm.getBalance() + amount);

        System.out.println(amount + " inserted");

        vm.setState(new HasMoneyState());
    }

    @Override
    public void selectProduct(VendingMachine vm, Product product) {
        System.out.println("Insert money first");
    }

    @Override
    public void dispense(VendingMachine vm) {
        System.out.println("No product selected");
    }
}
