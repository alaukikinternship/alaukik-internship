import java.util.*;
public class MaximumNumber {
    public static void main(String gg[])
    {
    int arr[]=new int[10];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++)
    {
        System.out.print("Enter a Number: ");
        arr[i]=sc.nextInt();
    }
    int maxNumber=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(maxNumber<arr[i])maxNumber=arr[i];
    }
    System.out.println("Maximum Number: "+maxNumber);
}
}
