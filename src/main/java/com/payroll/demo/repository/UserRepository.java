package com.payroll.demo.repository;

import com.payroll.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
    public User findByUsernameAndPassword(String username,String password);
    public User findByUsername(String username);
    public User findByEmial(String email);
}
