import java.util.*;
public class java9_primeusingswitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean  isPrime=true;
        switch (num) {
            case 0,1: isPrime=false;
            case 2 : isPrime=true;
                
                break;
        
            default:
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }

            }
                
        }
        if(isPrime){
            System.out.println("its prime");
        }
        else{
            System.out.println("its not prime");
        }
        sc.close();
    }
    
    
}
