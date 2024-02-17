import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        for(int i=0;i<=a;i++)
        {
            for(int j=1;j<=a;j++){
            if(Math.pow(i,2)+Math.pow(j,2)==a)
            {
                c+=1;
                System.out.print("True");
                break;
            }
            }
            if(c!=0)
            {
                break;
            }
        }
        if(c==0)
        {
            System.out.print("False");
        }
    }
}