package com.nareshit.TransactionManagement.service;

import com.nareshit.TransactionManagement.model.Employee;
import com.nareshit.TransactionManagement.model.Insurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.RuntimeErrorException;

@Service
public class OrganizationService {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private InsuranceService insuranceService;

    public void onboardEmployee(Employee employee, Insurance insurance) {
        employeeService.saveEmployee(employee);
//        insuranceService.registerInsurance(insurance);
        if(insurance.getHealthInsuranceSchemeName().length()<=4){
            throw new RuntimeErrorException(null,"Error in insurance");
        } else {
            insurance.setEmpId(employee.getEmpId());
            insuranceService.registerInsurance(insurance);
        }
    }


}
