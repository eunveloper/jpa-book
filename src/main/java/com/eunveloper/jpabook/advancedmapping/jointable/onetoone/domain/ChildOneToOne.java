package com.eunveloper.jpabook.advancedmapping.jointable.onetoone.domain;

import javax.persistence.*;

@Entity
public class ChildOneToOne {

    @Id @GeneratedValue
    @Column(name = "CHILD_ID")
    private Long id;

    private String name;

    /* Child 엔티티에도 연관관계를 매핑하면 양방향이 된다 */
    @OneToOne(mappedBy = "child")
    /*@OneToOne
    @JoinColumn(name = "PARENT_ID")*/
    private ParentOneToOne parent;

}
