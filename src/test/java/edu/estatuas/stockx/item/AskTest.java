package edu.estatuas.stockx.item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AskTest {

    private Ask ask;

    @Test
    public void testAsk(){

        ask = new Ask ("41", 350);    
        assertEquals("41" , ask.size());
        assertEquals(350, ask.value());
    }
}
