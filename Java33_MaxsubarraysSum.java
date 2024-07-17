public class Java33_MaxsubarraysSum {
    
    public static void Sub(int arr[]){
        // int maxsum=0;
        // int currsum=0;
        // for(int i=0;i<arr.length;i++){
        //     int start=i;
        //     for(int j=i; j<arr.length;j++){
        //         int end=j;
        //         currsum=0;
        //         for(int k=start;k<=end;k++){
        //             currsum+=arr[k];
        //         }
        //         System.out.println(currsum+" *");
        //         if(currsum>maxsum){
        //             maxsum=currsum;
        //         }
               
                
        //     }
           
        // }
        // System.out.println("Maximum sum of subarray "+maxsum);
    
        
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currentsum=0;
                for(int k=i;k<=j;k++){
                    currentsum+=arr[k];
                    if(currentsum>maxsum){
                        maxsum=currentsum;
                    }
                    
                }
            }
        }
        System.out.println(maxsum);
    }

    public static void main(String[] args) {
    int arr[]={2,3,4,5,6};
        Sub(arr);
    
}
}



















































