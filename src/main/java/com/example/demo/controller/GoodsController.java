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
    //展示所有商品
    @RequestMapping("/display")
    public List<Goods> displayAll() {
        return goodsService.display();
    }
    //通过审核商品
    @RequestMapping("/passGoods")
    public void passGoods(@RequestBody Goods goods){
        goodsService.passGoods(goods.getEid());
    }
    //未通过审核商品
    @RequestMapping("/unpassGoods")
    public void unpassGoods(@RequestBody Goods goods){
        goodsService.unpassGoods(goods.getEid());
    }
    //添加商品
    @CrossOrigin
    @PostMapping("/commodity")
    public Result sendAdmin(@RequestBody Goods goods){
        goods.setImage(Ba64Utils.GenerateImagebendi(goods.getImage()));
        goods.setIsrelease("审核通过");
        goodsService.insert(goods);
        return Result.success();
    }
    //展示所有商品
    @CrossOrigin
    @RequestMapping("/commodity/all")
    public Result showGoods(){
//      String resoureceUrl="http://127.0.0.1:8080/commodity/file/";
        List<Goods> goodsList=goodsService.display();
        return Result.success(goodsList);
    }

    //删除商品
    @CrossOrigin
    @PostMapping("/commodity/delete")
    public Result deletePublish(@RequestBody Goods goods) {
        int deleteresult = goodsService.delete(goods.getEid());
        if (deleteresult > 0) {
            return Result.success();
        } else {
            return Result.error("删除失败");
        }
    }


}
