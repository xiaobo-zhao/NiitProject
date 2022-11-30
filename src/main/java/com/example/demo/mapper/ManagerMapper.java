package com.example.demo.mapper;



import com.example.demo.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

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
}
