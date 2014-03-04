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
public class DataBase {
    
    DiscountStrategy ds;
    
//    private String [] customer;
//    {
//    customer[0] = "Alex Plouff";
//    customer[1] = "Sergei Palksinov";
//    customer[2] = "Mother Goose";
//    customer[3] = "Irritated Customer";
//    };   
    
    private final Customer[] customer = {
    
       new Customer ( "Alex Plouff" ),
       new Customer ( "Sergei Palksinov"),
       new Customer ( "Mother Goose "),
       new Customer ( "Irritated Customer" )
    };
    
    private final Product[] products = {
       new Product("A101", "RC Car", 19.99, new DiscountByPercent(.5)),
//       new Product("B101", "Garbage", 69.99, new DiscountByQuantity(3)),
//       new Product("C101", "Super Garbage", 89.99, new DiscountByPercent(.3)),
//       new Product("D101", "Super Duper Garbage", 99.99, new DiscountByQuantity(5))  
    };
    
    
    public final Product findProduct(final String prodId) {
        Product product = null;
        // validation is needed for method parameter
        if (prodId == null || prodId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
        } else {
            for (Product p : products) {
                if (prodId.equals(p.getProductID())) {
                    product = p;
                    break;
                }
            }
        }

        return product;
    }
    
    public static void main(String[] args) {
        DataBase d = new DataBase();
        
        System.out.println(d.findProduct("A101"));
    }
}
