import java.util.*;
public class Searching
{
    public static void main(String gg[])
    {
        int nums[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter a Number: ");
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter a Number to Search: ");
        int search=sc.nextInt();
        boolean found=false;
        int i=0;
        for( i=0;i<nums.length;i++)
        {
            if(search==nums[i])
            {
                found=true;
                break;
            }
        }
        if(found)System.out.println(search +" found at index: "+i);
        else System.out.println(search+" not Found");
    }
}