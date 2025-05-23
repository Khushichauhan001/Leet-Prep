package Recursion;

public class TreeRec {
    static void print(int n){
        if(n==-1){

            return ;
        }
       System.out.println(n);
       print(n-1);
       print(n-1);
    }
    
    public static void main(String[] args) {
        print(3);
    }
}
