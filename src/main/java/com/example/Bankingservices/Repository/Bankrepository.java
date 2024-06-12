package com.example.Bankingservices.Repository;

import com.example.Bankingservices.Model.Bankmodel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Bankrepository extends JpaRepository<Bankmodel, Integer> {

}
