package com.javatechie.springbootmultipledb.model.user.repository;

import com.javatechie.springbootmultipledb.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
