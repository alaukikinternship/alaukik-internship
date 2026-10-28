import java.util.*;
public class CheckPrimeNumber
{
public boolean checkPrime(int num)
{
for(int i=2;i<num;i++)
{
if(num%i==0)return false;
}
return true;

}
}
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num;
System.out.println("Enter a Number: ");
num=sc.nextInt();
CheckPrimeNumber primeNumber=new CheckPrimeNumber();
boolean check=primeNumber.checkPrime(num);
if(check)
{
System.out.println(num+" is prime Number");
}
else
{
System.out.println(num+" is not prime Number");
}
}
}



