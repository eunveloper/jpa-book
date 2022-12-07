package com.eunveloper.jpabook.advancedmapping.compositekey.domain.embeddedid;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/* Serializable, equals, hashcode 구현하는것은 동일 */
@Embeddable
public class Ei2ChildId implements Serializable {

    private String parentId;
    /* @MapsId("parentId")의 속성과 매핑 */

    @Column(name = "CHILD_ID")
    private String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ei2ChildId that = (Ei2ChildId) o;
        return Objects.equals(parentId, that.parentId) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentId, id);
    }
}
