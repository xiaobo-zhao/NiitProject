package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.pojo.UserInfo;
import com.example.demo.result.Result;
import com.example.demo.service.UserInfoService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserInfoController {
    @Autowired
    UserService userService;
    @Autowired
    UserInfoService userInfoService;

    @CrossOrigin
    @PostMapping("/userinfo/updateuserinfo")
    public Result updateUserInfo(@RequestBody UserInfo userInfo){
        userInfoService.UpdateUser(userInfo);
        System.out.println(userInfoService.UpdateUser(userInfo));
        System.out.println(userInfo);
        return Result.success(userInfo);
    }

//
//    @CrossOrigin
//    @PostMapping("/userinfo/wantlist")
//    public Result showUserWant() {
//        List<User> users = userService.selectAll();
//        return Result.success(users);
//    }


    @CrossOrigin
    @PostMapping("/userinfo/one")
    //展示当前登陆用户信息
    public Result ShowOneInfo(@RequestBody UserInfo userInfo){
        UserInfo userinfo =userInfoService.selectOne(userInfo.getUid());
        return Result.success(userinfo);
    }


}
