class Solution {
    public boolean isInterleave(String st1, String st2, String st3) {
        int m = st1.length();
        int n = st2.length();
        if (m + n != st3.length()) {
            return false;
        }
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] &&
                       st1.charAt(i - 1) == st3.charAt(i - 1);
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] &&
                       st2.charAt(j - 1) == st3.charAt(j - 1);
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                boolean fromSt1 =
                        dp[i - 1][j] &&
                        st1.charAt(i - 1) == st3.charAt(i + j - 1);
                boolean fromSt2 =
                        dp[i][j - 1] &&
                        st2.charAt(j - 1) == st3.charAt(i + j - 1);
                dp[i][j] = fromSt1 || fromSt2;
            }
        }
        return dp[m][n];
    }
}