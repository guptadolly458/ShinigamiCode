class Solution {
    public int totalMoney(int n) {
       int t = 0;
       int  m = 1;
       for(int i = 0;i<n;i++){
        t = t+m + (i%7);
        if(i%7==6){
           m++; 
        }
       } 
       return t;
    }
}