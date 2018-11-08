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
public abstract class Tea extends BoiledDrinks
{
    @Override
    protected void StepTwo()
    {
        System.out.println("Steeping tea");
    }
    
    @Override
    protected void StepFour()
    {
        System.out.println("Add lemon");
    }
}
