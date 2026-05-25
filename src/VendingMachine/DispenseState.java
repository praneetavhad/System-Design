package VendingMachine;

public class DispenseState implements State {

    @Override
    public void insertMoney(VendingMachine vm, int amount) {
        System.out.println("Wait. Dispensing product");
    }

    @Override
    public void selectProduct(VendingMachine vm, Product product) {
        System.out.println("Already processing");
    }

    @Override
    public void dispense(VendingMachine vm) {

        System.out.println(
                "Dispensed: " +
                        vm.getSelectedProduct().getName()
        );

        vm.setSelectedProduct(null);

        vm.setState(new IdleState());
    }
}
