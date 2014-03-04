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
public class LineItem {
     
        private DataBase db;
        private DiscountStrategy ds;
        Product product;
        
        private String lineInfo;
        private double price;

    public LineItem(Product product) {
        setProduct(product);
    }

    public void setProduct(Product product){
        this.product = product;
    }
    
    public Product getProduct(){
        return product;
    }
        
        
        
        
}
