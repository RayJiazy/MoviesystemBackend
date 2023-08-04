package com.mvsys.login.service;

import com.mvsys.login.model.User;
import com.mvsys.login.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
@Service
public class RegisterService {
    @Autowired
    private UserMapper userMapper;
    @Transactional
    public String register(User user) {
        try{ userMapper.insertUserInfo(user); }
        catch (DuplicateKeyException e){
            System.out.println(e.getCause().getMessage());
            if (e.getCause().getMessage().contains("uname")) {
                return "Name already exists";
            }
            else if(e.getCause().getMessage().contains("email")){
                return "Email already exists";
            } else if (e.getCause().getMessage().contains("phone")){
                return "Phone already exists";
            }
        }
        catch(Exception e) {
            return "Missing value";
        }

        user.setUser_id(userMapper.selectUserId(user));
        try{ userMapper.insertUserLogin(user); }
        catch (DuplicateKeyException e){
            if (e.getCause().getMessage().contains("pwd")) {
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return "Password already exists";
            }
            else {
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return "Duplicate key";
            }
        }
        catch(Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return "Missing value";
        }
        return "Registered successfully";
    }
}
