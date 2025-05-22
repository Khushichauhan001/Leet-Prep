package BinarySearch;

public class PeakEle {
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low= 0;
        int high = n-1;
        while(low<high){
            int mid = low+(high-low)/2;
                if( arr[mid]< arr[mid+1]){
                    low = mid+1;
                }
                else{
                    high = mid;
                }
        }
        return high;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
