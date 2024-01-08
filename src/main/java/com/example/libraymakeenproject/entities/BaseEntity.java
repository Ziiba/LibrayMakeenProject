package com.example.libraymakeenproject.entities;

import jakarta.persistence.Entity;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long entityId;

    private Boolean notDeleted=true;

    //*************************************  setter & getter  *****************************************//

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public Boolean getNotDeleted() {
        return notDeleted;
    }

    public void setNotDeleted(Boolean notDeleted) {
        this.notDeleted = notDeleted;
    }
}
