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
public abstract class Bike 
{
    protected String description = "Unknown Bike";
    private Person p;
    
    public String getDescription()
    {
        return description;
    }
    
    public double cost()
    {
        return 10.00;
    }
    
    public boolean isAvailable()
    {
        if(p == null)
        {
            return true;
        }
        return false;
    }
    
    public void setPerson(Person p)
    {
        this.p = p;
    }
}
