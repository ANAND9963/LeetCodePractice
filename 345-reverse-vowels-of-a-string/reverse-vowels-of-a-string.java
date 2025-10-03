class Solution {
    public String reverseVowels(String s) {
        
        Stack<Character> st = new Stack<>();

        int n = s.length();

        for(int i =0 ; i<n ; i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< n ; i++){
            char ch2 = s.charAt(i);
            if(isVowel(ch2)){
               char reverse= st.pop();
               sb.append(reverse);
            }else{
                sb.append(ch2);
            }
        }

        return sb.toString();
    }

    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}