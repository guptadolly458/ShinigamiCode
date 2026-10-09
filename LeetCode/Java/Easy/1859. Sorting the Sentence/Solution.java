class Solution {
    public String sortSentence(String s) {
        String[] w = s.split(" ");
        String[] result = new String[w.length];
        for (int i = 0;i < w.length;i++){
           String wo = w[i];
           int p = wo.charAt(wo.length()-1)-'0';
           result[p - 1]= wo.substring(0,wo.length()-1);
        }
        return String.join(" ",result); 
    }
}