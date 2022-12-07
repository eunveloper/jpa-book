package com.eunveloper.jpabook.advancedmapping.Inheritance.repository.subtype;

import com.eunveloper.jpabook.advancedmapping.Inheritance.domain.subtype.SubAlbum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubAlbumRepository extends JpaRepository<SubAlbum, Long> {
    SubAlbum findByName(String name);
}
