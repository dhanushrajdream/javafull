package com.javabasics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetProgramCollection {

	  private static boolean contains;

	public static void main(String[] args) {
		
		  Set<Object> obj = new HashSet<>();
		  
		  obj.add(24);
		  obj.add("java");
		  obj.add("oracle");
		  obj.add("FZ");
		  obj.add(2002);
		  obj.add(2002);
		  obj.add(2029);
		  obj.add(null);
		  obj.add(null);
		  System.out.println(obj);
		  
		  int size = obj.size();
	      System.out.println(size);
	      
	      //obj.clear();
	      // System.out.println(obj);
	      
	      //Set<Object> obj1 = new LinkedHashSet<>();
	      
	      //obj1.add(25);
	      //obj1.add(2003);
	      // obj1.add(null);
	      // obj1.add("selleenium");
	      //System.out.println(obj1);
	      
	      // obj.add(obj1);
	      //System.out.println(obj);
	      
	      
	      Set<Object> obj3 = new TreeSet<>();
	      
	      obj3.add(1);
	      obj3.add(999);
	      obj3.add(24);
		  obj3.add(2002);
		  obj3.add(2002);
		  obj3.add(2029);
		  System.out.println(obj3);
		  
		  
	     
		
	      
	    
	      
	      
	      
	      
	      
		  
	      
		  
		  
	}
}
