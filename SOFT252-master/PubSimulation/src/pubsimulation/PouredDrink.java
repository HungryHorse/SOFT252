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
public abstract class PouredDrink extends Drink
{
    
    public final void ServeDrink()
    {
        StepOne();
        StepTwo();
        
        System.out.println("Your drink is served");
    }
    
    protected abstract void StepOne();
    
    protected void StepTwo()
    {
        System.out.println("Pouring drink into glass");
    }
    
        
}
