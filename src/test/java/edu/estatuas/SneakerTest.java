package edu.estatuas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.estatuas.stockx.item.Sneaker;

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
}
