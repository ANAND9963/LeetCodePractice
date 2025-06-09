class Solution {
    private static final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    
    public int getMaximumGold(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int maxGold = 0;
        ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, dfs(grid, i, j));
                }
            }
        }
        return maxGold;
    }

    private int dfs(int[][] grid, int x, int y) {

        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0) {
            return 0;
        }

        int originalGold = grid[x][y];
        grid[x][y] = 0;

        int maxGoldFromHere = 0;

        for (int[] dir : directions) {
            int nx = x + dir[0];
            int ny = y + dir[1];
            maxGoldFromHere = Math.max(maxGoldFromHere, dfs(grid, nx, ny));
        }

        grid[x][y] = originalGold;
        return originalGold + maxGoldFromHere;
    }

}