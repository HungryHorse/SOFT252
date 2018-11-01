/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.stockdatamodel.AnObserver;
import stocktracker.stockdatamodel.PhysicalStockItem;
import stocktracker.stockdatamodel.ServiceStockItem;
import stocktracker.stockdatamodel.StockItem;
import stocktracker.stockdatamodel.StockType;

/**
 *
 * @author jjbrewer
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StockItem objTestItem1 = new PhysicalStockItem("Starcraft Manual");
        StockItem objTestItem2 = new PhysicalStockItem("Halo 3", 100);
        StockItem objTestItem3 = new ServiceStockItem("Delivery");
        AnObserver observer = new AnObserver();
        
        if(objTestItem1.getItemType() == StockType.PHYSICALITEM)
        {
            System.out.println("Item 1 is a PHSYICAL stock item");
        }
        else
        {
            System.out.println("Item 1 is a SERVICE stock item");
        }
        
        if(objTestItem2.getItemType() == StockType.PHYSICALITEM)
        {
            System.out.println("Item 2 is a PHSYICAL stock item");
        }
        else
        {
            System.out.println("Item 2 is a SERVICE stock item");
        }
        
        if(objTestItem3.getItemType() == StockType.PHYSICALITEM)
        {
            System.out.println("Item 3 is a PHSYICAL stock item");
        }
        else
        {
            System.out.println("Item 3 is a SERVICE stock item");
        }
        
        objTestItem1.registerObserver(observer);
        objTestItem3.registerObserver(observer);
        
        System.out.println("Changing quantity of the physical stock item");
        objTestItem1.setQuantityInStock(8);
        System.out.println("Changing price of service stock item");
        objTestItem3.setSellingPrice(80.00);
    }
    
}
