package com.eunveloper.jpabook.advancedmapping.compositekey.repository.idclass;

import com.eunveloper.jpabook.advancedmapping.compositekey.domain.idclass.IcParent;
import com.eunveloper.jpabook.advancedmapping.compositekey.domain.idclass.IcParentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IcParentRepository extends JpaRepository<IcParent, IcParentId> {
}
