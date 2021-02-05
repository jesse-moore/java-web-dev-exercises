package exercises.inheritance.main;

public abstract class Computer extends AbstractEntity {
    private double price;
    private int year;
    private String brand;

    public Computer(double price, int year, String brand) {
        this.price = price;
        this.year = year;
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public double discountPrice(double discount){
        return this.price - ((discount/100) * this.price);
    }
}
