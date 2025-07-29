class Solution {
    public int[] twoSum(int[] nums, int target) {

        int p1 =0;
        int p2 =1;

        for(p1 =0 ; p1 < nums.length ; p1++){


            for(p2 =p1+1 ; p2<nums.length ; p2++){

                if(nums[p1]+nums[p2]==target){

                    return new int[] {p1,p2};
                }

            }                     

        }

        return new int[] {p1,p2};
        
    }
}