 public class Java35_kadanesMaxsum {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,1,-2,-1,-5,-3};
        int current=0;
        int max=Integer.MIN_VALUE;

    //if all values are negative use this loop directly
        // for(int j=0;j<arr.length;j++){
        //     if(arr[j]<0){
        //         current=arr[j];
        //         max=Math.max(current,max);
        //     }

        // }
        // System.out.println(max);
    
    //optimized way for all negative numbers
        // for(int i=0;i<arr.length;i++){
        //     if(max<arr[i]){
        //         max=arr[i];
        //     }
        // }
    // System.out.println(max);
      
        for(int i=0;i<arr.length;i++){
            current+= arr[i];
            
            if(current<0){
                current=0;
            }
            if(max<current){     // Rather than this if statement
                max=current;     // we use max=Math.max(current,max);
            }
           
        }

        System.out.println(max+"#");

    
    }
    
}
