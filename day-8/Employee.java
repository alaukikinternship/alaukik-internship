public class Employee
{
    private String employeeId;
    private String employeeName;
    private String designation;
    private double salary;
    public Employee()
    {

    }
    public Employee(String employeeId,String employeeName,String designation,double salary)
    {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.designation=designation;
        this.salary=salary;
    }

    public String getEmployeeId() {
    return employeeId;
}

public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
}

public String getEmployeeName() {
    return employeeName;
}

public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
}

public String getDesignation() {
    return designation;
}

public void setDesignation(String designation) {
    this.designation = designation;
}

public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}



}
class Developer extends Employee
{
    private String programmingLanguage;
    private String experience;
    public Developer()
    {

    }
    public Developer(String programmingLanguage,String experience)
    {
        this.programmingLanguage=programmingLanguage;
        this.experience=experience;
    }
    public void setProgrammingLanguage(String programmingLanguage)
    {
        this.programmingLanguage=programmingLanguage;
    
    }
    public String getProgrammingLanguage()
    {
        return this.programmingLanguage;
    }
    public void setExperience(String experience)
    {
        this.experience=experience;
    }
    public String getExperience()
    {
        return this.experience;
    }

}
class SeniorDeveloper extends Employee
{
    private int teamSize;
    private double bonus;
    public SeniorDeveloper()
    {

    }
    public SeniorDeveloper(int teamSize,double bonus)
    {
        this.teamSize=teamSize;
        this.bonus=bonus;
    }
    public int getTeamSize() {
    return teamSize;
}

public void setTeamSize(int teamSize) {
    this.teamSize = teamSize;
}

public double getBonus() {
    return bonus;
}

public void setBonus(double bonus) {
    this.bonus = bonus;
}



}
class Main
{
    public static void main(String args[])
    {
        Developer employee=new Developer();
        employee.setEmployeeId("A100001");
        employee.setEmployeeName("Mohammad Mushef");
        employee.setDesignation("Java Full Stack Developer");
        employee.setSalary(50000);
        employee.setProgrammingLanguage("c,c++,java,spring....");
        employee.setExperience("3 years");
        System.out.println("Developer Details....");
        System.out.println("EmployeeId: "+employee.getEmployeeId());
        System.out.println("EmployeeName: "+employee.getEmployeeName());
        
System.out.println("Designation: "+employee.getDesignation());
        System.out.println("Salary: "+employee.getSalary());
        System.out.println("ProgrammingLanguages: "+employee.getProgrammingLanguage());
        System.out.println("Experience: "+employee.getExperience());
        System.out.println("**********************");


       SeniorDeveloper seniorEmployee=new SeniorDeveloper();
        seniorEmployee.setEmployeeId("A100002");
        seniorEmployee.setEmployeeName("Mohammad Bilal");
        seniorEmployee.setDesignation("Java Full Stack Developer");
        seniorEmployee.setSalary(60000);
        seniorEmployee.setTeamSize(4);
        seniorEmployee.setBonus(15000.00);
        
        
         System.out.println("Senior Developer Details....");
        System.out.println("EmployeeId: "+seniorEmployee.getEmployeeId());
        System.out.println("EmployeeName: "+seniorEmployee.getEmployeeName());
        
System.out.println("Designation: "+seniorEmployee.getDesignation());
        System.out.println("Salary: "+seniorEmployee.getSalary());
        System.out.println("Team: "+seniorEmployee.getTeamSize());
        System.out.println("Bonus: "+seniorEmployee.getBonus());
        System.out.println("**********************");
   
    }
}