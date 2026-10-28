import java.util.*;
public class Average {
    public static void main(String gg[])
    {
    int nums[]=new int[5];
    Scanner sc=new Scanner(System.in);
    int sum=0;
    for(int i=0;i<5;i++)
    {
        System.out.print("Enter a Number: ");
        nums[i]=sc.nextInt();
sum+=nums[i];
    }
    int avg=sum/5;
    System.out.println("Average is: "+avg);
}
}
