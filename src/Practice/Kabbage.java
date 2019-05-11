package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Kabbage {

	public static int solution(String S) {
		if (S.trim().length() == 0) {
			return -1;
		}

		String[] command = S.split("--");

		
		
		if (command.length == 1) {
			return -1;
		}

		boolean isHelp = false;
		for (String ss : command) {
			ss = ss.replace(" ", "").toLowerCase();
		
			if (ss.startsWith("count")) {

				if (ss.length() > 5) {
					String par = ss.substring(5);

					String regexIsdigit = "[0-9]+";

					if (par.matches(regexIsdigit)) {
						int parVal = Integer.parseInt(par);
						if (!(parVal >= 10 && parVal <= 100)) {
							return -1;
						}
					} else {
						return -1;
					}

				} else {
					return -1;
				}
			} else if (ss.startsWith("name")) {
				if (ss.length() > 4) {
					String par = ss.substring(4);
					int parLen = par.length();
					if (!(parLen >= 3 && parLen < 10)) {
						return -1;
					}
				} else {
					return -1;
				}

			} else if (ss.startsWith("help")) {
				int commandLen = ss.length();
				if ((commandLen != 4)) {
					return -1;
				}
				isHelp = true;
			}else {
				System.out.println(ss);
				return -1;
			}

		}

		if (isHelp) {
			return 1;
		}

		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("--help"));
	
			int X=1;
			int Y=1;
			int D=3;

			int counter=0;
			if(X>=Y) {
				System.out.println("0");
				return;
			}
	        if((X+D)>=Y){
	        	System.out.println("1");
	        	return;
	        }
	        int div=Y/D;
	        int N=(div*D)+X;
	        counter=div;
	        while(!(N>=Y)){
	            N=N+D;
	            counter++;
	        }
	        System.out.println(""+counter);
		
		
	}

}
