package com.qianfeng.utils;

import com.qfedu.common.CfgInfo;
import com.qfedu.pojo.Blog;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class GenHtmlUtils {

    public static boolean genHtml(String sourceFtl, String desHtml, Object info, FreeMarkerConfigurer freeMarkerConfigurer)throws Exception {
       try {
           // 1、从spring容器中获得FreeMarkerConfigurer对象。
           // 2、从FreeMarkerConfigurer对象中获得Configuration对象。
           Configuration configuration = freeMarkerConfigurer.getConfiguration();
           // 3、使用Configuration对象获得Template对象。
           Template template = configuration.getTemplate(sourceFtl);
           // 4、创建数据集
           Map dataModel = new HashMap<>();
           dataModel.put("info", info);
           dataModel.put("hostInfo", CfgInfo.getHost());
           // 5、创建输出文件的Writer对象。
           Writer out = new FileWriter(new File(desHtml));
           // 6、调用模板对象的process方法，生成文件。
           template.process(dataModel, out);
           // 7、关闭流。
           out.close();

           return true;
       }catch (Exception e){
           return false;
       }
    }
}
