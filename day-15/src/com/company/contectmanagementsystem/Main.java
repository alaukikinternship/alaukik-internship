package com.company.contectmanagementsystem;
import com.company.contectmanagementsystem.model.*;
import com.company.contectmanagementsystem.service.*;
import java.util.*;

public class Main
{
public static void main(String gg[])
{
Scanner sc = new Scanner(System.in);

        ContectManagement contectManagement =
                new ContectManagement();

        while (true) {

            System.out.println("\n===== contect Management System =====");
            System.out.println("1. Add contect");
            System.out.println("2. Search contect");
            System.out.println("3. Update contect");
            System.out.println("4. Delete Contect");
            System.out.println("5. display Contects");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
		try
{
                Contect contect = new Contect();
System.out.println("Contect Add Module.......");
                System.out.print("Enter Name: ");
                contect.setName(sc.nextLine());

                System.out.print("Enter Phone Number: ");
                contect.setPhoneNumber(sc.nextLine());

                System.out.print("Enter Email: ");
                contect.setEmail(sc.nextLine());

                contectManagement.addContect(contect);
}catch(InvalidContectException exception)
{
System.out.println(exception.getMessage());
}

            }

            else if (choice == 2) {
                try
                {
System.out.println("Contect Search Module......");
System.out.println("Enter Phone Number: ");
String phoneNumber=sc.nextLine();
Contect contect=contectManagement.searchContect(phoneNumber);
System.out.println("Contect Number Detail");               
                     System.out.println("Name: "+contect.getName());
                

                System.out.println("Phone Number: "+contect.getPhoneNumber());
                

                System.out.println("Enter Email: "+contect.getEmail());
                System.out.println("************");
         }catch(InvalidContectException exception)
{
System.out.println(exception.getMessage());
}

            }

            else if (choice == 3) {
                try
                {
System.out.println("Contect Update Module.......");
                Contect contect = new Contect();

                System.out.print("Enter Name: ");
                contect.setName(sc.nextLine());

                System.out.print("Enter Phone Number: ");
                contect.setPhoneNumber(sc.nextLine());

                System.out.print("Enter Email: ");
                contect.setEmail(sc.nextLine());

                contectManagement.updateContect(contect);
}catch(InvalidContectException exception)
{
System.out.println(exception.getMessage());
}


            }

            else if (choice == 4) {
try
{
                System.out.println("Contect Delete Module.......");
                System.out.println("Enter Contect Number: ");
                String phoneNumber=sc.nextLine();
                contectManagement.deleteContect(phoneNumber);
}catch(InvalidContectException exception)
{
System.out.println(exception.getMessage());
}
            }
            else if(choice==5)
            {
                	try
{
    System.out.println("ContectDetails Module.......");
        
    List<Contect>list=contectManagement.DisplayContects();
    for(Contect contect:list)
    {
                System.out.println("Name: "+contect.getName());
                

                System.out.println("Phone Number: "+contect.getPhoneNumber());
                

                System.out.println("Enter Email: "+contect.getEmail());
    System.out.println("********************************");
            }
}catch(InvalidContectException exception)
{
System.out.println(exception.getMessage());
}


            }

            else if (choice == 6) {
                System.out.println("Thank You!");
                break;
            }

            else {
                System.out.println("Invalid Choice!");
            }
        }

        sc.close();




}
}