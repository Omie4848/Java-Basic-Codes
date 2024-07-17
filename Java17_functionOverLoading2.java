import java.util.*;
public class Java17_functionOverLoading2 {

    public static boolean isPrime(int a){
        int count=0;
        for(int i=1;i<=a;i++){
            if( a%i==0){
                count++;
            }
        }
        if(count==2){
           return true; 
        }
        else{
            return false;
        }
        

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(isPrime(a));
        
        
     sc.close();
    }
    
}
