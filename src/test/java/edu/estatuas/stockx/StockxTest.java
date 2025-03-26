package edu.estatuas.stockx;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import edu.estatuas.stockx.item.Sneaker;
public class StockxTest {
    @Test public void testAppHasADraw() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertNotNull("app debe tener un draw", Stockx.draw(sneaker));
    }
}