package edu.estatuas.stockx.criteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.estatuas.stockx.item.Ask;
import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

public class Asks implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        List<Offer> offersAsk = new ArrayList<>();
        for (Offer offer : sneaker.offers()) {

            if (offer instanceof Ask) {
                offersAsk.add(offer);
            }
        }
        Collections.sort(offersAsk);
        return offersAsk;
    }
}
