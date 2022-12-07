package com.eunveloper.jpabook.advancedmapping.Inheritance.domain.integrated;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
public abstract class IntegratedItem {

    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;
    private int price;

    public IntegratedItem() {}

    public IntegratedItem(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
