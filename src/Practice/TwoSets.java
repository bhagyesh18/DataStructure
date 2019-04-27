package Practice;

import java.util.ArrayList;
import java.util.Arrays;

//https://www.hackerrank.com/challenges/between-two-sets/problem
public class TwoSets {

	static int GCD(int a,int b){
		if(b==0) {
			return a;
		}
		return GCD(b,a%b);
		
	}
	
	static int LCM(int a,int b) {
		return (a*b)/GCD(a,b);
	}
	
	static ArrayList<Integer> LCMofSet(int[] set,int[] set2) {
		Arrays.sort(set2);
		int length=set2[0];
		ArrayList<Integer> res=new ArrayList<Integer>();
		int lcm=set[0];
		for(int i=1;i<set.length;i++) {
			lcm=(LCM(lcm, set[i]));
		}
		res.add(lcm);
		for(int i=2;i<10000;i++) {
			int newlcm=lcm*i;
			if(newlcm>length) {
				return res;	
		    }
			res.add(newlcm);
		}
		
		
		return res;
	}
	
	
	
	static int findtwosets(int[] set1,int[] set2) {
		ArrayList<Integer> lcmofset1=LCMofSet(set1, set2);
		int counter=0;
		for (int lcm : lcmofset1) {
			int flag=1;
			for(int i=0;i<set2.length;i++) {
				if(set2[i]%lcm!=0) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				counter++;
			}
		}
		
		return counter;
		
	}
	
	public static void main(String[] args) {
		int[] set1= {2,4};
		int[] set2= {16,32,48};
		System.out.print(""+findtwosets(set1, set2));
			
	}

}
