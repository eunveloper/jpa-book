package com.eunveloper.jpabook.advancedmapping.domain.inheritance;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
/*
   상속관계의 매핑을 사용한다면, 부모클래스에 해당 어노테이션을 사용
   InheritanceType.JOINED = 조인전략
*/
@DiscriminatorColumn
/*
    부모클래스에 구분 컬럼을 지정
    default = "DTYPE"
*/
public abstract class JoinItem {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;
    private int price;

    public JoinItem() {}

    public JoinItem(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
