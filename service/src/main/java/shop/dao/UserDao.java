package shop.dao;


import shop.bean.User;

import java.util.List;


public interface UserDao {
	User login(User user);
	int touser(User user);
	List findall(User user);
	int delete(int id);
	
	User findid(int id);
	int  userup(User user);
}
