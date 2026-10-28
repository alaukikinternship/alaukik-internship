import java.util.*;
public class MinimumNumber {
    public static void main(String args[])
    {
    int arr[]=new int[10];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++)
    {
        System.out.print("Enter a Number: ");
        arr[i]=sc.nextInt();
    }
    int minNumber=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(minNumber>arr[i])minNumber=arr[i];
    }
    System.out.println("Minimum Number: "+minNumber);
}
}
