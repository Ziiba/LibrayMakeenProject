package com.example.libraymakeenproject.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class BookType extends BaseEntity {
    private String Name;
    private List<Books> books;

    //*************************************  getter  *****************************************//

    public String getName() {
        return Name;
    }

    @OneToOne
    @JsonBackReference
    public List<Books> getBooks() {
        return books;
    }
    //*************************************  setter  *****************************************//

    public void setName(String name) {
        Name = name;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
    //*************************************  override  *****************************************//
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "booktype")
    @SequenceGenerator(name = "booktype", sequenceName = "booktypeseq", allocationSize = 1)
    @Column(name = "book_type")

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
