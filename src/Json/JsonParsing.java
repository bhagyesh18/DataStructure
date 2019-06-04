package Json;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.*;




public class JsonParsing {

	
	  private static String request(URL urlRequest) throws Exception {
	        URL url = urlRequest;
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod("GET");
	        connection.connect();

	        int code = connection.getResponseCode();

	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

	        String line;
	        StringBuilder content = new StringBuilder();
	        while ((line = bufferedReader.readLine()) != null) {
	            content.append(line + "\n");
	        }

	        bufferedReader.close();
	        return content.toString();

	    }
	    static String[] getMovieTitles(String substr) {
	        String[] result = null;
	        try {

	            List<String> sortedResult = new ArrayList<String>();
	            String data = request(new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title="+ substr));
	            JsonObject contentObj = new JsonParser().parse(data).getAsJsonObject();
	            int totalpages = contentObj.get("total_pages").getAsInt();

	            for (int i = 1; i <= totalpages; i++) {
	                data = request(new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title="+ substr+"&page=" + i));
	                JsonObject contentofPageObj = new JsonParser().parse(data).getAsJsonObject();
	                JsonArray detailArray = contentofPageObj.get("data").getAsJsonArray();
	                for (JsonElement jsonElement : detailArray) {
	                		  sortedResult.add(jsonElement.getAsJsonObject().get("Title").toString().replace("\"", ""));
	                }
	            }
	            
	            Collections.sort(sortedResult);
	            result = new String[sortedResult.size()];
	            int i=0;
	            for (String titlemovie : sortedResult) {
	                result[i]=titlemovie;
	                i++;
	            }

	            return result;
	        } catch (Exception e) {
	            // TODO: handle exception
	        }

	        return result;
	    }

	
	public static void main(String args[]) throws Exception {
			
		String[] result=getMovieTitles("spiderman");
		for (String string : result) {
			System.out.println(string);
		}
	}
}
