package com.example.demo.mapper;


import com.example.demo.pojo.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsMapper {
    //    查询所有货物
    public List<Goods> selectAll();

    //    审核货物通过
    public void passGoods(@Param("eid") int eid);

    //    审核货物不通过
    public void unpassGoods(@Param("eid") int eid);

    /**
     * 插入新商品
     */
    @Insert("INSERT INTO entity(userId,ename,ephone,price,image,type,description,isrelease,seller) VALUES(#{userId},#{ename},#{ephone},#{price},#{image},#{type},#{description},#{isrelease},#{seller})")
    // keyProperty java对象的属性；keyColumn表示数据库的字段
    public int addGoods(Goods goods);
    /**
     * @description:查询货物的数量
     * @author: Insist On
     * @date: 2022/11/30 19:28
     **/
    public int selectGoodNum();
}
