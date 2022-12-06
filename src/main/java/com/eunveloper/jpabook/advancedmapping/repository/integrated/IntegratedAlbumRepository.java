package com.eunveloper.jpabook.advancedmapping.repository.integrated;

import com.eunveloper.jpabook.advancedmapping.domain.integrated.IntegratedAlbum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntegratedAlbumRepository extends JpaRepository<IntegratedAlbum, Long> {
    IntegratedAlbum findByName(String name);
}
