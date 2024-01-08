import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=(12*a)/100;
        double e=a+b+c+d;
        System.out.printf("%.2f
%.2f",d,e);
    }
}