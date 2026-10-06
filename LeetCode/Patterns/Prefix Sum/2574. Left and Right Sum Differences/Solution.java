class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int t = 0;
        for (int i = 0; i < n; i++) {
            t = t + nums[i];
        }

        int l = 0;

        for (int i = 0; i < n; i++) {
            int r = t - l - nums[i];

            ans[i] = Math.abs(l - r);
            l = l + nums[i];
        }

        return ans;
    }
}