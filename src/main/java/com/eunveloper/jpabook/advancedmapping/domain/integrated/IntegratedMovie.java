package com.eunveloper.jpabook.advancedmapping.domain.integrated;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class IntegratedMovie extends IntegratedItem {

    private String director;
    private String actor;

    public IntegratedMovie(Long id, String name, int price) {
        super(id, name, price);
    }

    public IntegratedMovie() {
        super();
    }

}
