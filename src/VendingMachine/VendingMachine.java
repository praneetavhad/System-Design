package VendingMachine;

public class VendingMachine {

    private State currentState;
    private int balance;
    private Product selectedProduct;

    public VendingMachine() {
        currentState = new IdleState();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void insertMoney(int amount) {
        currentState.insertMoney(this, amount);
    }

    public void selectProduct(Product product) {
        currentState.selectProduct(this, product);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }
}
