package edu.estatuas.stockx.criteria;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import edu.estatuas.stockx.item.Ask;
import edu.estatuas.stockx.item.Bid;
import edu.estatuas.stockx.item.Offer;
import edu.estatuas.stockx.item.Sale;
import edu.estatuas.stockx.item.Sneaker;

public class SalesTest {

    @Test
    public void checkCriteria_sales_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Sale("5.5", 550));
        sneaker.add(new Sale("4.5", 480));
        sneaker.add(new Sale("5.5", 900));
        sneaker.add(new Sale("6", 472));

        Criteria sales = new Sales();

        List<Offer> filteredSales = sales.checkCriteria(sneaker);
        assertTrue(filteredSales.stream().allMatch(s -> s instanceof Sale));
    }

    @Test
    public void checkCriteria_sales_mix_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));
        sneaker.add(new Sale("9", 235));
        sneaker.add(new Sale("12", 523));
        sneaker.add(new Sale("14", 325));

        Criteria sales = new Sales();
        List<Offer> filteredsales = sales.checkCriteria(sneaker);
        assertTrue(filteredsales.stream().allMatch(b -> b instanceof Sale));

        Optional<Offer> maxOpt = Optional.ofNullable(sales.checkCriteria(sneaker).get(0));
        sneaker.setSale(maxOpt.isPresent() ? maxOpt.get().value() : 0);
        assertEquals(235, sneaker.getSale());
    }

    @Test
    public void checkCriteria_no_sales_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Criteria sale = new Sales();
        List<Offer> maximum = sale.checkCriteria(sneaker);
        sneaker.setSale(maximum.isEmpty() ? 0 : maximum.get(0).value());
        assertEquals(0, sneaker.getSale());
    }
}
