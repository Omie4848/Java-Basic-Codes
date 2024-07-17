import java.util.*;
// via parameters
public class Java17_functionOverLoading {

    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
        int c=sc.nextInt();
        sum(a, b);
        System.out.println("sum of a+b is "+sum(a, b));
        sum(a, b, c);
        System.out.println("sum of a+b+c is "+sum(a, b, c));
        int d=sum(a, b)+sum(a, b, c);
        System.out.println(d);

        sc.close();
    }
    
}
