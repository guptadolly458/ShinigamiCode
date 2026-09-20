class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++){
            if (i % 2 == 0 && nums[i] % 2 != 0) {

                for (int j = i + 1; j < n; j++) {

                    if (nums[j] % 2 == 0) {

                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;

                        break;
                    }
                }
            }
            else if (i % 2 != 0 && nums[i] % 2 == 0) {

                for (int j = i + 1; j < n; j++) {

                    if (nums[j] % 2 != 0) {

                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;

                        break;
                    }
                }
            }
        }

        return nums;
    }
}