package lab12;

public class Student {
    protected String name;
    protected int id;
    protected int grade;

    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Имя: " + name + ", Оценка: " + grade;
    }
}