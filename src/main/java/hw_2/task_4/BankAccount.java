package hw_2.task_4;
/*
Класс BankAccount
Создайте класс BankAccount с полями owner и balance. Реализуйте конструктор, геттеры,
сеттер для владельца, методы deposit(amount) и withdraw(amount) и метод printBalance().
В main внесите деньги, снимите и выведите баланс.
 */
public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("Owner: " + this.owner + ", balance: " + this.balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Smith", 10000);
        account.deposit(2000);
        account.withdraw(1000);

        account.printBalance();
    }
}
