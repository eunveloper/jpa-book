package com.eunveloper.jpabook.advancedmapping.compositekey;

import com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid.EiParent;
import com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid.EiParentId;
import com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid.EiParentIdNotOverride;
import com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid.EiParentNotOverride;
import com.eunveloper.jpabook.advancedmapping.compositekey.domain.idclass.IcParent;
import com.eunveloper.jpabook.advancedmapping.compositekey.domain.idclass.IcParentId;
import com.eunveloper.jpabook.advancedmapping.compositekey.repository.embeddedid.EiParentNotOverrideRepository;
import com.eunveloper.jpabook.advancedmapping.compositekey.repository.embeddedid.EiParentRepository;
import com.eunveloper.jpabook.advancedmapping.compositekey.repository.idclass.IcParentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompositeKeyTest {

    @Autowired
    private IcParentRepository icParentRepository;

    @Autowired
    private EiParentRepository eiParentRepository;

    @Autowired
    private EiParentNotOverrideRepository eiParentNotOverrideRepository;

    @Test
    void 복합키_스키마_확인() {}

    @Test
    void 복합키_비식별_Id_Class() {
        System.out.println("======================== 1. 생성 =======================");
        IcParent icParent = new IcParent();
        icParent.setId1("id1");
        icParent.setId2("id2");
        System.out.println("======================== 확인사항 ========================");
        System.out.println();
        System.out.println("식별자 클래스를 따로 할당해서 사용하는게 아니라 그저 데이터를 세팅만함");
        System.out.println("내부적으로 동일한 필드명을 매핑하여 식별자 클래스를 생성하고 키로 사용");
        System.out.println();
        icParentRepository.save(icParent);

        System.out.println("======================== 1. 조회 =======================");
        IcParentId icParentId = new IcParentId("id1", "id2");
        icParentRepository.findById(icParentId).get();
        System.out.println("======================== 확인사항 ========================");
        System.out.println();
        System.out.println("식별자 클래스가 영속성 컨텍스트 키이기 때문에 클래스로 조회해야 한다.");
        System.out.println();
    }

    @Test
    void 복합키_비식별_Embedded_Id() {
        System.out.println("======================== 1. 생성 =======================");
        EiParent eiParent = new EiParent();
        EiParentId eiParentId = new EiParentId("id1", "id2");
        eiParent.setId(eiParentId);
        System.out.println("======================== 확인사항 ========================");
        System.out.println();
        System.out.println("식별자 클래스를 직접 생성해서 사용한다.");
        System.out.println();
        eiParentRepository.save(eiParent);

        System.out.println("======================== 1. 조회 =======================");
        eiParentRepository.findById(eiParentId).get();
        System.out.println("======================== 확인사항 ========================");
        System.out.println();
        System.out.println("동일하게 식별자 클래스를 직접 사용하여 조회한다.");
        System.out.println();
    }

    @Test
    void 복합키_이퀄스_해시코드_오버라이딩() {
        System.out.println("===================== 오버라이딩 한 경우 ====================");
        System.out.println();
        EiParentId eiParentId1 = new EiParentId("id1", "id2");
        EiParentId eiParentId2 = new EiParentId("id1", "id2");

        System.out.println("================= eiParentId1로 엔티티 저장 ================");
        System.out.println();
        EiParent eiParent1 = new EiParent();
        eiParent1.setId(eiParentId1);
        eiParent1.setName("name1");
        eiParentRepository.save(eiParent1);
        System.out.println("======================== 저장완료 ========================");
        System.out.println();

        System.out.println("============= eiParentId1로 조회한 객체의 식별자 =============");
        System.out.println();
        System.out.println(eiParentRepository.findById(eiParentId1).get().getId());
        System.out.println("============= eiParentId2로 조회한 객체의 식별자 =============");
        System.out.println();
        System.out.println(eiParentRepository.findById(eiParentId2).get().getId());

        System.out.println("======================== 확인결과 =========================");
        System.out.println("다른 식별자 객체로 조회해도 조회된 객체의 식별자 객체는 동일한 주소값을 가짐");
        System.out.println("어찌보면 당연한 이야기 이다 => 이퀄스와 해시코드를 오버라이딩 했기 때문");
        System.out.println("JPA 영속성 컨텍스트는 이 식별자의 동등성을 기반으로 객체를 관리하기 때문");

        System.out.println("==================== 오버라이딩 안한 경우 ===================");
        System.out.println();
        EiParentIdNotOverride eiParentIdNotOverride1 = new EiParentIdNotOverride("id1", "id2");
        EiParentIdNotOverride eiParentIdNotOverride2 = new EiParentIdNotOverride("id1", "id2");

        System.out.println("============ eiParentIdNotOverride1 엔티티 저장 ============");
        System.out.println();
        EiParentNotOverride eiParentNotOverride1 = new EiParentNotOverride();
        eiParentNotOverride1.setId(eiParentIdNotOverride1);
        eiParentNotOverride1.setName("name1");
        eiParentNotOverrideRepository.save(eiParentNotOverride1);
        System.out.println("======================== 저장완료 ========================");
        System.out.println();

        System.out.println("======== eiParentIdNotOverride1 조회한 객체의 식별자 =========");
        System.out.println();
        System.out.println(eiParentNotOverrideRepository.findById(eiParentIdNotOverride1).get().getId());
        System.out.println("========= eiParentIdNotOverride2 조회한 객체의 식별자 =========");
        System.out.println();
        System.out.println(eiParentNotOverrideRepository.findById(eiParentIdNotOverride2).get().getId());

        System.out.println("======================== 확인결과 =========================");
        System.out.println("다른 식별자 객체로 조회해도 조회된 객체의 식별자 객체는 다른 주소값을 가짐");
    }

}
