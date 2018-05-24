package com.bran.filter;

import com.sun.org.apache.xpath.internal.operations.And;

import java.util.List;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otheCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otheCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otheCriteria.meetCriteria(firstCriteriaPersons);
    }
}
