public class Java39_SelectionSort {

    public static  void Ssort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
             int minpos=i;
             for(int j=i+1;j<arr.length;j++){

             
             if(arr[minpos]>arr[j]){
                minpos=j;
             }
        }
        int temp=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
    }
    }
    public static void main(String[] args) {
        int arr[]={2,6,1,8,3,7,0};
        Ssort(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
    
}
