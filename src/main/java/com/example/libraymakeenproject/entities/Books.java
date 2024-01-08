package com.example.libraymakeenproject.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Books extends BaseEntity {

    private String title;

    private String Author;

    private BookType bookType;


    //*************************************  getter  *****************************************//


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonManagedReference
    public BookType getBookType() {
        return bookType;
    }
    //*************************************  setter  *****************************************//

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    //*************************************  override  *****************************************//
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book")
    @SequenceGenerator(name = "book", sequenceName = "bookseq", allocationSize = 1)
    @Column(name = "book_id")
    @Override
    public Long getEntityId() {
        return super.getEntityId();
    }

    @Override
    public void setEntityId(Long entityId) {
        super.setEntityId(entityId);
    }

    @Override
    public Boolean getNotDeleted() {
        return super.getNotDeleted();
    }

    @Override
    public void setNotDeleted(Boolean notDeleted) {
        super.setNotDeleted(notDeleted);
    }
}
