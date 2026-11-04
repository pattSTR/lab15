package lab9;

public class CheckingAccount extends Account {
    // Уникальное поле: кредитный лимит (овердрафт)
    private double overdraftLimit;

    public CheckingAccount(String number, double balance, String owner, double overdraftLimit) {
        super(number, balance, owner);
        this.overdraftLimit = overdraftLimit;
    }

    // На расчетном счете проценты не начисляются (по заданию -> 0)
    @Override
    public double calculateInterest() {
        return 0.0;
    }

    // Снятие без комиссии (но в пределах баланса + овердрафта)
    @Override
    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            System.out.printf("Снято: %.2f BYN (без комиссии). Новый баланс: %.2f BYN%n",
                    amount, getBalance());
        } else {
            System.out.println("Ошибка: превышен лимит овердрафта!");
        }
    }

    // Переопределение метода displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("   Тип счета: Расчетный | Лимит овердрафта: " + overdraftLimit + " BYN");
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}