package com.eunveloper.jpabook.advancedmapping.Inheritance.domain.subtype;

import javax.persistence.Entity;

@Entity
public class SubAlbum extends SubItem {

    private String artist;

    public SubAlbum() {}

    public SubAlbum(String artist) {
        this.artist = artist;
    }

    public SubAlbum(Long id, String name, int price, String artist) {
        super(id, name, price);
        this.artist = artist;
    }
}
