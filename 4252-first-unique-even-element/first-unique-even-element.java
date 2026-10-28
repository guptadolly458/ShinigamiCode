class Solution {
    public int firstUniqueEven(int[] nums) {
        int n = nums.length;
        int[] c = new int[101];
        for (int i = 0;i<n;i++) {
            c[nums[i]]++;
        }
        for (int i = 0;i<n;i++) {
            if (nums[i] % 2 == 0 && c[nums[i]] == 1) {
                return nums[i];
            }
        }

    return -1;
    }
}