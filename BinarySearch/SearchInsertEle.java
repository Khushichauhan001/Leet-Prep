package BinarySearch;

public class SearchInsertEle {
    public static int searchInsert(int[] nums, int target) {
        int n= nums.length;
        int low = 0 , high = n-1 ;
        while(low <= high){
            int  mid = (low+high)/2;
            if(nums[mid] == target){
               return mid ;
            }
            else if(nums[mid]< target){
                //  ans = mid ;
                low = mid+1;
            }
            else {
                high = mid-1 ;
            }
        }
        return low;   // low wo index bn jata h jha target insert hona chahie and  high usse peeche bale ko point kr rha hota h
    }
    public static void main(String[] args) {
           int[] nums = {1,3,5,7};
           int target = 9;
          System.out.println(searchInsert(nums, target));
    }
}
