package edu.estatuas.stockx.criteria;

import java.util.List;

import edu.estatuas.stockx.item.*;

public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    
    @Override
    public List<Offer> checkCriteria(Item sneaker) {

        return criteria.checkCriteria(sneaker).stream()
                                            .filter(otherCriteria.checkCriteria(sneaker)::contains)
                                            .toList();
    }
}