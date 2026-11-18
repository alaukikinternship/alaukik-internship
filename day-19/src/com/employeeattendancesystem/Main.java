
package com.employeeattendancesystem;

import java.util.*;

public class Main {

    public static void main(String gg[]) {

        List<Attendance> records = new ArrayList<>();

        Employee employee = new Employee();

        employee.setId(101);
        employee.setName("Mohammad Mushef");

        // Check-in
        Attendance attendance = new Attendance(employee);

        records.add(attendance);

        System.out.println("Check In Successful");

        // Check-out
        attendance.checkOut();

        System.out.println("Check Out Successful");

        // Attendance Report
        System.out.println("\n===== ATTENDANCE REPORT =====");

        for (Attendance a : records) {

            a.showReport();
        }
    }
}
