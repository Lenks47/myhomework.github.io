package Hm;

import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("001","����");
		map.put("002","����");
		map.put("003","����");
		map.put("004","����");
	    map.put("003","����");
	    System.out.println(map);
	    String value = map.get("002");
	    System.out.println(value);
	    map.put("003","����");
	    System.out.println(map);
	}
}
