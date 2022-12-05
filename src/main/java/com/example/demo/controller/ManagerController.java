package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.Manager;
import com.example.demo.service.GoodsService;
import com.example.demo.service.ManagerService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register")
    public String managerRegister(@RequestBody Manager manager) {
        managerService.addManager(manager);
        return "注册成功";
    }

    @RequestMapping(value = "/login")
    public String managerLogin(@RequestBody Manager manager) {
        Integer count = managerService.selectManager(manager.getMusername(), manager.getMpassword());
        if (count == null) {
            return JSON.toJSONString("登录失败,账号或密码错误");
        } else {
            return JSON.toJSONString("登录成功");
        }
    }

    @RequestMapping(value = "/num")
    public List getNumInformation() {
        int goods = goodsService.getGoodNum();
        int user = userService.getUserNum();
        int manager = managerService.getManagerNum();
        List list = new ArrayList();
        list.add(goods);
        list.add(user);
        list.add(manager);
        return list;
    }

    @RequestMapping(value = "/allInformation")
    public List<Manager> getAllManagerInf() {
        return managerService.getAllManager();
    }

    /**
     * @description:根据ID查询管理员的信息
     * @author: Insist On
     * @date: 2022/12/3 22:56
     **/
    @RequestMapping(value = "/idInformation")
    public List<Manager> getManagerById(@RequestBody Manager manager) {
        System.out.println(manager.getMid());
        return managerService.getIdByManager(manager.getMid());
    }

    /**
     * @description:根据管理员编号删除管理员信息
     * @author: Insist On
     * @date: 2022/12/4 11:25
     **/
    @RequestMapping(value = "/deleteManager")
    public void deleteManager(@RequestBody Manager manager) {
        managerService.deleteManager(manager.getMid());
    }

    /**
     * @description:修改管理员信息
     * @author: Insist On
     * @date: 2022/12/4 17:08
     **/
    @RequestMapping(value = "/updateManagerInf")
    public String updateManager(@RequestBody Manager manager) {
        if (manager.getMid().equals("") && manager.getMusername().equals("") && manager.getMpassword().equals("") && manager.getMemail().equals("")) {
            return "修改失败";
        } else {
            managerService.updateManagerInf(manager);
            return "修改成功";
        }
    }

}
