package com.example.demo.controller;


import com.example.demo.pojo.Goods;
import com.example.demo.result.Result;
import com.example.demo.service.GoodsService;
import com.example.demo.util.Ba64Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @CrossOrigin
    @PostMapping("/commodity")
    public Result sendAdmin(@RequestBody Goods goods){
        goods.setImage(Ba64Utils.GenerateImagebendi(goods.getImage()));
        goods.setIsrelease("审核通过");
        goodsService.insert(goods);
        return Result.success();
    }
    @CrossOrigin
    @RequestMapping("/commodity/all")
    public Result showGoods(){
        String resoureceUrl="http://127.0.0.1:5000/commodity/file/";
        List<Goods> goodsList=goodsService.display();
        return Result.success(goodsList);
    }

    @CrossOrigin
    @RequestMapping("/wantlist")
    public Result showWant(){
        List<Goods> entities=goodsService.display();
        return Result.success(entities);
    }
}
