package com.example.Bankingservices.Dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Bankinforesponse {
    public String bankName;
    public String ifsccode;
    public String branch;
    public String accountholdername;
    public String accountholderaddress;
    public String accountholderemail;
    public String accountholderphonenumber;
}
