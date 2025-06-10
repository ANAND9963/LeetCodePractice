class Solution {
    public int maxDifference(String s) {

        Map<Character,Integer> hmap = new HashMap<>();

        int maxOdd = 1,minEven = s.length();

        for(char ch : s.toCharArray()){

              hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }

         for (int value : hmap.values()) {
            if (value % 2 == 1) {
                maxOdd = Math.max(maxOdd, value);
            } else {
                minEven = Math.min(minEven, value);
            }
        }
        return maxOdd - minEven;


        
    }
}