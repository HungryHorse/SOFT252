/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.stockdatamodel;

import java.util.ArrayList;
import utilities.IObserver;
/**
 *
 * @author jjbrewer
 */
public abstract class StockItem {
    
    public StockItem()
    {
    }
    
    public StockItem(String name)
    {
        this.name = name;
    }
    
    public StockItem(String name, Integer qty)
    {
        this.name = name;
        this.quantityInStock = qty;
    }
    
    public Boolean registerObserver(IObserver o)
    {
        Boolean blnAdded = false;
        if(o != null){
            
            if(this.observers == null){
                this.observers = new ArrayList<>();
            }
            
            blnAdded = this.observers.add(o);
        }
        
        return blnAdded;
    }
    public Boolean removeObserver(IObserver o)
    {
        Boolean blnRemoved = false;
        if(o != null){
            if(this.observers != null){
                blnRemoved = this.observers.remove(o);
            }
        }
        
        return blnRemoved;
    }
    public void notifyObservers()
    {
        if(this.observers != null && this.observers.size() > 0){
            for (IObserver currentObserver : this.observers){
                currentObserver.update();
            }
        }
    }
    
    protected String name = "UNKOWN";
    protected Integer quantityInStock = 0;
    protected Double sellingPrice = 1000000.00;
    protected Double costPrice = 1000000.00;
    private ArrayList<IObserver> observers = null;
    
    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrie(Double costPrice) {
        if(costPrice != null && costPrice >= 0){
            this.costPrice = costPrice;
        }
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
        notifyObservers();
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        if(quantityInStock != null && quantityInStock >= 0){
            this.quantityInStock = quantityInStock;
        }
        notifyObservers();
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        if(sellingPrice != null && sellingPrice >= this.costPrice && sellingPrice >= 0){
            this.sellingPrice = sellingPrice;
        }
        notifyObservers();
    }
    
    public Boolean isInStock(){
        Boolean inStock = false;
        if(this.quantityInStock > 0){
            inStock = true;
        }
        return inStock;
    }

    
    public abstract StockType getItemType();
    
    
}
