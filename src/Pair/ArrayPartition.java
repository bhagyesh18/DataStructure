package Pair;

//https://leetcode.com/problems/array-partition-i/
public class ArrayPartition {

	// Don't sort
	// try to understand the code
	
	
	/*
	 * var arrayPairSum = function(nums) {
    let hash = [];
    for(let i=0; i<20001;++i){
        hash[i]=0;
    }
    let sum = 0;
    let min= Number.MAX_VALUE;
    let max= Number.MIN_VALUE;
    for(let i=0; i<nums.length;++i){
        let cur=nums[i]+10000;
        ++hash[cur];
        min=Math.min(min,cur);
        max=Math.max(max,cur);
    }
    let evenOdd=0;
    for(let i=min; i<=max;++i){
        let curAmount=hash[i];
           for(let j=0; j<curAmount;++j){
                if(evenOdd==0){
                    sum+=i-10000;
                }  
               evenOdd^=1;
           } 
    }
    return sum; 
};
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
