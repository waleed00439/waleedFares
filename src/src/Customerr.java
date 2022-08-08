public class  Customerr {

    private int id;
    private aCustomer aCustomer;
    private double balance;

    public Customerr(int id, aCustomer aCustomer, double balance) {
        this.id = id;
        this.aCustomer = aCustomer;
        this.balance = balance;
    }

    public Customerr(aCustomer aCustomer) {
        this.aCustomer = aCustomer;
    }

    public int getId() {
        return id;
    }

    public aCustomer getaCustomer() {
        return aCustomer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return aCustomer.toString() +
                ", balance=" + balance;
    }

    public Customerr deposit(double amount) {
        balance += amount;
        return this;
    }

    public String getaCustomername() {
        return getaCustomername();
    }

    public Customerr withdraw(double amount) {
        if (balance >= amount) {
            this.balance = amount;
        } else {
            System.out.println("amount withdrawnexceeds the current balance");
        }


        return null;
    }
}
