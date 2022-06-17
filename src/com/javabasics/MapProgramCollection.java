package com.javabasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapProgramCollection {
	
	public static void main(String[] args) {
		
		Map<Integer,Object> obj = new HashMap<>();
		
		obj.put(null, 12);
		obj.put(1, 45);
		obj.put(2, 45);
		obj.put(4, 89);
		obj.put(5, 00);
		obj.put(6, 80);
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println(size);
		
		Object object = obj.get(5);
		System.out.println(object);
		
		Set<Integer> keySet = obj.keySet();
		System.out.println(keySet);
        
		boolean containsKey = obj.containsKey(40);
		System.out.println(containsKey);
		
		boolean containsValue = obj.containsValue(5);
		System.out.println(containsValue);
		
		Set<Entry<Integer, Object>> entrySet = obj.entrySet();
		System.out.println(entrySet);
		for (Entry<Integer, Object> entry : entrySet) {
			System.out.println(entry);
			
		}
		
		
	}

}
