package com.eunveloper.jpabook.advancedmapping.repository.integrated;

import com.eunveloper.jpabook.advancedmapping.domain.integrated.IntegratedAlbum;
import com.eunveloper.jpabook.advancedmapping.domain.integrated.IntegratedItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntegratedItemRepository extends JpaRepository<IntegratedItem, Long> {
    IntegratedItem findByName(String name);
}
