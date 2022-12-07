package com.example.demo.service;


import com.example.demo.mapper.GoodsMapper;
import com.example.demo.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: renteasy
 * @BelongsPackage: com.example.renteasy.service
 * @Author: Insist On
 * @CreateTime: 2022-11-23  15:55
 */
@Service
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    //查询所有商品信息
    public List<Goods> display(){
        return goodsMapper.selectAll();
    }
    //商品通过
    public void passGoods(int eid){
        goodsMapper.passGoods(eid);
    }
    //商品不通过
    public void unpassGoods(int eid){
        goodsMapper.unpassGoods(eid);
    }
    //插入新的商品
    public int insert(Goods goods){
        return goodsMapper.addGoods(goods);
    }
    //根据id删除商品
    public int delete(int eid) {return goodsMapper.deleteGoods(eid);}
    //获得商品数量
    public int getGoodNum(){
        return goodsMapper.selectGoodNum();
    }
}
