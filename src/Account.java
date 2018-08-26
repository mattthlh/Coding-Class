public class Account {

    private double balance;
    private String name;
    private String email;
    private String phone;

    public Account(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public void depositMoney(double amount) {
        this.balance += amount;
    }

    public void withdrawMoney(double amount) {
        this.balance -= amount;
    }
}
