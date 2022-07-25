
package Buoi3_Lab1;

public class NoTaxProduct extends Product{

    public NoTaxProduct() {
    }

    public NoTaxProduct(String name, double price) {
        super(name, price);
    }



    @Override
    public double getImPortTax() {
        return 0.0;
    }
    
}
