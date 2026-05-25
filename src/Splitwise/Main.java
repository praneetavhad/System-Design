package Splitwise;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1. Create Users
        User u1 = new User("U1", "Alice");
        User u2 = new User("U2", "Bob");
        User u3 = new User("U3", "Charlie");

        // 2. Create Splits (Equal Split example)
        List<Split> splits = new ArrayList<>();
        splits.add(new EqualSplit(u1));
        splits.add(new EqualSplit(u2));
        splits.add(new EqualSplit(u3));

        // 3. Create Expense (Alice pays 300)
        Expense expense = new Expense("E1", 300, u1, splits);

        // 4. Process Expense
        ExpenseService expenseService = new ExpenseService();
        expenseService.addExpense(expense);

        // 5. Show balances
        expenseService.balanceSheet.showBalance("U2");
        expenseService.balanceSheet.showBalance("U3");
    }
}