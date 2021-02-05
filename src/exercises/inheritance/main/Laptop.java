package exercises.inheritance.main;

public class Laptop extends Computer{
    private String operatingSystem;
    public Laptop(double price, int year, String brand, String operatingSystem) {
        super(price, year, brand);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}
