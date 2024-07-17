import java.util.*;
public class Java12_pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pat=sc.nextInt();
        for(int i=0;i<pat;i++){
            for(int j=pat-1;j>i;j--){
                System.out.print("1");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
