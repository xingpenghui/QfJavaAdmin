package com.qfedu.web;

import com.qfedu.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class BlogController {

    //表示注入的时候，该bean可以不存在，idea里加，否则编译报错
    @Autowired(required = false)
    private BlogService blogService;
}
