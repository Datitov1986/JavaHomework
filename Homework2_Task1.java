public class Homework2_Task1 {
    public static void main(String[] args) {
        int[][] island = new int[][]{{0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}, {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        System.out.println(maxAreaOfIsland(island));

    }

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    continue;
                }
                int cur = dfs(grid, i, j);
                if (cur > max) {
                    max = cur;
                }
            }
        }
        return max;
    }

    int[][] island = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int dfs(int[][] grid, int row, int column) {
        if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length ||
                grid[row][column] == 0) {
            return 0;
        }
        int res = 1;
        grid[row][column] = 0;
        for (int i = 0; i < island.length; i++) {
            res += dfs(grid, row + island[i][0], column + island[i][1]);
        }
        return res;
    }
}


