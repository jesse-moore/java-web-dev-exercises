package exercises.inheritance.main;

public class SmartPhone extends Computer {
    private String network;

    public SmartPhone(double price, int year, String brand, String network) {
        super(price, year, brand);
        this.network = network;
    }

    public String getNetwork() {
        return network;
    }
}
