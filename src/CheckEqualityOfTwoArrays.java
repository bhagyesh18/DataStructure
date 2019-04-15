
public class CheckEqualityOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5};
		boolean flag=true;
			
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					flag=false;
				}
			}
		}else {
			System.out.println("Not Equal");
		}
		
		if(flag)
			System.out.println("Equal");
		else
			System.out.println("Not equal");
				
			
	}

}
