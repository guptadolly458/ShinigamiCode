class Solution {
    public int peakValleyDifference(int[] nums) {
        int n = nums.length;
        int sum1 = 0;
        int sum2 = 0;
        int diff = 0;
        for(int i = 1;i<n-1;i++){
            if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                sum1+=nums[i];
            }
            if(nums[i] < nums[i - 1] && nums[i] < nums[i + 1]){
                sum2+= nums[i];
            }
            diff = sum1-sum2;
        }
             return diff;
    }
}