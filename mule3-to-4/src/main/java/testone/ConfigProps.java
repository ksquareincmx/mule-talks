package testone;

import java.util.Map;

public class ConfigProps {

	public static Map<String,Object> extractOne(Map<String,Object> payload) {
		payload.put("role", "developer");
		return payload;
	}
}
