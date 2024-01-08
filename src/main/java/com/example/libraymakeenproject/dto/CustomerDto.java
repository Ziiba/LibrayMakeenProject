package com.example.libraymakeenproject.dto;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class CustomerDto {
    private Long Id;

    private String firstName;

    private String lastName;

    private Integer age;

    private String phone;

    private String phoneNumber;

    private String postalCode;

    private String username;

    private String password;

    private String repeatpassword;

    private String nationalcode;

    private String address;

    private String gender;

    private String token;


    //*************************************  setter & getter  *****************************************//


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatpassword() {
        return repeatpassword;
    }

    public void setRepeatpassword(String repeatpassword) {
        this.repeatpassword = repeatpassword;
    }

    public String getNationalcode() {
        return nationalcode;
    }

    public void setNationalcode(String nationalcode) {
        this.nationalcode = nationalcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    //*************************************  to string  *****************************************//

    @Override
    public String toString() {
        return "CustomerDto{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", repeatpassword='" + repeatpassword + '\'' +
                ", nationalcode='" + nationalcode + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerDto that = (CustomerDto) o;
        return Objects.equals(Id, that.Id) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(age, that.age) && Objects.equals(phone, that.phone) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(postalCode, that.postalCode) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(repeatpassword, that.repeatpassword) && Objects.equals(nationalcode, that.nationalcode) && Objects.equals(address, that.address) && Objects.equals(gender, that.gender) && Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, firstName, lastName, age, phone, phoneNumber, postalCode, username, password, repeatpassword, nationalcode, address, gender, token);
    }
}
