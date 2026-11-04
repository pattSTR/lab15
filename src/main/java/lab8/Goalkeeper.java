package lab8;

public class Goalkeeper extends Sportsman {
    // Уникальное поле
    private int saves;

    // Конструктор с вызовом super()
    public Goalkeeper(String name, String team, int number, int saves) {
        super(name, team, number); // вызов конструктора родителя
        this.saves = saves;
    }

    // Переопределение метода getPosition()
    @Override
    public String getPosition() {
        return "Вратарь";
    }

    // Уникальный метод для Goalkeeper
    public void makeSave() {
        saves++;
        System.out.println("Вратарь " + getName() + " совершил сейв! Всего сейвов: " + saves);
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }
}