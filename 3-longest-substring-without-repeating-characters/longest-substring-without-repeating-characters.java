class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int slow = 0;
        int max = 0;
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i =0 ; i< n ; i++){

            char ch = s.charAt(i);
            if(map.containsKey(ch)){

                slow = Math.max(slow , map.get(ch)+1);

            }
            map.put(ch,i);
            max = Math.max(max, i - slow +1);

        }

        return max;
        
    }
}