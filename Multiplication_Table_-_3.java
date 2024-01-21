import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int t=b;
        while(t!=c+1)
        {
            System.out.print(a+" x "+t+" = "+a*t+"
");
            t++;
        }
    }
}