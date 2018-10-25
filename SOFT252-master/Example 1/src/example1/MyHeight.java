/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author jjbrewer
 */
public class MyHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int centimeters;
        double feet;
        int inches;
        double inchesTotal;
        
        centimeters = 180;
        inchesTotal = centimeters / 2.54;
        feet = inchesTotal / 12;
        inches = (int)((feet % 1)*10);
        feet = (int)feet;
        
        System.out.println(inchesTotal + " " + feet + " " + inches);
        System.exit(0);
    }
    
}
