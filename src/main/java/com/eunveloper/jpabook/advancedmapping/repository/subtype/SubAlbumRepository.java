package com.eunveloper.jpabook.advancedmapping.repository.subtype;

import com.eunveloper.jpabook.advancedmapping.domain.subtype.SubAlbum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubAlbumRepository extends JpaRepository<SubAlbum, Long> {
    SubAlbum findByName(String name);
}
