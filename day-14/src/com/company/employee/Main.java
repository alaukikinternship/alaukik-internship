package com.company.employee;
import com.company.employee.model.*;
import com.company.employee.service.*;
import java.util.*;

public class Main {

    public static void main(String gg[]) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Get All Employees");
            System.out.println("5. Get Employee By ID");
            System.out.println("6. Get Employee By PAN Card Number");
            System.out.println("7. Get Employee By Aadhar Card Number");

            System.out.println("8. Exit");

            System.out.print("Enter your Choice (1--8): ");

            int choice = sc.nextInt();
            sc.nextLine();

           if (choice == 1) {

    Employee employee = new Employee();

    System.out.print("Enter Employee ID: ");
    employee.setId(sc.nextLine());

    System.out.print("Enter Employee Name: ");
    employee.setName(sc.nextLine());

    System.out.print("Enter Gender: ");
    employee.setGender(sc.nextLine());

    System.out.print("Enter Date Of Birth (dd-MM-yyyy): ");
    String dob = sc.nextLine();

    try {
        Date date = new java.text.SimpleDateFormat("dd-MM-yyyy").parse(dob);
        employee.setDateOfBirth(date);
    }
    catch (Exception e) {
        System.out.println("Invalid Date Format");
        continue;
    }

    System.out.print("Are you Indian? (true/false): ");
    employee.setIsIndian(sc.nextBoolean());

    System.out.print("Enter Salary: ");
    employee.setSalary(sc.nextDouble());

    sc.nextLine(); // Consume leftover newline

    System.out.print("Enter Aadhar Card Number: ");
    employee.setAadharCardNumber(sc.nextLine());

    System.out.print("Enter PAN Card Number: ");
    employee.setPanCardNumber(sc.nextLine());

    try {
        service.addEmployee(employee);
        System.out.println("Employee Added Successfully!");
    }
    catch (EmployeeException e) {
        System.out.println(e.getMessage());
    }
}
 else if (choice == 2) {

                System.out.println("Fill Information Carefully Which Employee can be update");





    Employee employee = new Employee();

    System.out.print("Enter Employee ID: ");
    employee.setId(sc.nextLine());

    System.out.print("Enter Employee Name: ");
    employee.setName(sc.nextLine());

    System.out.print("Enter Gender: ");
    employee.setGender(sc.nextLine());

    System.out.print("Enter Date Of Birth (dd-MM-yyyy): ");
    String dob = sc.nextLine();

    try {
        Date date = new java.text.SimpleDateFormat("dd-MM-yyyy").parse(dob);
        employee.setDateOfBirth(date);
    }
    catch (Exception e) {
        System.out.println("Invalid Date Format");
        continue;
    }

    System.out.print("Are you Indian? (true/false): ");
    employee.setIsIndian(sc.nextBoolean());

    System.out.print("Enter Salary: ");
    employee.setSalary(sc.nextDouble());

    sc.nextLine(); // Consume leftover newline

    System.out.print("Enter Aadhar Card Number: ");
    employee.setAadharCardNumber(sc.nextLine());

    System.out.print("Enter PAN Card Number: ");
    employee.setPanCardNumber(sc.nextLine());

    try {
        service.updateEmployee(employee);
        System.out.println("Employee Updated Successfully!");
    }
    catch (EmployeeException e) {
        System.out.println(e.getMessage());
    }
}


            else if(choice == 3) {
try
{

                System.out.println("Delete Employee based on id");
                // Delete Employee Logic
    System.out.print("Enter Employee ID: ");
    String id=sc.nextLine();
service.deleteEmployee(id);
}catch(EmployeeException e)
{
System.out.println(e.getMessage());
}



            } 
           else if (choice == 4) {

      try {

        List<Employee> employees = service.getAll();

        if (employees.isEmpty()) {
            System.out.println("No Employee Found");
        } 
        else {

            for (Employee emp : employees) {

                System.out.println("--------------------------");

                System.out.println("Employee ID: " + emp.getId());
                System.out.println("Name: " + emp.getName());
                System.out.println("Gender: " + emp.getGender());
                System.out.println("Date Of Birth: " + emp.getDateOfBirth());
                System.out.println("Indian: " + emp.getIsIndian());
                System.out.println("Salary: " + emp.getSalary());
                System.out.println("Aadhar Card Number: " + emp.getAadharCardNumber());
                System.out.println("PAN Card Number: " + emp.getPanCardNumber());

                System.out.println("--------------------------");
            }
        }

    } 
    catch (EmployeeException e) {
        System.out.println(e.getMessage());
    }
}   else if (choice == 5) {

                System.out.println("Get Employee By EmployeeId");
		System.out.print("Enter EmployeeId: ");
		String employeeId=sc.nextLine();
try
{
Employee emp=service.getByEmployeeId(employeeId);
 System.out.println("Employee ID: " + emp.getId());
                System.out.println("Name: " + emp.getName());
                System.out.println("Gender: " + emp.getGender());
                System.out.println("Date Of Birth: " + emp.getDateOfBirth());
                System.out.println("Indian: " + emp.getIsIndian());
                System.out.println("Salary: " + emp.getSalary());
                System.out.println("Aadhar Card Number: " + emp.getAadharCardNumber());
                System.out.println("PAN Card Number: " + emp.getPanCardNumber());

}catch(EmployeeException employeeException)
{
System.out.println(employeeException.getMessage());
}
                // Get Employee By ID Logic



            } 
else if(choice==6)
{

                System.out.println("Get Employee By PAN Card Number");
		System.out.print("Enter Pan Card Number: ");
		String panCardNumber=sc.nextLine();
try
{
Employee emp=service.getByPANCardNumber(panCardNumber);
 System.out.println("Employee ID: " + emp.getId());
                System.out.println("Name: " + emp.getName());
                System.out.println("Gender: " + emp.getGender());
                System.out.println("Date Of Birth: " + emp.getDateOfBirth());
                System.out.println("Indian: " + emp.getIsIndian());
                System.out.println("Salary: " + emp.getSalary());
                System.out.println("Aadhar Card Number: " + emp.getAadharCardNumber());
                System.out.println("PAN Card Number: " + emp.getPanCardNumber());

}catch(EmployeeException employeeException)
{
System.out.println(employeeException.getMessage());
}


}else if(choice==7)
{

                System.out.println("Get Employee By Aadhar Card Number");
		System.out.print("Enter Aadhar Card Number: ");
		String aadharCardNumber=sc.nextLine();
try
{
                Employee emp=service.getByAadharCardNumber(aadharCardNumber);
                System.out.println("Employee ID: " + emp.getId());
                System.out.println("Name: " + emp.getName());
                System.out.println("Gender: " + emp.getGender());
                System.out.println("Date Of Birth: " + emp.getDateOfBirth());
                System.out.println("Indian: " + emp.getIsIndian());
                System.out.println("Salary: " + emp.getSalary());
                System.out.println("Aadhar Card Number: " + emp.getAadharCardNumber());
                System.out.println("PAN Card Number: " + emp.getPanCardNumber());

}catch(EmployeeException employeeException)
{
System.out.println(employeeException.getMessage());
}

}
            else if (choice == 8) {

                System.out.println("Thank You!");
                sc.close();
                return;

            } 
            else {

                System.out.println("Invalid Choice! Please Try Again.");

            }
        
    
}


        }

    }



    

