package com.company.employee.util;
import com.company.employee.model.*;
import com.company.employee.service.*;
public class EmployeeUtil
{
public static void printLine()
{
System.out.println("******************************");
}
public static boolean isValidSalary(double salary)
{
return salary>0;
} 
public static String formatName(String name)
{
return name.trim().toUpperCase();
}
}