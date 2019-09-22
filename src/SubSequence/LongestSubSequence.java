package SubSequence;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-subsequence/discuss/358377/Java-Recursion-with-Memorization
public class LongestSubSequence {

	
	public static int longestCommonSubsequence(String text1, String text2) {
        return helper(text1, text2, 0, 0, new Integer[text1.length()][text2.length()]);
    }
    
    public static int helper(String t1, String t2, int p1, int p2, Integer[][] memo) {
        
    	System.out.println("P1 "+p1 + " p2 " +p2 );
    	if (p1 >= t1.length() || p2 >= t2.length()) {
            return 0;
        }
        if (memo[p1][p2] != null) {
            return memo[p1][p2];
        }
        if (t1.charAt(p1) == t2.charAt(p2)) {
            return memo[p1][p2] = 1 + helper(t1, t2, p1 + 1, p2 + 1, memo);
        } else {
            return memo[p1][p2] = Math.max(helper(t1, t2, p1 + 1, p2, memo), helper(t1, t2, p1, p2 + 1, memo));
        }
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "abcd", text2 = "abd";
		System.out.println(longestCommonSubsequence(text1, text2));
	}

}
