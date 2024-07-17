import java.util.Scanner;
public class Java27_arraySmallestInArray {
    public static int SmallestInArry(int arr[]){
        int temp=arr[0];
        for(int i=0;i<arr.length;i++){
           if(arr[i]<=temp){
            temp=arr[i];

           }
        }
        return temp;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

// Arrays initialization
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

    //function call

    System.out.println(SmallestInArry(arr));

    sc.close();
 }
}