package Splitwise;

import java.util.*;

class Expense {
    String id;
    double amount;
    User paidBy;
    List<Split> splits;

    public Expense(String id, double amount, User paidBy, List<Split> splits) {
        this.id = id;
        this.amount = amount;
        this.paidBy = paidBy;
        this.splits = splits;
    }
}