import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int t=1,c=0;
        while(t!=a+1)
        {
            if(a%t==0)
            {
                c+=1;
            }
            t++;
        }
        if(c==2)
        {
            System.out.print("Prime");
        }
        else
        {
            System.out.print("Not Prime");
        }
    }
}