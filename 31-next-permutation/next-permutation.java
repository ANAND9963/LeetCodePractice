class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int index = -1;
        for(int  i = n-2 ; i >=0; i--){
            if(nums[i+1] > nums[i]){
                index = i;
                break;
            }
        }
        if(index !=-1){

            int j = n-1;
            while(nums[j] <= nums[index]){
                j--;
            }
            int find = j;
            interchange(nums,index,find);

        }
        

        reverse(nums,index+1,n-1);
        
    }

    private void interchange(int[] nums , int index, int find){

        int temp = nums[index];
        nums[index] = nums[find];
        nums[find] = temp;

    }

    private void reverse(int[] nums , int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

}