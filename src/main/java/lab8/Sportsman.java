package lab8;

public class Sportsman {
    // 3 приватных поля согласно заданию
    private String name;
    private String team;
    private int number;

    // Конструктор с параметрами
    public Sportsman(String name, String team, int number) {
        this.name = name;
        this.team = team;
        this.number = number;
    }

    // Метод, который будет переопределяться в наследниках
    public String getPosition() {
        return "Универсальный спортсмен";
    }

    // Метод отображения информации
    public void displayInfo() {
        System.out.println("Игрок: " + name + " | Команда: " + team +
                " | Номер: #" + number + " | Позиция: " + getPosition());
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}