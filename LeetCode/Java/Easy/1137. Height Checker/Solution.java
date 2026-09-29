class Solution {
    public int heightChecker(int[]h) {
        int n = h.length;
        int[] s = new int[n];
        for(int i = 0;i<n;i++){
            s[i]=h[i];
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-1-i;j++){
                if(s[j]>s[j+1]){
                    int temp = s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
        int c = 0;
        for(int i = 0;i<n;i++){
            if(h[i]!=s[i]){
                c++;
            }
        }
        return c;
    }
}