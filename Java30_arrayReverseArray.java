public class Java30_arrayReverseArray {

    public static void ReverseArray(int arr[]){
        int start=0; int end=arr.length-1;
        while (start < end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }
        
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,7,11};
       ReverseArray(arr);
       for(int a:arr){
        System.out.print(a+" ");
       }
    }
    
}
