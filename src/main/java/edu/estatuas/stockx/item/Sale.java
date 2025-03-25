package edu.estatuas.stockx.item;

public class Sale implements Offer {

    private String size;
    private Integer prize;

    public Sale(String size, int prize){

        this.size = size;
        this.prize = prize;
    }

    @Override
    public String size(){
        return this.size;
    }

    @Override
    public int value(){
        return this.prize.intValue();
    }

    @Override
    public String toString(){
        return "\t\s\s\s\s" + this.size() + "\t\s\s\s\s" + this.value() + "\n";
    }

    @Override
    public int compareTo(Offer sale){
        return this.prize.compareTo(sale.value());
    }
}
