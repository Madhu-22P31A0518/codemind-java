import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d=(int)Math.log10(a)+1;
        int s=0,r,m=a;
        while(a!=0)
        {
            r=a%10;
            s=s+r;
            a=(int)(a/(Math.pow(10,d-1)));
        }
        System.out.print(s);
    }
}