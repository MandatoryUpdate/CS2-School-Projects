import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args){
        
        int[] nums = {4,2,8,5,1};
        System.out.println(Arrays.toString(nums));
        mergeSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
        
        //         int[] nums2 = {4,2,8,5,1,5,6};
        //         System.out.println(Arrays.toString(nums2));
        //         mergeSort(nums2,0,nums2.length-1);
        //         System.out.println(Arrays.toString(nums2));
    }
    
    public static void mergeSort(int[] arr, int start, int end){
        System.out.println("merge sorting: " + start + " " + end);
        if(start >= end)
            return;
        int mid = (start + end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1,end);
        merge(arr,start,mid,end);
    }
    
    public static void merge(int[] arr, int start, int mid, int end){
        System.out.println("merge " + start + " " + mid + " " + end);
        int[] temp = new int[end-start+1];
        int tempSpot = 0;
        
        int spotA = start;
        int spotB = mid+1;
        while(spotA <= mid && spotB <= end){
            if(arr[spotA] < arr[spotB]){
                temp[tempSpot] = arr[spotA];
                tempSpot++;
                spotA++;
            }
            else{
                temp[tempSpot] = arr[spotB];
                tempSpot++;
                spotB++;
            }
        }
        //System.out.println("before temp = " + Arrays.toString(temp) + " spotA " + spotA + " spotB " + spotB);
        while(spotA <= mid){
            temp[tempSpot] = arr[spotA];
            tempSpot++;
            spotA++;
        }
        
        while(spotB <= end){
            temp[tempSpot] = arr[spotB];
            tempSpot++;
            spotB++;
        }
        System.out.println("after temp = " + Arrays.toString(temp) + " spotA " + spotA + " spotB " + spotB);
        tempSpot = 0;
        for(int i = start; i <= end; i++){
            arr[i] = temp[tempSpot];
            tempSpot++;
        }
        System.out.println("arr: " + Arrays.toString(arr));
    }
}