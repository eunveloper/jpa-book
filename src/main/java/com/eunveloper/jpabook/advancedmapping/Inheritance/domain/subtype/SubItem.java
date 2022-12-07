package com.eunveloper.jpabook.advancedmapping.Inheritance.domain.subtype;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class SubItem {

    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;
    private int price;

    public SubItem() {}

    public SubItem(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
