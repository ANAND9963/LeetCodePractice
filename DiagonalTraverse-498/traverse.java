class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        boolean dir=true;
        int idx =0;
        int r=0;
        int c= 0;
        while(idx < m*n){
            result[idx] = mat[r][c];
            idx++;
            if(dir){
                if(c == n-1){
                    r++;
                    dir=false;
                }else if(r == 0){
                   c++;
                   dir=false;
                }else{
                    r--;
                    c++;
                }

            }else{
                if(r == m-1){
                    c++;
                    dir=true;
                }
                else if(c == 0){
                   r++;
                   dir=true; 
                }else{
                    c--;
                    r++;
                }
            }
        }
        return result;

    }
}