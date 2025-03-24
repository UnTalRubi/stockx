package edu.estatuas.stockx.criteria;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import edu.estatuas.stockx.item.Bid;
import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

public class MaxBid implements Criteria{
    
    @Override
    public List<Offer> checkCriteria(Item sneaker){
        List<Offer> offersBid = new ArrayList<>();
        for (Offer offer : sneaker.offers()) {
            
            if (offer instanceof Bid){
                offersBid.add(offer);
            }
        }

        Collections.sort(offersBid, Collections.reverseOrder());
        return offersBid;
    }
}
