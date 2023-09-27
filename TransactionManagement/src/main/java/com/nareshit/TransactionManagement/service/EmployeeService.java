package com.nareshit.TransactionManagement.service;

import com.nareshit.TransactionManagement.dao.EmployeeDao;
import com.nareshit.TransactionManagement.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public Employee saveEmployee(Employee employee){
        return employeeDao.save(employee);
    }
}
