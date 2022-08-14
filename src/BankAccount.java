public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println(" ON YOUR ACCOUNT: " + sum + " SOM ");
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException(" YOU DON'T HAVE ENOUGH MONEY ", getAmount());
        } else {
            amount -= sum;
            System.out.println(" OPERATION COMPLETED SUCCESSFULLY! " +
                    " YOU BROUGHT OUT: " + sum + " SOM ");
        }
    }
}
