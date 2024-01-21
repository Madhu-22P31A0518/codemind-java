import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.nextLine();
        String t=sc.nextLine();
        int c=sc.nextInt();
        double d;
        if(c<=199)
        {
            d=1.20;
        }
        else if(c>=200 && c<400)
        {
            d=1.50;
        }
        else if(c>=400 && c<600)
        {
            d=1.80;
        }
        else
        {
            d=2.00;
        }
        double g=c*d;
        if(g>400)
        {
            g+=0.15*g;
        }
        else
        {
            g+=100;
        }
        System.out.printf("%.2f",g);
    }
}