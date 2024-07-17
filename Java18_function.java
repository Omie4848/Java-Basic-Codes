import java.util.*;
public class Java18_function {

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

    public static int primeNuminRange(int n){
        
        for(int i=1;i<n;i++){
         if(isPrime(i)){
             System.out.println(i);
         }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeNuminRange(n);
        
        
     sc.close();
    }
    
}
