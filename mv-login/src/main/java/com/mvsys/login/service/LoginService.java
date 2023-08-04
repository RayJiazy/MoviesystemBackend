package com.mvsys.login.service;

import com.mvsys.login.model.Account;
import com.mvsys.login.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginService {
    @Autowired
    private AccountMapper accountMapper;
    public String login(Account account){
        if(account.getRole().contains("user")){
            Account act = accountMapper.getUserState(account);
            if(act == null)
                return "Incorrect username";
            else if(Objects.equals(act.getPwd(), account.getPwd())) {
                if (act.getLogin_state() == 0) {
                    accountMapper.userLogin(act);
                    return "Login successfully";
                }
                return "Login unsuccessfully, this account is already logged in.";
            }
            return "Incorrect password";
        }
        else{
            Account act = accountMapper.getAdminState(account);
            if(act == null)
                return "Incorrect username";
            else if(Objects.equals(act.getPwd(), account.getPwd())) {
                if (act.getLogin_state() == 0) {
                    accountMapper.adminLogin(act);
                    return "Login successfully";
                }
                return "Login unsuccessfully, this account is already logged in.";
            }
            return "Incorrect password";
        }
    }
    public int offline(Integer user_id,String role){
        if(role.contains("user"))
            return(accountMapper.userOff(user_id));
        else
            return(accountMapper.adminOff(user_id));
    }
}
