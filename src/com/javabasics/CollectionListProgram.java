package com.javabasics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionListProgram {
    public static void main(String[] args) {
		
    	List<Object> obj = new ArrayList<>();
    	
    	obj.add(10);
    	obj.add(23);
    	obj.add(30);
    	obj.add(35);
    	System.out.println(obj);
    	
    	obj.add(44);
    	System.out.println(obj);
    	
         obj.remove(3);
    	System.out.println(obj);
    	
    	obj.set(2, 1);
    	System.out.println(obj);
    	
    	boolean contains = obj.contains(55);
    	System.out.println(contains);
    	
    	Object object = obj.get(1);
    	System.out.println(object);
    	
    	int size = obj.size();
    	System.out.println(size);
    	
    	int indexOF = obj.indexOf(23);
    	System.out.println(indexOF);
    	
    	List<Object> obj1 = new LinkedList<>();
    	
    	obj1.add(23);
    	obj1.add(4);
    	obj1.add(3);
    	System.out.println(obj1);
    	
    	 //obj.addAll(obj1);
    	// System.out.println(obj);
    	
    	//obj.retainAll(obj1);
    	//System.out.println(obj);
    	
    	//obj.removeAll(obj1);
    	//System.out.println(obj);
    	
    	List<Object> obj2 = new Vector<>();
    	
    	obj2.add(31);
    	obj2.add(32);
    	obj2.add(33);
    	System.out.println(obj2);
    	
    	obj.add(obj2);
    	System.out.println(obj);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	
}
}
