import java.util.Scanner;

class Vehicle1 {
    private String brand;
    private String countryOfOrigin;
    private double basePrice;
    
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter brand: ");
        this.brand = scanner.nextLine();
        System.out.print("Enter country of origin: ");
        this.countryOfOrigin = scanner.nextLine();
        System.out.print("Enter base price: ");
        this.basePrice = scanner.nextDouble();
    }
    
    public void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Country of Origin: " + this.countryOfOrigin);
        System.out.println("Base price: " + this.basePrice);
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public String getCountryOfOrigin() {
        return this.countryOfOrigin;
    }
    
    public double getBasePrice() {
        return this.basePrice;
    }
}

class Car extends Vehicle {
    private String model;
    private double speed;
    private double marketPrice;
    
    public void read() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Enter model: ");
        this.model = scanner.nextLine();
        System.out.print("Enter speed: ");
        this.speed = scanner.nextDouble();
        this.marketPrice = this.speed > 80 ? this.getBasePrice() * 1.15 : this.getBasePrice() * 0.95;
    }
    
    public void show() {
        super.display();
        System.out.println("Model: " + this.model);
        System.out.println("Speed: " + this.speed);
        System.out.println("Market price: " + this.marketPrice);
    }
    
    public double getSpeed() {
        return this.speed;
    }
    
    public double getMarketPrice() {
        return this.marketPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.read();
        c.show();
    }
}

