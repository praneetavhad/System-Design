package Splitwise;

class EqualSplit extends Split {

    public EqualSplit(User user) {
        super(user);
    }

    @Override
    public void calculateShare(double totalAmount, int totalUsers) {
        this.amount = totalAmount / totalUsers;
    }
}