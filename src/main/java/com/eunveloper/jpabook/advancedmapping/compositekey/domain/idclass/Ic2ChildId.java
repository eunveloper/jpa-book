package com.eunveloper.jpabook.advancedmapping.compositekey.domain.idclass;

import java.io.Serializable;
import java.util.Objects;

/* 이전과 동일하다 매핑할 필드명과 동일하게 작성해야하며 Serializable, equals, hashcode 구현해야 한다 */
public class Ic2ChildId implements Serializable {

    private String parent;
    private String childId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ic2ChildId that = (Ic2ChildId) o;
        return Objects.equals(parent, that.parent) && Objects.equals(childId, that.childId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, childId);
    }
}
