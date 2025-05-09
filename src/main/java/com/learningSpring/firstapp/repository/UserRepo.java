package com.learningSpring.firstapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learningSpring.firstapp.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,String> {

}
