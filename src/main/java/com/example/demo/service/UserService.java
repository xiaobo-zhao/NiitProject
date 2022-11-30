package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserMapper userMapper;

    public User SelectByName(String uusername){
        return userMapper.getUserByName(uusername);
    }

    public List<User> selectAll(){
        return userMapper.selectUserList();
    }

    public int insert(User user){
        return userMapper.addUser(user);
    }

    public List<String> getAllUsername(){return userMapper.selectAllName();}

    public int updatePwd(String uusername,String newpass){
        return  userMapper.updateUser(uusername,newpass);
    }
}
