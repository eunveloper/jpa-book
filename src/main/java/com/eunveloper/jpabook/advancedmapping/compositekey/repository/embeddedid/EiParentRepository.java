package com.eunveloper.jpabook.advancedmapping.compositekey.repository.embeddedid;

import com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid.EiParent;
import com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid.EiParentId;
import com.eunveloper.jpabook.advancedmapping.compositekey.domain.idclass.IcParent;
import com.eunveloper.jpabook.advancedmapping.compositekey.domain.idclass.IcParentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EiParentRepository extends JpaRepository<EiParent, EiParentId> {
}
