package edu.estatuas.stockx.criteria;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.estatuas.stockx.item.*;

public class AsksTest {

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
    public void testAsks(){

        Sneaker sneakerOnlyAsks = new Sneaker("456-DEF", "Tenis");
        sneakerOnlyAsks.add(new Ask("8", 220));
        sneakerOnlyAsks.add(new Ask("11", 170));

        Criteria asks = new Asks();

        assertEquals(sneakerOnlyAsks.offers().get(1).value(), asks.checkCriteria(sneaker).get(1).value());
        assertEquals(2, asks.checkCriteria(sneaker).size());
    }
}
