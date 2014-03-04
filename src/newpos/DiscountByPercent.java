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
public class DiscountByPercent implements DiscountStrategy{
    
    private double percent;
    
    public DiscountByPercent(double percent){
        setDiscount(percent);
    }
    
    public void setDiscount(double percent){
        if(this.percent > .5){
            System.out.println("Discount Amount Is Invalid");
        }
        System.out.println("Discount Of: " + percent*100 + "% Applied");
        this.percent = percent;
    }
    
    @Override
    public double getDiscount(){
        return percent * 100;
    }

    
}
