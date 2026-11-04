package lab8;

public class Forward extends Sportsman {
    // Уникальное поле
    private int goals;

    // Конструктор с вызовом super()
    public Forward(String name, String team, int number, int goals) {
        super(name, team, number); // вызов конструктора родительского класса
        this.goals = goals;
    }

    // Переопределение метода getPosition()
    @Override
    public String getPosition() {
        return "Нападающий";
    }

    // Уникальный метод для Forward
    public void scoreGoal() {
        goals++;
        System.out.println(getName() + " забивает гол! Всего голов за сезон: " + goals);
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
}