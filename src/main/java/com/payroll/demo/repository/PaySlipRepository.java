package com.payroll.demo.repository;

import com.payroll.PaySlip;
import org.springframework.data.repository.CrudRepository;

public interface PaySlipRepository extends CrudRepository<PaySlip,Integer> {
    public PaySlip findByEmail(String email);
}
