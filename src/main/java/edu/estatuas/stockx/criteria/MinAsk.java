package edu.estatuas.stockx.criteria;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import edu.estatuas.stockx.item.Ask;
import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

public class MinAsk implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker){
        List<Offer> offerAsk = new ArrayList<>();
        for (Offer offer : sneaker.offers()) {

            if (offer instanceof Ask) {
                offerAsk.add(offer);
            }
        }

        Collections.sort(offerAsk);
        return offerAsk;
    }
}
