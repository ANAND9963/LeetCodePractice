class Solution {
    public int removeDuplicates(int[] nums) {

        int p1;
        int p2;
        int k = 1;

        for(p1=0; p1 < nums.length ; p1++){
            for(p2 =p1+1; p2<nums.length ; p2++){
                if(nums[p1] != nums[p2]){

                    
                    nums[k]= nums[p2];
                    k++;
                    p1 = p2 ;
                }

            }

        }
        System.out.println(k);
        return k;

        

        
    }
}