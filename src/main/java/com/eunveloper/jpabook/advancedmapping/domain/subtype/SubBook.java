package com.eunveloper.jpabook.advancedmapping.domain.subtype;

import javax.persistence.Entity;

@Entity
public class SubBook extends SubItem {

    private String author;
    private String isbn;

}
