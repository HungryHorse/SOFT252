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
public abstract class LongDrink extends SpiritDrinks
{
    @Override
    protected void StepTwo()
    {
        System.out.println("Adding one spirit");
    }
    
    @Override
    protected void StepFour()
    {
        System.out.println("Adding a simple garnish");
    }
}
