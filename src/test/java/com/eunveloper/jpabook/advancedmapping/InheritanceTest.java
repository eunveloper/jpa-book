package com.eunveloper.jpabook.advancedmapping;

import com.eunveloper.jpabook.advancedmapping.domain.inheritance.JoinAlbum;
import com.eunveloper.jpabook.advancedmapping.domain.inheritance.JoinItem;
import com.eunveloper.jpabook.advancedmapping.domain.integrated.IntegratedAlbum;
import com.eunveloper.jpabook.advancedmapping.domain.subtype.SubAlbum;
import com.eunveloper.jpabook.advancedmapping.repository.inheritance.JoinAlbumRepository;
import com.eunveloper.jpabook.advancedmapping.repository.inheritance.JoinItemRepository;
import com.eunveloper.jpabook.advancedmapping.repository.integrated.IntegratedAlbumRepository;
import com.eunveloper.jpabook.advancedmapping.repository.integrated.IntegratedItemRepository;
import com.eunveloper.jpabook.advancedmapping.repository.subtype.SubAlbumRepository;
import com.eunveloper.jpabook.advancedmapping.repository.subtype.SubItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InheritanceTest {

    private final static String name = "name";

    @Autowired
    private JoinItemRepository joinItemRepository;

    @Autowired
    private JoinAlbumRepository joinAlbumRepository;

    @Autowired
    private IntegratedItemRepository integratedItemRepository;

    @Autowired
    private SubItemRepository subItemRepository;

    @Autowired
    private SubAlbumRepository subAlbumRepository;

    @Test
    void 조인_전략_스키마_확인() {}

    @Test
    void 조인_전략_특징() {
        System.out.println("======================== 1. 조회 =======================");
        System.out.println("======================= 부모클래스 =======================");
        joinItemRepository.findByName(name);
        System.out.println("======================= 자식클래스 =======================");
        joinAlbumRepository.findByName(name);
        System.out.println("======================== 확인사항 ========================");
        System.out.println();
        System.out.println("부모클래스를 조회하던 자식클래스를 조회하던 단일 클래스만 조회하지 않고");
        System.out.println("항상 조인을 통해서 모든 데이터를 가져온다 -> 즉 조회 성능에 영향 있음");
        System.out.println();
        System.out.println("======================== 왜그럴까 ========================");
        System.out.println();
        System.out.println("Hibernate 가 항상 EAGER 전략을 사용하기 때문 -> 즉시 조회하기 때문");
        System.out.println("https://sodocumentation.net/hibernate/topic/2326/performance-tuning");
        System.out.println("");
        System.out.println("======================== 임시?방안 ========================");
        System.out.println();
        System.out.println("원하는 테이블의 정보만 가져오는 DTO와 JPQL을 활용하면 데이터를 조회!");
        System.out.println();
        joinItemRepository.findDtoByName(name);

        System.out.println("======================== 2. 생성 =======================");
        joinAlbumRepository.save(new JoinAlbum(1L, name, 5000, "artist"));
        System.out.println();
        System.out.println("인서트 쿼리가 총 두개 나간다. -> 생각해보면 당연하다 테이블이 두개니까");

        System.out.println("======================== 3. 수정 =======================");
        joinAlbumRepository.save(new JoinAlbum(1L, name, 5000, "artist1"));
        System.out.println();
        System.out.println("부모클래스는 그대로 두고, 실제 변경이 일어난 자식클래스에만 업데이트 진행");
    }

    @Test
    void 단일_테이블_전략_특징() {
        System.out.println("======================== 1. 조회 =======================");
        integratedItemRepository.findByName(name);
        System.out.println();
        System.out.println("단일 테이블이기 때문에 셀렉트 쿼리 하나로 모든 정보를 한번에 조회 가능");

        System.out.println("======================== 2. 생성 =======================");
        integratedItemRepository.save(new IntegratedAlbum(1L, name, 5000, "artist"));
        System.out.println();
        System.out.println("인서트 쿼리가 한개만 나간다.");

        System.out.println("======================== 3. 수정 =======================");
        integratedItemRepository.save(new IntegratedAlbum(1L, name, 5000, "artist1"));
        System.out.println();
        System.out.println("업데이트 쿼리가 한개만 나간다.");
    }

    @Test
    void 클래스별_테이블_전략_특징() {
        System.out.println("======================== 1. 조회 =======================");
        System.out.println("======================= 부모클래스 =======================");
        subItemRepository.findByName(name);
        System.out.println("======================= 자식클래스 =======================");
        subAlbumRepository.findByName(name);
        System.out.println("======================== 확인사항 ========================");
        System.out.println();
        System.out.println("부모클래스를 조회하게 되면 자시글래스 전부를 union all 쿼리로 조회");
        System.out.println("싱황에 따라 다르겠지만 불필요한 데이터 조회 + 성능문제를 야기할 수 있음");

        System.out.println("======================== 2. 생성 =======================");
        subAlbumRepository.save(new SubAlbum(1L, name, 5000, "artist"));
        System.out.println();
        System.out.println("인서트 쿼리가 한개만 나간다.");

        System.out.println("======================== 3. 수정 =======================");
        subAlbumRepository.save(new SubAlbum(1L, name, 5000, "artist1"));
        System.out.println();
        System.out.println("업데이트 쿼리가 한개만 나간다.");
    }


}
