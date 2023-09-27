package com.nareshit.TransactionManagement.service;

import com.nareshit.TransactionManagement.dao.InsuranceDao;
import com.nareshit.TransactionManagement.model.Insurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceService {
    @Autowired
    private InsuranceDao insuranceDao;

    public Insurance registerInsurance(Insurance insurance){
        return insuranceDao.save(insurance);
    }

}
