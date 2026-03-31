interface Taxable {
    double calculateTax();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayBasicDetails() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Price      : " + price);
    }

    public abstract double calculateDiscount();
    public abstract double calculateFinalPrice();
}

class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public double calculateFinalPrice() {
        return getPrice() + calculateTax() - calculateDiscount();
    }
}

class Clothing extends Product implements Taxable {

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.25;
    }

    public double calculateTax() {
        return getPrice() * 0.12;
    }

    public double calculateFinalPrice() {
        return getPrice() + calculateTax() - calculateDiscount();
    }
}

class Groceries extends Product {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }

    public double calculateFinalPrice() {
        return getPrice() - calculateDiscount();
    }
}

public class EComerce {

    public static void main(String[] args) {

        Product[] products = {
            new Electronics(101, "Laptop", 60000),
            new Clothing(102, "Jacket", 4000),
            new Groceries(103, "Rice", 2000)
        };

        for (Product p : products) {
            p.displayBasicDetails();
            System.out.println("Final Price : " + p.calculateFinalPrice());
            System.out.println("--------------------------------");
        }
    }
}
