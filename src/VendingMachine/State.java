package VendingMachine;


public interface State {

    void insertMoney(VendingMachine vm, int amount);

    void selectProduct(VendingMachine vm, Product product);

    void dispense(VendingMachine vm);
}
