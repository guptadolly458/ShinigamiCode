class Solution {
    public int maxScore(String s) {
        int t = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                t++;
            }
        }
            int l = 0;
            int r = t;
            int max = 0;
        for(int i =  0;i<s.length()-1;i++){
            if(s.charAt(i)=='0'){
                l++;
            }else{
                r--;
            }
        int sc = l+r;
        max = Math.max(max,sc);
        }
    return max;
    }
}