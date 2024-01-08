package com.example.libraymakeenproject.entities;

import jakarta.persistence.*;
@Entity
public class wallet extends BaseEntity{
    private   Long amount;
    private  persons persons;




    //*************************************  getter  *****************************************//

    public Long getAmount() {
        return amount;
    }
@OneToOne(fetch = FetchType.LAZY)
    public persons getPersons() {
        return persons;
    }


    //************************************* setter  *****************************************//


    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setPersons(com.example.libraymakeenproject.entities.persons persons) {
        this.persons = persons;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wallets")
    @SequenceGenerator(name = "wallets", sequenceName = "walletseq", allocationSize = 1)
    @Column(name = "wallet_id")
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
