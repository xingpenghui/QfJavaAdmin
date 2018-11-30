package com.qfedu.dao;

import java.util.List;
import java.util.Map;


import com.qfedu.pojo.Comment;

public interface CommentDao {

	public void addComment(Comment comment);
	
	public List<Map<String, Object>> showComment(Integer bid);
	
	
	//分页查询
	public List<Map<String, Object>> findByPage(Map<String, Object> map);
	//总页数
	public long count();
	
	//删除评论
	public void deleteComment(Integer cid);
		
		
	
}
