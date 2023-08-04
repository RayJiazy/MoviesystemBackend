package com.mvsys.login.model;

public class Account {
    private String username;
    private String pwd;
    private Integer user_id;
    private Integer admin_id;
    private String role;
    private Integer login_state;

    public Integer getAdmin_id() {
        return admin_id;
    }
    public void setAdmin_id(Integer admin_id){
        this.admin_id = admin_id;
    }

    public Integer getUser_id() {
        return user_id;
    }
    public void setUser_id(Integer user_id){
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getLogin_state(){
        return login_state;
    }

    public void setLogin_state(Integer login_state) {
        this.login_state = login_state;
    }
}
