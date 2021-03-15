package com.jayaveer.ems.repository;

import com.jayaveer.ems.model.BaseUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<BaseUser,Long> {

}
