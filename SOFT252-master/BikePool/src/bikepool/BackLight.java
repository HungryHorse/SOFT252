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
public class BackLight extends ComponentDecorator{
    
    public BackLight(Bike bike)
    {
        super(bike);
    }
    
    public String getDescription()
    {
        return bike.getDescription() + ", Back light";
    }
    
    public double cost()
    {
        return bike.cost() + 1.25;
    }
}
