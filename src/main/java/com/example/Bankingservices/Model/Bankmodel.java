package com.example.Bankingservices.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "bank")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bankmodel {
    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String ifsc;
    public String branch;
    public String address;
    public int bankcode;
    public String email;
    public String bankname;
    public String phone;
    public String website;

    @OneToMany(targetEntity = Accounts.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_id", referencedColumnName = "bankcode")
    public List<Accounts> accounts;

}
