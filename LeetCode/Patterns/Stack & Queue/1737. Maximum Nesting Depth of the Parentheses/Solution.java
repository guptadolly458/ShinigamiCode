class Solution {
    public int maxDepth(String s) {
        int d = 0;
        int max = 0;
        for(int i = 0;i<s.length();i++){
            char c= s.charAt(i);
            if(c == '('){
                d++;
                if(d>max){
                    max = d;
                }
            }else if(c == ')'){
                d--;
            }
        }
        return max;
    }
}