package com.qfedu.dao;

import java.util.List;
import java.util.Map;

import com.qfedu.pojo.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogDao {

	//添加博文
	@Insert("insert into t_blog(title,typeid,createtime,keyword,content,url,imgPaths) values(#{title},#{blogType.tid},#{createTime},#{keyword},#{content},#{url},#{imgPaths})")
	public void addBlog(Blog blog);


	//@Select("select * from t_blog")
	public List<Blog> findAll();

	//分页查询
	@Select("select * from t_blog")
	public List<Blog> findByPage(Map<String, Object> map);
	//总页数
	public long count();
	
	//根据id展示blog信息
	public Blog findBlogById(Integer id);

	//根据id删除blog
	public void deleteBlogById(Integer id);
	
	//更改博客内容
	public void updateBlog(Blog blog);
	
}
