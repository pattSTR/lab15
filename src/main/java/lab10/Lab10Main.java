package lab10;

public class Lab10Main {
    public static void main(String[] args) {
        System.out.println("=== Лабораторная работа №10 (Вариант 7: Спортивные игры) ===");

        Playable[] matches = new Playable[5];

        matches[0] = new Football("Реал Мадрид", "Барселона", 90);
        matches[1] = new Football("Динамо Минск", "БАТЭ", 90);
        matches[2] = new Basketball("Лейкерс", "Голден Стэйт", 48);
        matches[3] = new Basketball("Бостон Селтикс", "Чикаго Буллз", 48);
        matches[4] = new Basketball("Цмоки-Минск", "Зенит", 40);

        for (int i = 0; i < matches.length; i++) {
            System.out.println("\n--- Матч #" + (i + 1) + " ---");

            matches[i].play();
            System.out.println("Время игры: " + matches[i].getDuration() + " минут");

            if (matches[i] instanceof Scorable) {
                Scorable scorableMatch = (Scorable) matches[i];
                scorableMatch.score();
                scorableMatch.score();
                System.out.println("Текущий счет: " + scorableMatch.getScore());
            }
        }
    }
}