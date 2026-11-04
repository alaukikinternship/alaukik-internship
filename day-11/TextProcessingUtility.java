import java.util.*;
public class TextProcessingUtility
{
public String reverse(String str)
{
char arr[]=str.toCharArray();
int left=0;
int right=arr.length-1;
char tmp;
while(left<right)
{
tmp=arr[left];
arr[left]=arr[right];
arr[right]=tmp;
left++;
right--;
}
return new String(arr);

}
public int countCharacter(String str)
{
return str.length();
}
public int countWords(String str)
{
int n=str.length();
int words=0;
for(int i=0;i<n;i++)
{
if(str.charAt(i)==' ')
{
words++;
}
}
return words+1;

}
public boolean isPallindrome(String str)
{
int n=str.length();
int left=0;
int right=n-1;
while(left<right)
{
if(str.charAt(left)!=str.charAt(right))return false;
left++;
right--;
}
return true;
}
public String removeDuplicate(String str)
{
char[]arr=str.toCharArray();
int n=arr.length;
int off=0;
int cm=1;
while(cm<n)
{
while(arr[cm]==arr[cm-1])cm++;
arr[off+1]=arr[cm];
off++;
cm++;
}
return new String(arr,0,off+1);

}

} 
class Main
{
public static void main(String gg[])
{
TextProcessingUtility textProcessingUtility=new TextProcessingUtility();
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("Welcome to Text Processing Utility");
System.out.println("1. perform Reverse Operation");
System.out.println("2. perform Count Character Operation");
System.out.println("3. Count Word Of Text");
System.out.println("4. Check String is Pallindrome");
System.out.println("5. peform Remove Duplicates From string");
System.out.println("6. Exit");
System.out.print("Perform Operation you Want to Perform: ");
int choice=sc.nextInt();
if(choice==1)
{
System.out.println("Performing Reverse Operation");
String str;
System.out.print("ENter a String: ");
if(sc.hasNext())sc.nextLine();
str=sc.nextLine();
String result=textProcessingUtility.reverse(str);
System.out.println(str+" is reverse is "+result);
}else if(choice==2)
{
System.out.println("Performing Count character Operation");
String str;
System.out.print("ENter a String: ");
if(sc.hasNext())sc.nextLine();
str=sc.nextLine();
int result=textProcessingUtility.countCharacter(str);
System.out.println(str+" count character is "+result);


}
else if(choice==3)
{
System.out.println("Performing Count Words of Text Operation");
String str;
System.out.print("ENter a Text: ");
if(sc.hasNext())sc.nextLine();
str=sc.nextLine();
int result=textProcessingUtility.countWords(str);
System.out.println(str+" is words is present "+result);

}
else if(choice==4)
{
System.out.println("Performing Pallindrome Operation");
String str;
System.out.print("ENter a String: ");
if(sc.hasNext())sc.nextLine();
str=sc.nextLine();
boolean result=textProcessingUtility.isPallindrome(str);
System.out.println(str+" is Pallindrome: "+result);

}
else if(choice==5)
{

System.out.println("Performing Remove Duplicates Operation");
String str;
System.out.print("ENter a String: ");
if(sc.hasNext())sc.nextLine();
str=sc.nextLine();
String result=textProcessingUtility.removeDuplicate(str);
System.out.println(str+" after removing duplicates "+result);


}else if(choice==6)
{
break;
}
}

}
}