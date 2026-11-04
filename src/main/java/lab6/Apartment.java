package lab6;

public class Apartment {
    private String address;
    private int rooms;
    private double area;
    private int Test1;
    private static int Test2;















































    public Apartment(String address, int rooms, double area) {
        this.address = address;
        setRooms(rooms);
        setArea(area);
    }

    public double pricePerSquareMeter(double totalPrice) {
        if (area <= 0) {
            System.out.println("Ошибка: площадь квартиры должна быть больше 0!");
            return 0;
        }
        return totalPrice / area;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if (rooms > 0) {
            this.rooms = rooms;
        } else {
            System.out.println("Ошибка: количество комнат должно быть больше 0!");
        }
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area > 0) {
            this.area = area;
        } else {
            System.out.println("Ошибка: площадь должна быть больше 0!");
        }
    }
}