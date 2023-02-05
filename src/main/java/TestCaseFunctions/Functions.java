package TestCaseFunctions;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import commonFunctions.BaseTest;

public class Functions {
	
	
	public static int  returnForeignPlayersCount() {
		int count=0;
		JSONArray jArr=BaseTest.createJSONData();
		  for(int i=0;i<jArr.size();i++) {
			  
	        	 JSONObject eachjson= ( JSONObject) jArr.get(i);
	        	String country= (String)eachjson.get("country");
	        	if(!country.equalsIgnoreCase("INDIA")) {
	        		count++;
	        		
	        	}
	        	 
	           }
		  return count;
		
	}
	
	
	public static int  returnWicketKeeperCount() {
		int count=0;
		JSONArray jArr=BaseTest.createJSONData();
		  for(int i=0;i<jArr.size();i++) {
			  
	        	 JSONObject eachjson= ( JSONObject) jArr.get(i);
	        	String role= (String)eachjson.get("role");
	        	if(role.equalsIgnoreCase("Wicket-keeper")) {
	        		count++;
	        		
	        	}
	        	 
	           }
		  return count;
		
	}
	

}
