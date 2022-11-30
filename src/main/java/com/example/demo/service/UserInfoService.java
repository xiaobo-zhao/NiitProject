package com.example.demo.service;

import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {
    @Autowired
    public UserInfoMapper userInfoMapper;

    public List<UserInfo> selectAll(){
        return userInfoMapper.selectUserInfoList();
    }
    public UserInfo selectOne(Integer uid){
        return userInfoMapper.selectOne(uid);
    }

    public int UpdateUser(UserInfo userInfo){
        return userInfoMapper.updateUserInfO(userInfo);
    }

    public int InsertUser(int uid){return userInfoMapper.insertUserInfo(uid);}
}
