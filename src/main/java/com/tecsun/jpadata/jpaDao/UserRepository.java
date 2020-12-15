package com.tecsun.jpadata.jpaDao;

import com.tecsun.entity.User;

import java.util.List;

public interface UserRepository {

	public User save(User user);
	public void saveList(List<User> list);

	public List<User> all();
	public List<User> query(String name,String idNum);
}
