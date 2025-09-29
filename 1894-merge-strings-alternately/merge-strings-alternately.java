class Solution {
    public String mergeAlternately(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        if(m < n ){
            int temp = m;
            m = n;
            n= temp;
        }
        
        StringBuilder sb = new StringBuilder();

        for(int i =0 ; i< m ; i++){
          if(i  < word1.length() ){
            char w1 = word1.charAt(i);
            sb.append(w1);
          }

          if(i < word2.length() ){
             char w2 = word2.charAt(i);
            sb.append(w2);
          }
        }

        return sb.toString();
        
    }
}