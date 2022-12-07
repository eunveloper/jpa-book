package com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid;

import javax.persistence.*;

@Entity
public class Ei2Child {

    @EmbeddedId
    private Ei2ChildId id;

    @MapsId("parentId")
    /*
        외래키와 매핑한 연관관계를 기본키에도 매핑하겠다는 의미
        속성값은 @EmbeddedId를 사용한 식별자 클래스의 기본 키 필드를 지정
    */
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Ei2Parent parent;

    private String name;

}
