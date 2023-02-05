package commonFunctions;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;



public class BaseTest {
	//static JSONObject jsonObj;
	//static JSONParser jsonParser;
	
	
	public static JSONArray createJSONData() {
		JSONObject jsonObj = null;
		 JSONParser jsonParser;
		 JSONArray jArray=null;
	jsonParser = new JSONParser();
	String filePath=System.getProperty("user.dir")+"//src//test//resources//jsonfiles//TeamRCB.json";
    
    try (FileReader reader = new FileReader(filePath))
    {
        //Read JSON file
        Object obj = jsonParser.parse(reader);
         jsonObj= (JSONObject) obj;
          jArray=  (JSONArray) jsonObj.get("player");
        
    
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
    
    return jArray;
	}
	
	
}
