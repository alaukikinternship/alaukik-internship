
package com.employeeattendancesystem;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Attendance {

    private Employee employee;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;

    public Attendance(Employee employee) {

        this.employee = employee;
        this.checkIn = LocalDateTime.now();
    }

    public void checkOut() {

        this.checkOut = LocalDateTime.now();
    }

    public void showReport() {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");

        System.out.println("Employee Id: " + employee.getId());

        System.out.println("Employee Name: " + employee.getName());

        System.out.println("Employee CheckIn Time: " +
                checkIn.format(formatter));

        if (checkOut != null) {

            System.out.println("Employee CheckOut Time: " +
                    checkOut.format(formatter));

            Duration duration =
                    Duration.between(checkIn, checkOut);

            System.out.println("Working Hours: " +
                    duration.toHours() + " Hours " +
                    duration.toMinutesPart() + " Minutes");

        } else {

            System.out.println("CheckOut: Not Done");
        }
    }
}
