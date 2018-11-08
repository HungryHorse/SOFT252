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
public abstract class Coffee extends BoiledDrinks
{
    @Override
    protected void StepTwo()
    {
        System.out.println("Brewing coffee in boiled water");
    }
    
    protected void StepFour()
    {
        System.out.println("Add milk");
    }    
        
}
