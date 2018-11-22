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
public abstract class ComponentDecorator extends Bike
{
    public Bike bike;
    
    public ComponentDecorator(Bike bike){
        this.bike = bike;
    }
}
