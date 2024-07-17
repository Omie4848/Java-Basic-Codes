public class Java29_arraysBinarySearch {
    public static int BinarySearch(int arr[], int key) {
        int start=0; int end=arr.length-1;
        while(start <= end){
            int mid=(start+end)/2;

            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid] < key){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={34,55,56,89,91,99}; //sorted array
        int key=99;
        System.out.println("key is at: "+BinarySearch(arr, key));
        if(BinarySearch(arr, key)==-1){
            System.out.println("key is not in array");
        }

    }
}
