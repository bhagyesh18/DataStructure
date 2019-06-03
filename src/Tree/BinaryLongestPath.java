package Tree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;


// find longest path in binary tree 
// in other words find maximum heights paths 




public class BinaryLongestPath {

	static List< List<String>> treeResult=new ArrayList<List<String>>();
	
	public static List<String> longestPathsOfTree(List<String> treeRelationships) {
		Map<String, List<String>> tree=new HashMap<String, List<String>>();
		for (String string : treeRelationships) {
			String[] tokens=string.split(",");
			int first=0;
			String key="";
			List<String> nodes=new ArrayList<String>();
			for (String string2 : tokens) {
				if(first==0) {
					key=string2;
					first=1;
				}else {
					nodes.add(string2);
				}
			}
			tree.put(key, nodes);
		}
		
		Stack<String> stack=new Stack<String>();
		Set<String> visited=new HashSet<String>();
		DFSUtil("root", tree, visited, stack);
		
		int max=treeResult.get(0).size();
		for (List<String> resList : treeResult) {
			if(resList.size()>max) {
				max=resList.size();
			}
		}
		
		List<String> result=new ArrayList<String>();
		for (List<String> resList : treeResult) {
			if(resList.size()==max) {
				String nodes="";
				for (String string : resList) {
				    	nodes=nodes+string+",";
				}
				result.add(nodes.substring(0, nodes.length() - 1));
			}
		}
		return result;
	}
	
	static void  DFSUtil(String root,Map<String, List<String>> tree,Set<String> visited,Stack<String> stack) {
		visited.add(root);
		stack.add(root);
		if(tree.containsKey(root)) {
			List<String> nodes=tree.get(root);
			for (String node : nodes) {
				if(!visited.contains((node))) {
					DFSUtil(node, tree, visited,stack);
					if(stack.lastElement()==node) {
						stack.pop();
					}
				}
				
			}
		}else {
			if(stack.size()>0) {
				List<String> result=new ArrayList<String>();
				for (String stackVal : stack) {
					result.add(stackVal);
				}
				treeResult.add(result);
				stack.pop();	
			}
		}
		
	}
	
	
	public static void main(String args[]) {
		
		List<String> list=new ArrayList<String>();
		list.add("root,a,f,h");
		list.add("a,b,e");
		list.add( "b,c,d");
		list.add("f,g");
	//	System.out.println(list);
		list=longestPathsOfTree(list);
		for (String resList : list) {
			System.out.println(resList);
		}
		
	}
	
	
}
