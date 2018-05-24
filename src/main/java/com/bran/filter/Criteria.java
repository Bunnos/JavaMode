package com.bran.filter;

import java.util.List;

/**
 * @author antiumbo
 * @date on 2018/5/24
 **/
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
