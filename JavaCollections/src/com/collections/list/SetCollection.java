package com.collections.list;
import java.util.*;
public class SetCollection {

	public static void main(String[] args) {
		HashSet hashSet=new HashSet();
		System.out.println("Removing Duplicates:");
		hashSet.add("Tamil");
		hashSet.add("English");
		hashSet.add("Science");
		hashSet.add("Maths");
		hashSet.add("Science");
		hashSet.add("Social");
		System.out.println(hashSet);
	}

}
