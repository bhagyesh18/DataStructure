package Leader;

// leet singlenumber
public class FindDistinctElement {

	public static int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        
        int distinct = 0;
        for (int num : nums) {
            distinct ^= num;
        }
        
        return distinct;
    }
	
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {4,2,1,2,1}));
		// op 4
		System.out.println(0^1);
		System.out.println(Integer.toBinaryString(~3));

		System.out.println(Integer.toBinaryString(~4));
	}

}
