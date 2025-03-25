package edu.estatuas.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

public class Size implements Criteria{

    private String size;

    public Size (String size){
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker){

        List<Offer> offersSize = new ArrayList<>();
        for (Offer offer : sneaker.offers()){
            if (offer.size().equals(size)){
                offersSize.add(offer);
            }
        }
        return offersSize;
    }
}