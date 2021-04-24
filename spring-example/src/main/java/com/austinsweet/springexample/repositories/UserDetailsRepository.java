package com.austinsweet.springexample.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.austinsweet.springexample.models.core.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long>{
	List<UserDetails> findById(long id);
}
