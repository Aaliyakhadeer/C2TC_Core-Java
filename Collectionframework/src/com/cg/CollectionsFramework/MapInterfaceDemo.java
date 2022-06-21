package com.cg.CollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		Map <Integer,String> mapInterface = new HashMap<>();
		mapInterface.put(100,"Rahul");
		mapInterface.put(98, "Ajay");
		mapInterface.put(89,"They work together in the same team");
		System.out.println(mapInterface);

	}

}
