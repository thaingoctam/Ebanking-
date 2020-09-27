/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ebanking.entities;

import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author solid
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerID;
    private String ctUserName;
    private String ctPassword;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthDay;
    private String sex;
    private String Adrress;
    private String country;
    private String nationlaty;
    private String district;
    private String city;
    private String phone;
    private String email;
    private String IDcard;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateIssueIDCard;
    private String issueIDCardOffice;
    private boolean status;

    @OneToMany(mappedBy = "customer")
    private Set<Account> account;
    
    @ManyToOne
    @JoinColumn(name="roleID")
    private Role role;

    public Customer() {
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCtUserName() {
        return ctUserName;
    }

    public void setCtUserName(String ctUserName) {
        this.ctUserName = ctUserName;
    }

    public String getCtPassword() {
        return ctPassword;
    }

    public void setCtPassword(String ctPassword) {
        this.ctPassword = ctPassword;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAdrress() {
        return Adrress;
    }

    public void setAdrress(String Adrress) {
        this.Adrress = Adrress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNationlaty() {
        return nationlaty;
    }

    public void setNationlaty(String nationlaty) {
        this.nationlaty = nationlaty;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIDcard() {
        return IDcard;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public Date getDateIssueIDCard() {
        return dateIssueIDCard;
    }

    public void setDateIssueIDCard(Date dateIssueIDCard) {
        this.dateIssueIDCard = dateIssueIDCard;
    }

    public String getIssueIDCardOffice() {
        return issueIDCardOffice;
    }

    public void setIssueIDCardOffice(String issueIDCardOffice) {
        this.issueIDCardOffice = issueIDCardOffice;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Set<Account> getAccount() {
        return account;
    }

    public void setAccount(Set<Account> account) {
        this.account = account;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    
}
