import java.util.*;
public class Sorting {
    public static void main(String gg[])
    {
    int nums[]=new int[10];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<=9;i++)
    {
        System.out.print("Enter a Number: ");
         nums[i]=sc.nextInt();
    }
    int outerEnd=nums.length-2;
    int innerEnd=nums.length-1;
    int e=0;
    int f=0;
    int tmp;
    while(e<=outerEnd)
    {
        f=e+1;
        while(f<=innerEnd)
        {
            if(nums[f]<nums[e])
            {
            tmp=nums[e];
            nums[e]=nums[f];
            nums[f]=tmp;
            }
            f++;
        }
        e++;


    }
    for(int i=0;i<=9;i++)System.out.println(nums[i]);

}
}
