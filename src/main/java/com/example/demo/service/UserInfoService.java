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
    private UserInfoMapper userInfoMapper;
    //查询所有用户信息
    public List<UserInfo> selectAll(){
        return userInfoMapper.selectUserInfoList();
    }
    //根据用户id查询用户信息
    public UserInfo selectOne(Integer uid){
        return userInfoMapper.selectOne(uid);
    }
    //根据相关数据更新用户信息
    public int UpdateUser(UserInfo userInfo){
        return userInfoMapper.updateUserInfO(userInfo);
    }
    //插入新的用户信息
    public int InsertUser(int uid){return userInfoMapper.insertUserInfo(uid);}

}
