package com.eunveloper.jpabook.advancedmapping.jointable.onetomany.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ParentOneToMany {

    @Id @GeneratedValue
    @Column(name = "PARENT_ID")
    private Long id;

    private String name;

    @OneToMany
    @JoinTable(
            name = "PARENT_CHILD",
            joinColumns = @JoinColumn(name = "PARENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CHILD_ID"))
    private List<ChildOneToMany> child = new ArrayList<>();

}
