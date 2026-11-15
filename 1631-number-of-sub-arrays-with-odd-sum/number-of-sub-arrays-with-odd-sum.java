class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int mod = 1000000007;
        int o = 0;
        int e = 1;
        int sum = 0;
        int c = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum % 2 == 0) {
                c += o;
                e++;
            } else {
                c += e;
                o++;
            }

            c %= mod;
        }

        return c;
    }
}