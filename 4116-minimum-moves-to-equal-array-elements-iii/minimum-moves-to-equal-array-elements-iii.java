class Solution {
    public int minMoves(int[] nums) {
        /*int n = nums.length;
        int min = nums[0];
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
            if(nums[i]<min){
                min = nums[i];
            }
        }
        
        return sum - (min * n);*/
    int n = nums.length;
    int max = nums[0];
    int sum = 0;

    for(int i = 0; i < n; i++) {

        sum += nums[i];

        if(nums[i] > max) {
            max = nums[i];
        }
    }

    return (max * n) - sum;
    }
}
