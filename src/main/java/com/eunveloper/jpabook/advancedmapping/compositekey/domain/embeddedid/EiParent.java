package com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class EiParent {

    @EmbeddedId
    private EiParentId id;

    private String name;

    public void setId(EiParentId id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EiParentId getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
