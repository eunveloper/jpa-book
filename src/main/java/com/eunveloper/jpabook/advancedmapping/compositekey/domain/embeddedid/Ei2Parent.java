package com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ei2Parent {

    @Id
    @Column(name = "PARENT_ID")
    private String id;

    private String name;

}
