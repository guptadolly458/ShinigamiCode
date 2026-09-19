class Solution {
    public int arrayPairSum(int[] nums) {
       int n = nums.length;
       for(int i = 0;i<n;i++){
        for(int j = 0;j<n-1-i;j++){
            if(nums[j]>nums[j+1]){
                int temp = nums[j];
                nums[j]= nums[j+1];
                nums[j+1]=temp;
            }
        }
       }
        int sum =0;
        for(int i=0;i<n;i=i+2){
            sum+=nums[i];
       } 
       return sum;
    }
}