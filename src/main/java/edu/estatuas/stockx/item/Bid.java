package edu.estatuas.stockx.item;

public class Bid implements Offer{

    private String size;
    private int bid;
    
    public Bid (String size, int bid){
        
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size(){
        return this.size;
    }

    @Override
    public int value(){
        return this.bid;
    }

    @Override
    public String toString(){
        return "\t\s\s\s\s" + this.size() + "\t\t\s\s\s" + this.value() + "\n";
    }
}
