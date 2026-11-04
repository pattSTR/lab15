package lab12;

public class PhD extends Student {
    private int publications;

    public PhD(String name, int id, int grade, int publications) {
        super(name, id, grade);
        this.publications = publications;
    }

    @Override
    public String toString() {
        return "PhD [" + super.toString() + ", Публикаций: " + publications + "]";
    }
}