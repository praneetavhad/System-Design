package Splitwise;

class ExpenseService {

    BalanceSheet balanceSheet = new BalanceSheet();

    public void addExpense(Expense expense) {

        for (Split split : expense.splits) {
            balanceSheet.addBalance(
                    split.user.id,
                    expense.paidBy.id,
                    split.amount
            );
        }
    }
}