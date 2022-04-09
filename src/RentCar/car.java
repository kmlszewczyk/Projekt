package RentCar;

public class car {
    private String id;
    private String brand;
    private String model;
    private String color;
    private int registrationNumber;

    public car(String id, String brand, String model, String color, int registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registrationNumber = registrationNumber;

    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }
}