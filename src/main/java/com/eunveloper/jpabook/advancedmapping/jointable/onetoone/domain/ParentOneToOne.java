package com.eunveloper.jpabook.advancedmapping.jointable.onetoone.domain;

import javax.persistence.*;

@Entity
public class ParentOneToOne {

    @Id @GeneratedValue
    @Column(name = "PARENT_ID")
    private Long id;

    private String name;

    @OneToOne
    @JoinTable(
            name = "PARENT_CHILD",
            joinColumns = @JoinColumn(name = "PARENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CHILD_ID"))
    private ChildOneToOne child;
    /*
        조인 컬럼의 관계였다면 @JoinColumn 어노테이션을 사용하였겠지만,
        조인 테이블의 관계이기 때문에 @JoinTable 어노테이션을 사용했다.
    */

}
