package lab9;

public abstract class Account {
    // 1. Приватные поля базового абстрактного класса
    private String number;
    private double balance;
    private String owner;

    // 2. Конструктор
    public Account(String number, double balance, String owner) {
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }

    // 3. Абстрактные методы (без реализации — тело пишется в классах-наследниках)
    public abstract double calculateInterest();
    public abstract void withdraw(double amount);

    // 4. Конкретный метод
    public void displayInfo() {
        System.out.printf("Счет №%s | Владелец: %-15s | Баланс: %.2f BYN%n", number, owner, balance);
    }

    // Геттеры и сеттеры
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}