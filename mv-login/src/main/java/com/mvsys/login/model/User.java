package com.mvsys.login.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

public class User extends Account{
    private String uname;
    private String email;
    private String phone;
    private String hobby;
    private String occupation;
    private String education;
    private String gender;
    private Integer age = 18;
    private String tgroup;

    // getter 和 setter 方法
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getTgroup() {
        return tgroup;
    }
    public void setTgroup(String tgroup) {
        this.tgroup = tgroup;
    }

}