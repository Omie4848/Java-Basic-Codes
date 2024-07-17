import java.util.*;
public class Java21_array {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

//define arrays
    int[] marks=new int[n];
    String name[]= new String[n];

// Inputs in arrays
    for(int i=0;i<name.length;i++){
        name[i]=sc.next();

    }

//output of arrays
    for(int i=0;i<name.length;i++){
        System.out.print(name[i]+" ");
    }
    System.out.println();

//inputs of array
    for(int i=0;i<marks.length;i++){
        marks[i]=sc.nextInt();
        
    }
//modifiavtion of arrays
    for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+10 +" ");
        
    }

    sc.close();
    
   }
}
