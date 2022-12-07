package com.eunveloper.jpabook.advancedmapping.jointable.manytoone.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ParentManyToOne {

    @Id @GeneratedValue
    @Column(name = "PARENT_ID")
    private Long id;

    private String name;

}
