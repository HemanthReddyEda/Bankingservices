package com.example.Bankingservices.Controller;

import com.example.Bankingservices.Dto.Bankinforequest;
import com.example.Bankingservices.Model.Bankmodel;
import com.example.Bankingservices.Repository.Accountrepository;
import com.example.Bankingservices.Repository.Bankrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sbi")
public class Bankcontroller {
    @Autowired
    public Bankrepository bankrepo;
    @Autowired
    public Accountrepository accountrepo;
    @PostMapping
    public Bankmodel addaccounts(@RequestBody Bankinforequest bank){
        return bankrepo.save(bank.getBankmodel());
    }
}
