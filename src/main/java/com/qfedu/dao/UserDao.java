package com.qfedu.dao;



import java.util.List;
import java.util.Map;
import java.util.Set;




import com.qfedu.pojo.User;


public interface UserDao {

	public User findAllByName(String name);
	
	public Set<String> findRolesByUserName(String name);
	
	public Set<String> findPermissionsByUsername(String name);
	
	public void updateUser(User user);
	/*public User findUserByName(String name);*/
	
	//分页查询
	public List<User> findByPage(Map<String, Object> map);
	//总页数
	public long count();
	
	public void addUser(User user);
	
	public User findUserById(Integer id);
	
	//根据id删除blog
	public void deleteUserById(Integer id);
	
	
}
