package edu.estatuas.stockx.item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SneakerTest 
{
    private Sneaker sneaker;

    @BeforeEach
    public void createSneaker(){
        sneaker = new Sneaker("123-ABC", "Zapas");
    }

    @Test
    public void testSetGet()
    {
        assertEquals("123-ABC", sneaker.getStyle());
        assertEquals("Zapas", sneaker.getName());

        assertEquals(0, sneaker.getSale());
        sneaker.setSale(150);
        assertEquals(150, sneaker.getSale());

        assertEquals(0, sneaker.getAsk());
        sneaker.setAsk(25);
        assertEquals(25,sneaker.getAsk());
        
        assertEquals(0, sneaker.getBid());
        sneaker.setBid(40);
        assertEquals(40, sneaker.getBid());
    }

    @Test
    public void testToString(){
        assertEquals("Zapas\n\t\t123-ABC", sneaker.toString());
    }

    @Test
    public void testOffersBid(){
    
        sneaker.add(new Bid ("40", 150));
        sneaker.add(new Bid ("41", 200));
        sneaker.add(new Bid ("37", 100));

        assertEquals(3, sneaker.offers().size());
        assertEquals("37", sneaker.offers().get(2).size());
        assertEquals(200, sneaker.offers().get(1).value());
        
    }

    @Test
    public void testOffersAsk(){
    
        sneaker.add(new Ask ("38", 250));
        sneaker.add(new Ask ("43", 320));

        assertEquals(2, sneaker.offers().size());
        assertEquals("43", sneaker.offers().get(1).size());
        assertEquals(250, sneaker.offers().get(0).value());
    }
}
