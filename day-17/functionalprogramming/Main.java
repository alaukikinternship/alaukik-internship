package functionalprogramming;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
public class Main
{
public static void main(String args[])
{
List<Employee>employees=new ArrayList<>();
employees.add(new Employee(101,"Aman Khan",119000));
employees.add(new Employee(102,"Mohammad Mushef",90000));
employees.add(new Employee(103,"Ahemad",23000));
employees.add(new Employee(104,"Avesh Khan",29000));
employees.add(new Employee(105,"Anas Khan",59000));
//print Employees
Stream<Employee>stream1=employees.stream();
stream1.forEach((e)->{
    System.out.println(e);

});
//filter employee
Stream<Employee>stream2=employees.stream();
List<Employee>res=stream2.filter(e->e.getSalary()>5000).collect(Collectors.toList());
System.out.println(res);
//sort Employee
Stream<Employee>stream3=employees.stream();
List<Employee>res1=stream3.sorted((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary())).collect(Collectors.toList());
System.out.println(res1);
//calculate Salary
Stream<Employee>stream4=employees.stream();
Function<Employee,Double>salary=(e)->e.getSalary()+(e.getSalary()*0.10);
employees.forEach(e->{
    System.out.println(e.getName()+": "+salary.apply(e));
});


//search Employee By name
Stream<Employee>stream5=employees.stream();
String name="Mohammad Mushef";
List<Employee>res3=stream5.filter(e->e.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
System.out.println(res3);
}
}
