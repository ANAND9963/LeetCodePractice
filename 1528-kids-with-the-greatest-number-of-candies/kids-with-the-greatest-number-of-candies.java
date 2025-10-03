class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int n = candies.length;
        int greatest = 0;
        List<Boolean> result = new ArrayList<>();
        for(int i =0 ; i< n ; i++){
            if(greatest <= candies[i]){
                greatest = candies[i];
            }
        }

        for(int i =0 ; i< n ; i++){
            if(candies[i] + extraCandies >= greatest){
                result.add(true);
            }else{
                result.add(false);
            }
        }

        return result;
    }
}