package com.qfedu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "Filter",value = "/*")
public class CrossFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletResponse res = (HttpServletResponse) resp;
        // 设置允许跨域访问的域，*表示支持所有的来源
        res.setHeader("Access-Control-Allow-Origin", "*");
//		res.setHeader("Access-Control-Allow-Credentials", "true");
//		res.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:8020");
        // 设置允许跨域访问的方法
        res.setHeader("Access-Control-Allow-Methods",
                "POST, GET, OPTIONS, DELETE");
        res.setHeader("Access-Control-Max-Age", "3600");
        res.setHeader("Access-Control-Allow-Headers", "x-requested-with,token");
        // pass the request along the filter chain
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
