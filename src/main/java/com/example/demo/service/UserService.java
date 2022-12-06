package com.example.demo.service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.Manager;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User SelectByName(String uusername) {
        return userMapper.getUserByName(uusername);
    }

    public List<User> selectAll() {
        return userMapper.selectUserList();
    }

    public int insert(User user) {
        return userMapper.addUser(user);
    }

    public List<String> getAllUsername() {
        return userMapper.selectAllName();
    }

    public int updatePwd(String uusername, String newpass) {
        return userMapper.updateUser(uusername, newpass);
    }

    public int getUserNum() {
        return userMapper.selectUserNum();
    }

    /**
     * @description:查询所有的用户信息
     * @author: Insist On
     * @date: 2022/12/6 14:43
     **/
    public List<User> getAllUserInf(){
        return userMapper.SelectAllUserInf();
    }
    /**
     * @description:根据学号删除用户的信息
     * @author: Insist On
     * @date: 2022/12/6 14:45
     **/
    public void deleteUser(Integer uid){
        userMapper.deleteUserInfById(uid);
    }
    /**
     * @description:修改用户的信息
     * @author: Insist On
     * @date: 2022/12/6 14:46
     **/
    public void updateUserInf(User user){
        userMapper.updateUserInf(user);
    }




}
