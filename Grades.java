import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int f=(a+b+c+d+e)/5;
        if(f>=90)
        {
            System.out.println("Grade A");
        }
        else if(f>=80)
        {
            System.out.println("Grade B");
        }
        else if(f>=70)
        {
            System.out.println("Grade C");
        }
        else if(f>=60)
        {
            System.out.println("Grade D");
        }
        else if(f>=40)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}