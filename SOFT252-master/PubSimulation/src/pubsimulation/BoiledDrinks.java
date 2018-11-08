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
public abstract class BoiledDrinks extends Drink
{
    public final void ServeDrink()
    {
        StepOne();
        StepTwo();
        StepThree();
        StepFour();
    }
    
    protected void StepOne()
    {
        System.out.println("Boiling water");
    }
    
    protected abstract void StepTwo();
    
    protected void StepThree()
    {
        System.out.println("Pour result into cup");
    }
    
    protected abstract void StepFour(); 
}
