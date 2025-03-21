package edu.estatuas.stockx.item;


public class Bid implements Offer{

    private String size;
    private int value;
    
    public Bid (String size, int value){
        
        this.size = size;
        this.value = value;
    }

    public String size(){
        return this.size;
    }

    public int value(){
        return this.value;
    }
}
