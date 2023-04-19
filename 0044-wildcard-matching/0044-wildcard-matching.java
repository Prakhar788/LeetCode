//if(pattern[i]=="?") || str[i-1]==pattern[j-1])
//T[i-1][j-1]
//if(pattern[j-1]=="*")
//T[i-1][j]||T[i][j-1]
//=false
//TC=O(mn)
//Space:O(mn)
//Notes->
class Solution {
     // Bottom Up DP
    public boolean isMatch(String s, String p) {
        // corner case
        if (s == null || p == null)
            return false;

        int m = s.length();
        int n = p.length();

        boolean[][] dp = new boolean[n + 1][m + 1];

        // 1. dp[0][0] = true, since empty string matches empty pattern
        dp[0][0] = true;

        // 2. dp[0][i] = false
        // since empty pattern cannot match non-empty string

        // 3. dp[j][0]
        // for any continuative '*' will match empty string
        // e.g s='aasffdasda' p='*'/'**'/'***'....
        for (int j = 1; j < n + 1; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[j][0] = dp[j - 1][0];
            }
        }

        // 1. if p.charAt(j) == s.charAt(i), match single character
        // =>>> dp[i][j] = dp[i - 1][j - 1]
        // 2. if p.charAt(j) == '?', '?' match single character
        // =>>> dp[i][j] = dp[i - 1][j - 1]

        // 3. if p.charAt(j) == '*', dp[i][j]=dp[i-1][j]||dp[i][j-1]
        // =>>> a. '*' match empty: dp[i][j]=dp[i-1][j]
        // =>>> b. '*' match multiple characters: dp[i][j]=dp[i][j-1]

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                char charS = s.charAt(i - 1);
                char charP = p.charAt(j - 1);
                if (charS == charP || charP == '?')
                    dp[j][i] = dp[j - 1][i - 1];
                else if (charP == '*')
                    dp[j][i] = dp[j - 1][i] || dp[j][i - 1];

            }
        }

        return dp[n][m];
    }
}