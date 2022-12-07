package com.eunveloper.jpabook.advancedmapping.compositekey.domain.idclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
public class Ic2Parent {

    @Id
    @Column(name = "PARENT_ID")
    private String id;

    private String name;

}
