package com.chinmaybiswaltech.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chinmaybiswaltech.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findUserByName(String name);

}
