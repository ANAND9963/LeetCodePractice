class Solution {
    private static final int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
    private int maxGold = 0;
    private List<Integer> bestPath = new ArrayList<>();

    public int getMaximumGold(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    List<Integer> currentPath = new ArrayList<>();
                    dfs(grid, i, j, 0, currentPath);
                }
            }
        }

        System.out.println("Best path: " + bestPath);
        return maxGold;
    }

    private void dfs(int[][] grid, int x, int y, int currentSum, List<Integer> path) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == 0) {
            return;
        }

        int gold = grid[x][y];
        currentSum += gold;
        path.add(gold);
        grid[x][y] = 0; 

        if (currentSum > maxGold) {
            maxGold = currentSum;
            bestPath = new ArrayList<>(path);
        }

        for (int[] dir : directions) {
            dfs(grid, x + dir[0], y + dir[1], currentSum, path);
        }

        grid[x][y] = gold; 
        path.remove(path.size() - 1); 
    }

}