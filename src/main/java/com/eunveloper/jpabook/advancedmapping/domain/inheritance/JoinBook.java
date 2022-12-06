package com.eunveloper.jpabook.advancedmapping.domain.inheritance;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("B")
@PrimaryKeyJoinColumn(name = "BOOK_ID")
public class JoinBook extends JoinItem {

    private String author;
    private String isbn;

    public JoinBook(Long id, String name, int price) {
        super(id, name, price);
    }

    public JoinBook() {
        super();
    }
}
