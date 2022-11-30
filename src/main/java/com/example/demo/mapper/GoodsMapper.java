package com.example.demo.mapper;


import com.example.demo.pojo.Goods;
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
    public void passGoods(@Param("eid") String eid);

    //    审核货物不通过
    public void unpassGoods(@Param("eid") String eid);

}
