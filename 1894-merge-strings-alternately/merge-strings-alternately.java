class Solution {
    public String mergeAlternately(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();
        
        StringBuilder sb = new StringBuilder();

        for(int i =0 ; i< Math.max(m,n) ; i++){
          if(i  < m ){
            char w1 = word1.charAt(i);
            sb.append(w1);
          }

          if(i < n ){
             char w2 = word2.charAt(i);
            sb.append(w2);
          }
        }

        return sb.toString();
        
    }
}