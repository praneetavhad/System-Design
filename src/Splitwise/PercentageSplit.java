package Splitwise;

class PercentageSplit extends Split {

    double percent;

    public PercentageSplit(User user, double percent) {
        super(user);
        this.percent = percent;
    }

    @Override
    public void calculateShare(double totalAmount, int totalUsers) {
        this.amount = (percent / 100.0) * totalAmount;
    }
}