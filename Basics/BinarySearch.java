public class BinarySearch
{
    public static void main(String[] args){
        
        int[] nums = {1,2,3,4,5};
        System.out.println(binarySearch(nums,0,nums.length-1,3));
        System.out.println(binarySearch(nums,0,nums.length-1,1));
        System.out.println(binarySearch(nums,0,nums.length-1,4));
        System.out.println(binarySearch(nums,0,nums.length-1,-3));
    }
    
    public static int binarySearch(int[] arr, int start, int end, int target){
        if(start > end)
            return -1;
        
        int mid = (start + end)/2;
        
        if(arr[mid] == target)
            return mid;
        else if(target < arr[mid])
                return binarySearch(arr,start,mid-1,target);
             else
                return binarySearch(arr,mid+1,end,target);
        
    }
}