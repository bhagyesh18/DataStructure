package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// leet Groups of Special-Equivalent Strings
/*
 * Input: ["abc","acb","bac","bca","cab","cba"]
Output: 3
Explanation: 3 groups ["abc","cba"], ["acb","bca"], ["bac","cab"]
Example 4:

Input: ["abcd","cdab","adcb","cbad"]
Output: 1
Explanation: 1 group ["abcd","cdab","adcb","cbad"]
 */
public class SpecialEquivalentStrings {

	
    public int numSpecialEquivGroups(String[] A) {
        Set<String> seen = new HashSet();
           for (String S: A) {
               int[] count = new int[52];
               for (int i = 0; i < S.length(); ++i)
                   count[S.charAt(i) - 'a' + 26 * (i % 2)]++;
               seen.add(Arrays.toString(count));
           }
           return seen.size();
       }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
