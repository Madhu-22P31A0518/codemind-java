import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double sh=0.0;
        for(double i=1;i<=a;i++)
        {
            sh+=(1/i);
        }
        System.out.printf("%.2f",sh);
    }
}