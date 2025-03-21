package edu.estatuas.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {

    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> offers = new ArrayList<>();

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
        this.sale = 0;
        this.ask = 0;
        this.bid = 0;
    }

    public String getStyle() {
        return this.style;
    }

    public String getName() {
        return this.name;
    }

    public int getSale() {
        return this.sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getBid() {
        return this.bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public int getAsk() {
        return this.ask;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public List<Offer> offers() {
        return null;
    }

    @Override
    public String toString() {
        return getName() + "\n\t\t" + getStyle();
    }

}
