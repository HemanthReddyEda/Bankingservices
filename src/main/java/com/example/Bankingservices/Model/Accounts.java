package com.example.Bankingservices.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
public class Accounts {
    @Id
    @GeneratedValue
    public int id;
    public int bankcode;
    public String accountnumber;
    public String accounttype;
    public double balance;
    public String accountholdername;
    public String accountholderaddress;
    public String accountholderemail;
    public String accountholderphonenumber;
    public String getaccountholderpassword;
}
