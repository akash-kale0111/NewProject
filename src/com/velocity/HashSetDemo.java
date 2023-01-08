package com.velocity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<Integer, String>();

		hs.put(10, "Pune");
		hs.put(4, "mumbai");
		hs.put(45, "nagpur");

		Set s = hs.keySet();

		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {

			int a = itr.next();

			System.out.println("Keys >> " + a);
			System.out.println("Values >> " + hs.get(a));

			// System.out.println(hs);
		}
	}
}
