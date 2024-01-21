import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int t=a;
        while(t!=b+1)
        {
            System.out.print(t+" ");
            t++;
        }
    }
}