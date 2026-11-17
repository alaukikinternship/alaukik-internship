package streamapi;
import streamapi.employeeanalyticssystem.*;
import java.util.stream.*;
import java.util.*;
public class Main
{
public static void main(String gg[])
{
List<Employee>employees=new ArrayList<>();
employees.add(new Employee(101,"Mohammad Mushef",100000,"Computer Science"));
employees.add(new Employee(102,"Mohammad Uzer",90000,"Information Technology"));
employees.add(new Employee(103,"Mohammad Abuzer",80000,"Physics Wallah"));
employees.add(new Employee(104,"Mohammad Usman",60000,"Science"));
employees.add(new Employee(105,"Rais Khan",100000,"Driver"));
//employee with salary greater then 50000
Stream<Employee>stream1=employees.stream();
List<Employee>res1=stream1.filter(e->e.getSalary()>50000).collect(Collectors.toList());
System.out.println("Employee with salary greater then 50000");
System.out.println(res1);


        // 2. Employees by Department

        System.out.println("\nEmployees by Department");

        Map<String, List<Employee>> res2 = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment()));

        res2.forEach((dept, empList) -> {
            System.out.println(dept + " : " + empList);
        });


        // 3. Highest Salary

        System.out.println("\nHighest Salary");

        Employee highest = employees.stream()
                .max((e1, e2) ->
                        Double.compare(e1.getSalary(), e2.getSalary()))
                .orElse(null);

        System.out.println(highest);


        // 4. Average Salary

        System.out.println("\nAverage Salary");

        double average = employees.stream()
                .collect(Collectors.averagingDouble(e -> e.getSalary()));

        System.out.println(average);

}
}