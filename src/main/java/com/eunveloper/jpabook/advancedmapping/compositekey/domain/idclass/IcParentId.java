package com.eunveloper.jpabook.advancedmapping.compositekey.domain.idclass;

import java.io.Serializable;
import java.util.Objects;

/*
    엔티티 클래스의 식별자 필드명과 동일해야 한다.
    기본 생성자가 있어야 한다.
        - Java Reflection 기능으로 JPA 구현을 위함
        - 첫주차 스터디때 다룸
    Serializable 인터페이스를 구현해야한다.
        - 기본적으로 JPA 의 식별자는 직렬화를 해줘야 한다.
        - 단일 식별자는 기본적으로 자바 기본형을 따르는데 (대표적으로 String, Long)
        - 이들은 이미 내부적으로 Serializable 인터페이스를 구현하고 있다.
        - 하지만 복합 식별자는 클래스 자체이기 때문에 추가로 Serializable 인터페이스를 구현해줘야 한다.
    equals, hashcode를 구현해야한다.
        - JPA 영속성 컨텍스트는 식별자를 키로 관리하여 엔티티에 동일성을 보장
        - 이때 식별자는 동등성 체크를 통해서 같은지 여부를 파악
        - 즉 기본 equals (동일성 체크)를 오버라이딩 하여 구현해야함
        - 위와 마찬가지로 자바 기본형의 단일 식별자 타입은 내부적으로 equals, hashcode를 구현한다.
    식별자 클래스는 public 이어야 한다.
*/
public class IcParentId implements Serializable {

    private String id1;
    private String id2;

    public IcParentId() {}

    public IcParentId(String id1, String id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IcParentId that = (IcParentId) o;
        return Objects.equals(id1, that.id1) && Objects.equals(id2, that.id2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id1, id2);
    }

}
