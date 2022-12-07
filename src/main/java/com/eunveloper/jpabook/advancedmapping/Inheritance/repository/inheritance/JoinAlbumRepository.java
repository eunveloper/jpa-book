package com.eunveloper.jpabook.advancedmapping.Inheritance.repository.inheritance;

import com.eunveloper.jpabook.advancedmapping.Inheritance.domain.inheritance.JoinAlbum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinAlbumRepository extends JpaRepository<JoinAlbum, Long> {
    JoinAlbum findByName(String name);
}
