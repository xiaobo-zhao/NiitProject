package com.example.demo.service;

import com.example.demo.mapper.ManagerMapper;
import com.example.demo.pojo.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public int getManagerNum(){
        return managerMapper.selectManagerNum();
    }
    /**
     * @description:查询所有的管理员信息
     * @author: Insist On
     * @date: 2022/12/3 22:20
     **/
    public List<Manager> getAllManager(){
        return managerMapper.selectManagerInf();
    }

    /**
     * @description:根据管理员编号查询管理员信息
     * @author: Insist On
     * @date: 2022/12/3 22:43
     **/
    public List<Manager> getIdByManager(String mid){
        return managerMapper.selectManagerById(mid);
    }

    /**
     * @description:根据管理员编号删除管理员信息
     * @author: Insist On
     * @date: 2022/12/4 11:24
     **/
    public void deleteManager(String mid){
        managerMapper.deleteManagerInf(mid);
    }
    /**
     * @description:修改管理员信息
     * @author: Insist On
     * @date: 2022/12/4 17:07
     **/
    public void updateManagerInf(Manager manager){
         managerMapper.updateManagerInf(manager);
    }
}
