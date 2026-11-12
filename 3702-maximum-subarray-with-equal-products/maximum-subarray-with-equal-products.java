class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int p = 1;
            int gcd = nums[i];
            int lcm = nums[i];
            for (int j = i; j < n; j++) {
                p *= nums[j];
                gcd = GCD(gcd, nums[j]);
                lcm = (lcm * nums[j]) / GCD(lcm, nums[j]);
                if (p == gcd * lcm) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }
    public int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}