package lab9;

public class SavingsAccount extends Account {
    // Уникальное поле: процентная ставка (в %)
    private double rate;

    public SavingsAccount(String number, double balance, String owner, double rate) {
        super(number, balance, owner);
        this.rate = rate;
    }

    // Реализация абстрактного метода начисления процентов
    @Override
    public double calculateInterest() {
        return getBalance() * (rate / 100.0);
    }

    // Реализация абстрактного метода снятия (комиссия 1%)
    @Override
    public void withdraw(double amount) {
        double commission = amount * 0.01;
        double totalToWithdraw = amount + commission;

        if (getBalance() >= totalToWithdraw) {
            setBalance(getBalance() - totalToWithdraw);
            System.out.printf("Снято: %.2f BYN (комиссия 1%%: %.2f BYN). Новый баланс: %.2f BYN%n",
                    amount, commission, getBalance());
        } else {
            System.out.println("Ошибка: недостаточно средств для снятия с учетом комиссии!");
        }
    }

    // Переопределение метода displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("   Тип счета: Сберегательный | Ставка: " + rate + "%");
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}