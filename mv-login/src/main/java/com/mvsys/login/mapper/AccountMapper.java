package com.mvsys.login.mapper;

import com.mvsys.login.model.Account;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface AccountMapper {
    @Select("SELECT * FROM UserLogin WHERE username=#{username}")
    Account getUserState(Account account);
    @Select("SELECT * FROM AdminLogin WHERE admin_name=#{username}")
    Account getAdminState(Account account);
    @Update("UPDATE UserLogin SET login_state = 1 Where user_id=#{user_id}")
    void userLogin(Account account);
    @Update("UPDATE AdminLogin SET login_state = 1 Where admin_id=#{admin_id}")
    void adminLogin(Account account);
    @Update("UPDATE UserLogin SET login_state = 0 Where user_id=#{user_id} and login_state = 1")
    int userOff(Integer user_id);
    @Update("UPDATE AdminLogin SET login_state = 0 Where admin_id=#{user_id} and login_state = 1")
    int adminOff(Integer user_id);
}
