class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int MOD = 12345;
        int size = m * n;
        int[] res = new int[size];
        res[0] = 1;
        for (int i = 1; i < size; i++) {
            int val = grid[(i - 1) / n][(i - 1) % n];
            long prod = (long) res[i - 1] * val;
            res[i] = (int)(prod % MOD);
        }
        long suffix = 1;
        for (int i = size - 1; i >= 0; i--) {
            long prod = (long) res[i] * suffix;
            res[i] = (int)((prod % MOD + MOD) % MOD);

            int val = grid[i / n][i % n];
            suffix = (suffix * val) % MOD;
        }
        int[][] ans = new int[m][n];
        for (int i = 0; i < size; i++) {
            ans[i / n][i % n] = res[i];
        }
        return ans;
    }
}