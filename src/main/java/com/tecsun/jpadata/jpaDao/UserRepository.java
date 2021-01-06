package com.tecsun.jpadata.jpaDao;

import com.tecsun.bo.UserBo;

import java.util.List;

public interface UserRepository {

	public UserBo save(UserBo user);
	public void saveList(List<UserBo> list);

	public List<UserBo> all();
	public List<UserBo> query(String name, String idNum);
}
