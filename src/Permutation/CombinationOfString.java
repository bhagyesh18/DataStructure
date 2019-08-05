package Permutation;

import java.util.List;

public class CombinationOfString {
    static StringBuilder sb=new StringBuilder();
    static String s="wxyz";
    public static void combinations(int start) {
    	for (int i = start; i < s.length(); i++) {
			sb.append(s.charAt(i));
			System.out.println(sb.toString());
			if(i<s.length()) {
				combinations(i+1);
			}
			sb.setLength(sb.length()-1);
		}
	}
	
	public static void main(String[] args) {
		String s="wxyz";
		combinations(0);
		/*
w
wx
wxy
wxyz
wxz
wy
wyz
wz
x
xy
xyz
xz
y
yz
z

		 */
		
	}

}
