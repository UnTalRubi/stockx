package edu.estatuas.stockx.criteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.estatuas.stockx.item.Bid;
import edu.estatuas.stockx.item.Sneaker;

public class MaxBidTest {

    private Sneaker sneaker;
    Criteria maxBid = new MaxBid();

    @BeforeEach
    public void createSneaker(){
        sneaker = new Sneaker("132-JSD","Zapas");
        sneaker.add(new Bid("12",123 ));
        sneaker.add(new Bid("9,2", 420));
        sneaker.add(new Bid("10", 211));
        sneaker.add(new Bid("8", 100));
        sneaker.add(new Bid("8,2", 90));

    }
    
    @Test
    public void testMaxBid(){

        assertEquals(420, maxBid.checkCriteria(sneaker).get(0).value());
    }

}
