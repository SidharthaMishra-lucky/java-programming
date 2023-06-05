import java.util.Scanner;
class Vehicle 
{
private String brand;
private String country_of_origin;
private double base_price;
public void input() 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter brand: ");
this.brand = sc.nextLine();
System.out.println("Enter country of origin: ");
this.country_of_origin = sc.nextLine();
System.out.println("Enter base price: ");
this.base_price = sc.nextDouble();
}
public void display() 
{
System.out.println("Brand: " + this.brand);
System.out.println("Country of origin: " + this.country_of_origin);
System.out.println("Base price: " + this.base_price);
}
public String getBrand() 
{
return this.brand;
}
public String getCountryOfOrigin() 
{
return this.country_of_origin;
}

    public double getBasePrice() {
        return this.base_price;
    }
}

class Car extends Vehicle {
    private String model;
    private double speed;
    private double market_price;

    public void read() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter model: ");
        this.model = sc.nextLine();
        System.out.println("Enter speed: ");
        this.speed = sc.nextDouble();
        this.calculateMarketPrice();
    }

    public void show() {
        super.display();
        System.out.println("Model: " + this.model);
        System.out.println("Speed: " + this.speed);
        System.out.println("Market price: " + this.market_price);
    }

    // calculate market price based on speed
    private void calculateMarketPrice() {
        if (this.speed > 80) {
            this.market_price = this.getBasePrice() * 1.15;
        } else {
            this.market_price = this.getBasePrice() * 0.95;
        }
    }

    // setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        this.calculateMarketPrice();
    }

    // getters
    public String getModel() {
        return this.model;
    }

    public double getSpeed() {
        return this.speed;
    }

    public double getMarketPrice() {
        return this.market_price;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.read();
        car.show();
    }

    
}

