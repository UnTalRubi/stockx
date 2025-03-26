package edu.estatuas.stockx.criteria;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.estatuas.stockx.item.Ask;
import edu.estatuas.stockx.item.Bid;
import edu.estatuas.stockx.item.Offer;
import edu.estatuas.stockx.item.Sneaker;

public class MaxBidTest {

    @Test
    public void checkCriteria_bids_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 472));

        Criteria maxBid = new MaxBid();
        Optional<Offer> maxOpt = Optional.ofNullable(maxBid.checkCriteria(sneaker).get(0));
        sneaker.setBid(maxOpt.isPresent() ? maxOpt.get().value() : 0);
        assertEquals(900, sneaker.getBid());
    }

    @Test
    public void checkCriteria_bids_aks_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));

        Criteria maxBid = new MaxBid();
        Optional<Offer> maxOpt = Optional.ofNullable(maxBid.checkCriteria(sneaker).get(0));
        sneaker.setBid(maxOpt.isPresent() ? maxOpt.get().value() : 0);
        assertEquals(900, sneaker.getBid());
    }

    @Test
    public void checkCriteria_no_bids_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Criteria maxBid = new MaxBid();
        List<Offer> maximum = maxBid.checkCriteria(sneaker);
        sneaker.setBid(maximum.isEmpty() ? 0 : maximum.get(0).value());
        assertEquals(0, sneaker.getBid());
    }
}
