// import java.util.*;
// public class Java25_arrayLinearSearch {
//     public static void LinarSearch(int arr[], int n){
//         for(int i=0;i<arr.length;i++){
//             if (arr[i]==n) {
//                 System.out.println("This value at index "+i);
//                 break;   
//             }
            
            
//             if(arr[i]!=n){
//                 System.out.println("This value is not present");
//                 break;
//             }
//         }
        
   
//     }
//     public static void main(String[] args) {

//         Scanner sc=new Scanner (System.in);
//         int arr[]={10,23,32,43,12,56};
//         for(int a: arr){
//             System.out.print(a+" ");
//         }
//         System.out.println();
//         int n=sc.nextInt();
//         LinarSearch(arr, n);;
//     }
// }

import java.util.*;
public class Java25_arrayLinearSearch{
    public static int LinarSearch(int arr[],int key){
for(int i=0;i<arr.length;i++){
    if(arr[i]==key){
        return  i;
    }
 }
 return -1;
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("size of array: ");
    int n=sc.nextInt();  
    int arr[]=new int[n];
    System.out.println("give inputs in array");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }  
    for(int a : arr){
        System.out.print(a+" ");
    }
    System.out.println();
    System.out.println("Which key index u want ?");
    int key=sc.nextInt();

    // function calling
    
    System.out.println(LinarSearch(arr, key));

    sc.close();
}
}