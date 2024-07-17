/**
 * Java41_CountingSort
 */
public class Java41_CountingSort {

    public static void CountSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,4,2,5,3,7,4,5,4};
        CountSort(arr);
        for(int a: arr){
            System.out.print(a+" ");
        }
        
    }
}