/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikepool;

/**
 *
 * @author jjbrewer
 */
public class Helmet extends ComponentDecorator{

    public Helmet(Bike bike) {
        super(bike);
    }
    
    public String getDescription()
    {
        return bike.getDescription() + ", Helmet";
    }
    
    public double cost()
    {
        return bike.cost() + 1.5;
    }
}
