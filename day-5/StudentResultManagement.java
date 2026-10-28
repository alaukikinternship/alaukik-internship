
import java.util.*;
public class StudentResultManagement {
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        String names[]=new String[5];
        int marks[]=new int[5];
        char grade[]=new char[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter your name: ");
           names[i]=sc.nextLine();
            System.out.print("Enter your marks: ");
            marks[i]=sc.nextInt();
            System.out.print("Enter your grade: ");
            grade[i]=sc.next().charAt(0);
            sc.nextLine();
        }
        System.out.println("Enter your index: ");
        int index=sc.nextInt();
        if(index<0 || index>names.length)
        {
            System.out.println("Please Enter a Valid Index , Valid Index can be in a range(0--5)");
        }
        System.out.println("Student Details..");
        System.out.println("Name: "+names[index]);
        System.out.println("Marks: "+marks[index]);
        System.out.println("Grade: "+grade[index]);


    }


    
}
