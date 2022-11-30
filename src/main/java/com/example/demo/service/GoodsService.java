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
    public List<Goods> display(){
        return goodsMapper.selectAll();
    }
    public void passGoods(String eid){
        goodsMapper.passGoods(eid);
    }
    public void unpassGoods(String eid){
        goodsMapper.unpassGoods(eid);
    }
}
