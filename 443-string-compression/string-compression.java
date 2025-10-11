class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        int k = 0;
        int n = chars.length;
        while (j < n) {
            if (j == n - 1 || chars[j] != chars[j + 1]) {
                chars[k++] = chars[i];
                int cnt = j - i + 1;
                if (cnt > 1) {
                    char[] s = Integer.toString(cnt).toCharArray();
                    for (char c : s) {
                        chars[k++] = c;
                    }
                }
                i = j + 1;
            }
            j++;

        }
        return k;
    }
}