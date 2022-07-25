
package Buoi3_Lab1;


public class Product {
    private String name;
    private double price;
    

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getImPortTax(){
        return 0.1*getPrice();
    }
    
}

