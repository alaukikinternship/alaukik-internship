
import java.util.*;
public class StudentGradeManagementSystem {
    public static void main(String args[])
    {
    int mathMarks,scienceMarks,englishMarks,hindiMarks,totalMarks;
    Scanner sc=new Scanner(System.in);
   String name;
    System.out.println("Enter your name: ");
    name=sc.nextLine();
    System.out.print("Enter your MathsMarks: ");
    mathMarks=sc.nextInt();
    System.out.print("Enter your englishMarks: ");
    englishMarks=sc.nextInt();
    System.out.print("Enter your scienceMarks: ");
    scienceMarks=sc.nextInt();
    System.out.print("Enter your hindiMarks: ");
    hindiMarks=sc.nextInt();
totalMarks=mathMarks+scienceMarks+englishMarks+hindiMarks;
    System.out.println("Total Marks: "+totalMarks);
double percentage = (totalMarks / 400.0) * 100;  
    System.out.print("Percentage: "+percentage);
    char grade;
    if(percentage>=90)
    {
        grade='A';
    }
    else if(percentage>=80)
    {
        grade='B';
    }
    else if(percentage>=70)
    {
        grade='C';
    }
    else if(percentage>=60)
    {
        grade='D';
    }
    else
    {
        grade='F';
    }
System.out.println("Grade: "+grade);
if(percentage>=40)
    {
        System.out.println("You have passed the exam");
    }
    else
    {
        System.out.println("You have failed the exam");
    }


    }    
}
