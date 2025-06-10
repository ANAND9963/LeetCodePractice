class Solution {
    public int maxDifference(String s) {

       int[] freq = new int[26]; // since s has only lowercase letters

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int maxOdd = 1;
        int minEven = s.length(); 

        for (int count : freq) {
            if (count == 0) continue;

            if (count % 2 == 1) {
                maxOdd = Math.max(maxOdd, count);
            } else {
                minEven = Math.min(minEven, count);
            }
        }

        return maxOdd - minEven;

        
    }
}