package com.example.Bankingservices.Repository;

import com.example.Bankingservices.Model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Accountrepository extends JpaRepository<Accounts, Integer> {
}
