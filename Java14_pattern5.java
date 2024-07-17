/**
 * Java14_pattern5
 */
import java.util.*;
public class Java14_pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pat=sc.nextInt();
        for(int i=0;i<pat;i++){
            for(int j=pat-1;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0; j<pat;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }

    
}