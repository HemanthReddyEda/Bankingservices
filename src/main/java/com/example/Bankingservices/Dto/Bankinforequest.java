package com.example.Bankingservices.Dto;

import com.example.Bankingservices.Model.Bankmodel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Bankinforequest {
    public Bankmodel bankmodel;
}
