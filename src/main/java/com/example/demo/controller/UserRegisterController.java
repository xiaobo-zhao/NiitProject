package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.pojo.UserInfo;
import com.example.demo.result.Result;
import com.example.demo.service.UserInfoService;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

import static com.example.demo.result.Error.ERROR_1;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserRegisterController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserInfoService userInfoService;
    //用户注册
    @CrossOrigin
    @PostMapping(value = "/register")
    public Result register(@RequestBody User user) {
        List<String> usernames = userService.getAllUsername();
        //用户名是否已经被注册
        if (usernames.contains(user.getUusername())) {
            System.out.println("sorry");
            return Result.error("用户名已注册");
        } else {
            int insertresult=userService.insert(user);
            if(insertresult>0){
            User user1 =userService.SelectByName(user.getUusername());
            userInfoService.InsertUser(user1.getUid());
            return Result.success();
            }else{
                return Result.error("注册失败");
            }

        }
    }
}
