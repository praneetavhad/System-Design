package VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        Product coke = new Product("Coke", 50);

        vm.insertMoney(100);

        vm.selectProduct(coke);
    }
}
