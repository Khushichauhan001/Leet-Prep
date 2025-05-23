package Recursion;

public class CountZeroes {
    static int zero(int[] arr ,int idx){
        int n= arr.length;
        if(idx == n) return 0 ;
        // int count = 0;
        int count = zero(arr, idx+1);
        // int currEle = arr[idx];
        if(arr[idx] == 0){
             return count+1;
        }
        return count ;
 }
    public static void main(String[] args) {
        int[] arr ={0,1,2,1,0,2,0,0};
        System.out.println(zero(arr, 0));
    }
}
