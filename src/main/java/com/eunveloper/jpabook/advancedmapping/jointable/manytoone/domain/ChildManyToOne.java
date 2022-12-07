package com.eunveloper.jpabook.advancedmapping.jointable.manytoone.domain;

import javax.persistence.*;

@Entity
public class ChildManyToOne {

    @Id @GeneratedValue
    @Column(name = "CHILD_ID")
    private Long id;

    private String name;

    @ManyToOne
    @JoinTable(
            name = "PARENT_CHILD",
            joinColumns = @JoinColumn(name = "CHILD_ID"),
            inverseJoinColumns = @JoinColumn(name = "PARENT_ID"))
    private ParentManyToOne parent;

}
