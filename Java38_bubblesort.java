/**
 * Java38_bubblesort
 */
public class Java38_bubblesort {
    public static void Bsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;

                }
            }
        }
    }

//t=To ceck total needed Swap 
    //    int n=arr.length;
    //    int swap=0;
    //    for(int i=0;i<n-1;i++){
    //     for(int j=0;j<n-1-i;j++){
    //         if(arr[j]>arr[j+1]){
    //             int temp=arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=temp;
    //             swap++;
    //         }
    //     }

    //    }
    //    System.out.println(swap);
    // }

    public static void PrintsortedArrray(int arr[]){
        Bsort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        PrintsortedArrray(arr);
        
    }
}