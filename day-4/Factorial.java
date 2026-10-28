import java.util.*;
public class Factorial
{
    public int Factor(int n)
    {
        int j=1;
        for(int i=1;i<=5;i++)
        {
            j=j*i;
        }
return j;
    }
}
 class Main2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        Factorial f=new Factorial();
        int ff=f.Factor(n);
        System.out.println(n+ " Factorial is: "+ff);


    }
}