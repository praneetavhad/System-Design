package VendingMachine;

public class HasMoneyState implements State {

    @Override
    public void insertMoney(VendingMachine vm, int amount) {

        vm.setBalance(vm.getBalance() + amount);

        System.out.println(amount + " added");
    }

    @Override
    public void selectProduct(VendingMachine vm, Product product) {

        if (vm.getBalance() < product.getPrice()) {
            System.out.println("Insufficient balance");
            return;
        }

        vm.setSelectedProduct(product);

        vm.setBalance(
                vm.getBalance() - product.getPrice()
        );

        vm.setState(new DispenseState());

        vm.dispense();
    }

    @Override
    public void dispense(VendingMachine vm) {
        System.out.println("Select product first");
    }
}
