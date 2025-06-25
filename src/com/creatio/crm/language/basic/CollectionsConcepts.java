package com.creatio.crm.language.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsConcepts {

	public static void main(String[] args) {
		// 1. List --ArrayList,LinkedList
		// 2. Map --HashMap,LinkedMap,TreeMap
		// 3. Set --HashSet,LinkedSet,Treeset,HashTable
		
		

		/***************** ArrayList **************/
		
		List<String> empNames = new ArrayList<String>();
		List<Integer> empId = new ArrayList<Integer>();

		empNames.add("Lokeswara reddy");
		empNames.add("Roja");
		empNames.add("Aadvika");
		empNames.add(2, "loki");
		empId.add(2025);
		

		empNames.remove("Aadvika");
		System.out.println(empNames.size());

		System.out.println(empNames);
		System.out.println(empId);

		/***************** LinkedList **************/
		
		List<String> empNames1 = new LinkedList<String>();

		empNames1.add("Lokeswara reddy");
		empNames1.add("Roja");
		empNames1.add("Aadvika");

		System.out.println(empNames1);

	}

}
