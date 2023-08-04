package com.mvsys.login.mapper;

import com.mvsys.login.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO UserInfo(uname, email, phone, hobby, occupation, education, gender, age, tgroup) VALUES(#{uname}, #{email}, #{phone}, #{hobby}, #{occupation}, #{education}, #{gender}, #{age}, #{tgroup})")
    void insertUserInfo(User user);
    @Select("SELECT user_id FROM UserInfo WHERE email=#{email}")
    Integer selectUserId(User user);
    @Insert("INSERT INTO UserLogin(user_id, username, pwd) VALUES(#{user_id}, #{email}, #{pwd})")
    void insertUserLogin(User user);
}