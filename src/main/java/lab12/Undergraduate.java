package lab12;

public class Undergraduate extends Student {
    private int year;

    public Undergraduate(String name, int id, int grade, int year) {
        super(name, id, grade);
        this.year = year;
    }

    @Override
    public String toString() {
        return "Undergraduate [" + super.toString() + ", Курс: " + year + "]";
    }
}