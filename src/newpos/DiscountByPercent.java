/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpos;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class DiscountByPercent implements DiscountStrategy {

    private double percent;

    public DiscountByPercent(double percent) {
        setDiscount(percent);
    }

    public void setDiscount(double percent) {
        if (percent > .5) {
            JOptionPane.showMessageDialog(
                    null, "Percent Must be lower than .5 or 50%");
            System.exit(0);
        }
        System.out.println("Discount Of: " + percent * 100 + "% Applied");
        this.percent = percent;
    }

    @Override
    public double getDiscount() {
        return percent * 100;
    }

    public static void main(String[] args) {
        DiscountByPercent d = new DiscountByPercent(.6);
        System.out.println(d.getDiscount());
    }
}
