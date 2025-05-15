package com.taskmanager.repo;

import com.taskmanager.entity.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String>{

	public List<User> findByName(String name);

	public User findByUserNameAndPassword(String userName, String password);

}
