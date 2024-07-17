/**
 * Java31_arrayPairsInArr
 */
public class Java31_arrayPairsInArr {

    // public static void Pairs(int arr[]){
    //     int tp=0;
    //     for(int i=0;i<arr.length;i++){
    //         int cur=arr[i];
    //          for(int j=i+1;j<arr.length;j++){
    //             System.out.print("("+ cur +","+arr[j]+") ");
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("total pairs: "+tp);
    // }
    // public static void main(String[] args) {
    //     int arr[]={2,3,4,5,6};
    //    Pairs(arr);
    // }
    public static void Pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+start+" "+arr[j]+")");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
             int arr[]={2,3,4,5,6};
          Pairs(arr);
        
    }
}