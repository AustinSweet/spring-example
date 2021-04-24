package com.austinsweet.springexample.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.austinsweet.springexample.models.core.UserData;

public interface UserDataRepository extends JpaRepository<UserData, Long>{
	List<UserData> findById(long id);
}
