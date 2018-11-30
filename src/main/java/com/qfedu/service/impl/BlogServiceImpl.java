package com.qfedu.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.qfedu.dao.BlogDao;
import com.qfedu.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class BlogServiceImpl {

	@Autowired(required = false)
	private BlogDao blogDao;
	
	
	//添加博文
	public void addBlogService(Blog blog) {
		
		if (blog == null || blog.equals("")) {
			throw new RuntimeException("发表博文出现异常");
		}
		
		try {
			Date data = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = format.format(data);
			
			blog.setCreateTime(time);
			blog.setStatus("审核中");
			
			blogDao.addBlog(blog);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("发表博文失败");
		}
		
		
	}
	
	//分页显示博客管理员版
	public Map<String, Object> pageFind(int page, int pageSize) {
		
		//总行数
		int count = 0;
		try {
			count = (int) blogDao.count();
			System.out.println("总页数：" +  count);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			throw new RuntimeException("查找总博文数失败");
		}
		
		
		Map<String, Object> limit = new HashMap<>();
		limit.put("index", page);
		limit.put("pageSize", pageSize);
		System.out.println("================");
		System.out.println("page" + page);
		System.out.println("pageSize" + pageSize);
		System.out.println("================");
		List<Blog> list = null;
		
		try {
			list = blogDao.findByPage(limit);			
			System.out.println("分页返回的数据数" + list.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			throw new RuntimeException("分页失败");
		}
		
		Map<String, Object> map = new HashMap<>();
		map.put("total", count);
		map.put("rows", list);
		
		return map;
	}
	
	//分页显示博客游客版
		public Map<String, Object> pageFind2(int page, int pageSize) {
			
			//总行数
			int count = 0;
			try {
				count = (int) blogDao.count();
				System.out.println("总页数：" +  count);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				throw new RuntimeException("查找总博文数失败");
			}
			
			
			Map<String, Object> limit = new HashMap<>();
			limit.put("index", page);
			limit.put("pageSize", pageSize);
			System.out.println("================");
			System.out.println("page" + page);
			System.out.println("pageSize" + pageSize);
			System.out.println("================");
			List<Blog> list = null;
			List<Blog> list2 = new ArrayList<Blog>();
			try {
				list = blogDao.findByPage(limit);
				
				for (Blog blog : list) {
					if (blog.getStatus().equals("审核通过")) {
						list2.add(blog);
					}
				}
				
				
				System.out.println("分页返回的数据数" + list2.size());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				throw new RuntimeException("分页失败");
			}
			
			Map<String, Object> map = new HashMap<>();
			map.put("total",list2.size());
			map.put("rows", list2);
			
			return map;
		}
	
	
	
	//根据Id展示Blog信息
	public Blog findBlogByIdService(Integer id) {
		
		Blog blog = null;
		try {
			blog = blogDao.findBlogById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("展示失败");
		}
		
		
		return blog;
	}
	
	//根据id删除Blog
	public void deleteBlogByIdService(Integer id) {
		
		try {
			blogDao.deleteBlogById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("删除失败");
		}
		
	}
	
	//更新博客
	public void updateBlogService(Blog blog) {
		
		if (blog == null || blog.equals("")) {
			throw new RuntimeException("博文不能为空");
		}
		
		try {
			Date data = new Date();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = format.format(data);
			

			blogDao.updateBlog(blog);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("更改失败");
		}
		
	}
	
	//批准博文
	public void checkBlogService(Integer bid) {
		if (bid == null || bid.equals("")) {
			throw new RuntimeException("此博文不存在");
		}
		
		Blog blog = null;
		try {
			blog = blogDao.findBlogById(bid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("此博文不存在");
		}
		
		if (blog == null) {
			throw new RuntimeException("此博文不存在");
		} else {
			if (blog.getStatus().equals("审核中")) {
				blog.setStatus("审核通过");
			} else {
				blog.setStatus("审核中");
			}
			
			try {
				blogDao.updateBlog(blog);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException("审批失败");
			}
			
		}
		
	}
	
	
	
}
