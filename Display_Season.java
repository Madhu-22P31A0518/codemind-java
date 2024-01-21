import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a)
        {
            case 4,5,6:
                System.out.println("Summer");
                break;
            case 7,8,9,10:
                System.out.println("Rainy");
                break;
            case 11,12,1:
                System.out.println("Winter");
                break;
            case 2,3:
                System.out.println("Spring");
                break;
            default:
            System.out.println("-1");
            break;
                
        }
    }
}