public class landandwaterproblem{

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // Traverse each cell in the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If a land cell is found, start DFS and increment the count
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    // Helper DFS function to mark all connected land as visited
    private static void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Check boundary conditions and whether current cell is land
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] != '1') {
            return;
        }

        // Mark current cell as visited
        grid[i][j] = '0';

        // Visit all adjacent cells (up, down, left, right)
        dfs(grid, i - 1, j); // up
        dfs(grid, i + 1, j); // down
        dfs(grid, i, j - 1); // left
        dfs(grid, i, j + 1); // right
    }

    // Example usage
    public static void main(String[] args) {

        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        System.out.println("Number of islands: " + numIslands(grid));
    }
}

