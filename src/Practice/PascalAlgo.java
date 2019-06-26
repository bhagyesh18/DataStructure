package Practice;

import java.util.ArrayList;
import java.util.List;

public class PascalAlgo {

	public static List<Integer> pascalByrow(int k){
		List<Integer> last=new ArrayList<Integer>();
	    if(k==0) {
			last.add(1);
			return last;
		}
			last.add(1);
			last.add(1);
		List<Integer> newlist=new ArrayList<Integer>();
		for(int i=2;i<=k;i++) {
			newlist=new ArrayList<Integer>();
			newlist.add(1);
		
			for(int j=0;j<last.size()-1;j++) {
				int x=last.get(j);
				int y=last.get(j+1);
				int z=x+y;
				newlist.add(z);
			}
			newlist.add(1);
			last=newlist;
		}
	    return last;
	}
	
	
	 public static List<List<Integer>> generate(int k) {
	          List<List<Integer>> list=new ArrayList<List<Integer>>();

        if(k==0){
            return list;
        } else if(k==1){
        List<Integer> first=new ArrayList<Integer>();
            first.add(1);
            list.add(first);
            return list;    
        }
        List<Integer> first=new ArrayList<Integer>();
            first.add(1);
            list.add(first);
    
        List<Integer> last=new ArrayList<Integer>();
		last.add(1);
		last.add(1);
		list.add(last);
		for(int i=2;i<k;i++) {
			List<Integer> newlist=new ArrayList<Integer>();
			newlist.add(1);
		
			for(int j=0;j<last.size()-1;j++) {
				int x=last.get(j);
				int y=last.get(j+1);
				int z=x+y;
				newlist.add(z);
			}
			newlist.add(1);
			list.add(newlist);
			last=newlist;
		}
		
		return list;
    }
	public static void main(String[] args) {
		
		System.out.println(pascalByrow(4));

		System.out.println(generate(5));
	}

}
