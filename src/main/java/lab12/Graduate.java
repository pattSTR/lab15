package lab12;

public class Graduate extends Student {
    private String thesis;

    public Graduate(String name, int id, int grade, String thesis) {
        super(name, id, grade);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return "Graduate [" + super.toString() + ", Тема: " + thesis + "]";
    }
}