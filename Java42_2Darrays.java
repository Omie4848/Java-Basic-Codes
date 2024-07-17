/**
 * Java42_2Darrays
 */
// Creation of 2d arrays and printing then as matrix
import java.util.*;
public class Java42_2Darrays {

    public static void arr(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][4];
        int n=matrix.length;
        System.out.println(n);
        int m=matrix[0].length;
        System.out.println(m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               
                matrix[i][j]=sc.nextInt();
            }
        }
        arr(matrix);
        
    sc.close();
    }
}