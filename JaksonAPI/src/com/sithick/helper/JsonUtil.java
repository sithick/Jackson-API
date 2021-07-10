package com.sithick.helper;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	public static ObjectMapper mapper = new ObjectMapper();
	
	public static String javaObjToJson(Object obj) throws JsonGenerationException, JsonMappingException, IOException {
		String result = mapper.writeValueAsString(obj);
		return result;
		
	}
	
	public static <T> T jsonToJavaObj(String jsonString,Class<T> classType) throws JsonParseException, JsonMappingException, IOException {
		T result = null;
		result = mapper.readValue(jsonString, classType);
		return result;
	}
}
