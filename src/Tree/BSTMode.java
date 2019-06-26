package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/find-mode-in-binary-search-tree

class BSTMode {
    Map<Integer,Integer> map;
    int max=0;
    public int[] findMode(TreeNode root) {
           map=new HashMap<Integer,Integer>();
            if(root==null)
                return new int[0];
        
            preorder(root);
        
            List<Integer> list=new ArrayList<Integer>();
            System.out.println(map);
            for(Integer key:map.keySet()){
                if(map.get(key)==max){
                    list.add(key);
                }
            }
        
            int[] R=new int[list.size()];
            int ind=0;    
            for(Integer val:list){
                R[ind]=val;    
                ind++;
            }
            return R;
        
    }
    
    public void preorder(TreeNode root){
        if(root==null)
            return;
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        max=Math.max(max,map.get(root.val));
        preorder(root.left);
        preorder(root.right);
    
    }
    
    public static void main(String[] args) {
	
	}
    
}
