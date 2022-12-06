package com.eunveloper.jpabook.advancedmapping.domain.subtype;

import javax.persistence.Entity;

@Entity
public class SubMovie extends SubItem {

    private String director;
    private String actor;

}
