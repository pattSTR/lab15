package lab9;

public class Lab9Main {
    public static void main(String[] args) {
        System.out.println("=== Лабораторная работа №9 (Вариант 7: Банковские счета) ===");

        // 1. Демонстрация того, что абстрактный класс НЕЛЬЗЯ инстанцировать напрямую:
        // Account test = new Account("111", 500, "Иван"); // Ошибка компиляции: 'Account' is abstract; cannot be instantiated

        // 2. Создаем массив абстрактного типа Account на 5 счетов
        // По заданию: 2 сберегательных и 3 расчетных
        Account[] accounts = new Account[5];

        accounts[0] = new SavingsAccount("BY01SAV001", 10000.0, "Иванов И.И.", 7.5);
        accounts[1] = new SavingsAccount("BY02SAV002", 2500.0, "Петров П.П.", 5.0);
        accounts[2] = new CheckingAccount("BY03CHK001", 1200.0, "ООО 'Вектор'", 500.0);
        accounts[3] = new CheckingAccount("BY04CHK002", 450.0, "Сидоров С.С.", 200.0);
        accounts[4] = new CheckingAccount("BY05CHK003", 8900.0, "ЗАО 'АйтиГрупп'", 2000.0);

        // 3. Полиморфный вызов методов в цикле
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("\n----------------------------------------------");
            accounts[i].displayInfo();

            // Расчет процентов
            double interest = accounts[i].calculateInterest();
            System.out.printf("Начисленные проценты за год: %.2f BYN%n", interest);

            // Демонстрация операции снятия (полиморфизм)
            System.out.print("Попытка снятия 500 BYN: ");
            accounts[i].withdraw(500.0);
        }
    }
}