package com.tecsun.jpadata.repository;

import com.tecsun.jpadata.entity.UserJapEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserJapEntity, Long> {

}
