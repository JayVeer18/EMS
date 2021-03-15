package com.jayaveer.ems.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.*;
import javax.persistence.*;

@Entity
@Table(name = "base_user")
public class BaseUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long buser_gkey;
    @JsonProperty("id")
    private String buser_userid;
    @JsonProperty("currentPassword")
    private String buser_password;
    @JsonProperty("oldPassword")
    private String buser_old_password;
    @JsonProperty("firstName")
    private String buser_firstName;
    @JsonProperty("lastName")
    private String buser_lastName;
    @JsonProperty("middleName")
    private String buser_middle_name;
    @JsonProperty("email")
    private String buser_eMail;
    @JsonProperty("telephone")
    private String buser_telephone;
    @JsonProperty("Language")
    private String buser_locLanguage;
    @JsonProperty("country")
    private String buser_locCountry;
    @JsonProperty("timeZone")
    private String buser_time_zone;

    @Override
    public String toString() {
        return "BaseUser{" +
                "buser_gkey=" + buser_gkey +
                ", buser_userid='" + buser_userid + '\'' +
                ", buser_password='" + buser_password + '\'' +
                ", buser_old_password='" + buser_old_password + '\'' +
                ", buser_firstName='" + buser_firstName + '\'' +
                ", buser_lastName='" + buser_lastName + '\'' +
                ", buser_middle_name='" + buser_middle_name + '\'' +
                ", buser_eMail='" + buser_eMail + '\'' +
                ", buser_telephone='" + buser_telephone + '\'' +
                ", buser_locLanguage='" + buser_locLanguage + '\'' +
                ", buser_locCountry='" + buser_locCountry + '\'' +
                ", buser_time_zone='" + buser_time_zone + '\'' +
                '}';
    }

    public Long getBuser_gkey() {
        return buser_gkey;
    }

    public void setBuser_gkey(Long buser_gkey) {
        this.buser_gkey = buser_gkey;
    }

    public String getBuser_userid() {
        return buser_userid;
    }

    public void setBuser_userid(String buser_userid) {
        this.buser_userid = buser_userid;
    }

    public String getBuser_password() {
        return buser_password;
    }

    public void setBuser_password(String buser_password) {
        this.buser_password = buser_password;
    }

    public String getBuser_old_password() {
        return buser_old_password;
    }

    public void setBuser_old_password(String buser_old_password) {
        this.buser_old_password = buser_old_password;
    }

    public String getBuser_firstName() {
        return buser_firstName;
    }

    public void setBuser_firstName(String buser_firstName) {
        this.buser_firstName = buser_firstName;
    }

    public String getBuser_lastName() {
        return buser_lastName;
    }

    public void setBuser_lastName(String buser_lastName) {
        this.buser_lastName = buser_lastName;
    }

    public String getBuser_middle_name() {
        return buser_middle_name;
    }

    public void setBuser_middle_name(String buser_middle_name) {
        this.buser_middle_name = buser_middle_name;
    }

    public String getBuser_eMail() {
        return buser_eMail;
    }

    public void setBuser_eMail(String buser_eMail) {
        this.buser_eMail = buser_eMail;
    }

    public String getBuser_telephone() {
        return buser_telephone;
    }

    public void setBuser_telephone(String buser_telephone) {
        this.buser_telephone = buser_telephone;
    }

    public String getBuser_locLanguage() {
        return buser_locLanguage;
    }

    public void setBuser_locLanguage(String buser_locLanguage) {
        this.buser_locLanguage = buser_locLanguage;
    }

    public String getBuser_locCountry() {
        return buser_locCountry;
    }

    public void setBuser_locCountry(String buser_locCountry) {
        this.buser_locCountry = buser_locCountry;
    }

    public String getBuser_time_zone() {
        return buser_time_zone;
    }

    public void setBuser_time_zone(String buser_time_zone) {
        this.buser_time_zone = buser_time_zone;
    }
}
