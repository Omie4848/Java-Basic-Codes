import java.util.*;
public class Java20_decimalTobinary {
    public static int decTobin(int n){
        int pow=0;
        int bin=0;
        while(n>0){
             
            int rem=n%2;
            bin=bin+rem*(int)Math.pow(10, pow);
            pow++;
            n=n/2;
        }
        System.out.println(bin);
        return 0;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        decTobin(n);

        sc.close();
    }
}
