package com.org.yogi.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "employee")
public class Employee implements Serializable {
    private String empId;
    private String empName;
    private String empAddress;
    private String empSal;
}
