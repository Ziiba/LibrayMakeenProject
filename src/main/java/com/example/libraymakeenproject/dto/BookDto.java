package com.example.libraymakeenproject.dto;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class BookDto {
    private  Long id;
    private  String nameBook;
    private  String author;
    private  Long entityAll;
    private String category;

    //*************************************  setter & getter  *****************************************//


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getEntityAll() {
        return entityAll;
    }

    public void setEntityAll(Long entityAll) {
        this.entityAll = entityAll;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    //*************************************  to string  *****************************************//

    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", entityAll=" + entityAll +
                ", category='" + category + '\'' +
                '}';
    }
    //*************************************  equals & hashcode  *********************************//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDto bookDto = (BookDto) o;
        return Objects.equals(id, bookDto.id) && Objects.equals(nameBook, bookDto.nameBook) && Objects.equals(author, bookDto.author) && Objects.equals(entityAll, bookDto.entityAll) && Objects.equals(category, bookDto.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameBook, author, entityAll, category);
    }
}
