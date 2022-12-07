package com.eunveloper.jpabook.advancedmapping.compositekey.domain.onetoone;

import javax.persistence.*;

/*
    외래키를 가지고 있는 자식 테이블이 연관관걔의 주인이 됨.
    복합키 구조가 아니기 때문에 부모 테이블과 자식 테이블이
    OneToOne 양방향 매핑 구조로 구성할 수 있음
*/
@Entity
public class BoardDetail {

    @Id
    private Long boardId;

    @MapsId
    @OneToOne
    @JoinColumn(name = "BOARD_ID")
    private Board board;

    private String content;

}
