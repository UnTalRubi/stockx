package edu.estatuas.stockx.criteria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.estatuas.stockx.item.*;

public class BidsTest {

    private Sneaker sneaker;

    @BeforeEach
    public void createSneaker(){
        sneaker = new Sneaker("123-ABC", "Zapas");
        sneaker.add(new Bid("12", 150));
        sneaker.add(new Ask("8", 220));
        sneaker.add(new Bid("9", 100));
        sneaker.add(new Ask("11", 170));
    }

    @Test
    public void testBids(){

        Sneaker sneakerOnlyBids = new Sneaker("456-DEF", "Tenis");
        sneakerOnlyBids.add(new Bid("12", 150));
        sneakerOnlyBids.add(new Bid("9", 100));

        Criteria bids = new Bids();

        assertEquals(sneakerOnlyBids.offers().get(1).value(), bids.checkCriteria(sneaker).get(1).value());
        assertEquals(2, bids.checkCriteria(sneaker).size());
    }
}
