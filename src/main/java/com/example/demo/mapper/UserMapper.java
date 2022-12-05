package com.example.demo.mapper;

import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {

    /**
     * 查询所有信息
     */
    public List<User> selectUserList();

    @Select("select uusername from user_table")
    public List<String> selectAllName();
    /**
     * 根据用户名进行查询
     */
    public User getUserByName(String uusername);

    /**
     * 密码更新
     */
    public int updateUser(String uusername,String newpass);

    /**
     * 插入新用户
     */
    @Insert("INSERT INTO user_table(uname,uusername,upassword,uphone) VALUES(#{uname},#{uusername},#{upassword},#{uphone})")
    // keyProperty java对象的属性；keyColumn表示数据库的字段
    public int addUser(User user);
    /**
     * @description:查询用户的数量
     * @author: Insist On
     * @date: 2022/11/30 19:34
     **/
    public int selectUserNum();
}
