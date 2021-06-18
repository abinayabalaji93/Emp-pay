package com.payroll.demo.repository;

import com.payroll.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepo extends CrudRepository<Admin,Integer> {
    public Admin findByEmailAndPassword(String email,String password);
}
