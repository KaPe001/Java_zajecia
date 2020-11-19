package metody03;

public class Car {
    String brand = "honda";
    String model = "civic";
    double price = 100.00;

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void getBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void getModel(String model){
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void getPrice(double price){
        this.price = price;
    }

    public String toString() {
        return brand + price;
    }
}
