package com.eunveloper.jpabook.advancedmapping.repository.inheritance;

import com.eunveloper.jpabook.advancedmapping.domain.inheritance.JoinItem;
import com.eunveloper.jpabook.advancedmapping.dto.JoinItemDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinItemRepository extends JpaRepository<JoinItem, Long> {
    JoinItem findByName(String name);

    @Query("select i.name from JoinItem i")
    JoinItemDto findDtoByName(String name);
}
