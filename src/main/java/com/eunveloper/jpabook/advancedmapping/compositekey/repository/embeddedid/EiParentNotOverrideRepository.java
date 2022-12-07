package com.eunveloper.jpabook.advancedmapping.compositekey.repository.embeddedid;

import com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid.EiParent;
import com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid.EiParentId;
import com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid.EiParentIdNotOverride;
import com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid.EiParentNotOverride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EiParentNotOverrideRepository extends JpaRepository<EiParentNotOverride, EiParentIdNotOverride> {
}
