class Solution {
    public void gameOfLife(int[][] board) {

        int m = board.length;
        int n = board[0].length;
        int[][] dirs = {
                { -1, 0 },
                { 1, 0 },
                { 0, -1 },
                { 0, 1 },
                { -1, -1 },
                { -1, 1 },
                { 1, -1 },
                { 1, 1 }
        };
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int Alives = countAlives(board, i, j, dirs, m, n);
                if (board[i][j] == 1 ) {

                    if (Alives > 3 || Alives < 2) {
                        board[i][j] = 3;
                    }

                } else {
                    if (Alives == 3) {
                        board[i][j] = 4;
                    }
                }

            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == 3) {
                    board[i][j] = 0;
                }
                if (board[i][j] == 4) {
                    board[i][j] = 1;
                }

            }
        }

    }

    private int countAlives(int[][] board, int r, int c, int[][] dirs, int m, int n) {
        int count = 0;

        for (int[] dir : dirs) {
            int nr = r + dir[0];
            int nc = c + dir[1];

            if (nr >= 0 && nr < m && nc >= 0 && nc < n && (board[nr][nc] == 1 || board[nr][nc] == 3)) {
                count++;
            }

        }

        return count;
    }

}