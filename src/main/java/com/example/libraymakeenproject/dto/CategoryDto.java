package com.example.libraymakeenproject.dto;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CategoryDto {
    private  Long Id;
    private  String categoryName;
    //*************************************  setter & getter  *****************************************//


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    //*************************************  to string  *****************************************//

    @Override
    public String toString() {
        return "CategoryDto{" +
                "Id=" + Id +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryDto that = (CategoryDto) o;
        return Objects.equals(Id, that.Id) && Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, categoryName);
    }
}
