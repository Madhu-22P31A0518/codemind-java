import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a*5>=b)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}