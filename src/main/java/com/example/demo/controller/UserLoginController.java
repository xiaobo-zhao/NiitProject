package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.result.Result;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import static com.example.demo.result.Error.ERROR_1;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserLoginController {
    @Autowired
    private UserService userService;

    @CrossOrigin
    @PostMapping(value = "/login")
    public Result login(@RequestBody User requestUser, HttpSession session, HttpServletResponse response) {
        String uusername = requestUser.getUusername();
        String upassword = requestUser.getUpassword();
        User existUser = userService.SelectByName(uusername);
        System.out.println(existUser);
        System.out.println(upassword);
        System.out.println(existUser.getUpassword().equals(upassword));
//        if(uusername.isEmpty() || upassword.isEmpty()) {
//            return Result.error("");
//        }
        if(existUser==null){
            return  Result.error("用户名或密码错误");
        }
//        if (!existUser.getUpassword().equals((DigestUtils.md5DigestAsHex(upassword.getBytes())))) {
//            result.setMessage("密码错误,请重新输入");
//            result.setCode(400);
//            return result;
//        }
        if (!upassword.equals(existUser.getUpassword())) {
            return Result.error("用户名或密码错误");
        }

        return Result.success(existUser);
    }
}
