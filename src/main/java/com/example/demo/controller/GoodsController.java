package com.example.demo.controller;


import com.example.demo.pojo.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @BelongsProject: renteasy
 * @BelongsPackage: com.example.renteasy.controller
 * @Author: Insist On
 * @CreateTime: 2022-11-23  15:56
 */
@RestController
@CrossOrigin
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/display")
    public List<Goods> displayAll() {
        return goodsService.display();
    }
    @RequestMapping("/passGoods")
    public void passGoods(@RequestBody Goods goods){
        goodsService.passGoods(goods.getEid());
    }
    @RequestMapping("/unpassGoods")
    public void unpassGoods(@RequestBody Goods goods){
        goodsService.unpassGoods(goods.getEid());
    }
}
