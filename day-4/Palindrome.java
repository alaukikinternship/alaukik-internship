import java.util.*;
public class Palindrome
{
    public boolean checkPalindrome(String s)
    {
        int e=0;
        int f=s.length()-1;
        if(s.charAt(e)!=s.charAt(f))return false;
        while(e<f)
        {
            if(s.charAt(e)!=s.charAt(f))return false;
            e++;
            f--;
        }
        return true;

    }
}
class psp
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        Palindrome palindrome=new Palindrome();
       boolean check=palindrome.checkPalindrome(str);
       if(check)
       {
        System.out.println(str +" is Pallindrome");
       }
       else
       {
        System.out.println(str+" is not a Pallindrome");
       }

    }
}