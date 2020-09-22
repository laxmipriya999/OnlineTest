package com.capgemini.Test.Dao;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Test.entity.Test;

@Repository
public interface DaoClass extends JpaRepository<Test,BigInteger>{
	
}
