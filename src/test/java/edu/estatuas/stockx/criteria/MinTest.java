package edu.estatuas.stockx.criteria;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import edu.estatuas.stockx.item.Ask;
import edu.estatuas.stockx.item.Bid;
import edu.estatuas.stockx.item.Offer;
import edu.estatuas.stockx.item.Sneaker;

public class MinTest {

    @Test
    public void checkCriteria_max_size_bid_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("13", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("13", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));

        Criteria size = new Size("13");
        Criteria asks = new Asks();
        Criteria min = new Min(size, asks);

        List<Offer> filteredSize = min.checkCriteria(sneaker);
        assertTrue(filteredSize.stream().allMatch(o -> o.size().equals("13")));
        assertTrue(filteredSize.stream().allMatch(o -> o instanceof Ask));
        assertEquals(333, filteredSize.get(0).value());
    }

}