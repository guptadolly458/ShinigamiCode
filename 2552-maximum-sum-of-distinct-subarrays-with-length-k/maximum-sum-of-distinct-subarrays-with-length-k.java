class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n =  nums.length;
        int[] freq = new int[100001];
        long sum = 0;
        long max = 0;
        int l = 0;
        int distinct = 0;
        for(int r = 0; r<n;r++){
           sum = sum + nums[r];
           if(freq[nums[r]]==0){
            distinct++;
           } 
           freq[nums[r]]++;
           if(r-l+1==k){
           if(distinct == k){
            max = Math.max(max,sum);
           }
           freq[nums[l]]--;
           if(freq[nums[l]]==0){
            distinct--;
           }
           sum = sum - nums[l];
           l++;
           }
        }
        return max;
    }
}