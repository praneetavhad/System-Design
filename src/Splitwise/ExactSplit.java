package Splitwise;

class ExactSplit extends Split {

    public ExactSplit(User user, double amount) {
        super(user);
        this.amount = amount;
    }

    @Override
    public void calculateShare(double totalAmount, int totalUsers) {
        // No calculation required
    }
}
