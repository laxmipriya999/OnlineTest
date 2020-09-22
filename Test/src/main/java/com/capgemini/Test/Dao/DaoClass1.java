package com.capgemini.Test.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Test.entity.User;

@Repository
public interface DaoClass1 extends JpaRepository<User,String>{
	

}
