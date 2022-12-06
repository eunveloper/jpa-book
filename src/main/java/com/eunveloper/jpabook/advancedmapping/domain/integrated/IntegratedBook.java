package com.eunveloper.jpabook.advancedmapping.domain.integrated;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class IntegratedBook extends IntegratedItem {

    private String author;
    private String isbn;

    public IntegratedBook(Long id, String name, int price) {
        super(id, name, price);
    }

    public IntegratedBook() {
        super();
    }

}
