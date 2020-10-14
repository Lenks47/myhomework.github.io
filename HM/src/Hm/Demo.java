package Hm;

import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("001","张三");
		map.put("002","李四");
		map.put("003","王五");
		map.put("004","王五");
	    map.put("003","赵六");
	    System.out.println(map);
	    String value = map.get("002");
	    System.out.println(value);
	    map.put("003","王二");
	    System.out.println(map);
	}
}
