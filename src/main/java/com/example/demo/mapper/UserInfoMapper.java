package com.example.demo.mapper;

import com.example.demo.pojo.User;
import com.example.demo.pojo.UserInfo;
import lombok.Data;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserInfoMapper {
    /**
     * 查询所有信息
     */
    @Select("select * from user_information;")
    public List<UserInfo> selectUserInfoList();
    /**
     * 根据uid查询信息
     */
    @Select("select * from user_information where uid= #{uid}")
    public UserInfo selectOne(Integer uid);
    /**
     * 更新相关用户信息1
     */
    @Update("update user_information set udescribe=#{udescribe},uidentify=#{uidentify},usex=#{usex},utype=#{utype},uschool=#{uschool} where uid = #{uid}")
    public int updateUserInfO(UserInfo userInfo);
    /**
     * 添加用户信息
     */
    @Insert("insert into user_information values('','','','','',#{uid})")
    public int insertUserInfo(int uid);

}
