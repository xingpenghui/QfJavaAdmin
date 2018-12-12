package com.qfedu.common;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CfgInfo {
    private static Properties pro = null;
    static{
        pro = new Properties();
        InputStream stream = CfgInfo.class.getResourceAsStream("/ueditorcfg.properties");
        try {
            pro.load(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getRootInfo(){
        if(pro != null){
            return pro.getProperty("rootPath");
        }else{
            return "";//默认路径
        }
    }

    public static String getHost(){
        if(pro != null){
            return pro.getProperty("host");
        }else{
            return "";//默认路径
        }
    }

}
