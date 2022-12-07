package com.eunveloper.jpabook.advancedmapping.jointable.onetomany.domain;

import javax.persistence.*;

@Entity
public class ChildOneToMany {

    @Id @GeneratedValue
    @Column(name = "CHILD_ID")
    private Long id;

    private String name;

}
