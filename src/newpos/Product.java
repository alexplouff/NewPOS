/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpos;

/**
 *
 * @author Alex
 */
public class Product {
    
    private String productDescription;
    private String productID;
    private double productPrice;
    private DiscountStrategy ds;

    public Product(String productDescription, String productID, double productPrice, DiscountStrategy ds) {
        this.productDescription = productDescription;
        this.productID = productID;
        this.productPrice = productPrice;
        this.ds = ds;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public DiscountStrategy getDs() {
        return ds;
    }

    public void setDs(DiscountStrategy ds) {
        this.ds = ds;
    }

    @Override
    public String toString() {
        return "Product Description: " + productDescription + " ProductID: " + productID + " ProductPrice: $" + productPrice + " Discount Strategy: " + ds.getDiscount()+"%";
    }
    
    
    
    public static void main(String[] args) {
        Product p = new Product("RC CAR", "A101", 50.00, new DiscountByPercent(.1));
        Product p1 = new Product("RC CAR", "A101", 40.00, new DiscountByQuantity(5));
        
        System.out.println(p1.toString());
        
    }
}
