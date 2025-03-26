package edu.estatuas.stockx.item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BidTest {

    private Bid bid;

    @Test
    public void constructorTest() {
        Bid bid = new Bid("9.5", 282);
        assertEquals(282, bid.value());
        assertEquals("9.5", bid.size());
    }

    @Test
    public void anotherConstructTest() {

        bid = new Bid("40", 150);
        assertEquals("40", bid.size());
        assertEquals(150, bid.value());
    }
}
