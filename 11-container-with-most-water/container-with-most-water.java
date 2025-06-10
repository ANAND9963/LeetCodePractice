class Solution {
    public int maxArea(int[] height) {

        int n = height.length;

        int max =0;
        int l =0;
        int r = n-1;

        while(l < r){
            int currarea = (r-l) * Math.min(height[l],height[r]);
            max = Math.max(max , currarea);

            if(height[l] <= height[r]){
                l++;
            }else{
                r--;
            }
        }

        return max;
        
    }
}