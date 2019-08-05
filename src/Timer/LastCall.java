package Timer;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/number-of-recent-calls/solution/
public class LastCall {
	 	Queue<Integer> q;
	    public LastCall() {
	        q = new LinkedList<Integer>();
	    }

	    public int ping(int t) {
	        q.add(t);
	        while (q.peek() < t - 3000)
	            q.poll();
	        return q.size();
	    }
	
	
	public static void main(String[] args) {
		LastCall l1=new LastCall();
		System.out.println(		l1.ping(1));
		System.out.println(l1.ping(100));
		System.out.println(		l1.ping(3001));
	System.out.println(	l1.ping(3002));
	System.out.println(	l1.ping(3003));
		
		
	}
}
