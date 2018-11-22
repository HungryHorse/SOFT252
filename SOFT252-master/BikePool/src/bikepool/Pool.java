/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bikepool;

import java.util.ArrayList;
import java.util.List;
import static jdk.nashorn.internal.objects.NativeJava.type;

/**
 *
 * @author jjbrewer
 */
public class Pool 
{
    private List<Bike> bikeList = new ArrayList<>();
    
    public void addBike(Bike b)
    {
        bikeList.add(b);
    }
    
    public void removeBike(Bike b)
    {
        bikeList.remove(b);
    }
    
    public List<Bike> getAvailable()
    {
        List<Bike>AvailableList = new ArrayList<>();
        for(Bike b : bikeList)
        {
            if(b.isAvailable())
            {
                AvailableList.add(b);
            }
        }
        return AvailableList;
    }
    
    public void setUser(Bike b, Person p)
    {
        b.setPerson(p);
    }
    
}
