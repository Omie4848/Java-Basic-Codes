import java.util.*;
public class Java11_pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pat =sc.nextInt();
        for(int i=1;i<=pat;i++){
            for(int j=1;j<=pat;j++){
                System.out.print("*");
            }
                System.out.println();
        }
        sc.close();
    }
    
}
