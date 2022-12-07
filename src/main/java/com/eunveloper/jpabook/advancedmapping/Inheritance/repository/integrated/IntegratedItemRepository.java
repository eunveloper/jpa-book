package com.eunveloper.jpabook.advancedmapping.Inheritance.repository.integrated;

import com.eunveloper.jpabook.advancedmapping.Inheritance.domain.integrated.IntegratedItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntegratedItemRepository extends JpaRepository<IntegratedItem, Long> {
    IntegratedItem findByName(String name);
}
