package com.eunveloper.jpabook.advancedmapping.Inheritance.domain.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("A")
@PrimaryKeyJoinColumn(name = "ALBUM_ID")
public class JoinAlbum extends JoinItem {

    private String artist;

    public JoinAlbum(Long id, String name, int price, String artist) {
        super(id, name, price);
        this.artist = artist;
    }

    public JoinAlbum() {
        super();
    }

}
