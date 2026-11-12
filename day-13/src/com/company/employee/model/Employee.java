package com.company.employee.model;
import java.util.*;
import java.math.*;

public class Employee
{
private String id;
private String name;
private String gender;
private Date dateOfBirth;
private boolean isIndian;

private double salary;
private String aadharCardNumber;
private String panCardNumber;
public Employee()
{
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}


public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}


public String getGender() {
    return gender;
}

public void setGender(String gender) {
    this.gender = gender;
}


public Date getDateOfBirth() {
    return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
}


public boolean getIsIndian() {
    return isIndian;
}

public void setIsIndian(boolean isIndian) {
    this.isIndian = isIndian;
}


public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}


public String getAadharCardNumber() {
    return aadharCardNumber;
}

public void setAadharCardNumber(String aadharCardNumber) {
    this.aadharCardNumber = aadharCardNumber;
}


public String getPanCardNumber() {
    return panCardNumber;
}

public void setPanCardNumber(String panCardNumber) {
    this.panCardNumber = panCardNumber;
}}