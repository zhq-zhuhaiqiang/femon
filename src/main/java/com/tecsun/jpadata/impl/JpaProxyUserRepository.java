package com.tecsun.jpadata.impl;

import com.tecsun.bo.UserBo;
import com.tecsun.jpadata.entity.UserJapEntity;
import com.tecsun.jpadata.jpaDao.UserRepository;
import com.tecsun.jpadata.repository.UserJpaRepository;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class JpaProxyUserRepository implements UserRepository {

	@Autowired
	private UserJpaRepository jpaRepository;
    @PersistenceContext
    private EntityManager entityManager;

	public UserBo save(UserBo newUser) {
		UserJapEntity newEntity = new UserJapEntity(newUser);
		UserJapEntity savedEntity = jpaRepository.save(newEntity);
		UserBo savedUser = savedEntity.toUser();
		return savedUser;
	}

	@Override
	public void saveList(List<UserBo> list) {

		list.stream().forEach(o->{
				UserJapEntity newEntity = new UserJapEntity(o);
		 jpaRepository.save(newEntity);
		});


	}

	public List<UserBo> all() {
		List<UserJapEntity> entities = jpaRepository.findAll();
		List<UserBo> users = new ArrayList<UserBo>(entities.size());
		for (UserJapEntity entity : entities) {
			UserBo user = entity.toUser();
			users.add(user);
		}
		return users;
	}

	@Override
	public List<UserBo> query(String name, String idNum) {
		UserJapEntity userJapEntity=new UserJapEntity(name,idNum);
        Example<UserJapEntity> example = Example.of(userJapEntity);
//		ExampleMatcher exampleMatcher = ExampleMatcher.matching();
//		if(StringUtils.isNotEmpty(name)){
//			exampleMatcher = exampleMatcher.withMatcher("name",
//					matcher -> matcher.exact().caseSensitive());
//		}
//		if(StringUtils.isNotEmpty(idNum)){
//			exampleMatcher = exampleMatcher.withMatcher("idNum",
//					matcher -> matcher.exact().caseSensitive());
//		}
//		Example<UserJapEntity> example = Example.of(userJapEntity, exampleMatcher);
        String queryStr="select t from UserJapEntity t where 1=1";
        if(StringUtils.isNotEmpty(name)){
            queryStr+=" and name = :name";
		}
		if(StringUtils.isNotEmpty(idNum)){
            queryStr+=" and idNum like :idNum";
		}
//		if(StringUtils.isEmpty(name)&&StringUtils.isEmpty(idNum)){
//		    return null;
//        }
        Query query = entityManager.createQuery(queryStr);
        if(StringUtils.isNotEmpty(name)){
            query.setParameter("name", name);
        }
        if(StringUtils.isNotEmpty(idNum)){
            query.setParameter("idNum", "%"+idNum+"%");
        }
        List<UserJapEntity> entities = query.getResultList();
		List<UserBo> users = new ArrayList<UserBo>(entities.size());
		for (UserJapEntity entity : entities) {
			UserBo user = entity.toUser();
			users.add(user);
		}
		return users;
	}


}
