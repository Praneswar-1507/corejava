package com.collections.list;
import java.util.*;
public class Mapping {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"cricket");
		map.put(3, "hockey");
		map.put(2, "football");
		map.put(4, "rugby");
		map.put(1, "cricket");
		System.out.println(map);
		HashMap<Integer,String> hash=new HashMap<Integer,String>();
		System.out.println("After :");
		hash.put(1,"cricket");
		hash.put(3, "hockey");
		hash.put(2, "football");
		hash.put(4, "rugby");
		hash.put(1, "cricket");
		System.out.println(hash);
		

	}

}
