package Recursion;

public class ArraySum {
    static int getSum(int[] arr , int idx, int sum){
        int n = arr.length;
        if(idx == n){
            return sum;
        }
        int Curr = arr[idx];
        // sum =sum+arr[idx];
        int smallAns = getSum(arr, idx+1, sum);
        return smallAns+Curr;
}
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    
    System.out.println(getSum(arr, 0, 0));
  }  
}
