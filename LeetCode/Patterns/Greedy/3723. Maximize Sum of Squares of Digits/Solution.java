class Solution {
    public String maxSumOfSquares(int num, int sum) {
    /if (sum > num * 9) {
        return "";
        }
    String ans = "";

    while (num > 0) {
        if (sum >= 9) {
            ans += "9";
            sum -= 9;
        } else {
            ans += sum;
            sum = 0;
        }
        num--;
    }

    return ans;
    }
}