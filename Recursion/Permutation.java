package Recursion;
 // when repetation is allowed 
public class Permutation {
    static void permRep(String option , String ans){
         if(ans.length() == option.length()){
            System.out.println(ans);
            return;
         }
         for(int i=0 ; i<option.length();i++){

             permRep(option, ans+option.charAt(i));
         }
    }

    static void permWithoutRep(String option , String ans){
      if(ans.length() == option.length()){
        System.out.println(ans);
        return ;
      }
    //   String optionLeft = option.substring(1);

    //   permRep(option, optionLeft);
    for(int i=0 ; i<option.length() ; i++){
        permWithoutRep(option.substring(0, i)+option.substring(i+1), ans+option.charAt(i));
    }
    }
    public static void main(String[] args) {
        permWithoutRep("abc" , " ");
    }
}


///tc: (length of string)^3 ;