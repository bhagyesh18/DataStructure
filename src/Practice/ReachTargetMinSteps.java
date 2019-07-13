package Practice;

 // leetcode
public class ReachTargetMinSteps {

	public int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while (target > 0)
            target -= ++k;
        return target % 2 == 0 ? k : k + 1 + k%2;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
