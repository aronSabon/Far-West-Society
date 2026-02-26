package com.nubi.fws.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nubi.fws.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
User findByUsername(String username);
}
