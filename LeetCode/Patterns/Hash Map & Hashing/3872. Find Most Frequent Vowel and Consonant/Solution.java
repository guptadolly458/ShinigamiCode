class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for(int i = 0;i<s.length();i++){
            char ch  = s.charAt(i);
            freq [ch - 'a']++;
        }
        int maxv=0;
        int maxc=0;
        for(int i = 0;i<26;i++){
           char ch = (char)('a'+ i);
           if(ch=='a'|| ch=='e'|| ch=='o'||ch=='i'||ch=='u'){
            maxv = Math.max(maxv,freq[i]);
           }else{
            maxc = Math.max(maxc,freq[i]);
           }
        }
        return maxc+maxv;
    }
}