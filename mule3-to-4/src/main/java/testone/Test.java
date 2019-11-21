package testone;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Test {
	
	public Test() {
		
	}
	
	private List<Integer> contacts;
	public  String hello(String obj) {
		//List<Integer> l =(List<Integer>)obj;
		System.out.println("Payload"+obj);
		return contacts.toString();
	}
	public List<Integer> getContacts() {
		return contacts;
	}
	public void setContacts(List<Integer> contacts) {
		this.contacts = contacts;
	}
	
	public  HashMap<String,Object> readMap(HashMap<String,Object> map) {
		
		map.put("200", "500");
		return map;
	}
	
}