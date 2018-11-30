package com.qfedu.service;

import com.qfedu.pojo.Blog;

import java.text.SimpleDateFormat;
import java.util.*;

public interface BlogService {

    //添加博文
    public void addBlogService(Blog blog);

    //分页显示博客管理员版
    public Map<String, Object> pageFind(int page, int pageSize);

    //分页显示博客游客版
    public Map<String, Object> pageFind2(int page, int pageSize);

    //根据Id展示Blog信息
    public Blog findBlogByIdService(Integer id);
    //根据id删除Blog
    public void deleteBlogByIdService(Integer id);

    //更新博客
    public void updateBlogService(Blog blog);

    //批准博文
    public void checkBlogService(Integer bid);
}
