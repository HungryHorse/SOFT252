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
public class BikePool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Pool pool = new Pool();
        
        Bike bike1 = new MoutainBike();
        Bike bike2 = new RoadBike();
        Person Dave = new Person(2);
        
        pool.addBike(bike2);
        pool.addBike(bike1);
        
        System.out.println(pool.getAvailable());
        
        pool.setUser(bike2, Dave);
        
        System.out.println(pool.getAvailable());
    }
    
}
