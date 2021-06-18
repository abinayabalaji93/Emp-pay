package com.payroll.service;

import com.payroll.Admin;
import com.payroll.demo.repository.AdminRepo;

public class AdminService {
    private final AdminRepo adminRepository;

    public AdminService(AdminRepo adminRepository) {
        this.adminRepository = adminRepository;
    }
    public Admin findByEmailAndPassword(String email, String password) {
        return adminRepository.findByEmailAndPassword(email, password);
    }
}


}


