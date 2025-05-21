package BinarySearch;

class mBouquet{
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k > bloomDay.length){
            return -1;
        }
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;
        for(int i=0 ; i< bloomDay.length ; i++){
            max = Math.max(max , bloomDay[i]);
            min = Math.min(min,bloomDay[i]);
        }
         int low  = min;
         int high = max ;
        while(low<= high){
            int mid = (low+high)/2;
            if(canMakeBouquet(bloomDay , mid, m,k)){
                high = mid -1 ;
            }
            else {
                low = mid+1;
            }
        }
        return low ;        
    }
      static boolean canMakeBouquet(int[] bloomyDay, int day ,int m , int n){
        int cnst = 0;
        int noOfB = 0;
        for(int i=0 ; i< bloomyDay.length; i++){
              if(day >= bloomyDay[i]){
                cnst++;
                // return true ;
              }
              else {
                // return false ;
                noOfB += (cnst / n);
                cnst=0 ;
              }
        }
        noOfB += (cnst / n);
        return noOfB >= m;
      }
}