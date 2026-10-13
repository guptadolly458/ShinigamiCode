class Solution {
    public long maxAlternatingSum(int[] nums) {
      /* int n = nums.length;
       long ans = 0;
       long[] square = new long[n];
       for(int i = 0;i<n;i++){
        square[i] = (long)nums[i]*nums[i];
       }
       Arrays.sort(square);
       for(int i = 0;i<n/2;i++){
        ans-=square[i];
       }
       for(int i = 0;i<n;i++){
        ans+=square[i];
       }
       return ans;*/
    int n = nums.length;
    long ans = 0;
    long[] square = new long[n];

    for (int i = 0; i < n; i++) {
        square[i] = (long) nums[i] * nums[i];
    }
    Arrays.sort(square);
    for (int i = 0; i < n ; i++) {
       if(i<(n+1)/2){
        ans-=square[n-1-i];
       }else{
        ans+=square[n-1-i];
       }
    }
    return Math.abs(ans);
    }
}