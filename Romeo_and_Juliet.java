import java.util.*;
public class Factor{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k =(n*5)+(a*10);
        System.out.printf("%d",k/b);
}
}