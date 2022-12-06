package com.eunveloper.jpabook.advancedmapping.repository.subtype;

import com.eunveloper.jpabook.advancedmapping.domain.subtype.SubAlbum;
import com.eunveloper.jpabook.advancedmapping.domain.subtype.SubItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubItemRepository extends JpaRepository<SubItem, Long> {
    SubItem findByName(String name);
}
