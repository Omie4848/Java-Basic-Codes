public class Java28_arrayOptimizeLS {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int arr[]={4,-4,10};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
