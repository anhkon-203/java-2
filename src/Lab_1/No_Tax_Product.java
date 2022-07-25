
package Lab_1;

public class No_Tax_Product extends Product{

    public No_Tax_Product(String name, double price) {
        super(name, price);
    }


    @Override
    public double getImportTax() {
        return 0;
    }
    
}
