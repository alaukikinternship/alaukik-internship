package com.company.employee.service;
import com.company.employee.model.*;
import com.company.employee.util.*;
import java.util.*;
public class EmployeeManagementSystem
{
private List<Employee>employeeList;
private Map<String,Employee>employeeIdWiseEmployeesMap;
private Map<String,Employee>aadharCardNumberWiseEmployeesMap;
private Map<String,Employee>panCardNumberWiseEmployeesMap;
public EmployeeManagementSystem()
{
employeeList=new ArrayList<>();

employeeIdWiseEmployeesMap=new HashMap<>();

aadharCardNumberWiseEmployeesMap=new HashMap<>();
panCardNumberWiseEmployeesMap=new HashMap<>();
}
public void addEmployee(Employee employee)throws EmployeeException
{
String id=employee.getId();




    String name = employee.getName();
    String gender = employee.getGender();
    Date dateOfBirth = employee.getDateOfBirth();
    boolean isIndian = employee.getIsIndian();
    double salary = employee.getSalary();
    String aadharCardNumber = employee.getAadharCardNumber();
    String panCardNumber = employee.getPanCardNumber();
if(id==null)
{
throw new EmployeeException("Invalid EmployeeId");
}
id=id.trim();
if(id.length()==0)
{
throw new EmployeeException("Invalid EmployeeId");
}

if (name == null) {
    throw new EmployeeException("Invalid Employee Name");
}
name = name.trim();

if (name.length() == 0) {
    throw new EmployeeException("Invalid Employee Name");
}

if (gender == null) {
    throw new EmployeeException("Invalid Gender");
}
gender = gender.trim();

if (gender.length() == 0) {
    throw new EmployeeException("Invalid Gender");
}

if (!gender.equalsIgnoreCase("Male") &&
    !gender.equalsIgnoreCase("Female") &&
    !gender.equalsIgnoreCase("Other")) {
    throw new EmployeeException("Invalid Gender");
}
if (dateOfBirth == null) {
    throw new EmployeeException("Invalid Date Of Birth");
}
if (isIndian != true && isIndian != false) {
    throw new EmployeeException("Invalid Indian Status");
}
if (salary <= 0) {
    throw new EmployeeException("Invalid Salary");
}
if (aadharCardNumber == null) {
    throw new EmployeeException("Invalid Aadhar Number");
}
aadharCardNumber = aadharCardNumber.trim();
if(aadharCardNumber.length()==0)
{
throw new EmployeeException("Invalid AadharCardNumber");
}




    Employee emp = new Employee();


    emp.setId(id);
    emp.setName(name);
    emp.setGender(gender);
    emp.setDateOfBirth(dateOfBirth);
    emp.setIsIndian(isIndian);
    emp.setSalary(salary);
    emp.setAadharCardNumber(aadharCardNumber);
    emp.setPanCardNumber(panCardNumber);





if(employeeIdWiseEmployeesMap.containsKey(id))
{
throw new EmployeeException("EmployeeId: "+id+" Exists");
}

if(aadharCardNumberWiseEmployeesMap.containsKey(aadharCardNumber))
{
throw new EmployeeException("AadharCardNumber: "+aadharCardNumber+" Exists");
}
if(panCardNumberWiseEmployeesMap.containsKey(panCardNumber))
{
throw new EmployeeException("PAN Card Number: "+panCardNumber+" Exists");
}

employeeList.add(emp);
employeeIdWiseEmployeesMap.put(id,emp);
aadharCardNumberWiseEmployeesMap.put(aadharCardNumber,emp);
panCardNumberWiseEmployeesMap.put(panCardNumber,emp);



}
public void updateEmployee(Employee employee)throws EmployeeException
{

    String id = employee.getId();

    String name = employee.getName();
    String gender = employee.getGender();
    Date dateOfBirth = employee.getDateOfBirth();
    boolean isIndian = employee.getIsIndian();
    double salary = employee.getSalary();
    String aadharCardNumber = employee.getAadharCardNumber();
    String panCardNumber = employee.getPanCardNumber();

    if (id == null) {
        throw new EmployeeException("Invalid EmployeeId");
    }

    id = id.trim();

    if (id.length() == 0) {
        throw new EmployeeException("Invalid EmployeeId");
    }

    if (!employeeIdWiseEmployeesMap.containsKey(id)) {
        throw new EmployeeException("EmployeeId: " + id + " Not Found");
    }

    if (name == null) {
        throw new EmployeeException("Invalid Employee Name");
    }

    name = name.trim();

    if (name.length() == 0) {
        throw new EmployeeException("Invalid Employee Name");
    }

    if (gender == null) {
        throw new EmployeeException("Invalid Gender");
    }

    gender = gender.trim();

    if (gender.length() == 0) {
        throw new EmployeeException("Invalid Gender");
    }

    if (!gender.equalsIgnoreCase("Male") &&
        !gender.equalsIgnoreCase("Female") &&
        !gender.equalsIgnoreCase("Other")) {

        throw new EmployeeException("Invalid Gender");
    }

    if (dateOfBirth == null) {
        throw new EmployeeException("Invalid Date Of Birth");
    }

    if (salary <= 0) {
        throw new EmployeeException("Invalid Salary");
    }

    if (aadharCardNumber == null) {
        throw new EmployeeException("Invalid Aadhar Number");
    }

    aadharCardNumber = aadharCardNumber.trim();
if(aadharCardNumber.length()==0)throw new EmployeeException("Invalid AadharCardNumber");

    

    
    if (panCardNumber == null) {
        throw new EmployeeException("Invalid PAN Number");
    }

    panCardNumber = panCardNumber.trim().toUpperCase();
if(panCardNumber.length()==0)throw new EmployeeException("Invalid PANCardNumber");


    Employee oldEmployee = employeeIdWiseEmployeesMap.get(id);

    Employee existingAadhar =
        aadharCardNumberWiseEmployeesMap.get(aadharCardNumber);

    if (existingAadhar != null && !existingAadhar.getId().equals(id)) {
        throw new EmployeeException("AadharCardNumber: " + aadharCardNumber + " Exists");
    }
    Employee existingPan =
        panCardNumberWiseEmployeesMap.get(panCardNumber);

    if (existingPan != null && !existingPan.getId().equals(id)) {
        throw new EmployeeException("PAN Card Number: " + panCardNumber + " Exists");
    }

    Employee emp = new Employee();

    emp.setId(id);
    emp.setName(name);
    emp.setGender(gender);
    emp.setDateOfBirth(dateOfBirth);
    emp.setIsIndian(isIndian);
    emp.setSalary(salary);
    emp.setAadharCardNumber(aadharCardNumber);
    emp.setPanCardNumber(panCardNumber);

    
    aadharCardNumberWiseEmployeesMap.remove(oldEmployee.getAadharCardNumber());
    panCardNumberWiseEmployeesMap.remove(oldEmployee.getPanCardNumber());

    
    int index = employeeList.indexOf(oldEmployee);

    employeeList.set(index, emp);

    
    employeeIdWiseEmployeesMap.put(id, emp);
    aadharCardNumberWiseEmployeesMap.put(aadharCardNumber, emp);
    panCardNumberWiseEmployeesMap.put(panCardNumber, emp);
}





public void deleteEmployee(String id)throws EmployeeException
{

    if (id == null) {
        throw new EmployeeException("Invalid EmployeeId");
    }

    id = id.trim();

    if (id.length() == 0) {
        throw new EmployeeException("Invalid EmployeeId");
    }

    if (!employeeIdWiseEmployeesMap.containsKey(id)) {
        throw new EmployeeException("Invalid EmployeeId");
    }
Employee emp=employeeIdWiseEmployeesMap.get(id);
employeeIdWiseEmployeesMap.remove(emp.getId());
aadharCardNumberWiseEmployeesMap.remove(emp.getAadharCardNumber());
panCardNumberWiseEmployeesMap.remove(emp.getPanCardNumber());
employeeList.remove(emp);
System.out.println("Employee Deleted with EmployeeId: "+id);





}
public Employee getByEmployeeId(String id)throws EmployeeException
{

    if (id == null) {
        throw new EmployeeException("Invalid EmployeeId");
    }

    id = id.trim();

    if (id.length() == 0) {
        throw new EmployeeException("Invalid EmployeeId");
    }

    if (!employeeIdWiseEmployeesMap.containsKey(id)) {
        throw new EmployeeException("Invalid EmployeeId");
    }
Employee employee=employeeIdWiseEmployeesMap.get(id);
Employee emp=new Employee();

    emp.setId(employee.getId());
    emp.setName(employee.getName());
    emp.setGender(employee.getGender());
    emp.setDateOfBirth(employee.getDateOfBirth());
    emp.setIsIndian(employee.getIsIndian());
    emp.setSalary(employee.getSalary());
    emp.setAadharCardNumber(employee.getAadharCardNumber());
    emp.setPanCardNumber(employee.getPanCardNumber());

return emp;
}


public Employee getByAadharCardNumber(String aadharCardNumber)throws EmployeeException
{

    if (aadharCardNumber == null) {
        throw new EmployeeException("Invalid AadharCardNumber");
    }

    aadharCardNumber = aadharCardNumber.trim();

    if (aadharCardNumber.length() == 0) {
        throw new EmployeeException("Invalid AadharCardNumber");
    }

    if (!aadharCardNumberWiseEmployeesMap.containsKey(aadharCardNumber)) {
        throw new EmployeeException("Invalid AadharCardNumber");
    }
Employee employee=aadharCardNumberWiseEmployeesMap.get(aadharCardNumber);
Employee emp=new Employee();

    emp.setId(employee.getId());
    emp.setName(employee.getName());
    emp.setGender(employee.getGender());
    emp.setDateOfBirth(employee.getDateOfBirth());
    emp.setIsIndian(employee.getIsIndian());
    emp.setSalary(employee.getSalary());
    emp.setAadharCardNumber(employee.getAadharCardNumber());
    emp.setPanCardNumber(employee.getPanCardNumber());

return emp;
}

public Employee getByPANCardNumber(String panCardNumber)throws EmployeeException
{

    if (panCardNumber == null) {
        throw new EmployeeException("Invalid PANCardNumber");
    }

    panCardNumber = panCardNumber.trim();

    if (panCardNumber.length() == 0) {
        throw new EmployeeException("Invalid PANCardNumber");
    }

    if (!panCardNumberWiseEmployeesMap.containsKey(panCardNumber)) {
        throw new EmployeeException("Invalid PANCardNumber");
    }
Employee employee=panCardNumberWiseEmployeesMap.get(panCardNumber);
Employee emp=new Employee();

    emp.setId(employee.getId());
    emp.setName(employee.getName());
    emp.setGender(employee.getGender());
    emp.setDateOfBirth(employee.getDateOfBirth());
    emp.setIsIndian(employee.getIsIndian());
    emp.setSalary(employee.getSalary());
    emp.setAadharCardNumber(employee.getAadharCardNumber());
    emp.setPanCardNumber(employee.getPanCardNumber());

return emp;
}


public List<Employee>getAll()throws EmployeeException
{
List<Employee>employees=new LinkedList<>();
for(Employee employee:employeeList)
{


    Employee emp = new Employee();


    emp.setId(employee.getId());
    emp.setName(employee.getName());
    emp.setGender(employee.getGender());
    emp.setDateOfBirth(employee.getDateOfBirth());
    emp.setIsIndian(employee.getIsIndian());
    emp.setSalary(employee.getSalary());
    emp.setAadharCardNumber(employee.getAadharCardNumber());
    emp.setPanCardNumber(employee.getPanCardNumber());
employees.add(emp);

}
return employees;



}


}