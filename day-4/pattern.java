import java.util.*;
public class pattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Steps: ");
        int steps=sc.nextInt();
        
        
        for(int i=1;i<=steps;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }



    }
    
}
