package com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EiParentIdNotOverride implements Serializable {

    @Column(name = "PARENT_ID1")
    private String id1;

    @Column(name = "PARENT_ID2")
    private String id2;

    public EiParentIdNotOverride() {}

    public EiParentIdNotOverride(String id1, String id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

}
