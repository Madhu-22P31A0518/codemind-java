import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double d,h;
        if(a<=10000)
        {
            d=0.8;
            h=0.2;
        }
        else if(a>10000 && a<=20000)
        {
            d=0.9;
            h=0.25;
        }
        else
        {
            d=0.95;
            h=0.3;
        }
        double f=a+(d*a)+(h*a);
        System.out.printf("%.2f",f);
    }
}