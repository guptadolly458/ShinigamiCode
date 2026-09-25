class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] freq = new int[256];
        int l = 0;
        int max = 0;
        for(int r = 0;r<n;r++){
            char ch = s.charAt(r);
            freq[ch]++;
            while(freq[ch]>1){
                freq[s.charAt(l)]--;
                l++;
            }
            int length = r-l+1;
            if(length>max){
                max = length;
            }
        }
        return max;
    }
}