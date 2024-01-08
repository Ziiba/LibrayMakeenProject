package com.example.libraymakeenproject.entities;

import jakarta.persistence.*;

@Entity
public class persons extends BaseEntity {

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    private String gender;

    private String nationalCode;

    private String postalCode;

    private Integer age;

    private String landLinePhone;

    private String mobilePhone;

    private String address;

    private wallet walletCharge;

    private PersonRole personRole;


    //*************************************  getter  *****************************************//

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Integer getAge() {
        return age;
    }

    public String getLandLinePhone() {
        return landLinePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    @OneToOne(mappedBy = "persons",fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public wallet getWalletCharge() {
        return walletCharge;
    }

    public PersonRole getPersonRole() {
        return personRole;
    }

//*************************************  setter  *****************************************//


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setLandLinePhone(String landLinePhone) {
        this.landLinePhone = landLinePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWalletCharge(wallet walletCharge) {
        this.walletCharge = walletCharge;
    }

    public void setPersonRole(PersonRole personRole) {
        this.personRole = personRole;
    }

    //*************************************  override  *****************************************//
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "persons")
    @SequenceGenerator(name = "persons", sequenceName = "personseq", allocationSize = 1)
    @Column(name = "person_id")
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
