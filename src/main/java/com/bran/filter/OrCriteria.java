package com.bran.filter;

import java.util.List;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otheCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otheCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otheCriteria.meetCriteria(persons);
        for (Person person : otherCriteriaItems){
            if (!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
