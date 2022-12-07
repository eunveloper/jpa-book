package com.eunveloper.jpabook.advancedmapping.compositekey.domain.idclass;

import javax.persistence.*;

@Entity
public class IcChild {

    @Id
    private String id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PARENT_ID1", referencedColumnName = "PARENT_ID1"),
            @JoinColumn(name = "PARENT_ID2", referencedColumnName = "PARENT_ID2"),})
    private IcParent icParent;

}
