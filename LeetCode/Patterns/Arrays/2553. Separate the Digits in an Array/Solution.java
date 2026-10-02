class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            int m = nums[i];
            while(m>0){
                count++;
                m = m/10;
            }
        }
        int[] ans = new int[count];
        int k = count - 1;
        for(int i = n-1;i>=0;i--){
            int m = nums[i];
            while(m>0){
                ans[k] = m%10;
                k--;
                m = m/10;
            }
        }
        return ans;
    }
}