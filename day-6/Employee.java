public class Employee
{
    private String id;
    private String name;
    private int salary;
    private String department;
    public Employee()
    {
    }
    public Employee(String id,String name,int salary,String department)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public String getId()
    {
        return this.id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public int getSalary()
    {
        return this.salary;
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }
    public String getDepartment()
{
    return this.department;
}
public void displayDetails()
{
    System.out.println("Employee Details...");
    System.out.println("Id: "+id);
    System.out.println("Name: "+name);
    System.out.println("Salary: "+salary);
    System.out.println("Department: "+department);
}


}
class Main4
{
    public static void main(String args[])
    {
        Employee employee=new Employee();
        employee.setId("A100001");
        employee.setName("Mohammad Mushef");
        employee.setSalary(30000);
        employee.setDepartment("Computer Science");
        employee.displayDetails();
    }
}