import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Amne {
	public static int incrementing=0;
	
	private static final String FILENAME = "temp.txt";
	
	public static ArrayList<Integer> price=new ArrayList<Integer>();
	
	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr = null;
		int N = 0;
		int K = 0;
		Boolean flag=true;
		int[] temp=new int[2];
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			String sCurrentLine;
			StringTokenizer st;
			br = new BufferedReader(new FileReader(FILENAME));
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				if(flag){
				st = new StringTokenizer(sCurrentLine," ");  
				int i=0;
			    while (st.hasMoreTokens()) {  
				         temp[i]=Integer.parseInt(st.nextToken());  
				         i++;
			    } 
				N=temp[0];
				K=temp[1];
				flag=false;
				}
				else{
					st=new StringTokenizer(sCurrentLine," ");
					while (st.hasMoreTokens()) {  
				         price.add(Integer.parseInt(st.nextToken()));  
				    }	
				}
			 }
			
			
				for(int k=0;k<price.size();k++){
					System.out.println(price.get(k));
				}
				
				int windows=K;
				int start=0,end,answer;
				end=windows-1;
				System.out.println(start+" "+ end);
				for(int j=1;j<=(N-K+1);j++){
					//answer=checkSubrange(start,end);
					//System.out.println("ANS "+answer);
					start++;
					end++;
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
	}
	
	static void checkSubrange(int start,int end){
		Boolean firstCondtion=false;
		int diff=(end-start)+1;
		
		while(diff<=2){
			
			int s=start;
			int e=end;
			                                                                                                               
			while(s!=end){
				
				for(int i=s;i<e;i++){
					if(price.get(i).intValue()<price.get((i+1)).intValue()){
						firstCondtion=true;
					}
				}
				
				if(firstCondtion==true){
					incrementing++;
				}
				
				s++;
				e++;
			}
			
		}
		
		
			
		checkSubrange(start, end);
	
	}
	
	
	
}
