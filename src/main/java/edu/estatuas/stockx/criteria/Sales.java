package edu.estatuas.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.estatuas.stockx.item.Sale;
import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

public class Sales implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> offersSale = new ArrayList<>();
        for (Offer offer : sneaker.offers()){

            if (offer instanceof Sale){
                offersSale.addFirst(offer);
            }
        }
        return offersSale;
    }
}
