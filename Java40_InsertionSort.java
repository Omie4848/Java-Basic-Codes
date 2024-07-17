/**
 * Java40_InsertionSort
 */
public class Java40_InsertionSort {
    public static void InSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void main(String[] args) {
        int arr[]={4,6,2,9,1,5,12,56};
        InSort(arr);
        for(int a :arr){
            System.out.print(a+" ");
        }
    }
}