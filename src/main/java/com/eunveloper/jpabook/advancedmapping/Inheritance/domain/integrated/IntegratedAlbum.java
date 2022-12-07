package com.eunveloper.jpabook.advancedmapping.Inheritance.domain.integrated;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class IntegratedAlbum extends IntegratedItem {

    private String artist;

    public IntegratedAlbum(Long id, String name, int price, String artist) {
        super(id, name, price);
        this.artist = artist;
    }

    public IntegratedAlbum() {
        super();
    }

}
