import java.util.*;
public class Java13_pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pat=sc.nextInt();
        for(int i=0;i<pat;i++){
            for(int j=0;j<pat;j++){
                if(i==0 || j==0 || j==pat-1 ||i==pat-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        sc.close();
    }
}
