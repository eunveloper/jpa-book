package com.eunveloper.jpabook.advancedmapping.domain.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("M")
/*
    부모클래스의 구분 컬럼에 입력할 값을 작성
*/
@PrimaryKeyJoinColumn(name = "MOVIE_ID")
/*
    기본은 부모 테이블의 ID 컬럼명을 그대로 사용
    하지만 해당 어노테이션을 통해 재정의 가능
*/
public class JoinMovie extends JoinItem {

    private String director;
    private String actor;

    public JoinMovie(Long id, String name, int price) {
        super(id, name, price);
    }

    public JoinMovie() {
        super();
    }

}
