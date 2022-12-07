package com.example.demo.util;
import sun.misc.BASE64Decoder;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.UUID;

public class Ba64Utils {
    //生成图片数据
    public static String GenerateImagebendi(String imgStr) {
        //判断是否为空
        if (imgStr == null)
            return null;
        //对数据进行截获
        String str1 = imgStr.substring(0, imgStr.indexOf(","));
        imgStr = imgStr.substring(str1.length()+1, imgStr.length());
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            byte[] b = decoder.decodeBuffer(imgStr);
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {//调整异常数据
                    b[i] += 256;
                }
            }
            //图片保存名称1
            String newfilename = System.currentTimeMillis() + UUID.randomUUID().toString().replace(".", "").substring(0, 6) + ".jpg";
//            String fileLocation = "/static/restaurantRes/";
            //文件访问位置
            String filePath = "/home/picture/"
//                    + fileLocation
                    + newfilename;
            //文件存储位置
            String imgFilePath = "/home/picture/" + System.currentTimeMillis() + UUID.randomUUID().toString().replace(".", "").substring(0, 6) + ".jpg";//新生成的图片
            //文件写入
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            return filePath;
        } catch (Exception e) {
            return null;
        }
    }
}