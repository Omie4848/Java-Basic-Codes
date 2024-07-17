//arrays passsed by reference

import java.util.*;
public class Java23_IntPassByRef {

    public static void Update(int marks[]) {
        for(int i=0;i<marks.length;i++){
            marks[i]+=2;

        }
       
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int marks[]={1,2,3,4,5};
        Update(marks);
        for(int m :marks){
            System.out.print(m+" ");
        }
        sc.close();
    }
}

