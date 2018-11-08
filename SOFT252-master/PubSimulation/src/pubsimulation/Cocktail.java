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
public abstract class Cocktail extends SpiritDrinks
{
    @Override
    protected void StepTwo()
    {
        System.out.println("Adding two spirits");
    }
    
    @Override
    protected void StepFour()
    {
        System.out.println("Adding a fancy garnish");
    }
}
