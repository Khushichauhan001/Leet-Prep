package Recursion;

public class REvArray {
    static void rev(int[] arr , int idx){
        int n  = arr.length;
        if(idx >=n/2){
            return ;
        }
            int temp = arr[idx];
            arr[idx] = arr[n-1-idx];
            arr[n-1-idx] = temp;

         rev(arr, idx+1);


}
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    rev(arr, 0);
    
    for (int i : arr) {
        System.out.println(i+ " ");
    }
  }  
}
