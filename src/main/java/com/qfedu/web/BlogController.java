package com.qfedu.web;

import com.qfedu.pojo.Blog;
import com.qfedu.service.BlogService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class BlogController {

    //表示注入的时候，该bean可以不存在，idea里加，否则编译报错
    @Autowired(required = false)
    private BlogService blogService;

    @RequestMapping(value="/blog", method= RequestMethod.POST)
    @ResponseBody
    public JsonBean addBlogController(Blog blog) {

        JsonBean bean = new JsonBean();
        try {
            blogService.addBlogService(blog);
            bean.setCode(1);
        }catch (Exception e){
            bean.setCode(0);
            bean.setMsg(e.getMessage());
        }
        return bean;
    }
}
