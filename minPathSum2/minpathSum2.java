class Solution {
    public int minFallingPathSum(int[][] grid) {

        int n = grid.length;
        int min = Integer.MAX_VALUE;
        for(int i =n-2 ;i >= 0;i-- ){
            for(int j =0 ; j<= n-1 ; j++){  
                   int minrow = Integer.MAX_VALUE;
                   if(j == 0){
                        for(int k = j+1 ; k <= n-1 ; k++){
                            minrow = Math.min(minrow,grid[i+1][k]);
                        }
                        
                        grid[i][j] =  grid[i][j] + minrow;
                       

                   }else if(j == n-1){
                        for(int k = j-1 ; k >=0 ; k--){
                            minrow = Math.min(minrow,grid[i+1][k]);
                            
                        }
                        grid[i][j] =  grid[i][j] + minrow;  
                         

                   }else{
                        for(int k = j+1  ; k<= n-1 ; k++){
                                minrow = Math.min(minrow,grid[i+1][k]);
                         }
                          int temp = minrow;
                          for(int k = j-1 ; k >=0 ; k--){
                            minrow = Math.min(minrow,grid[i+1][k]);
                        }
                        grid[i][j] =  grid[i][j] + Math.min(minrow,temp);
                       
                   }

            }
        }
        for(int j =0 ; j<= n-1; j++){

            min = Math.min(min , grid[0][j]);
        }
        
        return min;


    
        
    }
}