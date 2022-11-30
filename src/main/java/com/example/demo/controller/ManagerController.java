package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.Manager;
import com.example.demo.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @BelongsProject: renteasy
 * @BelongsPackage: com.example.renteasy.controller
 * @Author: Insist On
 * @CreateTime: 2022-11-07  14:54
 */
@RestController
@CrossOrigin
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @RequestMapping(value = "/register")
    public String managerRegister(@RequestBody Manager manager) {
        managerService.addManager(manager);
            return "注册成功";
    }
    @RequestMapping(value = "/login")
    public String managerLogin(@RequestBody Manager manager){
        Integer count = managerService.selectManager(manager.getMusername(),manager.getMpassword());
        if (count == null){
            return JSON.toJSONString("登录失败,账号或密码错误");
        }else {
            return JSON.toJSONString("登录成功");
        }
    }

}
