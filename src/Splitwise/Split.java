package Splitwise;

abstract class Split {
    User user;
    double amount;

    public Split(User user) {
        this.user = user;
    }

    public abstract void calculateShare(double totalAmount, int totalUsers);
}