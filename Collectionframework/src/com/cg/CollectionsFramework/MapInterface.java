package com.cg.CollectionsFramework;

import java.util.HashMap;
import java.util.Map;
 

public class MapInterface {

	public static void main(String[] args) {
		 Map  <String, String> mapObj = new HashMap<>();
		 mapObj.put("first","professor");
		 mapObj.put("sec","berlinr");
		 mapObj.put("third","tokyo");
		 mapObj.put("fourth","pnarbi");
		 mapObj.put("first","pnarbi");// keys are unique values duplicated 
		 System.out.println(mapObj);//insertion order is not preserved
	}

}
