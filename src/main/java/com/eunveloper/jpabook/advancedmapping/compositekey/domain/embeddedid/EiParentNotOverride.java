package com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class EiParentNotOverride {

    @EmbeddedId
    private EiParentIdNotOverride id;

    private String name;

    public void setId(EiParentIdNotOverride id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EiParentIdNotOverride getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
