class Solution {
    public int sumCounts(List<Integer> nums) {
        /*int n = nums.size();
        for(int i = 0;i<n;i++){
            int d = 0;
            for(int j = i;j<n;j++){
                boolean found = false;
                for(int k = i;k<j;k++){
                    if(nums.get(k).equals(nums.get(j))){
                        found = true;
                        break;
                    }
                }
                if(!found){
                    d++;
                }
            }
            ans += d * d;
        }
    return ans;*/
        int n = nums.size();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int d = 0;

            for (int j = i; j < n; j++) {
                boolean found = false;

                for (int k = i; k < j; k++) {
                    if (nums.get(k).equals(nums.get(j))) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    d++;
                }

                ans += d * d;
            }
        }

        return ans;
    }
}