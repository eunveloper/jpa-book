package com.eunveloper.jpabook.advancedmapping.compositekey.domain.idclass;

import javax.persistence.*;

@Entity
@IdClass(Ic2ChildId.class)
public class Ic2Child {

    /*
        식별관계는 부모테이블의 기본키가
        자식테이블의 기본키이자 외래키로 사용되기 때문에
        @Id @ManyToOne 두가지의 어노테이션을 모두 달아준다.
        비식별 관계에서는 @ManyToOne 하나만 달아줌
        참고 : IcChild 클래스
    */
    @Id
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Ic2Parent parent;

    @Id
    @Column(name = "CHILD_ID")
    private String childId;

    private String name;

}
