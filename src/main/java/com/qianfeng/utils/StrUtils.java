package com.qianfeng.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class StrUtils {
    /**
     * 字符串列表转为指定分隔符分割的字符串
     * @param list
     * @param separator
     * @return
     */
    public static String listToString(List list, char separator){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)).append(separator);
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }

    /**
     * 根据当前时间和随机数生成html文件的名字
     * @return
     */
    public static String htmlName(){
        Date date = new Date();
        Random random = new Random();
        int i = random.nextInt(10000);
        // 时间戳和一个5位的数字组成，不够补0
        String fileName = String.valueOf(date.getTime()) + String.format("%05d", i) + ".html";
        return fileName;
    }

    /**
     * 生成日期的路径字符串
     * @return
     */
    public static String datePath(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dateStr = sdf.format(new Date());
        return dateStr;
    }

}
