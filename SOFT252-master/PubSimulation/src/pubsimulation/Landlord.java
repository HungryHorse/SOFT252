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
public class Landlord 
{
    private DrinkStratergy stragergy = new DrinkStratergy();
    private BottledDrink bottledDrink;
    private DrinkOnTap drinkOnTap;
    private Coffee coffee;
    private Tea tea;
    private LongDrink longDrink;
    private Cocktail cocktail;
    
    public void ServeBottledDrink()
    {
        stragergy.ServeDrink(bottledDrink);
    }
    public void ServeDrinkOnTap()
    {
        stragergy.ServeDrink(drinkOnTap);
    }
    public void ServeCoffee()
    {
        stragergy.ServeDrink(coffee);
    }
    public void ServeTea()
    {
        stragergy.ServeDrink(tea);
    }
    public void ServeLongDrink()
    {
        stragergy.ServeDrink(longDrink);
    }
    public void ServeCocktail()
    {
        stragergy.ServeDrink(cocktail);
    }
}
