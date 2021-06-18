package com.payroll.service;

import com.payroll.PaySlip;
import com.payroll.demo.repository.PaySlipRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PaySlipServices {
    private final PaySlipRepository paySlipRepository;
    public PaySlipServices(PaySlipRepository paySlipRepository)
    {
        this.paySlipRepository=paySlipRepository;
    }
    public void savePayslip(PaySlip payslip)
    {
        paySlipRepository.save(payslip);
    }
    public PaySlip findByEmail(String email)
    {
        return paySlipRepository.findByEmail(email);
    }

}
