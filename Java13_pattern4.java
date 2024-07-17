import java.util.*;
public class Java13_pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pat=sc.nextInt();
        for(int i=1;i<=pat;i++){
            for(int j=pat;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
