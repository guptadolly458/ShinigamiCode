class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int l  = 0;
        int max = 0;
        int sum = 0;
        int count = 0;
        for(int r = 0;r<n;r++){
            char ch = s.charAt(r);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
            if(r-l+1==k){
                max = Math.max(max,count);
                char lchar = s.charAt(l);
                if(lchar =='a'|| lchar == 'e'|| lchar == 'i'|| lchar == 'o' || lchar == 'u'){
                    count--;
                }
                l++;
            }
        }
        return max;
    }
}