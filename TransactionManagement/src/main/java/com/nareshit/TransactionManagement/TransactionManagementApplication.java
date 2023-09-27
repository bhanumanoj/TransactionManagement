package com.nareshit.TransactionManagement;

import com.nareshit.TransactionManagement.model.Employee;
import com.nareshit.TransactionManagement.model.Insurance;
import com.nareshit.TransactionManagement.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionManagementApplication implements CommandLineRunner {
    @Autowired
    private OrganizationService organizationService;

	public static void main(String[] args) {

        SpringApplication.run(TransactionManagementApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Employee employee=new Employee();
        employee.setEmpName("bhanu");

        Insurance insurance=new Insurance();
        insurance.setHealthInsuranceSchemeName("correct");
        insurance.setCoverageAmount(1000000);

        organizationService.onboardEmployee(employee,insurance);
    }
}
