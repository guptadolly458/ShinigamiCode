class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Find 3rd distinct maximum
        int count = 1;

        for (int i = n - 2; i >= 0; i--) {

            if (nums[i] != nums[i + 1]) {
                count++;
            }

            if (count == 3) {
                return nums[i];
            }
        }

        // If 3rd maximum doesn't exist
        return nums[n - 1];
    }
}