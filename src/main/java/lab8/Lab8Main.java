package lab8;

public class Lab8Main {
    public static void main(String[] args) {
        System.out.println("=== Лабораторная работа №8 (Вариант 7: Спортсмены) ===");

        // Создаем массив базового типа Sportsman на 5 элементов
        Sportsman[] team = new Sportsman[5];

        // Распределяем объекты: 3 Forward (нападающих), 2 Goalkeeper (вратаря)
        team[0] = new Forward("Лионель Месси", "Интер Майами", 10, 820);
        team[1] = new Forward("Криштиану Роналду", "Аль-Наср", 7, 870);
        team[2] = new Forward("Килиан Мбаппе", "Реал Мадрид", 9, 280);
        team[3] = new Goalkeeper("Тибо Куртуа", "Реал Мадрид", 1, 450);
        team[4] = new Goalkeeper("Мануэль Нойер", "Бавария", 1, 620);

        // Демонстрация полиморфизма и работы уникальных методов
        for (int i = 0; i < team.length; i++) {
            System.out.println("\n--- Игрок №" + (i + 1) + " ---");
            team[i].displayInfo();

            // Проверка типа объекта и вызов уникальных методов (Downcasting)
            if (team[i] instanceof Forward) {
                Forward f = (Forward) team[i];
                f.scoreGoal();
            } else if (team[i] instanceof Goalkeeper) {
                Goalkeeper gk = (Goalkeeper) team[i];
                gk.makeSave();
            }
        }
    }
}