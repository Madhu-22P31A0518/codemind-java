import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0,c=1,d=c+b;
        System.out.print(b+" "+c+" "+d+" ");
        for(int i=3;i<a;i++)
        {
            b=c;
            c=d;
            d=b+c;
            System.out.print(d+" ");
        }
    }
}