import java.util.*;
public class ReverseNumber
{
public int reverseNumber(int n)
{
   
    int rev=0;
    while(n>0)
    {
        int d=n%10;
        rev=rev*10+d;
        n=n/10;


    }
    return rev;
}
}
class Main3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number: ");
int num=sc.nextInt();
ReverseNumber rn=new ReverseNumber();
int n=rn.reverseNumber(num);
System.out.println(num+" reverse is "+n);


}
}