package com.example.demo.util;
import sun.misc.BASE64Decoder;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.UUID;

public class Ba64Utils {
    public static String GenerateImagebendi(String imgStr) {
        if (imgStr == null)
            return null;
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

            String newfilename = System.currentTimeMillis() + UUID.randomUUID().toString().replace(".", "").substring(0, 6) + ".jpg";
//            String fileLocation = "/static/restaurantRes/";
            String filePath = "http://127.0.0.1:5000/commodity/file/"
//                    + fileLocation
                    + newfilename;
            String imgFilePath = "D:\\final_project\\vue3_test\\static\\img\\" + System.currentTimeMillis() + UUID.randomUUID().toString().replace(".", "").substring(0, 6) + ".jpg";//新生成的图片
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