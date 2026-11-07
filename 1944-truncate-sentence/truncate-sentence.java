class Solution {
    public String truncateSentence(String s, int k) {
        String[] w = s.split(" ");
        String a = "";

        for (int i = 0; i < k; i++) {
            a += w[i];

            if (i < k - 1) {
                a += " ";
            }
        }

        return a;

    }
}