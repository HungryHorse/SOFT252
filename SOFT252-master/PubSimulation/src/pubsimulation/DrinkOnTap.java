/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation;

/**
 *
 * @author jjbrewer
 */
public abstract class DrinkOnTap extends PouredDrink
{
    @Override
    protected void StepOne()
    {
        System.out.println("Putting glass under tap");
    }
    
        
}
