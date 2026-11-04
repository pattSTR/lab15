package lab7;

public class Smartphone {
    // 1. Нестатические поля (у каждого объекта смартфона свои значения)
    private String model;
    private int memory;     // в гигабайтах (ГБ)
    private int cameraMP;   // мегапиксели

    // 2. Статические поля (общие для ВСЕГО класса Smartphone)
    private static int totalPhones = 0;   // счетчик созданных смартфонов
    private static int totalMemory = 0;   // сумма памяти всех смартфонов

    // 3. Конструктор
    public Smartphone(String model, int memory, int cameraMP) {
        this.model = model;
        this.memory = memory;
        this.cameraMP = cameraMP;

        // При создании каждого нового объекта увеличиваем статические счетчики:
        totalPhones++;
        totalMemory += memory;
    }

    // 4. Статический метод расчета средней памяти
    public static double getAverageMemory() {
        if (totalPhones == 0) {
            return 0.0;
        }
        // Приводим к double, чтобы деление было дробным
        return (double) totalMemory / totalPhones;
    }

    // Статические геттеры для получения общей статистики (хороший тон инкапсуляции)
    public static int getTotalPhones() {
        return totalPhones;
    }

    public static int getTotalMemory() {
        return totalMemory;
    }

    // Обычные геттеры для объекта
    public String getModel() {
        return model;
    }

    public int getMemory() {
        return memory;
    }

    public int getCameraMP() {
        return cameraMP;
    }

    // Метод для удобного вывода информации о конкретном смартфоне
    public void printInfo() {
        System.out.println("Модель: " + model + " | Память: " + memory + " ГБ | Камера: " + cameraMP + " Мп");
    }
}