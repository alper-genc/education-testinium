package model;

public class Car {
    private long id;
    private String model;
    private String brand;
    private int year;
    // Constructor
    public Car(long id, String model, String brand, int year) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.year = year;
    }
    public Car() {
        this.id = 0;
        this.model = "Unknown";
        this.brand = "Unknown";
        this.year = 0;
    }
    // Getters and Setters
    public long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

}
