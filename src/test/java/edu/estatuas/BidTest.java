package edu.estatuas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.estatuas.stockx.item.Bid;

public class BidTest {
    
    private Bid bid;

    @Test 
    public void testConstruct(){
        
        bid = new Bid ("40", 150);    
        assertEquals("40" , bid.size());
        assertEquals(150, bid.value());
    }
}
