import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<b)
            {
                System.out.println(a);
            }
            else
            {
                int c=a/b;
                if(a%b==0)
                {
                    System.out.println(c);
                }
                else
                {
                    System.out.println(c+(a-(b*c)));
                }
            }
        }
    }
}