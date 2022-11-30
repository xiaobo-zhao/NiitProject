package com.example.demo.service;

import com.example.demo.mapper.ManagerMapper;
import com.example.demo.pojo.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @BelongsProject: renteasy
 * @BelongsPackage: com.example.renteasy.service
 * @Author: Insist On
 * @CreateTime: 2022-11-07  14:50
 */
@Service
public class ManagerService {
    @Autowired
    private ManagerMapper managerMapper;

    public void addManager(Manager manager){
         managerMapper.addManager(manager);
    }

    public Integer selectManager(String musername,String mpassword){
        return managerMapper.selectManager(musername, mpassword);
    }

}
