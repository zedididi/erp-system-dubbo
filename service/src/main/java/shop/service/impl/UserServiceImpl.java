package shop.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import shop.bean.User;
import shop.dao.UserDao;
import shop.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

	@Override
	public int touser(User user) {
		// TODO Auto-generated method stub
		return userDao.touser(user);
	}

	@Override
	public List findall(User user ) {
		// TODO Auto-generated method stub
		return userDao.findall(user);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return userDao.delete(id);
	}

	@Override
	public User findid(int id) {
		// TODO Auto-generated method stub
		return userDao.findid(id);
	}

	@Override
	public int userup(User user) {
		// TODO Auto-generated method stub
		return userDao.userup(user);
	}

	
	
}
