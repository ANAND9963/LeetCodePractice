class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstrow = false;
        boolean firstcol = false;
        

        for(int i =0 ;i< m;i++){
            for(int j = 0 ;j < n ;j++){
                if(matrix[i][j] == 0){

                    if(i == 0) firstrow= true;
                    if(j == 0) firstcol= true;

                    matrix[0][j] = 0;
                    matrix[i][0] =0 ;
                    
                }

            }
        }


        for(int i =1 ;i< m;i++){
            for(int j = 1 ;j < n ;j++){

                if(matrix[0][j] == 0 || matrix[i][0] == 0){

                    matrix[i][j] =0;
                    
                }
                
            }
        }
        if(firstrow){
            for(int i =0 ;i< n;i++){
                  matrix[0][i] =0;
            }
        
        }
        if(firstcol){
            for(int i =0 ;i< m;i++){
                matrix[i][0] =0;
            }

        }

        

       

        

        
    }
}