class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int m = str1.length(), n = str2.length();

        for(int i = Math.min(m, n) ; i >= 1 ; i--){
            if(isValid(str1, str2 , i)){
                return str1.substring(0, i);
            }
        }

        return "";
        
    }


    public boolean isValid(String str1 , String str2 , int k){

            int m = str1.length(), n = str2.length();
            if( m % k > 0 || n % k > 0){
                return false;
            }else{
                String s1 = str1.substring(0, k);
                return str1.replace(s1 , "").isEmpty() && str2.replace(s1 , "").isEmpty();
            }

    }
}