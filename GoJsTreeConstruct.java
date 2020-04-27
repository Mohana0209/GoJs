public JSONArray getResult() 
{
	JSONArray nodeArray = new JSONArray();
	
	try {		
		JSONObject displayJson = new JSONObject();
	
		displayJson.put("key", "School");
		displayJson.put("type", "P");
		
		displayJson.put("key", "Teacher");
		displayJson.put("parent", "School");
		displayJson.put("type", "C");
		
		nodeArray.put(displayJson);
				
	}
	catch(Exception e) {
	}
	
	return nodeArray;
	
}
