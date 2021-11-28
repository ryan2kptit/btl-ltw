package com.example.btlltw.service.impl;

import com.example.btlltw.entity.Salary;
import com.example.btlltw.repository.SalaryRepository;
import com.example.btlltw.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Autowired
    private SalaryRepository salaryRepository;

    public Salary getSalaryById(int id) {
        return salaryRepository.getById(id);
    }
}
