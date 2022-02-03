package com.milestone3.q1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class q1 {
	
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("raj", 95);
		map.put("ekta", 75);
		map.put("rajiv", 85);
		map.put("sunita", 66);
		map.put("gunika", 99);
		//System.out.println("------printing map------");
		
		//1. print map using stream
		
		System.out.println("-------print map using stream----------");
		
		map.entrySet()
		.stream().collect(Collectors.toSet()).forEach(System.out::println);
		
		
		
		//2. print only that records that contain key contains raj
		
		System.out.println("--------Records that contain key raj-----------");
		map.entrySet()
		.stream().filter(m->m.getKey()=="raj").forEach(System.out::println);;
		
		
		//3. print map sorted by key
		
		System.out.println("---------Print map sorted by key--------");
		map.entrySet()
		.stream().sorted(Comparator.comparing(m->m.getKey())).forEach(System.out::println);
		
		//4. print map sorted by values
		
		System.out.println("---------Print map sorted by key--------");
		map.entrySet()
		.stream().sorted(Comparator.comparing(m->m.getValue())).forEach(System.out::println);
		
		//5. print map reverse sorted by the key
		
		System.out.println("-----Map reverse sorted by the key---------");
		map.entrySet().stream()
		.sorted(Collections.reverseOrder(Comparator.comparing(m->m.getKey())))
		.forEach(System.out::println);
		
	}

}
