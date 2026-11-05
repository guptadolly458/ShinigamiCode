class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        int n = arr1.length;
        int m = arr2.length;

        for (int i = 0; i < n; i++) {
            boolean f = true;

            for (int j = 0; j < m; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    f = false;
                    break;
                }
            }

            if (f) {
                count++;
            }
        }

        return count;
    }
}