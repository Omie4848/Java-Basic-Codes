import java.util.Scanner;

public class Java26_arrayLargestInArray {
    public static int LargestInArry(int arr[]){
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>temp){
                temp=arr[i];  
            }  
        }
        return temp;
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
    

    System.out.println(LargestInArry(arr)); //function calling;

    sc.close();
 }
}