package com.example.demo.mapper;

import com.example.demo.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:管理员接口设计
 * @author: Insist On
 * @date: 2022/11/7 14:24
 **/
@Mapper
@Repository
public interface ManagerMapper {
    //    增加管理员信息
    public void addManager(Manager manager);

    //   登录信息查询
    public Integer selectManager(@Param(value = "musername") String musername, @Param(value = "mpassword") String mpassword);

    //查询管理员的数量
    public int selectManagerNum();

    //查询所有管理员信息
    public List<Manager> selectManagerInf();

    //根据管理员编号查询管理员信息
    public List<Manager> selectManagerById(@Param(value = "mid") String mid);

//    根据管理员编号删除管理员信息
    public void deleteManagerInf(@Param(value = "mid")String mid);
//    修改管理员的信息
    public void updateManagerInf(Manager manager);
}
