package com.qfedu.web;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.pojo.Blog;
import com.qfedu.pojo.BlogType;
import com.qfedu.service.BlogService;
import com.qfedu.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BlogController {

    //表示注入的时候，该bean可以不存在，idea里加，否则编译报错
    @Autowired(required = false)
    private BlogService blogService;

    @RequestMapping(value="/blog", method= RequestMethod.POST)
    @ResponseBody
    public JsonBean addBlogController(Blog blog, BlogType type) {

        JsonBean bean = new JsonBean();
        try {
            blog.setBlogType(type);
            blogService.addBlogService(blog);
            bean.setCode(1);
        }catch (Exception e){
            bean.setCode(0);
            bean.setMsg(e.getMessage());
        }
        return bean;
    }

    @RequestMapping(value="/blog", method= RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> list(Integer offset, Integer limit) {

//        PageHelper.startPage(page, limit);//页码
        Page<Object> page = PageHelper.offsetPage(offset, limit);// 开始索引
        List<Blog> list = blogService.findAllBlog();

        Map<String, Object> map = new HashMap<>();
        map.put("total", page.getTotal());
        map.put("rows", list);

        return map;
    }
}
