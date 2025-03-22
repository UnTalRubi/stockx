package edu.estatuas.stockx.criteria;

import java.util.List;

import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

public interface Criteria{

    List<Offer> checkCriteria(Item sneaker);
}