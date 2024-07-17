public class Java34_PrefixsubarraysSum {
    
    public static void Sub(int arr[]){
        int maxsum=Integer.MIN_VALUE;;
        int currsum=0;
        int prefix[]=new int[arr.length];
        
        prefix[0]=arr[0];
        // calculate prefix array
        
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }

  
        for(int i=0;i<arr.length;i++){
            int start=i; 
            for(int j=i; j<arr.length;j++){
                int end=j;

                // for(int k=start;k<=end;k++){
                //     currsum+=arr[k];
                // }
                
                currsum= start == 0 ? prefix[end] : prefix[end] - prefix[start-1];  
                if(currsum>maxsum){
                    maxsum=currsum;
                }
               
                
            }
           
        }
        System.out.println("Maximum sum of subarray "+maxsum);
    }
    public static void main(String[] args) {
    int arr[]={2,3,4,5,6};
        Sub(arr);
    
}
}



















































