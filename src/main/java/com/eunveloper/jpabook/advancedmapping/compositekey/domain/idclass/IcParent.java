package com.eunveloper.jpabook.advancedmapping.compositekey.domain.idclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(IcParentId.class)
public class IcParent {

    @Id
    @Column(name = "PARENT_ID1")
    private String id1;

    @Id
    @Column(name = "PARENT_ID2")
    private String id2;

    private String name;

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public void setName(String name) {
        this.name = name;
    }
}
