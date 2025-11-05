class Solution {

    public int findFirstPosition(int[] nums , int target ,int low , int high){
        while(low <= high){
            int mid = low + (high -low)/2;

            if(nums[mid]== target){
                    
                if(mid ==0 || nums[mid] != nums[mid-1]){
                    
                    return mid;
                    
                }else{
                    high = mid -1;
                }
                     
            }

           else if(nums[mid] > target){
                high = mid -1;
            }else {
                low = mid +1;
            }

            
        }
        return -1;
    }
    public int findLastPosition(int[] nums , int target, int low , int high){
        while(low <= high){
            int mid = low + (high -low)/2;

            if(low == -1){
                return -1;
            }

            if(nums[mid] == target){
                    
                if(mid == high || nums[mid] != nums[mid+1]){
                    
                    return mid;
                    
                }else{
                    low = mid +1;
                }
                     
            }

           else if(nums[mid] > target){
                high = mid -1;
            }else {
                low = mid +1;
            }

            
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;
        int [] ar =new int[] {-1, -1};
        ar[0] = findFirstPosition(nums, target ,low , high);
        ar[1] = findLastPosition(nums, target,ar[0] , high);

        return ar;

        
    }
}