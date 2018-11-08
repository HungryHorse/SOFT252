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
public abstract class SpiritDrinks extends Drink
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
        System.out.println("Adding ice to glass");
    }
    protected abstract void StepTwo();
    protected void StepThree()
    {
        System.out.println("Adding mixer to glass");
    }
    protected abstract void StepFour();
}
