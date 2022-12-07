package com.example.demo.util;
import sun.misc.BASE64Decoder;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
            String filePath = "http://42.193.107.153:8080/file/"
//                    + fileLocation
                    + newfilename;
            //文件存储位置
//            String imgFilePath = "D:/images/" + System.currentTimeMillis() + UUID.randomUUID().toString().replace(".", "").substring(0, 6) + ".jpg";//新生成的图片
            String imgFilePath = "/home/picture/" +newfilename;
            File file = new File(imgFilePath);
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();

            }
            if(!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException ioException) {
                    System.out.println("1");
                    ioException.printStackTrace();
                }
            }
            //文件写入
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            System.out.println("");
            out.flush();
            out.close();
            return filePath;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}