package com.creatio.crm.language.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsConcepts {

	public static void main(String[] args) {
		// 1. List --ArrayList,LinkedList
		// 2. Map --HashMap,LinkedMap,TreeMap
		// 3. Set --HashSet,LinkedHashSet,Treeset,HashTable
		
		

		/***************** ArrayList **************/
		
		List<String> empNames = new ArrayList<String>();
		List<Integer> empId = new ArrayList<Integer>();

		empNames.add("Lokeswara reddy");
		empNames.add("Roja");
		empNames.add("Roja");
		empNames.add("Aadvika");
		empNames.add(2, "loki");
		empNames.add(null);
		empId.add(2025);
		
		

		empNames.remove("Aadvika");
		//System.out.println(empNames.size());

		System.out.println("ArrayList " + empNames);
	//	System.out.println(empId);

		/***************** LinkedList **************/
		
		List<String> empNames1 = new LinkedList<String>();

		empNames1.add("Lokeswara reddy");
		empNames1.add("Roja");
		empNames1.add("Aadvika");
		empNames1.add("Aadvika");

		System.out.println("LinkedList "+empNames1);
		
		
		/***************** HashSet **************/
		
		Set<String> empNames2 = new HashSet<String>();
		

		empNames2.add("Lokeswara reddy");
		empNames2.add("Roja");
		empNames2.add("Aadvika");
		
		empNames2.add(null);
		
		//empNames2.remove("Aadvika");
		//System.out.println(empNames2.size());

		System.out.println("HashSet "+empNames2);
		
		/***************** LinkedHashSet **************/
		
Set<String> empNames3 = new LinkedHashSet<String>();
		

		empNames3.add("Lokeswara reddy");
		empNames3.add("Roja");
		empNames3.add("Aadvika");
		
		empNames3.add(null);
		
		//empNames2.remove("Aadvika");
		//System.out.println(empNames2.size());

		System.out.println("LinkedHashSet "+empNames3);
		
		/***************** Treeset **************/
Set<String> empNames4 = new TreeSet<String>();
		

		empNames4.add("Lokeswara reddy");
		empNames4.add("Roja");
		empNames4.add("Aadvika");
		
		//empNames4.add(null);
		
		//empNames2.remove("Aadvika");
		//System.out.println(empNames2.size());

		System.out.println("TreeSet "+empNames4);
		
		
		/***************** HashMap **************/
		
Map<String,Integer> empNames5 = new HashMap<String,Integer>();
		

		empNames5.put("Lokeswara reddy",10);
		empNames5.put("Roja",11);
		empNames5.put("Aadvika",12);
		
		empNames5.put(null,null);
		empNames5.put("Roja",null);
		empNames5.put("Aadvika",13);
		
		//empNames2.remove("Aadvika");
		//System.out.println(empNames2.size());

		System.out.println("HashMap "+empNames5);
		
		/***************** LinkedHashMap **************/
Map<String,Integer> empNames6 = new LinkedHashMap<String,Integer>();
		

		empNames6.put("Lokeswara reddy",10);
		empNames6.put("Roja",11);
		empNames6.put("Aadvika",12);
		
		empNames6.put(null,null);
		empNames6.put("Roja",null);
		empNames6.put("Aadvika",13);
		
		//empNames2.remove("Aadvika");
		//System.out.println(empNames2.size());

		System.out.println("LinkedHashMap "+empNames6);
		
		/***************** TreeMap **************/
Map<String,Integer> empNames7 = new TreeMap<String,Integer>();
		

		empNames7.put("Lokeswara reddy",10);
		empNames7.put("Roja",11);
		empNames7.put("Aadvika",12);
		
		//empNames7.put(null,null);
		empNames7.put("Roja",null);
		empNames7.put("Aadvika",13);
		
		//empNames2.remove("Aadvika");
		//System.out.println(empNames2.size());

		System.out.println("TreeMap "+empNames7);
		/***************** Hashtable **************/
Map<String,Integer> empNames8 = new Hashtable<String,Integer>();
		

		empNames8.put("Lokeswara reddy",10);
		empNames8.put("Roja",11);
		empNames8.put("Aadvika",12);
		
		//empNames8.put(null,null);
		//empNames8.put("Roja",null);
		empNames8.put("Aadvika",13);
		
		//empNames2.remove("Aadvika");
		//System.out.println(empNames2.size());

		System.out.println("Hashtable "+empNames8);
		
		
		

	}

}
