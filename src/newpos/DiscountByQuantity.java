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
public class DiscountByQuantity implements DiscountStrategy{
    
    private double quantity;
    private double percent=.1;
    
    public DiscountByQuantity(double quantity){
        setQuantity(quantity);
    }
    
    public void setQuantity(double quantity){
        if(quantity > 5){
           this.percent =.2;
           System.out.println("Discount Of :" + percent*100 + "Applied");
            }  
        this.quantity = quantity;
    }
    
    @Override
    public double getDiscount(){
        return percent*100;
    }
    
}
