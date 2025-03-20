package edu.estatuas.stockx.item;

public interface Item {

    int getBid();
    int getAsk();
    int getSale();

    void setBid(int bid);
    void setAsk(int ask);
    void setSale(int sale);
}
