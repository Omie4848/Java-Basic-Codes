import java.util.*;
public class Java19_binaryTodecimal {
/**
 * 
 */
public static void binTodec(int a ){
    int pow=0;
    int decimal=0;
    while (a>0) {
        int lastnum=a%10;
        decimal=decimal+ lastnum *(int)Math.pow(2, pow);
        pow++;
        a=a/10;
        
        
    }
    System.out.println(decimal);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        binTodec(a);

        sc.close();
    }
}
