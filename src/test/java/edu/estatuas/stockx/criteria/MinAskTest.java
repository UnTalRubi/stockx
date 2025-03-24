package edu.estatuas.stockx.criteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.estatuas.stockx.item.Ask;
import edu.estatuas.stockx.item.Sneaker;

public class MinAskTest {

    private Sneaker sneaker;
    Criteria minAsk = new MinAsk();

    @BeforeEach
    public void createSneaker(){
        sneaker = new Sneaker("132-JSD","Zapas");
        sneaker.add(new Ask("12",123 ));
        sneaker.add(new Ask("9,2", 420));
        sneaker.add(new Ask("10", 211));
        sneaker.add(new Ask("8", 100));
        sneaker.add(new Ask("8,2", 90));

    }
    
    @Test
    public void testMinAsk(){

        assertEquals(90, minAsk.checkCriteria(sneaker).get(0).value());
    }

}